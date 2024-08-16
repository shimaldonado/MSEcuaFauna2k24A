package MSEcuaFauna.MSViws;

import MSEcuaFauna.MSDataBase.*;
import MSEcuaFauna.MSModels.SMHormiga;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class SMEcuaFauna2K24A extends JFrame {
    private DefaultTableModel smTableModel;
    private JTable smHormigaTable;
    public SMEcuaFauna2K24A() {
        setTitle("EcuaFauna 2K24A");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        JPanel smMainPanel = new JPanel(new BorderLayout());
        JPanel smButtonPanel = new JPanel(new FlowLayout());
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        JButton smCrearHormigaButton = new JButton("Crear Hormiga Larva");
        JButton smEliminarButton = new JButton("Eliminar");
        JButton smGuardarButton = new JButton("Guardar");

        smButtonPanel.add(smCrearHormigaButton);
        smButtonPanel.add(smEliminarButton);
        smButtonPanel.add(smGuardarButton);

        smMainPanel.add(smButtonPanel, BorderLayout.NORTH);
        smTableModel = new DefaultTableModel(new String[]{"ID", "Tipo Hormiga", "Ubicación", "Sexo", "GenoAlimento", "IngestaNativa", "Estado"}, 0);
        smHormigaTable = new JTable(smTableModel);
        JScrollPane smScrollPane = new JScrollPane(smHormigaTable);
        JPanel smAlimentacionPanel = new JPanel(new GridLayout(2, 2));

        JComboBox<String> smGenoAlimentoComboBox = new JComboBox<>(new String[]{"X", "XX", "XY"});
        JComboBox<String> smIngestaNativaComboBox = new JComboBox<>(new String[]{"Carnívoro", "Herbívoro", "Omnívoro", "Insectívoros"});

        JButton smAlimentarGenoButton = new JButton("Alimentar con GenoAlimento");
        JButton smAlimentarIngestaButton = new JButton("Alimentar con Ingesta Nativa");

        smAlimentacionPanel.add(smGenoAlimentoComboBox);
        smAlimentacionPanel.add(smAlimentarGenoButton);
        smAlimentacionPanel.add(smIngestaNativaComboBox);
        smAlimentacionPanel.add(smAlimentarIngestaButton);

        add(smMainPanel, BorderLayout.NORTH);
        add(smScrollPane, BorderLayout.CENTER);
        add(smAlimentacionPanel, BorderLayout.SOUTH);
        smCrearHormigaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int smResult = JOptionPane.showConfirmDialog(null, "¿Está seguro de crear una hormiga larva?", "Confirmar", JOptionPane.YES_NO_OPTION);
                if (smResult == JOptionPane.YES_OPTION) {
                    Random smRandom = new Random();
                    String smId = String.valueOf(smTableModel.getRowCount() + 1);
                    String smTipoHormiga = "Larva";
                    String smUbicacion = getRandomProvincia(smRandom);
                    String smSexo = "Asexual";
                    String smGenoAlimento = "X";
                    String smIngestaNativa = "N/A";
                    String smEstado = "Viva";

                    smTableModel.addRow(new String[]{smId, smTipoHormiga, smUbicacion, smSexo, smGenoAlimento, smIngestaNativa, smEstado});
                }
            }
        });
        smAlimentarGenoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int smSelectedRow = smHormigaTable.getSelectedRow();
                if (smSelectedRow != -1) {
                    String smSelectedGeno = (String) smGenoAlimentoComboBox.getSelectedItem();
                    if ("XX".equals(smSelectedGeno)) {
                        smTableModel.setValueAt("Rastreadora", smSelectedRow, 1);
                        smTableModel.setValueAt("Hembra", smSelectedRow, 3);
                        smTableModel.setValueAt(smSelectedGeno, smSelectedRow, 4);
                    }
                }
            }
        });
        smAlimentarIngestaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int smSelectedRow = smHormigaTable.getSelectedRow();
                if (smSelectedRow != -1) {
                    String smSelectedIngesta = (String) smIngestaNativaComboBox.getSelectedItem();
                    if ("Herbívoro".equals(smSelectedIngesta)) {
                        smTableModel.setValueAt(smSelectedIngesta, smSelectedRow, 5);
                        smTableModel.setValueAt("Muerta", smSelectedRow, 6);
                    }
                }
            }
        });
        smEliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int smSelectedRow = smHormigaTable.getSelectedRow();
                if (smSelectedRow != -1) {
                    int smResult = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar esta hormiga?", "Confirmar", JOptionPane.YES_NO_OPTION);
                    if (smResult == JOptionPane.YES_OPTION) {
                        smTableModel.removeRow(smSelectedRow);
                    }
                }
            }
        });
        smGuardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int smResult = JOptionPane.showConfirmDialog(null, "¿Está seguro de guardar todo el hormiguero en la base de datos?", "Confirmar", JOptionPane.YES_NO_OPTION);
                if (smResult == JOptionPane.YES_OPTION) {
                    try {
                        Connection smConnection = SMDatabaseConnection.getConnection();
                        for (int i = 0; i < smTableModel.getRowCount(); i++) {
                            String smInsertQuery = "INSERT INTO SMHormiga (TipoHormiga, Ubicacion, Sexo, GenoAlimento, IngestaNativa, Estado) VALUES (?, ?, ?, ?, ?, ?)";
                            PreparedStatement smPreparedStatement = smConnection.prepareStatement(smInsertQuery);
                            smPreparedStatement.setString(1, (String) smTableModel.getValueAt(i, 1));
                            smPreparedStatement.setString(2, (String) smTableModel.getValueAt(i, 2));
                            smPreparedStatement.setString(3, (String) smTableModel.getValueAt(i, 3));
                            smPreparedStatement.setString(4, (String) smTableModel.getValueAt(i, 4));
                            smPreparedStatement.setString(5, (String) smTableModel.getValueAt(i, 5));
                            smPreparedStatement.setString(6, (String) smTableModel.getValueAt(i, 6));
                            smPreparedStatement.executeUpdate();
                        }
                        JOptionPane.showMessageDialog(null, "Hormiguero guardado exitosamente en la base de datos.");
                    } catch (SQLException smSQLException) {
                        smSQLException.printStackTrace();
                    }
                }
            }
        });
    }

    private String getRandomProvincia(Random smRandom) {
        String[] smProvincias = {"Pichincha", "Guayas", "Manabí", "Azuay", "Imbabura", "Tungurahua", "Loja", "Cotopaxi", "Esmeraldas", "Chimborazo", "Los Ríos", "El Oro", "Carchi", "Sucumbíos", "Morona Santiago", "Napo", "Pastaza", "Bolívar", "Zamora Chinchipe", "Galápagos", "Cañar", "Orellana", "Santo Domingo de los Tsáchilas", "Santa Elena"};
        return smProvincias[smRandom.nextInt(smProvincias.length)];
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SMEcuaFauna2K24A().setVisible(true));
    }
}

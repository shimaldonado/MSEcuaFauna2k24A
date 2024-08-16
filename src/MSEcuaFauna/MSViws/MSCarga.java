package MSEcuaFauna.MSViws;
import javax.swing.*;
import java.awt.*;

public class MSCarga extends JFrame{
    
    public MSCarga() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
    }
    private void initComponents() {
        textlog = new JLabel();
        porcentaje = new JLabel();
        barra = new JProgressBar();
        img1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        textlog.setFont(new Font("Times New Roman", Font.BOLD, 36));
        textlog.setForeground(Color.BLACK);
        textlog.setText("Loading...");
        textlog.setCursor(new Cursor(Cursor.HAND_CURSOR));
        textlog.setBounds(10, 410, 540, 30);
        getContentPane().add(textlog);

        porcentaje.setFont(new Font("Times New Roman", Font.BOLD, 36));
        porcentaje.setForeground(Color.BLACK);
        porcentaje.setText("0 %");
        porcentaje.setCursor(new Cursor(Cursor.HAND_CURSOR));
        porcentaje.setBounds(750, 410, 130, 30);
        getContentPane().add(porcentaje);

        barra.setBackground(new Color(204, 153, 0));
        barra.setForeground(new Color(153, 0, 0));
        barra.setCursor(new Cursor(Cursor.HAND_CURSOR));
        barra.setBounds(0, 454, 900, 50);
        getContentPane().add(barra);
        ImageIcon originalIcon = new ImageIcon("src/MSImg/MSImaghormiga.jpg");
        Image scaledImage = originalIcon.getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
        img1.setIcon(new ImageIcon(scaledImage));
        img1.setBounds(0, 0, 900, 500);
        getContentPane().add(img1);
        pack();
        setSize(900, 500);
    }

    public static void main(String args[]) {
        EventQueue.invokeLater(() -> {
            MSCarga l = new MSCarga();
            l.setVisible(true);
            SMLogin sm= new SMLogin();
            sm.setVisible(false);
            new Thread(() -> {
                try {
                    for (int x = 0; x <= 100; x++) {
                        Thread.sleep(110);
                        l.porcentaje.setText(x + "%");
                        l.barra.setValue(x);
                        if (x == 100) {
                            l.setVisible(false);
                            sm.setVisible(true);
                        }
                        if (x == 50 || x == 90) {
                            l.textlog.setText("Connecting to Database...");
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Carga completa!");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }).start();
        });
    }
    public JProgressBar barra;
    private JLabel img1;
    public static JLabel porcentaje;
    public JLabel textlog;
}
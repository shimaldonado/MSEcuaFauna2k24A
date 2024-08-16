package MSEcuaFauna.MSControlers;

import java.sql.SQLException;
import java.util.List;
import MSEcuaFauna.MSModels.SMHormiga;

public class SMHormigaController {
    private final SMHormigaDAO smHormigaDAO;

    public SMHormigaController() {
        this.smHormigaDAO = new SMHormigaDAO();
    }

    public void smAddHormiga(SMHormiga hormiga) throws SQLException {
        smHormigaDAO.smCreateHormiga(hormiga);
    }

    public List<SMHormiga> smGetAllHormigas() throws SQLException {
        return smHormigaDAO.smReadAllHormigas();
    }

    public void smUpdateHormiga(SMHormiga hormiga) throws SQLException {
        smHormigaDAO.smUpdateHormiga(hormiga);
    }

    public void smDeleteHormiga(int smId) throws SQLException {
        smHormigaDAO.smDeleteHormiga(smId);
    }
}

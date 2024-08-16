import MSEcuaFauna.MSControlers.MSDAOL;

public class App {
    public static void main(String[] args) {
        MSDAOL userDAO = new MSDAOL();
        userDAO.createUser("pat_mic", "123456");
    }
}

package MSEcuaFauna.MSModels;

public class SMLugar {
    private int smId;
    private String smPais;
    private String smRegion;
    private String smProvincia;

    public int getSmId() {
        return smId;
    }

    public void setSmId(int smId) {
        this.smId = smId;
    }

    public String getSmPais() {
        return smPais;
    }

    public void setSmPais(String smPais) {
        this.smPais = smPais;
    }

    public String getSmRegion() {
        return smRegion;
    }

    public void setSmRegion(String smRegion) {
        this.smRegion = smRegion;
    }

    public String getSmProvincia() {
        return smProvincia;
    }

    public void setSmProvincia(String smProvincia) {
        this.smProvincia = smProvincia;
    }

    public SMLugar(int smId, String smPais, String smRegion, String smProvincia) {
        this.smId = smId;
        this.smPais = smPais;
        this.smRegion = smRegion;
        this.smProvincia = smProvincia;
    }
    
}

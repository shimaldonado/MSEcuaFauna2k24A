package MSEcuaFauna.MSModels;

public class SMAlimento {
    private int smId;
    private String smGenoAlimento;
    private String smIngestaNativa;

    public int getSmId() {
        return smId;
    }

    public void setSmId(int smId) {
        this.smId = smId;
    }

    public String getSmGenoAlimento() {
        return smGenoAlimento;
    }

    public void setSmGenoAlimento(String smGenoAlimento) {
        this.smGenoAlimento = smGenoAlimento;
    }

    public String getSmIngestaNativa() {
        return smIngestaNativa;
    }

    public void setSmIngestaNativa(String smIngestaNativa) {
        this.smIngestaNativa = smIngestaNativa;
    }

    public SMAlimento(int smId, String smGenoAlimento, String smIngestaNativa) {
        this.smId = smId;
        this.smGenoAlimento = smGenoAlimento;
        this.smIngestaNativa = smIngestaNativa;
    }
}

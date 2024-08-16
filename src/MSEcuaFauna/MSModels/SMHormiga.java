package MSEcuaFauna.MSModels;

public class SMHormiga {
    private int smId;
    private String smTipoHormiga;
    private String smUbicacion;
    private String smSexo;
    private String smGenoAlimento;
    private String smIngestaNativa;
    private String smEstado;

    public int getSmId() {
        return smId;
    }

    public void setSmId(int smId) {
        this.smId = smId;
    }

    public String getSmTipoHormiga() {
        return smTipoHormiga;
    }

    public void setSmTipoHormiga(String smTipoHormiga) {
        this.smTipoHormiga = smTipoHormiga;
    }

    public String getSmUbicacion() {
        return smUbicacion;
    }

    public void setSmUbicacion(String smUbicacion) {
        this.smUbicacion = smUbicacion;
    }

    public String getSmSexo() {
        return smSexo;
    }

    public void setSmSexo(String smSexo) {
        this.smSexo = smSexo;
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

    public String getSmEstado() {
        return smEstado;
    }

    public void setSmEstado(String smEstado) {
        this.smEstado = smEstado;
    }

    public SMHormiga(int smId, String smTipoHormiga, String smUbicacion, String smSexo, String smGenoAlimento, String smIngestaNativa, String smEstado) {
        this.smId = smId;
        this.smTipoHormiga = smTipoHormiga;
        this.smUbicacion = smUbicacion;
        this.smSexo = smSexo;
        this.smGenoAlimento = smGenoAlimento;
        this.smIngestaNativa = smIngestaNativa;
        this.smEstado = smEstado;
    }
}

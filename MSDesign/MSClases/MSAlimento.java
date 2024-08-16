public class MSAlimento {
    private int id;
    private String genoAlimento;
    private String ingestaNativa;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getGenoAlimento() {
        return genoAlimento;
    }
    public void setGenoAlimento(String genoAlimento) {
        this.genoAlimento = genoAlimento;
    }
    public String getIngestaNativa() {
        return ingestaNativa;
    }
    public void setIngestaNativa(String ingestaNativa) {
        this.ingestaNativa = ingestaNativa;
    }
    public MSAlimento(int id, String genoAlimento, String ingestaNativa) {
        this.id = id;
        this.genoAlimento = genoAlimento;
        this.ingestaNativa = ingestaNativa;
    }
}

public class MSProvincia {
    private int id;
    private String nombre;
    private int regionId;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getRegionId() {
        return regionId;
    }
    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }
    public MSProvincia(int id, String nombre, int regionId) {
        this.id = id;
        this.nombre = nombre;
        this.regionId = regionId;
    }

}



public class MSPais {
    private int paisID;
    private String nombre;
    public int getPaisID() {
        return paisID;
    }
    public void setPaisID(int paisID) {
        this.paisID = paisID;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public MSPais(int paisID, String nombre) {
        this.paisID = paisID;
        this.nombre = nombre;
    }
    
   
}

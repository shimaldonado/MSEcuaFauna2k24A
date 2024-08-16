
import java.util.Random;

public class MSHormiga {
    private int id;
    private String tipoHormiga;
    private String sexo;
    private int provinciaId;
    private int alimentoId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoHormiga() {
        return tipoHormiga;
    }

    public void setTipoHormiga(String tipoHormiga) {
        this.tipoHormiga = tipoHormiga;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getProvinciaId() {
        return provinciaId;
    }

    public void setProvinciaId(int provinciaId) {
        this.provinciaId = provinciaId;
    }

    public int getAlimentoId() {
        return alimentoId;
    }

    public void setAlimentoId(int alimentoId) {
        this.alimentoId = alimentoId;
    }

    public MSHormiga(String tipoHormiga, int alimentoId) {
        this.tipoHormiga = tipoHormiga;
        this.sexo = generarSexoAleatorio();
        this.provinciaId = generarProvinciaAleatoria();
        this.alimentoId = alimentoId;
    }

    private String generarSexoAleatorio() {
        String[] sexos = {"Macho", "Hembra", "Asexual"};
        return sexos[new Random().nextInt(sexos.length)];
    }

    private int generarProvinciaAleatoria() {
        int[] provincias = {/* IDs de provincias */};
        return provincias[new Random().nextInt(provincias.length)];
    }
}

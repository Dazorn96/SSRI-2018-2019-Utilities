package spiegazioni.ereditarieta;

public class Docente extends Persona {

    private float stipendio;
    private int uuid;
    private static int nextUUID = 1;

    public Docente(String nome, String indirizzo, float stipendio) {
        super(nome, indirizzo);
        this.stipendio = stipendio;
        this.uuid = nextUUID++;
    }

    public float getStipendio() {
        return stipendio;
    }

    public void setStipendio(float stipendio) {
        this.stipendio = stipendio;
    }
    public int getUuid() {
        return uuid;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "stipendio=" + stipendio +
                ", uuid=" + uuid +
                ", nome='" + nome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                '}';
    }
}

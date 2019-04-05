package spiegazioni.model;

import java.util.Objects;

public class MacchinaConOverride {

    private String targa;
    private int cilindrata;

    //Costruttore parametrico;
    public MacchinaConOverride(String targa, int cilindrata) {
        this.targa = targa;
        this.cilindrata = cilindrata;
    }

    //Costruttore di copia;
    public MacchinaConOverride(MacchinaConOverride macchina) {
        macchina.setCilindrata(macchina.getCilindrata());//con i metodi pubblici
        this.targa = macchina.getTarga(); //metodi pubblici + attributo privato
    }

    //Costruttore di default; se non esiste alcun costruttore alternativo non è necessario specificarlo
    public MacchinaConOverride() {
    }

    public String getTarga() {
        return targa;
    }

    /**
     * this viene usato per referenziare i parametri presenti all'interno della classe;
     * infatti come potete vedere posso scrivere sia this.targa che targa come parametro formale
     */
    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    @Override
    public String toString() {
        return "MacchinaConOverride{" +
                "targa='" + targa + '\'' +
                ", cilindrata=" + cilindrata +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MacchinaConOverride)) return false;
        MacchinaConOverride that = (MacchinaConOverride) o;
        return getCilindrata() == that.getCilindrata() &&
                Objects.equals(getTarga(), that.getTarga());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTarga(), getCilindrata());
    }
}

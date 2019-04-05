package spiegazioni.model;

public class Macchina {

    private String targa;
    private int cilindrata;

    //Costruttore parametrico;
    public Macchina(String targa, int cilindrata) {
        this.targa = targa;
        this.cilindrata = cilindrata;
    }

    //Costruttore di copia;
    public Macchina(Macchina macchina) {
        macchina.setCilindrata(macchina.getCilindrata());//con i metodi pubblici
        this.targa = macchina.getTarga(); //metodi pubblici + attributo privato
    }

    //Costruttore di default; se non esiste alcun costruttore alternativo non è necessario specificarlo
    public Macchina() {
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

}

package spiegazioni.ereditarieta;

public class Studente extends Persona {

    private int matricola;
    private static int nextMatricola = 1;

    public Studente(String nome, String indirizzo) {
        super(nome, indirizzo);
        this.matricola = nextMatricola++;
    }

    public int getMatricola() {
        return matricola;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "matricola=" + matricola +
                ", nome='" + nome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                '}';
    }
}

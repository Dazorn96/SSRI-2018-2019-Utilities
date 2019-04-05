package spiegazioni.model;

public class Animale {

    private String habitat;
    private String famiglia;
    private String nome;


    public Animale(String habitat,String famiglia, String nome){
        this.habitat=habitat;
        this.famiglia=famiglia;
        this.nome=nome;
    }

    public Animale(Animale a, String nome){
        this.habitat=a.habitat;
        this.famiglia=a.famiglia;
        this.nome=nome;
    }

    public Animale() {

    }

    @Override
    public String toString() {
        return "Animale{" +
                "habitat='" + habitat + '\'' +
                ", famiglia='" + famiglia + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}

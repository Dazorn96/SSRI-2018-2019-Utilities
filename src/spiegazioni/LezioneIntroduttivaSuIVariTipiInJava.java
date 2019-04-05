package spiegazioni;

import spiegazioni.model.Animale;
import spiegazioni.model.Macchina;
import spiegazioni.model.MacchinaConOverride;


/**
 * Benvenuti! Questa è la prima lezione di "Cose Ja-viste e non" ahahah
 * Nell'introduzione, come è solito fare ogni libro, bisognerebbe spiegare perché la OOP (object oriented programming) si è rilevata vincente
 * nell'affrontare una serie di problematiche (classi di problemi), nascondendo all'esterno la complessità intriseca delle stesse;
 * infatti si è passati da definire strutture dati primitive mono/multidimensionali(int e int[] per esempio)
 * o strutture mono/multidimensionali (struct o struct[] per esempio) e funzioni a se stanti a realizzare una struttura complessa contenente entrambe!
 * Questa è la classe, entità fondamentale della OOP. Una classe è una rappresentazione di un'entità astratta o concreta caratterizzata da attributi (le variabili)
 * e metodi (le funzioni).
 * A questo punto mi potreste dire: "Ma perchè impiegare le 'classi'? Potrei fare dei file.h/file.c contenenti le specifiche e che espongano solo le struct e le funzioni"
 * Avreste ragione, o almeno in parte! Principalmente si è passati all'OOP per 4 motivi:
 * 1) Le classi presentano una facilità disarmante nell'implementazione e nell'istanziamento (creazione di una nuova istanza del tipo della classe -> un nuovo oggetto con un proprio stato ma con le stesse caratteristiche)
 * 2) Hai una struttura che possiede un suo "contesto" (referenziabile tramite la keyword this), cosa che in c non esiste.
 * 3) Hai una struttura polimorfa ed estendibile (Approfondiremo nel package spiegazioni.ereditarieta); questo significa che puoi creare,
 * a partire da una classe in grado di risolvere una data classe di problemi, N varianti eseguendo l'override (la sovrascrizione) di solo una parte del codice.
 * 4) Un oggetto può contenere all'interno dello stesso diversi livelli di visibilità permettendo di rendere alcuni attributi o metodi pubblici, privati, protetti o visibili nel package
 */
public class LezioneIntroduttivaSuIVariTipiInJava {


    //static significa che è richiamabile senza che la classe sia istanziata
    public static void main(String[] args) {



        /*
        TIPI PRIMITIVI (https://www.html.it/pag/15101/tipi-primitivi-di-java-e-valori/)

        I tipi primitivi sono rappresentati con il proprio valore, niente di più e niente di meno.
        Questo comporta che posso stimare e confrontare due variabili (ad esempio int) semplicemente impiegandole.
         */
        int numero1=5,numero2=numero1;
        System.out.println("numero1 è uguale a numero2?"+(numero1==numero2));
        System.out.println("\n\n");

        /*
          OGGETTI

          Ogni oggetto contiene un riferimento nell'heap che ne continene i dati; infatti se cercherai di stampare un oggetto vedrai il riferimento nell'heap
          Es:spiegazioni.model.Macchina@7217fef
          1) Quindi è possibile confrontare due oggetti? é possibile confrontare due oggetti tramite l'override del metodo equals() (lo vedremo) oppure confrontando il valore delle proprietà.
          2) é possibile copiare un oggetto in uno nuovo? Tramite costruttori di copia (vedremo) oppure copiando "a mano" gli attributi.
         */

        Macchina macchina1=new Macchina("aaa",100),macchina2=macchina1; //oggetto
        System.out.println("macchina1 è uguale a macchina2?"+(macchina1==macchina2));
        System.out.println("macchina1:"+macchina1);
        System.out.println("macchina2:"+macchina2);

        macchina1.setCilindrata(120);
        System.out.println("la cilindrata di macchina1 dopo la modifica vale:"+macchina1.getCilindrata());
        System.out.println("la cilindrata di macchina2 dopo la modifica eseguita su macchina1 vale:"+macchina2.getCilindrata());

        Macchina macchina3=new Macchina("aaa",100),macchina4=new Macchina("aaa",100); //oggetto
        System.out.println("macchina3 è uguale a macchina4?"+(macchina3==macchina4));
        System.out.println("macchina3:"+macchina3);
        System.out.println("macchina4:"+macchina4);


        /*
            Tuttavia è possibile aggirare i problemi di prima eseguendo l'override dei metodi toString() (viene usato per stampare come stringa il valore dell'oggetto),
            equal e hashCode
         */

        MacchinaConOverride macchina6=new MacchinaConOverride("aaa",100),macchina5=new MacchinaConOverride("aaa",100); //oggetto
        System.out.println("macchina5 è uguale a macchina6?"+(macchina5.equals(macchina6)));
        System.out.println("macchina5:"+macchina5);
        System.out.println("macchina6:"+macchina6);
        System.out.println("\n\n");

        /*
        NB: Quando lavori con delle varibili devi esser coscio delle loro caratteristiche! Ad esempio sapere cosa è immutabile,
        cosa viene passato per valore o riferimento (e quindi è modificabile al di fuori dello scope (teoria di anisetti...)).
        Lo stesso discorso fatto per i vettori, le strutture, i dati primitivi in c è valido anche in Java.
        Pensate agli oggetti, per praticità, come a dei puntatori che contengono il riferimento a una locazione con più attributi.
        Quindi porre un puntatore (oggetto) uguale ad un altro comporta copiare il riferimento, non il valore!
         */


        /*
        TIPI IMMUTABILI

        I tipi immutabili non possono esser modificati; ogni loro modifica va riportata su una nuova variabile.
        Anche nel caso in cui venisse inizializzata una nuova variabile con il valore della precedente sarebbero due stringhe di equal contenuto ma di valore (riferimento nell'heap)
        diverso.
         */
        String stringa1="a",stringa2=stringa1; //tipo immutabile
        System.out.println("stringa1 è uguale a stringa2?"+(stringa1==stringa2)); //funziona anche con l'== perché string fa l'override del metodo toString
        System.out.println("stringa1 è uguale (con equals) a stringa2?"+(stringa1.equals(stringa2)));
        System.out.println("stringa1:"+stringa1);
        System.out.println("stringa2:"+stringa2);
        stringa1.concat(stringa1);
        System.out.println("stringa1 dopo il concat (non gestito correttamente):"+stringa1);
        stringa1=stringa1.concat(stringa1);
        System.out.println("stringa1 dopo il concat (gestito correttamente):"+stringa1);
        System.out.println("stringa2 dopo il concat (gestito correttamente):"+stringa2+"; si noti che stringa2 ha mantenuto il suo valore sebbene sia un oggetto");
        System.out.println("\n\n");



        /*
        Strutture multi-dimensionali con primitivi; in una struttura multidimensionale (array...) ogni "cella" ha un valore di default.
         Ad esempio per int sarà 0, per char '' (carattere vuoto), per String null, per oggetti null
         */
        int []vettInt=new int[10];
        for(int i=0;i<vettInt.length;i++){
            System.out.println("vettInt-> elemento i:"+i+" di valore:"+vettInt[i]);
        }

        char []vettChar=new char[10];
        for(int i=0;i<vettChar.length;i++){
            System.out.println("vettChar-> elemento i:"+i+" di valore:"+vettChar[i]);
        }

        String []vettString=new String[10];
        for(int i=0;i<vettString.length;i++){
            System.out.println("vettString-> elemento i:"+i+" di valore:"+vettString[i]);
        }

        Macchina []vettObj=new Macchina[10];
        for(int i=0;i<vettObj.length;i++){
            System.out.println("vettObj-> elemento i:"+i+" di valore:"+vettObj[i]);
        }


        Animale a1=new Animale();
        System.out.println(a1);

        Animale a2=new Animale("*","canidi","bobo");
        System.out.println(a2);

        Animale a3=new Animale(a2,"bobby");
        System.out.println(a3);
    }
}

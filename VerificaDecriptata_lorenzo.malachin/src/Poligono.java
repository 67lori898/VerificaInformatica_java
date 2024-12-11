
/*crivi una classe chiamata Poligono con i seguenti requisiti:

Un attributo privato numeroLati (di tipo int) che rappresenta il numero di lati del poligono.
Un attributo privato lunghezzaLato (di tipo double) che rappresenta la lunghezza di ciascun lato.
Un costruttore che accetta numeroLati e lunghezzaLato come parametri.
Un metodo double calcolaPerimetro() che restituisce il perimetro del poligono.
Scrivi anche un metodo toString() che restituisca una descrizione testuale del poligono, ad esempio:
"Poligono con 5 lati di lunghezza 3.0, perimetro: 15.0"
*/

public class Poligono {
    //attributi (privati della classe poligono)
    private int numeroLati;
    private double lunghezzaLato;


    //costruttore del poligono: ha come attributi il numero dei lati e la lunghezza dei lati
    public Poligono(int numeroLati, double lunghezzaLato)
    {
        this.numeroLati=numeroLati;
        this.lunghezzaLato=lunghezzaLato;

    }



    //per calcolare il perimetro ho moltiplicato la lunghezza del singolo lato per il numero di volte che è presente il lato in maniera tale da ricavare il perimetro

    public double calcolaPerimetro()
    {
        return numeroLati*lunghezzaLato;
    }



    public String  getInformazioni()
    {
        return String.format("Poligono con: " +
                              "\n Numero lati: "+numeroLati+
                              "\n Lati con lunghezza"+lunghezzaLato+
                                "\nPerimetro:  "+calcolaPerimetro());
    }

}

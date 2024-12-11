/*public class Rettangolo {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double calcolaArea() {
        return base * altezza;
    }

    public int compareTo(Rettangolo altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();
        return Double.compare(areaQuesto, areaAltro);
    }
}
 
public class Quadrato {
    private double lato;

    public Quadrato(double lato) {
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    public double calcolaArea() {
        return lato * lato;
    }
}
 
public class TriangoloRettangolo {
    private double base;
    private double altezza;

    public TriangoloRettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double calcolaArea() {
        return (base * altezza) / 2;
    }
}
 
public class Circonferenza {
    private double raggio;

    public Circonferenza(double raggio) {
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }
}



/*

DOMANDA 1
 Scrivi il metodo compareTo() per le seguenti classi:

Quadrato
TriangoloRettangolo
Circonferenza
Il metodo deve confrontare l'area dell'oggetto attuale con quella di un altro oggetto della stessa classe e restituire:

1 se l'area dell'oggetto attuale è maggiore.
0 se le aree sono uguali.
-1 se l'area dell'oggetto attuale è minore.


DOMANDA 2

Scrivi una classe chiamata Punto con i seguenti attributi e metodi:

Due attributi privati x e y di tipo double, che rappresentano le coordinate del punto.
Un costruttore che accetta come parametri i valori di x e y.
Metodi getter e setter per gli attributi.
Un metodo double distanza(Punto altro) che calcola e restituisce la distanza tra il punto corrente e un altro punto passato come parametro.

DOMANDA 3

Modifica la classe Rettangolo aggiungendo un metodo chiamato calcolaPerimetro() che restituisce il perimetro del rettangolo. Scrivi il codice per il metodo e spiega il motivo per cui è utile avere metodi di calcolo in una classe.


DOMANDA 4

Scrivi una classe chiamata Poligono con i seguenti requisiti:

Un attributo privato numeroLati (di tipo int) che rappresenta il numero di lati del poligono.
Un attributo privato lunghezzaLato (di tipo double) che rappresenta la lunghezza di ciascun lato.
Un costruttore che accetta numeroLati e lunghezzaLato come parametri.
Un metodo double calcolaPerimetro() che restituisce il perimetro del poligono.
Scrivi anche un metodo toString() che restituisca una descrizione testuale del poligono, ad esempio:
"Poligono con 5 lati di lunghezza 3.0, perimetro: 15.0"


Tutto il codice che scriverete deve essere adeguatamente commentato, specialmente per le parti non banali. In particolare:

Costruttori: spiegate il loro scopo e quali parametri si aspettano.
Metodi di calcolo (ad esempio, calcolaArea o calcolaPerimetro): descrivete brevemente il ragionamento dietro le formule utilizzate.
Metodi complessi (ad esempio, compareTo o distanza): spiegate cosa fanno e perché sono utili.
Evitate commenti superflui per il codice ovvio, come // Imposta la base per un setter, ma concentratevi sul rendere chiaro il funzionamento delle logiche più articolate.
Un codice ben commentato non solo aiuta voi a riprenderlo in futuro, ma permette anche a chi lo legge di comprenderne facilmente il funzionamento!





/*
Che devi fare?
Correggi il main, se occorre:
Controlla bene il  metodo getInformazioni() e vedi come risolvere il problema dello stampare info e fare andare bene il compareTo.
 */


import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {



        //Creazione degli oggetti , ne creiamo 2 dello stesso tipo per confrontarli successivamente
        Rettangolo rettangolo = new Rettangolo(15, 18);
        Rettangolo rettangolo2 = new Rettangolo(10, 6);

        Quadrato quadrato = new Quadrato(6);
        Quadrato quadrato2 = new Quadrato(10);

        TriangoloRettangolo triangolo = new TriangoloRettangolo(3, 4);
        TriangoloRettangolo triangolo2 = new TriangoloRettangolo(5, 6);



        /*Nelle classi di ogni figura manca il metodo getInformazioni(), quindi lo implementiamo nelle rispettive classi */

        //Stampiamo le informazioni sugli oggetti
        System.out.println(rettangolo.getInformazioni());
        System.out.println(quadrato.getInformazioni());
        System.out.println(triangolo.getInformazioni());

        //confrontiamo i 2 rettangoli
        if (rettangolo.compareTo(rettangolo2)>0) {
            System.out.println("Il primo rettangolo ha un'area maggiore del secondo rettangolo.");
        }
        if(rettangolo.compareTo(rettangolo2)==0)
        {
            System.out.println("Il primo rettangolo  ha un area uguale al secondo rettangolo .");
        }
        else
        {
            System.out.println("Il primo rettangolo ha un area minore rispetto al secondo rettangolo  .");
        }

        //confrontiamo i 2 quadrati
        if (quadrato.compareTo(quadrato2) > 0) {
            System.out.println("Il primo quadrato ha un'area maggiore del secondo quadrato.");
        }
        if(quadrato.compareTo(quadrato2)==0)
        {
            System.out.println("Il primo quadrato  ha un area uguale al secondo quadrato .");
        }
        else
        {
            System.out.println("Il primo quadrato ha un area minore del secondo quadrato.");
        }

        //confrontiamo i 2 triangoli
        if (triangolo.compareTo(triangolo2) > 0) {
            System.out.println("Il primo triangolo ha un'area maggiore  del secondo triangolo.");
        }
        if(triangolo.compareTo(triangolo2) == 0)
        {
            System.out.println("Il primo triangolo ha un area uguale rispetto al secondo triangolo .");
        }
        else
        {
            System.out.println("Il primo triangolo ha  un area minore rispetto al secondo triangolo.");
        }




        //Istanziamo i due punti e calcoliamo la loro distanza

        System.out.println("\nCALCOLO DELLA DISTANZA TRA 2 PUNTI");

        Punto punto1= new Punto(1,2);
        Punto punto2= new Punto(3,4);

        System.out.println("La distanza tra il punto 1 che ha coordinate:\nx:"+punto1.getX()+"\ny:"+ punto1.getY()+"\nE il punto 2 che ha coordinate: \nx"+punto2.getX()+"\ny:"+punto2.getY()+"\nè di: "+punto1.calcolaDistanza(punto2));

        System.out.println("\n CREAZIONE E VISUALIZAZZIONE DEL POLIGONO: ");
        Poligono poligono = new Poligono(5,3.5);
        System.out.println("\n"+poligono.getInformazioni());



    }
}

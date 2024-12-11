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




    /*metodo compareTo(), se il primo valore  è maggiore del secondo, la funzione restituisce un numero maggiore di 0,
    se i 2 valori sono uguali la funzione restituisce 0, se il 2 valore è maggiore del 1 la funzione restituisce un numero minore di 0*/
    public int compareTo(Circonferenza altro ) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();


        return (Double.compare(areaQuesto, areaAltro));

    }
}

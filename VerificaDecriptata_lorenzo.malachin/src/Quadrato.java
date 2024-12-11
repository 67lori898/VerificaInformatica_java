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

      /*metodo compareTo(), se il primo valore  è maggiore del secondo, la funzione restituisce un numero maggiore di 0,
        se i 2 valori sono uguali la funzione restituisce 0, se il 2 valore è maggiore del 1 la funzione restituisce un numero minore di 0*/

    public int compareTo(Quadrato altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();


        return(Double.compare(areaQuesto, areaAltro));

    }

    public String  getInformazioni()
    {
        return String.format("Quadrato con: " +
                "\n Lunghezza lato: "+lato+
                "\n Area:  "+calcolaArea());
    }

}
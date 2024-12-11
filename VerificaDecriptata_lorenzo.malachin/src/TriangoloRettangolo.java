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

     /*metodo compareTo(), se il primo valore  è maggiore del secondo, la funzione restituisce un numero maggiore di 0,
        se i 2 valori sono uguali la funzione restituisce 0, se il 2 valore è maggiore del 1 la funzione restituisce un numero minore di 0*/

    public int compareTo(TriangoloRettangolo altro ) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();


                return(Double.compare(areaQuesto, areaAltro));

    }
    public String  getInformazioni()
    {
        return String.format("Triangolo rettangolo con: " +
                "\n Lunghezza base:"+base+
                "\n Lunghezza altezza:"+calcolaArea());
    }


}
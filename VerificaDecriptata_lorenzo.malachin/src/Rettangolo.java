public class Rettangolo {
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



    //aggiungere metodi come calcolaPerimetro() e calcolaArea() ci permette di rendere queste classi oiù complete e riutilizzabili

    public String  getInformazioni()
    {
        return String.format("Rettangolo con: " +
                "\n Lunghezza base: "+base+
                "\n Lunghezza altezza: "+altezza+
                "\n Area:  "+calcolaArea());
    }

}
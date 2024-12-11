

/*Scrivi una classe chiamata Punto con i seguenti attributi e metodi:

Due attributi privati x e y di tipo double, che rappresentano le coordinate del punto.
Un costruttore che accetta come parametri i valori di x e y.
Metodi getter e setter per gli attributi.
Un metodo double distanza(Punto altro) che calcola e restituisce la distanza tra il punto corrente e un altro punto passato come parametro.
*/


public class Punto {

    //punti che rappresentano le coordinate del punto
    private double x;
    private double y;

     public Punto(double x, double y)
     {
         this.x=x;
         this.y=y;
     }

   //metodi getter e setter
    public void setX(double x)
    {

         this.x=x;
    }
   public double getX()
   {
         return x;
   }
    public void setY(double y)
    {

        this.y=y;
    }
    public double getY()
    {
        return y;
    }

    //metodo che calcola la distanza tra 2 punti, ho utilizzato la formula classica per ricavarla
    public double calcolaDistanza(Punto altroPunto){

           return  Math.sqrt(Math.pow(this.x- altroPunto.x,2) + Math.pow(this.y- altroPunto.y,2));


    }


}

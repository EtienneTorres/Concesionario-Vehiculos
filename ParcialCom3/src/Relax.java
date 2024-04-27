public class Relax extends Paquetes{

private boolean incluyehidromasajes;
private boolean incluyeBañoDeBarro;


    public Relax(int numId, String destino, int stock, int duracion, double preciounitario, double preciobase, boolean incluyehidromasajes, boolean incluyeBañoDeBarro) {
        super(numId, destino, stock, duracion, preciounitario, preciobase);
        this.incluyehidromasajes = incluyehidromasajes;
        this.incluyeBañoDeBarro = incluyeBañoDeBarro;
    }


    public boolean isIncluyehidromasajes() {
        return incluyehidromasajes;
    }

    public void setIncluyehidromasajes(boolean incluyehidromasajes) {
        this.incluyehidromasajes = incluyehidromasajes;
    }

    public boolean isIncluyeBañoDeBarro() {
        return incluyeBañoDeBarro;
    }

    public void setIncluyeBañoDeBarro(boolean incluyeBañoDeBarro) {
        this.incluyeBañoDeBarro = incluyeBañoDeBarro;
    }

    public double CalcularPrecioTotal()
    {
        double preciototal=preciobase;
        if(incluyehidromasajes)
        {
            preciototal=preciototal+20;
        }
        if(incluyeBañoDeBarro)
        {
            preciototal=preciototal+30;
        }
        return preciototal;
    }


}

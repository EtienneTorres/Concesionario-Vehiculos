public class Cultural extends Paquetes{

private int cantidadvisista;

    public Cultural(int numId, String destino, int stock, int duracion, double preciounitario, double preciobase, int cantidadvisista) {
        super(numId, destino, stock, duracion, preciounitario, preciobase);
        this.cantidadvisista = cantidadvisista;
    }


    public int getCantidadvisista() {
        return cantidadvisista;
    }

    public void setCantidadvisista(int cantidadvisista) {
        this.cantidadvisista = cantidadvisista;
    }

    @Override
    public double CalcularPrecioTotal() {
        double preciototal=preciobase+(preciounitario*10);
        preciototal=preciototal*1.05;
        return preciototal;

    }
}

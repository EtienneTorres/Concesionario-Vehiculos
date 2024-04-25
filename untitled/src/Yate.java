public class Yate  implements  CalcularPrecio{

    private double longitud;
    private boolean tieneCabina;
    private double precioBase;

    public Yate(double longitud, boolean tieneCabina, double precioBase) {
        this.longitud = longitud;
        this.tieneCabina = tieneCabina;
        this.precioBase = precioBase;
    }


    // Getters y setters
    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public boolean tieneCabina() {
        return tieneCabina;
    }

    public void setTieneCabina(boolean tieneCabina) {
        this.tieneCabina = tieneCabina;
    }

    @Override
    public String toString() {
        return "Yate{" +
                "longitud=" + longitud +
                ", tieneCabina=" + tieneCabina +
                ", precioBase=" + precioBase +
                '}';
    }

    public double CalcularPrecio() {
        return  100;
    }


}

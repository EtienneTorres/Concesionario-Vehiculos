public class Moto extends Vehiculo implements CalcularPrecio {


    private  int cilindrada;
    private boolean tieneBaul;


    public Moto(){};


    public Moto(String patente, String marca, String modelo, float consumoCombustible, int cantidadRuedas, float precio,
                int cilindrada, boolean tieneBaul) {
        super(patente, marca, modelo, consumoCombustible, cantidadRuedas, precio);
        this.cilindrada = cilindrada;
        this.tieneBaul = tieneBaul;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isTieneBaul() {
        return tieneBaul;
    }

    public void setTieneBaul(boolean tieneBaul) {
        this.tieneBaul = tieneBaul;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrada=" + cilindrada +
                ", tieneBaul=" + tieneBaul +
                '}'+super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Moto moto)) return false;
        if (!super.equals(o)) return false;
        return getCilindrada() == moto.getCilindrada() && isTieneBaul() == moto.isTieneBaul();
    }

    @Override
    public double CalcularPrecio() {
        return 5*getPrecio();
    }
}

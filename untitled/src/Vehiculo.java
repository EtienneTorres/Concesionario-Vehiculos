import java.util.Objects;

public  abstract class   Vehiculo implements CalcularPrecio {

    private String patente;
    private String marca;
    private String modelo;
    private float consumoCombustible;
    private int cantidadRuedas;
    private float precio;


    public Vehiculo() {};

    public Vehiculo(String patente, String marca, String modelo, float consumoCombustible, int cantidadRuedas, float precio) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.consumoCombustible = consumoCombustible;
        this.cantidadRuedas = cantidadRuedas;
        this.precio = precio;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(float consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }




    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", consumoCombustible=" + consumoCombustible +
                ", cantidadRuedas=" + cantidadRuedas +
                ", precio=" + precio +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehiculo vehiculo)) return false;
        return Float.compare(getConsumoCombustible(), vehiculo.getConsumoCombustible()) == 0 && getCantidadRuedas() == vehiculo.getCantidadRuedas()
                && Float.compare(getPrecio(), vehiculo.getPrecio()) == 0 && Objects.equals(getPatente(), vehiculo.getPatente()) && Objects.equals(getMarca(),
                vehiculo.getMarca()) && Objects.equals(getModelo(), vehiculo.getModelo());
    }


public abstract double CalcularPrecio();


}

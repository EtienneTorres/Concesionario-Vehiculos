import java.util.Objects;

public class Auto  extends  Vehiculo implements  CalcularPrecio{



    private String prestaciones;
    private String ModoCambio;

    public Auto(){};


    public Auto(String patente, String marca, String modelo, float consumoCombustible, int cantidadRuedas, float precio, String prestaciones, String modoCambio) {
        super(patente, marca, modelo, consumoCombustible, cantidadRuedas, precio);
        this.prestaciones = prestaciones;
        this.ModoCambio = modoCambio;
    }





    public String getPrestaciones() {
        return prestaciones;
    }

    public void setPrestaciones(String prestaciones) {
        this.prestaciones = prestaciones;
    }

    public String getModoCambio() {
        return ModoCambio;
    }

    public void setModoCambio(String modoCambio) {
        ModoCambio = modoCambio;
    }



    @Override
    public String toString() {
        return "Auto{" +
                "prestaciones=" + prestaciones +
                ", ModoCambio='" + ModoCambio + '\'' +
                '}'+super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto auto)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getPrestaciones(), auto.getPrestaciones()) && Objects.equals(getModoCambio(), auto.getModoCambio());
    }

    @Override
    public double CalcularPrecio() {
        return 10*getPrecio();
    }
}

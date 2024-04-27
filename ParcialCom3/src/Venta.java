import java.util.Date;
import java.util.List;

public class Venta {

    private Date fecha;
    private Cliente cliente;

    private List<Paquetes>paquetesadquiridos;

    public Venta(Date fecha, Cliente cliente, List<Paquetes> paquetesadquiridos) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.paquetesadquiridos = paquetesadquiridos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Paquetes> getPaquetesadquiridos() {
        return paquetesadquiridos;
    }

    public void setPaquetesadquiridos(List<Paquetes> paquetesadquiridos) {
        this.paquetesadquiridos = paquetesadquiridos;
    }
}

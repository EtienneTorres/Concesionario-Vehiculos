import java.util.List;
import java.util.ArrayList;

public class Agencia {

    private List<Cliente>clientes;

    private List<Paquetes>paquetito;

    private List<Venta>historialventas;


    public Agencia() {
        this.clientes = new ArrayList<>();
        this.paquetito = new ArrayList<>();
        this.historialventas = new ArrayList<>();
    }


    public  void agregarcliente(Cliente cliente)
    {
        clientes.add(cliente);
    }

    public void agregarpaquete(Paquetes paquete)
    {
      paquetito.add(paquete);
    }

  public void  registrarventa(Venta venta)
  {
      historialventas.add(venta);
  }

  public void aumentarpreciopaqueteaventura( double porcentaje)
  {
      for(Paquetes paquete:paquetito)
      {
          if(paquete instanceof Aventura)
          {
              double nuevoprecio=paquete.getPreciounitario()*(1+porcentaje/100);
              paquete.setPreciounitario(nuevoprecio);
          }
      }
  }

  public boolean eliminarpaquete( int identificacion)
      {
          for (int i=0;i<paquetito.size();i++)
          {
              if(paquetito.get(i).NumId==identificacion)
              {
                  paquetito.remove(i);
                  return true;
              }
          }
          return false;
      }


    public void mostrarInformacionAgencia() {
        System.out.println("Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNombre() + " (ID: " + cliente.getNumPasaporte() + ")");
        }

        System.out.println("\nPaquetes Turísticos:");
        for (Paquetes paquete : paquetito) {
            System.out.println(paquete.getDestino()+ " - Precio: $" + paquete.CalcularPrecioTotal());
        }

        System.out.println("\nVentas Registradas:");
        for (Venta venta : historialventas) {
            System.out.println("Fecha: " + venta.getFecha() + ", Cliente: " + venta.getCliente().getNombre());
            System.out.println("Paquetes adquiridos:");
            for (Paquetes paquete : venta.getPaquetesadquiridos()) {
                System.out.println("- " + paquete.getDestino());
            }
        }}

        public Paquetes obtenerPaquetemasVendido() {

            Paquetes paqueteMasVendido = null;
            int maxVentas = 0;

            for (Venta venta : historialventas) {
                int cantidadPaquetes = venta.getPaquetesadquiridos().size();
                if (cantidadPaquetes > maxVentas) {
                    maxVentas = cantidadPaquetes;
                    paqueteMasVendido = venta.getPaquetesadquiridos().get(0); // Tomamos el primer paquete de la venta
                }
            }

            return paqueteMasVendido;
        }

    }


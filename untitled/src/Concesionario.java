import java.util.ArrayList;

public class Concesionario {

    private ArrayList<Vehiculo> vehiculos;

    public Concesionario()
    {
        this.vehiculos=new ArrayList<>();
    }

    public Concesionario(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = new ArrayList<>(vehiculos);
    }

    //METODOS

    public void agregarvehiculo(Vehiculo vehiculo) {
       this.vehiculos.add(vehiculo);
    }


    // Método para buscar un vehículo por su patente
    public Vehiculo buscarPorPatente(String patente) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPatente().equals(patente)) {
                return vehiculo;
            }
        }
        return null; // si no se encuentra el vehiculo
    }

    // Método para contar la cantidad de vehículos en la lista
    public int contarVehiculos() {
        return vehiculos.size();
    }

    // Método para devolver un listado de todos los vehículos
    public ArrayList<Vehiculo> devolverlistado() {
        return new ArrayList<>(vehiculos);
    }

// Método para eliminar un vehículo por su patente

    public void  eliminarporpatente(String patente) {
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo vehiculo = vehiculos.get(i);
            if (vehiculo.getPatente().equals(patente)) {
                vehiculos.remove(i);
            }
        }
    }

    // Método para calcular el total del inventario
    public float calcularTotalInventario() {
        float total = 0;
        for (Vehiculo vehiculo : vehiculos) {
            total += vehiculo.getPrecio();
        }
        return total;
    }


    public static void main(String[] args) {
        //Crear el contenedor de vehículos
         Concesionario concesionario = new Concesionario();


        // Crear algunos vehículos de prueba
        Auto auto1 = new Auto("ABC123", "Toyota", "Corolla", 8.5f, 4, 25000, "300kmh", "Automático");
        Moto moto1 = new Moto("DEF456", "Honda", "CBR500R", 4.3f, 2, 8000,
                500, false);



        // Agregar vehículos al contenedor
        concesionario.agregarvehiculo(auto1);
        concesionario.agregarvehiculo(moto1);

        // Mostrar la cantidad de vehículos
        System.out.println("Cantidad de vehículos: " + concesionario.contarVehiculos());

        // Buscar un vehículo por patente
        System.out.println("Buscar vehículo por patente: " + concesionario.buscarPorPatente("ABC123"));

        // Mostrar el listado de vehículos
        System.out.println("Listado de vehículos:");
        ArrayList<Vehiculo> listado = concesionario.devolverlistado();
        for (Vehiculo vehiculo : listado) {
            System.out.println(vehiculo);
        }

        // Eliminar un vehículo por patente
        concesionario.eliminarporpatente("ABC123");
        System.out.println("Cantidad de vehículos después de eliminar: " + concesionario.contarVehiculos());
    }
}

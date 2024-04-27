public class Cliente {

private  String nombre;

private String Apellido;

private  int NumPasaporte;


    public Cliente(String nombre, String apellido, int numPasaporte) {
        this.nombre = nombre;
        Apellido = apellido;
        NumPasaporte = numPasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getNumPasaporte() {
        return NumPasaporte;
    }

    public void setNumPasaporte(int numPasaporte) {
        NumPasaporte = numPasaporte;
    }
}

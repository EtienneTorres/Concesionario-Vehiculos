public abstract class  Paquetes {

    protected int NumId;
    protected   String Destino;
    protected int stock;
    protected   int duracion;

    protected double preciounitario;

    protected double preciobase;


    public Paquetes(int numId, String destino, int stock, int duracion, double preciounitario, double preciobase) {
        NumId = numId;
        Destino = destino;
        this.stock = stock;
        this.duracion = duracion;
        this.preciounitario = preciounitario;

        switch (destino)
        {
            case "playa":
                this.preciobase=600;
                break;

            case "montaña":
                this.preciobase=500;
                break;
        }
    }

    public int getNumId() {
        return NumId;
    }

    public void setNumId(int numId) {
        NumId = numId;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(double preciounitario) {
        this.preciounitario = preciounitario;
    }

    public double getPreciobase() {
        return preciobase;
    }

    public void setPreciobase(double preciobase) {
        this.preciobase = preciobase;
    }

    public abstract double CalcularPrecioTotal();


}

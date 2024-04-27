public class Aventura extends Paquetes{

 private boolean IncluyeKayak;
 private boolean IncluyeSenderismo;


 public Aventura(int numId, String destino, int stock, int duracion, double preciounitario, double preciobase, boolean incluyeKayak, boolean incluyeSenderismo) {
  super(numId, destino, stock, duracion, preciounitario, preciobase);
  IncluyeKayak = incluyeKayak;
  IncluyeSenderismo = incluyeSenderismo;
 }


 public boolean isIncluyeKayak() {
  return IncluyeKayak;
 }

 public void setIncluyeKayak(boolean incluyeKayak) {
  IncluyeKayak = incluyeKayak;
 }

 public boolean isIncluyeSenderismo() {
  return IncluyeSenderismo;
 }

 public void setIncluyeSenderismo(boolean incluyeSenderismo) {
  IncluyeSenderismo = incluyeSenderismo;
 }

 public double CalcularPrecioTotal()
 {
     double preciototal=preciobase;
     if(IncluyeKayak)
     {
      preciototal=preciototal+50;
     }
     if(IncluyeSenderismo)
     {
      preciototal=preciototal+40;
     }
     preciototal=preciototal*1.05;
     return preciototal;
 }




}

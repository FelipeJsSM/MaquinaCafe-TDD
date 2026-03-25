public class Cafetera {
    private int cantidadCafe;

    public Cafetera(int cantidad) {
        this.cantidadCafe = cantidad;
    }

    public boolean hasCafe(int cantidad) {
        return this.cantidadCafe >= cantidad;
    }

    public void giveCafe(int cantidad) {
        this.cantidadCafe -= cantidad;
    }

    public int getCantidadCafe() {
        return this.cantidadCafe;
    }
}
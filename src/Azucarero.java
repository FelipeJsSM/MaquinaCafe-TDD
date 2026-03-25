public class Azucarero {
    private int cantidadDeAzucar;

    public Azucarero(int cantidad) {
        this.cantidadDeAzucar = cantidad;
    }

    public boolean hasAzucar(int cantidad) {
        return this.cantidadDeAzucar >= cantidad;
    }

    public void giveAzucar(int cantidad) {
        this.cantidadDeAzucar -= cantidad;
    }

    public int getCantidadAzucar() {
        return this.cantidadDeAzucar;
    }
}
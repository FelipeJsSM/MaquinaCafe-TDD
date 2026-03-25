public class MaquinaDeCafe {
    private Cafetera cafetera;
    private Vaso vasosPequeno;
    private Vaso vasosMediano;
    private Vaso vasosGrande;
    private Azucarero azucarero;

    public Vaso getTipoDeVaso(String tipo) {
        if (tipo.equals("pequeno")) return vasosPequeno;
        if (tipo.equals("mediano")) return vasosMediano;
        if (tipo.equals("grande")) return vasosGrande;
        return null;
    }

    public String getVasoDeCafe(Vaso vaso, int cantidadDeVasos, int cantidadDeAzucar) {
        if (!vaso.hasVasos(cantidadDeVasos)) return "No hay Vasos";
        
        int cafeNecesario = vaso.getContenido() * cantidadDeVasos;
        if (!cafetera.hasCafe(cafeNecesario)) return "No hay Cafe";
        
        if (!azucarero.hasAzucar(cantidadDeAzucar)) return "No hay Azucar";

        vaso.giveVasos(cantidadDeVasos);
        cafetera.giveCafe(cafeNecesario);
        azucarero.giveAzucar(cantidadDeAzucar);

        return "Felicitaciones";
    }

    public void setCafetera(Cafetera cafetera) { this.cafetera = cafetera; }
    public void setVasosPequeno(Vaso vaso) { this.vasosPequeno = vaso; }
    public void setVasosMediano(Vaso vaso) { this.vasosMediano = vaso; }
    public void setVasosGrande(Vaso vaso) { this.vasosGrande = vaso; }
    public void setAzucarero(Azucarero azucarero) { this.azucarero = azucarero; }
    public Cafetera getCafetera() { return cafetera; }
    public Vaso getVasosPequeno() { return vasosPequeno; }
    public Azucarero getAzucarero() { return azucarero; }
}
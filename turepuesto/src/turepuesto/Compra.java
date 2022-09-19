package turepuesto;

import java.util.ArrayList;

public class Compra {

    private ArrayList<Repuesto> repuestos;
    private ArrayList<Accesorio> accesorios;
    private ArrayList<Oferta> ofertasRecibidas;


    public void guardarOfertaNueva() {}

    public void selecionarOfertaAComprar(Oferta ofertaAComprar) {

    }

    public ArrayList<Repuesto> getRepuestos() {
        return repuestos;
    }

    public void setRepuestos(ArrayList<Repuesto> repuestos) {
        this.repuestos = repuestos;
    }

    public ArrayList<Accesorio> getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(ArrayList<Accesorio> accesorios) {
        this.accesorios = accesorios;
    }

    public ArrayList<Oferta> getOfertasRecibidas() {
        return ofertasRecibidas;
    }

    public void setOfertasRecibidas(ArrayList<Oferta> ofertasRecibidas) {
        this.ofertasRecibidas = ofertasRecibidas;
    }
}

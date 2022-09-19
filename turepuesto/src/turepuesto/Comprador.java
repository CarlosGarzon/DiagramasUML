package turepuesto;

import java.util.ArrayList;

public class Comprador extends Actor {

    private ArrayList<Compra> compras;
    private int radioDeBusqueda;

    public Repuesto buscarRespuesto(){return null;}

    public  Accesorio buscarAccesorio(){return null;}

    public void agregarRepuestoACompra(Repuesto repuestoParaAgregar) {}

    public void agregarAccesorioaCompra(Accesorio accesorioParaAgregar) {}

    public void borrarRepuestoDeCompra(Repuesto repuestoABorrar) {}

    public void borrarAccesorioDeCompra(Accesorio accesorioABorrar) {}

    public boolean publicarCompra() {
        return true;
    }

    public void comprarOferta(Compra compraParaSeleccionarOferta) {};

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public boolean configurarNuevoRadioDEBusqueda(int radioBusqueda ) { return true; }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    public int getRadioDeBusqueda() {
        return radioDeBusqueda;
    }

    public void setRadioDeBusqueda(int radioDeBusqueda) {
        this.radioDeBusqueda = radioDeBusqueda;
    }
}

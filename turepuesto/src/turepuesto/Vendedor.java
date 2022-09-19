package turepuesto;

import java.util.ArrayList;

public class Vendedor extends Actor{

    private ArrayList<Compra> compras;


    public void hacerOfertaACompra(Compra compraAOfertar) {}

    public boolean publicarOferta() {return true;}

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }
}

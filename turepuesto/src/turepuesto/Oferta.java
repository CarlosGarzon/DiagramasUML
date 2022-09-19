package turepuesto;

import java.util.ArrayList;

public class Oferta {


    private ArrayList<CamposOferta> ofertaRepuesto;
    private ArrayList<CamposOferta> ofertaAccesorio;


    public ArrayList<CamposOferta> getOfertaRepuesto() {
        return ofertaRepuesto;
    }

    public void setOfertaRepuesto(ArrayList<CamposOferta> ofertaRepuesto) {
        this.ofertaRepuesto = ofertaRepuesto;
    }

    public ArrayList<CamposOferta> getOfertaAccesorio() {
        return ofertaAccesorio;
    }

    public void setOfertaAccesorio(ArrayList<CamposOferta> ofertaAccesorio) {
        this.ofertaAccesorio = ofertaAccesorio;
    }
}

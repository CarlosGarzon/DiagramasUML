package turepuesto;

public class Repuesto extends Articulo {

    private String nombreRepuesto;
    private Motocicleta motocicleta;
    private TipoRepuesto tipoRepuesto;

    public Motocicleta getMotocicleta() {
        return motocicleta;
    }

    public void setMotocicleta(Motocicleta motocicleta) {
        this.motocicleta = motocicleta;
    }

    public TipoRepuesto getTipoRepuesto() {
        return tipoRepuesto;
    }

    public void setTipoRepuesto(TipoRepuesto tipoRepuesto) {
        this.tipoRepuesto = tipoRepuesto;
    }

    public String getNombreRepuesto() {
        return nombreRepuesto;
    }

    public void setNombreRepuesto(String nombreRepuesto) {
        this.nombreRepuesto = nombreRepuesto;
    }
}

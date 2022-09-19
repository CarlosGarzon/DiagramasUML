package turepuesto;

public class Accesorio extends Articulo{

    private String nombreAccesorio;
    private TipoAccesorio tipoAccesorio;
    private MarcaAccesorios marcaAccesorio;

    public String getNombreAccesorio() {
        return nombreAccesorio;
    }

    public void setNombreAccesorio(String nombreAccesorio) {
        this.nombreAccesorio = nombreAccesorio;
    }

    public TipoAccesorio getTipoAccesorio() {
        return tipoAccesorio;
    }

    public void setTipoAccesorio(TipoAccesorio tipoAccesorio) {
        this.tipoAccesorio = tipoAccesorio;
    }

    public MarcaAccesorios getMarcaAccesorio() {
        return marcaAccesorio;
    }

    public void setMarcaAccesorio(MarcaAccesorios marcaAccesorio) {
        this.marcaAccesorio = marcaAccesorio;
    }
}

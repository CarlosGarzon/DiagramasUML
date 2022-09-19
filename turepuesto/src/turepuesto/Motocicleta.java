package turepuesto;

public class Motocicleta {

    private TipoMotocicleta tipoMotocicleta;
    private MarcaMotocicleta marca;
    private short añoMotocicleta;

    public TipoMotocicleta getTipoMotocicleta() {
        return tipoMotocicleta;
    }

    public void setTipoMotocicleta(TipoMotocicleta tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }

    public MarcaMotocicleta getMarca() {
        return marca;
    }

    public void setMarca(MarcaMotocicleta marca) {
        this.marca = marca;
    }

    public short getAñoMotocicleta() {
        return añoMotocicleta;
    }

    public void setAñoMotocicleta(short añoMotocicleta) {
        this.añoMotocicleta = añoMotocicleta;
    }
}

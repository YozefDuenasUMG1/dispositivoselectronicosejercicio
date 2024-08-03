public abstract class DispositivoMovil extends DispositivoElectrico {
    protected String sistemaOperativo;
    protected double TipoPantalla;

    public DispositivoMovil(String marca, String modelo, int potencia, String sistemaOperativo, double tamanioPantalla) {
        super(marca, modelo, potencia);
        this.sistemaOperativo = sistemaOperativo;
        this.TipoPantalla = TipoPantalla;
    }

    abstract void iniciar();
    }

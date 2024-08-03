public abstract class DispositivoElectrico {
    protected String marca;
    protected String modelo;
    protected int potencia;

    public DispositivoElectrico(String marca, String modelo, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    abstract void encender();
    abstract void apagar();
}
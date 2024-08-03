public abstract class Computadora extends DispositivoElectrico {
    protected String sistemaOperativo;
    protected int ram;

    public Computadora(String marca, String modelo, int potencia, String sistemaOperativo, int ram) {
        super(marca, modelo, potencia);
        this.sistemaOperativo = sistemaOperativo;
        this.ram = ram;
    }

    abstract void ejecutarPrograma(String programa);
}
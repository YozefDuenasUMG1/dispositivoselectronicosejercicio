public abstract class Electrodomestico extends DispositivoElectrico {
    protected String color;
    protected double capacidadLitros;

    public Electrodomestico(String marca, String modelo, int potencia, String color, double capacidadLitros) {
        super(marca, modelo, potencia);
        this.color = color;
        this.capacidadLitros = capacidadLitros;
    }

    abstract void realizarTarea();
}
public class Refrigerador extends Electrodomestico {
    private int numeroCompartimentos;

    public Refrigerador(String marca, String modelo, int potencia, String color, double capacidadLitros, int numeroCompartimentos) {
        super(marca, modelo, potencia, color, capacidadLitros);
        this.numeroCompartimentos = numeroCompartimentos;
    }

    @Override
    void encender() {
        System.out.println("Encendiendo refrigerador " + marca + " " + modelo);
    }

    @Override
    void apagar() {
        System.out.println("Apagando refrigerador " + marca + " " + modelo);
    }

    @Override
    void realizarTarea() {
        System.out.println("Refrigerador enfriando alimentos");
    }
}
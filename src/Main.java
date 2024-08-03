import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Laptop laptop = new Laptop("Dell", "XPS 15", 65, "Windows 11", 16, 1.8);
        Desktop desktop = new Desktop("HP", "Pavilion", 300, "Windows 10", 32, "Torre");
        Smartphone smartphone = new Smartphone("Apple", "iPhone 13", 20, "iOS", 6.1, 123456789);
        Tablet tablet = new Tablet("Samsung", "Galaxy Tab S7", 15, "Android", 11.0, true);
        Refrigerador refrigerador = new Refrigerador("LG", "InstaView", 100, "Plateado", 601.0, 4);
        Lavadora lavadora = new Lavadora("Whirlpool", "Supreme Care", 1000, "Blanco", 80.0, 1200);

        while (true) {
            System.out.println("\n--- Menú de Dispositivos Eléctricos ---");
            System.out.println("1. Laptop");
            System.out.println("2. Desktop");
            System.out.println("3. Smartphone");
            System.out.println("4. Tablet");
            System.out.println("5. Refrigerador");
            System.out.println("6. Lavadora");
            System.out.println("7. Salir");
            System.out.print("Seleccione un dispositivo (1-7): ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    operarDispositivo(laptop);
                    break;
                case 2:
                    operarDispositivo(desktop);
                    break;
                case 3:
                    operarDispositivoMovil(smartphone);
                    break;
                case 4:
                    operarDispositivoMovil(tablet);
                    break;
                case 5:
                    operarElectrodomestico(refrigerador);
                    break;
                case 6:
                    operarElectrodomestico(lavadora);
                    break;
                case 7:
                    System.out.println("Gracias por usar el programa. ¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }

    private static void operarDispositivo(DispositivoElectrico dispositivo) {
        dispositivo.encender();
        if (dispositivo instanceof Computadora) {
            ((Computadora) dispositivo).ejecutarPrograma("Programa de ejemplo");
        }
        dispositivo.apagar();
    }

    private static void operarDispositivoMovil(DispositivoMovil dispositivo) {
        dispositivo.encender();
        dispositivo.iniciar();
        dispositivo.apagar();
    }

    private static void operarElectrodomestico(Electrodomestico electrodomestico) {
        electrodomestico.encender();
        electrodomestico.realizarTarea();
        electrodomestico.apagar();
    }
}
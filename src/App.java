import java.util.Scanner;

public class App {
    static AvionAPI vuelos = new AvionAPI();

    public static void main(String[] args) throws Exception {

        CheckFacade cliente1 = new CheckFacade();

        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\nSeleccione Origen:");
        String origen = entrada.nextLine();
        System.out.println("\n\nSeleccione Destino:");
        String destino = entrada.nextLine();
        System.out.println("\n\nSeleccione Fecha Inicial:");
        String fechaIda = entrada.nextLine();
        System.out.println("\n\nSeleccione Fecha Final:");
        String fechaVuelta = entrada.nextLine();

        cliente1.buscar(fechaIda, fechaVuelta, origen, destino);

    }

}
public class AvionAPI {
    public void buscarVuelos(String fechaIda, String fechaVuelta, String origen, String destino) {
        System.out.println("\n*************************************************");
        System.out.println("3 Vuelos encontrados hacia " + destino.toUpperCase() + " desde " + origen.toUpperCase());
        System.out.println("Fecha IDA: " + fechaIda + " - Fecha VUELTA: " + fechaVuelta);
        //System.out.println("\n");
    }
}

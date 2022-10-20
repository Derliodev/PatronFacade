public class CheckFacade {
    private AvionAPI avionAPI;
    private HotelAPI hotelAPI;
    private RentACarAPI rentAPI;

    public CheckFacade() {
        avionAPI = new AvionAPI();
        hotelAPI = new HotelAPI();
        rentAPI = new RentACarAPI();
    }

    public void buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
        avionAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
        hotelAPI.buscarHoteles(fechaIda, fechaVuelta, origen, destino);
        rentAPI.buscarRentACar(fechaIda, fechaVuelta, origen, destino);
    }
}

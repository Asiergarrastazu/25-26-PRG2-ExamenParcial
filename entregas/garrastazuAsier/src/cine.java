class cine {

    public String datosPeliculas[][];
    public String salasTotales[];
    public String asientosTotales[];
    public String asientosYaVendidos[];
    public String fechasDisponibles[];
    public String horasDisponibles[];
    public String precio[];

    public void numeroEntradasVendidas(String asientosTotales, String asientosVendidos) {
        int total = Integer.parseInt(asientosTotales);
        int vendidos = Integer.parseInt(asientosVendidos);
        System.out.println(vendidos + " entradas vendidas de " + total);
    }

    public void calcularRecaudacion(String numeroEntradasVendidas, String precio) {
        int entradas = Integer.parseInt(numeroEntradasVendidas);
        double p = Double.parseDouble(precio);
        double total = entradas * p;
        System.out.println((int) total + "€");
    }

    public void asignarProyeccion(String pelicula, String hora, String fecha, String sala) {
        System.out.println("\"" + pelicula + "\" - " + sala + " - " + fecha + " " + hora);
    }

    public void crearCartelera(String asignarProyeccion) {
        System.out.println(asignarProyeccion);
}

    public void mostrarCartelera(String crearCartelera) {
        System.out.println(crearCartelera);
}

    public void mapearAsientos(String asientosTotales, String asientosYaVendidos) {
        int total = Integer.parseInt(asientosTotales);
        int vendidos = Integer.parseInt(asientosYaVendidos);

        for (int i = 0; i < total; i++) {
            if (i < vendidos) System.out.print("[X]");
            else System.out.print("[ ]");
        }
        System.out.println();
    }

    public void seleccionarAsiento(String numeroAsiento) {
        System.out.println("Asiento seleccionado: " + numeroAsiento);
    }

    public void comprarEntrada(String cartelera, String precio) {
        System.out.println("Compra realizada para " + cartelera + " por " + precio + "€");
    }

    public static void main(String[] args) {

        cine cine = new cine();

        System.out.println("Cine: Cinepolis Centro\n");

        System.out.println("Películas:");
        System.out.println("\"Dune: Parte 2\" – Denis Villeneuve – 166 min – +13");
        System.out.println("\"Oppenheimer\" – Christopher Nolan – 180 min – +16\n");

        System.out.println("Salas:");
        System.out.println("Sala 1 – Capacidad: 100 asientos");
        System.out.println("Sala 2 – Capacidad: 150 asientos\n");

        System.out.println("Proyecciones:");
        cine.asignarProyeccion("Dune: Parte 2", "18:00", "01/04/2025", "Sala 1");
        System.out.print(" – 10€ – ");
        cine.numeroEntradasVendidas("100", "85");

        cine.asignarProyeccion("Oppenheimer", "20:00", "02/04/2025", "Sala 2");
        System.out.print(" – 12€ – ");
        cine.numeroEntradasVendidas("150", "120");

        System.out.println("\nRecaudación:");
        System.out.print("Sala 1: ");
        cine.calcularRecaudacion("85", "10");

        System.out.print("Sala 2: ");
        cine.calcularRecaudacion("120", "12");

        System.out.println("\nMapa de asientos Sala 1:");
        cine.mapearAsientos("20", "5");

        cine.seleccionarAsiento("6");

        cine.comprarEntrada("Dune: Parte 2 - Sala 1 - 18:00", "10");
    }
}
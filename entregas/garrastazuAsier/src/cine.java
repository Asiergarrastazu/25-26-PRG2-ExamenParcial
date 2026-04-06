class cine {
    
    public String datosPeliculas[][];
    public String salasTotales[];
    public String asientosTotales[];
    public String asientosVendidios[];
    public String fechasDisponibles[];
    public String horasDidponibles[];
    public String precio[];

    public void numeroDeEntradasVendidas(String asientosTotales, String asientosVendidos) {
        int totalAsientos = Integer.parseInt(asientosTotales);
        int asientosYaVendidos = Integer.parseInt(asientosVendidos);

        System.out.println("Vendidas: " + asientosYaVendidos + "/" + totalAsientos);
    }
    
    public void calcullarRecaudacion(String numeroEntradasVendidas, String precio){
        int entradas = Integer.parseInt(numeroEntradasVendidas);
        double p = Double.parseDouble(precio);
        System.out.println("Recaudación: " + (entradas * p));
    }
    
    public void asignarProyeccion(String datosPeliculas, String horaDisponible, String fechaDisponible, String salaDisponible) {
        System.out.println(datosPeliculas + " - " + salaDisponible + " - " + horaDisponible);
    }

    public void crearCartelera(String asignarProyeccion) {
        System.out.println("Cartelera: " + asignarProyeccion);
    }

    public void comprarEntrada(String cartelera, String precio) {
    
    }

    public void mapearAsientos(String asientosTotales, String asientosYaVendidos) {
    }

    public void seleccionarAsiento(String numeroAsiento) {
    }

    public void mostrarCartelera(String crearCartelera) {
        System.out.println("Mostrando: " + crearCartelera);
    }

        public static void main(String[] args) {

        }


}


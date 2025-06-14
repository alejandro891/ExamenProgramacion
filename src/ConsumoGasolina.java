public class ConsumoGasolina {
    

    // 1. Contar consumos mayores a 8 galones
    public static int contarConsumosAltos(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int consumo : fila) {
                if (consumo > 8) {
                    contador++;
                }
            }
        }
        return contador;
    }
        // 2. Promedio de consumos entre 4 y 7 galones inclusive
    public static double promedioConsumoModerado(int[][] matriz) {
        int suma = 0;
        int cantidad = 0;
        for (int[] fila : matriz) {
            for (int consumo : fila) {
                if (consumo >= 4 && consumo <= 7) {
                    suma += consumo;
                    cantidad++;
                }
            }
        }
        return cantidad > 0 ? (double) suma / cantidad : 0.0;
    }
    // 3. Imprimir consumos bajos (menores a 3 galones) con su posición
    public static void imprimirConsumoBajo(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j]<3) {
                    
                }
                
            }
        }
    


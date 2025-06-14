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
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 3) {
                    System.out.println("Consumo bajo en [" + i + "][" + j + "]: " + matriz[i][j] + " galones");
                }
            }
        }
    }

    // 4. Posición del consumo máximo 
    public static int[] posicionConsumoMaximo(int[][] matriz) {
        int max = Integer.MIN_VALUE;
        int[] posicion = new int[2]; // [i][j]
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }
        return posicion;
    }

    // BONUS: Mostrar matriz de forma tabular
    //Imprime la matriz de consumo en formato tabular.
   //Cada fila representa un día o grupo de datos de vehículos.
   //Se usa \t (tabulación) para que los números queden bien alineados
   
    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz de consumo:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }

    // Método principal para probar el funcionamiento
    public static void main(String[] args) {
        int[][] consumo = {
            {2, 5, 9},
            {4, 8, 3},
            {1, 6, 10}
        };

        imprimirMatriz(consumo); // BONUS

        System.out.println("\nConsumos altos (>8 galones): " + contarConsumosAltos(consumo));
        System.out.println("Promedio consumo moderado (4-7 gal): " + promedioConsumoModerado(consumo));
        System.out.println("\nConsumos bajos (<3 galones):");
        imprimirConsumoBajo(consumo);

        int[] posicionMaxima = posicionConsumoMaximo(consumo);
        System.out.println("\nMayor consumo en [" + posicionMaxima[0] + "][" + posicionMaxima[1] + "]: " + consumo[posicionMaxima[0]][posicionMaxima[1]] + " galones");
    }
}

package ordenamientoborbuja;

import java.util.Arrays;

public class OrdenamientoBorbuja {

    // Metodo burbuja normal
    public static void ordenamientoBurbuja(int[] arreglo) {

        for (int i = 0; i < arreglo.length - 1; i++) {

            for (int j = 0; j < arreglo.length - 1; j++) {

                // Comparamos los numeros que estan juntos
                if (arreglo[j] > arreglo[j + 1]) {

                    // Cambiamos los numeros de lugar
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
    }

    // Metodo burbuja mejorado
    public static void ordenamientoBurbujaMejorado(int[] arreglo) {

        boolean cambio;

        for (int i = 0; i < arreglo.length - 1; i++) {

            cambio = false;

            for (int j = 0; j < arreglo.length - 1 - i; j++) {

                if (arreglo[j] > arreglo[j + 1]) {

                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;

                    cambio = true;
                }
            }

            // Si no hubo cambios, ya esta ordenado
            if (cambio == false) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        int[] numeros1 = {5, 2, 8, 1, 3};
        int[] numeros2 = {5, 2, 8, 1, 3};

        int[] numeros3 = {1, 2, 4, 3, 5};
        int[] numeros4 = {1, 2, 4, 3, 5};

        System.out.println("BURBUJA NORMAL");

        System.out.println("Arreglo inicial: "
                + Arrays.toString(numeros1));

        ordenamientoBurbuja(numeros1);

        System.out.println("Arreglo ordenado: "
                + Arrays.toString(numeros1));

        System.out.println();

        System.out.println("BURBUJA MEJORADO");

        System.out.println("Arreglo inicial: "
                + Arrays.toString(numeros2));

        ordenamientoBurbujaMejorado(numeros2);

        System.out.println("Arreglo ordenado: "
                + Arrays.toString(numeros2));

        System.out.println();

        System.out.println("PRUEBA CON ARREGLOS PARCIALMENTE ORDENADOS");

        System.out.println("Arreglo inicial normal: "
                + Arrays.toString(numeros3));

        ordenamientoBurbuja(numeros3);

        System.out.println("Resultado normal: "
                + Arrays.toString(numeros3));

        System.out.println();

        System.out.println("Arreglo inicial mejorado: "
                + Arrays.toString(numeros4));

        ordenamientoBurbujaMejorado(numeros4);

        System.out.println("Resultado mejorado: "
                + Arrays.toString(numeros4));
    }
}
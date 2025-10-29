package ordenacaoemjava;

import java.util.Arrays;
import java.util.Random;

public class OrdenacaoEmJava {

    // Programa principal
    public static void main(String[] args) {
        int[] lista = gerarLista(20, 100);
        System.out.println("Lista original: " + Arrays.toString(lista));

        int[] ordenadaBubble = bubbleSort(lista);
        int[] ordenadaQuick = Arrays.copyOf(lista, lista.length);
        quickSort(ordenadaQuick, 0, ordenadaQuick.length - 1);

        System.out.println("\nBubble Sort: " + Arrays.toString(ordenadaBubble));
        System.out.println("Quick Sort:  " + Arrays.toString(ordenadaQuick));

        int valor = lista[5];
        System.out.println("\nBuscando valor: " + valor);

        System.out.println("Busca Linear - Indice: " + buscaLinear(lista, valor));
        System.out.println("Busca Binaria - Indice: " + buscaBinaria(ordenadaQuick, valor));
    }
    
    //  1. Gera uma lista de números aleatórios
    static int[] gerarLista(int tamanho, int limite) {
        Random r = new Random();
        int[] lista = new int[tamanho];
        for (int i = 0; i < tamanho; i++) lista[i] = r.nextInt(limite);
        return lista;
    }

    // 2. Bubble Sort (ordenador simples)
    static int[] bubbleSort(int[] arr) {
        int[] a = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < a.length - 1; i++)
            for (int j = 0; j < a.length - 1 - i; j++)
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
        return a;
    }

    // 3. Quick Sort (ordenador eficiente)
    static void quickSort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = arr[fim];
            int i = inicio - 1;

            for (int j = inicio; j < fim; j++) {
                if (arr[j] <= pivo) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            int temp = arr[i + 1];
            arr[i + 1] = arr[fim];
            arr[fim] = temp;

            int posPivo = i + 1;

            // Chamada recursiva para as duas metades
            quickSort(arr, inicio, posPivo - 1);
            quickSort(arr, posPivo + 1, fim);
        }
    }

    // 4. Busca Linear
    static int buscaLinear(int[] arr, int valor) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == valor) return i;
        return -1;
    }

    // 5. Busca Binária (requer lista ordenada)
    static int buscaBinaria(int[] arr, int valor) {
        int ini = 0, fim = arr.length - 1;
        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            if (arr[meio] == valor) return meio;
            if (arr[meio] < valor) ini = meio + 1;
            else fim = meio - 1;
        }
        return -1;
    }
}

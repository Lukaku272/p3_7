public class Main {
    public static void main(String[] args) {
        // Tworzenie tabliczki mnożenia
        int[][] tabliczka = new int[10][10];

        // Generowanie tabliczki mnożenia
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabliczka[i][j] = (i + 1) * (j + 1);
            }
        }

        // Wyświetlanie tabliczki mnożenia
        System.out.println("Tabliczka mnożenia od 1 do 10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tabliczka[i][j] + "\t");
            }
            System.out.println();
        }

        // Sumowanie wierszy
        int[] sumaWierszy = new int[10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sumaWierszy[i] += tabliczka[i][j];
            }
        }

        // Sumowanie iloczynów kolumn (zmiana na mnożenie, używamy long)
        long[] iloczynKolumn = new long[10];
        for (int j = 0; j < 10; j++) {
            iloczynKolumn[j] = 1; // Inicjujemy mnożenie od 1
            for (int i = 0; i < 10; i++) {
                iloczynKolumn[j] *= tabliczka[i][j]; // Mnożymy wartości w kolumnie
            }
        }

        // Wyświetlanie sum wierszy
        System.out.println("\nSuma wierszy:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Wiersz " + (i + 1) + ": " + sumaWierszy[i]);
        }

        // Wyświetlanie iloczynów kolumn
        System.out.println("\nIloczyn kolumn:");
        for (int j = 0; j < 10; j++) {
            System.out.println("Kolumna " + (j + 1) + ": " + iloczynKolumn[j]);
        }
    }
}

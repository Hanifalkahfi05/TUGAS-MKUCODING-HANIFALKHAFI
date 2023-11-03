public class Main {
    public static void main(String[] args) {
        // Membuat sebuah array integer
        int[] angka = {1, 2, 3, 4, 5};

        // Menampilkan semua nilai dalam array menggunakan perulangan for
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + angka[i]);
        }
    }
}

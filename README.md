# TUGAS-MKUCODING-HANIFALKHAFI
# TUGAS 1
1

    for (int i = 1; i <= 100; i++) {
Inisialisasi (int i = 1): Bagian ini digunakan untuk menginisialisasi variabel iterasi i. Dalam contoh ini, i diinisialisasi dengan nilai 1. Ini adalah nilai awal dari variabel yang akan digunakan dalam pengulangan. Peningkatan Variabel Iterasi (i++): Bagian ini mendefinisikan bagaimana variabel iterasi akan ditingkatkan setiap kali perulangan selesai dijalankan.Dengan pernyataan for ini, Anda akan menjalankan blok kode yang ada dalam kurung kurawal {} sebanyak 100 kali, mulai dari i sama dengan 1 dan terus bertambah hingga i mencapai atau melebihi 100. 

2

    System.out.printf("%4d(HANIF)%n", i);
System.out.printf(): Ini adalah perintah untuk mencetak output dengan format tertentu menggunakan printf.(HANIF): Ini adalah string yang akan dicetak setelah bilangan bulat. Dalam contoh ini, "(HANIF)" akan dicetak setiap kali bilangan bulat i dicetak i: Ini adalah variabel yang akan dicetak sesuai dengan format yang diberikan. Nilai dari i akan dicetak dalam ruang yang dialokasikan sebesar 4 karakter sesuai dengan %4d contohnya yaitu
![Screenshot (10)](https://github.com/Hanifalkahfi05/TUGAS-MKUCODING-HANIFALKHAFI/assets/147523271/02c9f36f-caa2-4acb-98f8-3398a84759fb)

# TUGAS 2
1

            while (i <= n) {
            if (i % 2 == 0) {
             totalGenap += i;
            }
            i++;

   
while (i <= n): Ini adalah awal dari perulangan while. Ini mengevaluasi apakah nilai i kurang dari atau sama dengan n. Selama kondisi ini benar (true), perulangan akan terus berlanjut.if (i % 2 == 0): Ini adalah bagian dari pernyataan if. Ini memeriksa apakah nilai i adalah bilangan genap atau bukan. Operasi modulo (%) digunakan untuk memeriksa apakah sisa pembagian i dengan 2 sama dengan 0. Jika hasilnya adalah 0, maka i adalah bilangan genap.i++: Pernyataan ini digunakan untuk meningkatkan nilai i sebesar 1 setiap kali perulangan selesai dijalankan. Ini bertujuan untuk memindahkan perulangan ke nilai selanjutnya.

2

    System.out.println("Jumlah bilangan genap dari 1 hingga " + n + " adalah: " + totalGenap);
Baris kode System.out.println("Jumlah bilangan genap dari 1 hingga " + n + " adalah: " + totalGenap); digunakan untuk mencetak hasil jumlah bilangan genap dari 1 hingga n ke layar dalam bahasa Java. contohnya yaitu:

![Screenshot (24)](https://github.com/Hanifalkahfi05/TUGAS-MKUCODING-HANIFALKHAFI/assets/147523271/a5b92864-2d5b-4ad0-829a-b04827627bce)

# TUGAS 3
1

      // Membuat kamus zodiak
        String[] zodiacSigns = {
                "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo",
                "Libra", "Scorpio", "Sagittarius", "Capricorn", "Aquarius", "Pisc
Array zodiacSigns adalah cara yang baik untuk menyimpan daftar data yang memiliki hubungan atau sifat yang sama. Dalam hal ini, array ini digunakan untuk menyimpan daftar nama-nama zodiak. Setiap elemen dalam array adalah string yang mewakili nama zodiak.

2

      int[] startDates = { 21, 20, 21, 21, 23, 23, 23, 23, 22, 22, 20, 19 };
        int[] endDates = { 19, 20, 20, 22, 22, 22, 22, 21, 21, 19, 18, 20 };
Array startDates dan endDates yang Anda berikan mungkin digunakan untuk merepresentasikan rentang tanggal yang berkaitan dengan periode zodiak atau mungkin juga digunakan untuk tujuan lain yang melibatkan tanggal. startDates adalah array yang berisi tanggal awal (atau tanggal mulai) dari masing-masing periode.endDates adalah array yang berisi tanggal akhir (atau tanggal selesai) dari masing-masing periode.

3

      // Meminta pengguna memasukkan bulan dan tanggal lahir
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bulan kelahiran (dalam angka): ");
        int month = scanner.nextInt();
        System.out.print("Masukkan hari kelahiran: ");
        int day = scanner.nextInt();
Scanner scanner = new Scanner(System.in);: Ini adalah baris yang digunakan untuk membuat objek Scanner yang akan digunakan untuk mengambil masukan dari pengguna melalui konsol.System.out.print("Masukkan bulan kelahiran (dalam angka): ");: Ini adalah perintah yang mencetak pesan ke layar untuk meminta pengguna memasukkan bulan kelahiran dalam bentuk angka.int month = scanner.nextInt();: Ini adalah baris kode yang digunakan untuk membaca masukan bulan yang dimasukkan oleh pengguna dan menyimpannya dalam variabel month sebagai integer.System.out.print("Masukkan hari kelahiran: ");: Ini adalah perintah yang mencetak pesan ke layar untuk meminta pengguna memasukkan tanggal kelahiran.int day = scanner.nextInt();: Ini adalah baris kode yang digunakan untuk membaca masukan tanggal yang dimasukkan oleh pengguna dan menyimpannya dalam variabel day sebagai integer.

4

            // Mencari zodiak yang sesuai dengan tanggal lahir
        String zodiacSign = null;
        for (int i = 0; i < zodiacSigns.length; i++) {
            if ((month == i + 1 && day >= startDates[i]) || (month == i + 2 && day <= endDates[i])) {
                zodiacSign = zodiacSigns[i];
                break;
String zodiacSign = null;: Pada awalnya, Anda mendeklarasikan variabel zodiacSign sebagai null. Variabel ini akan digunakan untuk menyimpan zodiak yang sesuai setelah pencarian.
for (int i = 0; i < zodiacSigns.length; i++) {: Ini adalah perulangan for yang digunakan untuk mengiterasi melalui array zodiacSigns yang berisi nama-nama zodiak.
if ((month == i + 1 && day >= startDates[i]) || (month == i + 2 && day <= endDates[i])) {: Ini adalah pernyataan if yang memeriksa apakah bulan dan tanggal kelahiran yang dimasukkan oleh pengguna cocok dengan rentang tanggal yang sesuai dengan zodiak dalam array. Dalam pernyataan ini:
zodiacSign = zodiacSigns[i];: Jika kondisi dalam pernyataan if adalah benar, maka variabel zodiacSign akan diisi dengan nama zodiak yang sesuai dengan rentang tanggal kelahiran tersebut.
break;: Setelah menemukan zodiak yang sesuai, perulangan dihentikan menggunakan break. Ini berarti kita hanya mencari zodiak yang sesuai dengan tanggal lahir pengguna dan tidak perlu melanjutkan iterasi melalui array zodiak.

5

      // Menampilkan zodiak
        if (zodiacSign != null) {
            System.out.println("Zodiak Anda adalah " + zodiacSign + ".");
        } else {
            System.out.println("Tanggal lahir tidak valid.");
        }
if (zodiacSign != null) {: Ini adalah pernyataan if yang memeriksa apakah variabel zodiacSign tidak sama dengan null
System.out.println("Zodiak Anda adalah " + zodiacSign + ".");: Jika kondisi dalam pernyataan if adalah benar, maka program akan mencetak pesan yang menginformasikan kepada pengguna zodiak yang sesuai dengan tanggal lahir mereka. else {: Jika variabel zodiacSign masih null, maka pernyataan dalam blok else akan dijalankan.System.out.println("Tanggal lahir tidak valid.");: Jika kondisi dalam pernyataan else adalah benar, maka program akan mencetak pesan kesalahan yang menginformasikan kepada pengguna bahwa tanggal lahir yang dimasukkan tidak valid.
CONTOHNYA 

![Screenshot (24)](https://github.com/Hanifalkahfi05/TUGAS-MKUCODING-HANIFALKHAFI/assets/147523271/4e1e7ec1-3f02-4b70-9622-7e85e3cf46ac)

# TUGAS 4
1

     // Membuat sebuah array integer
        int[] angka = {1, 2, 3, 4, 5};
int[] angka: Ini adalah deklarasi variabel yang membuat sebuah array integer dengan nama angka. Tanda [] menunjukkan bahwa ini adalah tipe data array.
{1, 2, 3, 4, 5}: Ini adalah bagian yang menginisialisasi array angka. Dalam kurung kurawal tersebut, Anda memasukkan nilai-nilai yang ingin Anda tambahkan ke dalam array. Dalam kasus ini, Anda telah mengisi array dengan lima nilai integer yaitu 1, 2, 3, 4, dan 5.

2

     // Menampilkan semua nilai dalam array menggunakan perulangan for
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + angka[i]);
for (int i = 0; i < angka.length; i++) {: Ini adalah perulangan for yang digunakan untuk mengiterasi melalui semua elemen dalam array angka. Perulangan ini dimulai dengan inisialisasi variabel i ke 0. Kondisi i < angka.length menentukan bahwa perulangan akan berlanjut selama i kurang dari panjang (jumlah elemen) array angka. Pada setiap iterasi, i akan ditambahkan dengan 1 menggunakan i++.System.out.println("Nilai ke-" + (i + 1) + ": " + angka[i]);: Ini adalah pernyataan yang digunakan untuk mencetak nilai dalam array. 
CONTOHNYA

![Screenshot (25)](https://github.com/Hanifalkahfi05/TUGAS-MKUCODING-HANIFALKHAFI/assets/147523271/1cd84eaa-6f1a-4a64-af8d-d603ea0ec2b9)







  

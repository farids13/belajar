<?php 
/*  STATIC KEYWORD
    - Member yang terkait dengan class, bukan dengan object
    - Nilai Static akan selalu tetap meskipun object di intanisiasi beulang kali
    - Mmebuat kode menjadi 'procedural'
    - Biasanya digunakan untuk membuat fungsi bantuan/ helper
    - Atau digunakan di class-class pada frame worl


*/

// ==== INI CONTOH TANPA PAKE STATIC OOP BIASA

class ContohBiasa {
    public $angka = 1;
    public function halo() {
        return "halo" . $this->angka++ . "Kali <br>";
    }
}
// kita instasiasi
$obj = new ContohBiasa;
echo $obj->halo();
echo $obj->halo();
echo $obj->halo();
echo "<br>";
$obj2 = new ContohBiasa;
echo $obj2->halo();
echo $obj2->halo();
echo $obj2->halo();

// ini apabila kita menggunakan STATIC KEYWORD
class ContohStaticKeyword {
    public static $angka = 1;
    public function halo() {
        return "halo" . self::$angka++ . "Kali <br>";
    }
}
// Kita Coba menggunkan instanisasi
echo"<br>";
echo"Ini yang menggunakan static keyword";
echo"<br>";
$obj = new ContohStaticKeyword;
echo $obj->halo();
echo $obj->halo();
echo $obj->halo();
echo "<br>";
$obj2 = new ContohStaticKeyword;
echo $obj2->halo();
echo $obj2->halo();
echo $obj2->halo();

// BACA !! INI YANG AKU CARI DARI DULU
/*  Pada static keyword ini dapat memanggil sebuah property tanpa haru di instanisiasi dahulu
    dengan cara
    Nama kelass :: property nya apa contoh dapat diliat dibawah;
 */
echo "Nilai Tanpa Instanisasi : " . ContohStaticKeyword::$angka;

// variable angka tidak akan direset ke nilai default nya tapi dilanjutkan terus
// itu maksud dari NO 2 keterangan diatas

?>
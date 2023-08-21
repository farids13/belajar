<?php 

/* VISIBILITY
    - Konsep yang digunakan untuk mengatur akses dari 
        property dan method pada sebuah objek
    - Ada 3 keyword visibility :
        1. Public : dapat digunakan atau diakses dimana saja, bakan di luar kealas
        2. protected : hanya dapat digunakan di dalam sebuah kelas beserta turunannya (Child)
        3. private : hanya dapat digunakan di dalam sebuah kelas tertentu saja.
    
    Kenapa kita membutuhkan visbility???
        1. Hanya memperlihatkan aspek dari class yang dibutuhkan oleh 'client'
        2. Menentukan Kebutuhan yang jelas untuk sebuah object
        3. Memberikan kendali pada kode untuk menghindari 'bug'
*/
class Produk{
    public  $judul = "judul",
            $penulis = "Penulis",
            $penerbit = "penerbit";
    protected $harga = 0;
    
    public function __construct($judul, $penulis, $penerbit, $harga){ 
        $this->judul = $judul;
        $this->penulis = $penulis;
        $this->penerbit = $penerbit;
        $this->harga = $harga;
    }
    public function panggilLabel(){
        return "$this->judul, $this->penerbit, $this->penulis, $this->harga";
    }
}
class Komik extends Produk{
    public $jmlHalaman;

    public function __construct($judul, $penulis, $penerbit, $harga, $jmlHalaman){
        parent::__construct($judul, $penulis, $penerbit, $harga,);
        $this->jmlHalaman = $jmlHalaman;
    }
    public function panggilLabel() {
        $str =  " Komik :" .parent::panggilLabel(). "| {$this->jmlHalaman} Halaman";
        return $str;
    }
}
class Game extends Produk{
    public $waktuMain;
    public function __construct($judul, $penulis, $penerbit, $harga, $waktuMain){
        parent::__construct($judul, $penulis, $penerbit, $harga);
        $this->waktuMain = $waktuMain;
    }
    public function getHarga(){
        return $this->harga;
    }
    public function panggilLabel() {
        $str =  "Game :" .parent::panggilLabel(). " | {$this->waktuMain} Jam";
        return $str;
    }
}

class CetakInfoProduk{
    public function cetak(Produk $produk){
        $str = "{$produk->panggilLabel()}";
        return $str;
    }
}

/* kita instanisasi */
$produk1 = new Komik("Naruto", "Kasasi kinomoto", "Jakarta", 60000, 100);
$produk2 = new Game("One piece", "Ajinomoto", "Bandung", 70000, 50);

echo $produk1->panggilLabel();
echo "<br>";
echo $produk2->panggilLabel();
echo "<hr>";
// lihat sintaks dibawah program tidak akan bisa mengubah value dari harga karena varible nya di protected
// artinya hanya class dan turunannya yang bisa mengubah nilai dari variable tersebut.
echo "Ini Nilai harga yang tidak bisa dirubah  :".$produk2->getHarga();
// kalau ingin mengubah 
echo "Ini yang tidak mendapatkan akses karena menggunkan protected   :" . $produk2->harga;
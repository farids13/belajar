<?php 

/* OVERRIDING
    membuat sebuah method yang sama pada sebuah child dari sebuah parent
    sehinggal function methodnya itu akan tertimpa
*/
class Produk{
    public  $judul = "judul",
            $penulis = "Penulis",
            $penerbit = "penerbit",
            $harga = 0;
    
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
 /* Ini artinya Child dari Kelas Produk child ini bisa mengakses semua data yang ada di class produk */
 /* Ini dia yang dinamakan overriding function pada parentnya sama seperti childnya jadi harus diberi overiding
  */
class Komik extends Produk{
    public $jmlHalaman;

    public function __construct($judul, $penulis, $penerbit, $harga, $jmlHalaman){
        parent::__construct($judul, $penulis, $penerbit, $harga,);
        $this->jmlHalaman = $jmlHalaman;
    }
    public function panggilLabel() {
        $str =  " Komik :" .parent::panggilLabel(). "| {$this->jmlHalaman} Halaman"; // kalau mau cari {::} namanya operator scope resolution
        return $str;
    }
}
class Game extends Produk{
    public $waktuMain;
    public function __construct($judul, $penulis, $penerbit, $harga, $waktuMain){
        parent::__construct($judul, $penulis, $penerbit, $harga);
        $this->waktuMain = $waktuMain;
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
<?php 
// ==== Abstract CLass
/*  .Sebuah Kelas yang tidak dapat di instansiasi
    . Kelas 'Abstrak'
    . Mendefinisikan interface untuk kelas lain yang menjadi turunannya\
    . Berperan sebagai 'Kerangka Dasar' untuk kelas turunannya.
    . Memiliki minimal 1 method abstrak (method abstrak ini mejadi kerangka dasarnya)
    . Digunakan dalam 'pewarisan' / inheritance untuk 'memaksakan' implementasi method abstrak
      Yang sama untuk semua kelas turunannya.
    . Semua Kelas turunannya, harus mengimplementasikan method abstrak yang ada di kelas abstraknya
    . Kelas abstrak boleh memiliki property/ method reguler
    . Kelas abstrak boleh Memiliki Property/ static method

    ALASAN KENAPA MENGGUNAKAN KELAS ABSTRAK
        1. Mempresentasikan ide atau konsep dasar (DASARNYA)
        2. "Composition over Inheritance"
        3. Salah satu cara menerapkan Polimorphism
        4. Sentralisasi logic
        5. Mempermudah pengerjaan tim.

*/
abstract class Produk{ // ini kelas produk yang dijadikan abstrack maka disini harus ada Kerangka dasar (method abstrack) minim 1
    private  $judul = "judul",
             $penulis = "Penulis",
             $penerbit = "penerbit",
             $harga = 0;
    
    public function __construct($judul, $penulis, $penerbit, $harga){ 
        $this->judul = $judul;
        $this->penulis = $penulis;
        $this->penerbit = $penerbit;
        $this->harga = $harga;
    }

    // ini adalah sebuah setter atau set
    public function setJudul($judul){
        if (!is_string($judul)){
            throw new Exception("Judul Harus String");
        }
        return $this->judul = $judul;

    }
    // ini adalah sebuah getter atau get 
    public function getJudul(){
        return $this->judul;
    }
    
    abstract public function panggilLabel() ; // nah ini yang disebut dengan kerangka dasar (method abstract)
    
    public function getLabel(){
        return "$this->judul, $this->penerbit, $this->penulis, $this->harga";
    }
}
class Komik extends Produk{
    public $jmlHalaman;

    public function __construct($judul, $penulis, $penerbit, $harga, $jmlHalaman){
        parent::__construct($judul, $penulis, $penerbit, $harga,);
        $this->jmlHalaman = $jmlHalaman;
    }
    public function panggilLabel() { // kerangka tadi di panggil disini di beri sebuah perintah
        $str =  " Komik :" .$this->getLabel(). "| {$this->jmlHalaman} Halaman";
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
    public function panggilLabel() { // sama disini juga di panggil untuk di beri sebuah perintah untuk di jalankan
        $str =  "Game :" .$this->getLabel(). " | {$this->waktuMain} Jam";
        return $str;
    }
}

class CetakInfoProduk{
    public $daftarProduk = array();

    public function tambahProduk(Produk $produk){
        $this->daftarProduk[] = $produk;
    }
    

    public function cetak(){
        $str = "DAFTAR PRODUK : <br>";

        foreach ($this->daftarProduk as $p){
            $str .= "- {$p->panggilLabel()} <br>";
        }
        return $str;
    }
}

/* kita instanisasi */
$produk1 = new Komik("Naruto", "Kasasi kinomoto", "Jakarta", 60000, 100);
$produk2 = new Game("One piece", "Ajinomoto", "Bandung", 70000, 50);

$cetakProduk = new CetakInfoProduk();
$cetakProduk->tambahProduk($produk1);
$cetakProduk->tambahProduk($produk2);
echo $cetakProduk->cetak();

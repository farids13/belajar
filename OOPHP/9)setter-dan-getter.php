<?php 

/* SETTER AND GETTER
    kalau yang saya simpulkan dalam penjelasan vidio web unpas
    itu sebuah metode untuk dapat mengakses sebuah variabel yang di beri
    sebuah visibillty yang terkunci mis nya itu protected atau private
    bisa dilihat dibawah contohnya
*/
class Produk{
    private  $judul = "judul";
    public   $penulis = "Penulis",
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
echo "Ini Nilai harga yang tidak bisa dirubah  :".$produk2->getHarga();
echo "Ini yang tidak mendapatkan akses karena menggunkan protected   :" . $produk2->harga;
echo "<hr>";

// ini adalah cara memanggil sebuah setter and getter
echo " INI Judul Lama :" . $produk1->getJudul();
echo"<br>";

$produk1->setJudul("Sasuke");
echo "ini Judul Yang sudah di setter and getter  :".$produk1->getJudul();
/* ini adalah contoh manfaat setter and getter dapat melakukan validasi pada sebuah nilai */
$produk1->setJudul(123); // disini akan terjadi eror 

// dari conoth di atas bahwa sebuah class yang bagus itu 
/* dimana propertynya tidak bisa langsung di akses oleh sebuah sintaks diluar kelas tersebut 
    fungsi lain dari setter and getter itu untuk mempermudah data supaya bisa di beri logika
    misalnya sebuah judul harus di masukkan string.
    jadi sebelum data itu masuk data akan divalidasi oleh setter and getter
*/

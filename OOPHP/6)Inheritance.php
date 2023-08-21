<?php 

/* INHERITANCE
    - Menciptakan hierarki antar kelas (Parent & Child)
    - Child Class, Mewarisi semua properti dan method dari Parent-nya (yang visible)
    - Child class, Memperluas (extends) funsionalitas dari parent-nya 

*/
class Produk{
    public  $judul = "judul",
            $penulis = "Penulis",
            $penerbit = "penerbit",
            $harga = 0,
            $jmlHalaman,
            $waktuMain;
    
    public function __construct($judul, $penulis, $penerbit, $harga, $jmlHalaman, $waktuMain){ 
        $this->judul = $judul;
        $this->penulis = $penulis;
        $this->penerbit = $penerbit;
        $this->harga = $harga;
        $this->jmlHalaman = $jmlHalaman;
        $this->waktuMain = $waktuMain;
    }
    public function panggilLabel(){
        return "$this->judul, $this->penerbit, $this->penulis, $this->harga";
    }
}
 /* Ini artinya Child dari Kelas Produk child ini bisa mengakses semua data yang ada di class produk */
class Komik extends Produk{
    public function getInfoProduk() {
        $str =  " Komik : {$this->panggilLabel()} | {$this->jmlHalaman} Halaman";
        return $str;
    }
}
class Game extends Produk{
    public function getInfoProduk() {
        $str =  " Komik : {$this->panggilLabel()} | {$this->waktuMain} Jam";
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
$produk1 = new Komik("Naruto", "Kasasi kinomoto", "Jakarta", 60000, 100,0);
$produk2 = new Game("One piece", "Ajinomoto", "Bandung", 70000, 0, 100);

echo $produk1->getInfoProduk();
echo "<br>";
echo $produk2->getInfoProduk();
<?php 

class Game extends Produk implements InfoProduk {
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
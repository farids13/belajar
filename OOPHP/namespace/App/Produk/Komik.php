<?php 
class Komik extends Produk implements InfoProduk{ // unutk bisa memanggil interface maka harus di tampah implements
    public $jmlHalaman;

    public function __construct($judul, $penulis, $penerbit, $harga, $jmlHalaman){
        parent::__construct($judul, $penulis, $penerbit, $harga,);
        $this->jmlHalaman = $jmlHalaman;
    }
    // kalau menggunakan interface sebuah method function yang ada di dalamnya harus di pakai kalau tidak eror
    public function panggilLabel() { // Nah perintah ini wajib ada karena diatas sudah di tetapkan di interfacenya
        $str =  " Komik :" .$this->getLabel(). "| {$this->jmlHalaman} Halaman";
        return $str;
    }
}
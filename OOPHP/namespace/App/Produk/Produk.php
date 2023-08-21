<?php 

class Produk { 
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
    
    public function getLabel(){
        return "$this->judul, $this->penerbit, $this->penulis, $this->harga";
    }
}
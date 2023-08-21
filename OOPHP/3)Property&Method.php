<?php 
/* PRoperty 
    - Mempresentasikan data/ keadaan dari sebuah object.
    - variabel yang ada di dalam object(member variable)
    - Sama seperti variable di dalam PHP, ditambah dengan
      visbility di depannya. 
    - 3 keyword visbility
        1. public
        2. private
        3. protetcted
  Method
    - Merepresentasikan perilaku dari sebuah object
    - function yang ada di dalam object
    - sama seperti function di dalam PHP, ditambah dengan
      Visibility di depannya, umumnnya pake public.
*/
/* 
    Contoh Sederhananya pada sebuah Mobil
    Property:
    - nama
    - merk
    - warna
    - kecepatan Max
    - Jumlah penumpang ect
    Method: 
    - tambahKecepatan
    - kurangiKecepatan
    - gantiTransmisi
    - belokKiri
    - belokKanan
*/
class Produk{
    public  $judul, 
            $penulis,   
            $penerbit,  
            $harga;
    function getLabel(){
        return "$this->judul, $this->penulis, $this->penerbit, $this->harga"; 
    }
}
$produk1 = new Produk();
$produk1->judul = "naruto";
$produk1->penulis = "Kasasi Kinimoto";
$produk1->penerbit = "Jakarta";
$produk1->harga = 60000;

$produk2 = new Produk();
$produk2->judul = "One piece";
$produk2->penulis = "Kasasi Arikmonoto";
$produk2->penerbit = "Bandung";
$produk2->harga = 40000;

echo "Komik :$produk1->judul, $produk1->penerbit" ;
echo "<br>";
echo "Komik : ".$produk1->getLabel();
echo "<br>";
echo "Komik2 :".$produk2->getLabel();




?>
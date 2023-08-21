<?php 
class Produk{
    public  $judul = "judul",
            $penulis = "Penulis",
            $penerbit = "penerbit",
            $harga = 0;
    
    public function __construct($judul, $penulis, $penerbit, $harga){ 
        /* ingat variabel di dalam __construct itu boleh sama karena pada dasarnya varible itu lokal gak bisa 
        di panggil kecuali pake $this jadi itu berbeda sama yang sudah di isi di atas */
        $this->judul = $judul;
        /* nah itu bedanya yang $this->judul itu punya public di atas function
            sedangkan yang = $judul itu punya nya function __construct yang ada di dalam (); 
        */
        $this->penulis = $penulis;
        $this->penerbit = $penerbit;
        $this->harga = $harga;
    }
    public function panggilLabel(){
        return "$this->judul, $this->penerbit";
    }
    public function panggilPrice(){
        return "$this->harga, $this->penerbit";
    }
}

/* kita instanisasi */
$produk1 = new Produk("Naruto", "Kasasi kinomoto", "Jakarta", 60000);
$produk2 = new Produk("One piece", "Ajinomoto", "Bandung", 70000);

echo "Komik1 :" . $produk1->panggilLabel();
echo "Harga  :" . $produk1->panggilPrice();
echo "<br>";
echo "Komik2 :" . $produk2->panggilLabel();
echo "Harga  :" . $produk2->panggilPrice();


?>
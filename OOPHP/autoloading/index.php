<?php 
require_once 'App/init.php';

/* untuk dapat mempermudah sebuah proses inisialiasi apabila sebah libaty udah banyak maka diperluka
    spl_autoload_register();
    lihat di folder init.php
    */


/* kita instanisasi */
$produk1 = new Komik("Naruto", "Kasasi kinomoto", "Jakarta", 60000, 100);
$produk2 = new Game("One piece", "Ajinomoto", "Bandung", 70000, 50);

$cetakProduk = new CetakInfoProduk();
$cetakProduk->tambahProduk($produk1);
$cetakProduk->tambahProduk($produk2);
echo $cetakProduk->cetak();
      
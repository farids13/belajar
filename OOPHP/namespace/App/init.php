<?php 

// dalam membuat init atau require harus program dalamnya urut juga karena child sama parent gak bisa di balik
// require_once 'App/Produk/InfoProduk.php';
// require_once 'App/Produk/Produk.php';
// require_once 'App/Produk/Komik.php';
// require_once 'App/Produk/Game.php';
// require_once 'App/Produk/CetakInfoProduk.php';
/* DIBAWAH MERUPAKAN CARA UNTUK MEMPERMUDAH DALAM PEMANGGILAN REQUIRE  */
spl_autoload_register(function($class){require_once __DIR__.'/Produk/'.$class.'.php';});

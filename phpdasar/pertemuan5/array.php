<?php 
// array 
// variabel yang dapat menampung banyak nilai
// elemen pada array boleh memiliki tipe data yang berbeda
// padangan antara key dan value
// key-nya adalah index yang dimulai dari 0

// membuat aray
// cara lama
$hari = array("Senin", "Selasa", "Rabu");

// cara baru
$bulan = ["Januari", "Februari", "Maret"];
// elemen yang di tampung boleh berbeda tipe data
$farid = [1303, "maret", false];

// menampilkan array
// var_dump() / print_r()

// var_dump($hari);
// echo "<br>";
// print_r($hari);

// // menampilkan 1 elemen pada array
// echo "<br>";
// echo $bulan[2]

// menambahkan elemen baru pada array pada variabel yang sudah ada di atas
var_dump($hari);
$hari[] = "Kamis";
echo "<br>";
var_dump($hari);
 ?>

<?php 
// ==== CONSTANT (KONSTANTA)
/*  Tau lah arti dari kosntanta itu tetap beda sama varible
    Sebuah Konstanta Nilai nya tidak dapat berubah

    Ada 2 cara menggunakan constanta :
    define ()
    const


*/

//Biasakan penulisan konstanta menggunakna Huruf KAPITAL
define('NAMA', 'Farid Satria');

// dari contoh di bawah dapat dipahami 
// apa bila itu sebuah niali konstanta tidak ada $ nya
// jadi langsung aja tulis nama Konstantanya.
echo NAMA;

// INI CARA YANG KEDUA

const UMUR = 23;
echo "<br>";
echo UMUR;

class CobaConstanta {
    const NAMAKELAS = 'Farid';
}
echo CobaConstanta::NAMAKELAS . "<br>";

/* DIdalam PHP sudah terdapat Magic Constanta
    isi nya apa saja:
    . __LINE__
    . __FILE__
    . __DIR__
    . __FUNCTION__
    . __CLASS__
    . __TRAIT__
    . __METHOD__
    . __NAMESPACE__

*/
echo __LINE__ . "<br>"; // angka yang akan muncul sesuai letak baris kode ini ada disini ada di 44.
echo __FILE__ . "<br>";// Ini untuk menampilkan alamat FIle yang di exsekusi ini. GG.
echo __DIR__ . "<br>";// ini akan menampilkan directory file ini berada
function coba ()   {
    return __FUNCTION__;
}
echo coba() . "<br>"; // ini menampilkan sebuah function yang sedang dijalankan.

class CobaClass {
    public $kelas = __CLASS__; // ini akan menampilkan sebuah letak kelas yang sedang di jalankan
}
$coba = new CobaClass;
echo $coba->kelas . "<br>";
/* UNTUK SELANJUTNYA ADA DI MATERI LAIN MASUK PADA ABSTRACT CLASS */

?>
// DOM SELECTION 
//  Ada Apa aka
 // document.getElementById() -> Element
 const judul= document.getElementById('judul');
 judul.style.color = 'red';
 judul.style.backgroundColor = '#ccc'
 judul.innerHTML = "Hello FAST"

 //document.getElementsByTagName()
// -> HTML Collection
 const p = document.getElementsByTagName('p');
 // jadi kalau di lihat ini sama seperti array
 // kalau kita mau memanipulasi data harus menyebut yang mana yang akan di ubaj
 // karena itu sebuah arrayy
p[2].style.backgroundColor = 'lightblue'; // dalam araay ngurutnya dari 0
// cara merubah dari HTML Collection menjadi sebuah element mudah
const h1 = document.getElementsByTagName('h1')[0]; // itu 0 buat panggil array di posisi 0
// kalau sudah menjadi element seperti di atas maka bisa kita ubah dengan mudah
h1.style.fontSize = '50px';

// document.getElementByClassName()
// HTML Collection
const p1 = document.getElementsByClassName('p1')[0];
p1.innerHTML = "ini di ubah menggunakan javascript"

//documnet.querySelector()
// artinya dari quary selector query sendiri artinya menanyakan selecetor

const p4 = document.querySelector('#b p');
p4.style.color = 'red'
p4.style.fontSize = "20px"

// ini mencari li yang ada di beberapa anak 
const li12 = document.querySelector('section#b ul li:nth-child(2)'); // lihat artinya nth-child yaitu kata n di awal artinya anak ke n jadi bisa disebut yang kita mau
li12.style.backgroundColor = "red";


// document.querySelectorAll()
// artinya dia akan menselec semua element
// dan ini tipe node nya akan menjadi Node list karena gabungan dari beberapa elemen yang berbeda

const semua = document.querySelectorAll('p');
 for (let i =0 ; i <= 2 /* atau bisa pake lenght semua.length*/ ;i++){
     semua[i].style.backgroundColor = 'red';
 }
 
 // ada cara lain yaitu mengubah NODE ROOT nya
 // pertama buat targetnya dulu yang mana yang ingin di pilih
 const sectionB = document.querySelector('#b'); // jangan lupa kalai pake id di kasih #
 const p4spesifik = sectionB.getElementsByTagName('p')[0];
 p4spesifik.style.backgroundColor = 'blue';
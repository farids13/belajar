// Cara untuk membuat object di javascript itu ada 4 jenis untuk saat ini:
// 1. Object Literal

// problem nya tidak efekti untuk object yang banyak

let mahasiswa1 = {
    nama: 'FaridSatria',
    energy: 10,
    makan: function(porsi) {
        this.energy = this.energy + porsi;
        console.log(`Selamat Makan ${this.nama} energi anda telah ditambah`);
    }
}

let mahasiswa2 = {
    nama: 'Agus Riyadi',
    energy: 20,
    makan: function(porsi) {
        this.energy = this.energy + porsi;
        console.log(`Selamat Makan ${this.nama} energi anda telah ditambah`);
    }
}
// kelemahan pada cara object literal saat ingin digunakan banyak mahasiswa jadi harus beda object nya 
// harus di buat mahasiswa 1 dan mahasiswa 2


// 2. function declaration

// Problem ini sama seperti satu nyata nya walau dinstansiasi resources makan banyak memori
// ada cara untuk tidak memakan banyak resources memori dengan cara di bawah ini
// dengan cara membuat object terpisah sehingga lebih efektif

// const methodMahasiswa = {
//     makan : function (porsi) {
//         this.energy += porsi;
//         console.log(`selamat makan ${this.nama} energi anda akan bertambah`);
//     },
//     main : function (jam) {
//         this.energy /= jam;
//         console.log(`Selamat Bermain ${this.nama} Ingat energi anda`);
//     },
// };
// // cara di atas tidak akan mengulang perintah yang sama pada memori jadi cuma di simpan 1 kali di memory
// function mahasiswa (nama, energi){
//     let mahasiswa = {}; // deklarasi variabel 
//     mahasiswa.nama = nama;
//     mahasiswa.energy = energi;
//     // sambung object yang di buat variable di atas dengan cara ini
//     mahasiswa.makan = methodMahasiswa.makan;
//     mahasiswa.main = methodMahasiswa.main;
//     return mahasiswa;
// // masalahnya pada ini adalah setiap membuat method baru maka harus di daftarkan di function mahasiswa nya ini akan membuat lama pengerjaan 
// // ada cara cepat sehingga otomatis yaitu menggunakan object.create caranya ada di bawah no 4
// }
// let Farid = mahasiswa('farid satria', 10);
// let Agus = mahasiswa('agus riyadi', 20);

// 3. Constructor Function
// ini menggunakan keyword new bedanya sama diatas itu pake new saat instansiasi
// function mahasiswa (nama, energi){
//     //let mahasiswa = {}; // bedanya sama diatas tidak perlu menggunakan deklarasi variabel
//     this.nama = nama;
//     this.energy = energi;

//     this.makan = function (porsi) {
//         this.energy += porsi;
//         console.log(`selamat makan ${this.nama} energi anda akan bertambah`);
//     }
//     this.main = function (jam) {
//         this.energy /= jam;
//         console.log(`Selamat Bermain ${this.nama} Ingat energi anda`);
//     }
//    // return mahasiswa; // di cara ketiga ini tidak perlu return karena sudah di wakilkan oleh kata new
// }
// let Farid = new mahasiswa('farid satria', 10);
// let Agus = new mahasiswa('agus riyadi', 20);

// ======================== 4. Object.create =====================================
 
const methodMahasiswa = {
    makan : function (porsi) {
        this.energy += porsi;
        console.log(`selamat makan ${this.nama} energi anda akan bertambah`);
    },
    main : function (jam) {
        this.energy /= jam;
        console.log(`Selamat Bermain ${this.nama} Ingat energi anda`);
    },
    tidur: function (jam) {
        this.energy += jam * 2;
        console.log(`Selamat Tidur ${this.nama}`);
    }
};

function mahasiswa (nama, energi){
    let mahasiswa = Object.create(methodMahasiswa);
    mahasiswa.nama = nama;
    mahasiswa.energy = energi;

    return mahasiswa;

}
let Farid = mahasiswa('farid satria', 10);
let Agus = mahasiswa('agus riyadi', 20);
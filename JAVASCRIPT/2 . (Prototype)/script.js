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
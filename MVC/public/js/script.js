$(function() { 

    $('.tombolTambah').on('click', function() {
        $('#judulModal').html('Tambah Data Mahasiswa');
        $('.modal-footer button[type=submit]').html('Tambah Data');
        $('#nama').val(''); // kalau di jquery mengambil araay associative langsung pake .
        $('#nik').val('');   // kalau di php itu yang pake ->
        $('#email').val('');
        // $('#jurusan').val('');
        $('#id').val('');
    });

    $('.tombolUbah').on('click', function() {
        $('#judulModal').html('Ubah Data Mahasiswa');
        $('.modal-footer button[type=submit]').html('Ubah Data');
        $('.modal-body form').attr('action','http://localhost/Belajar%20Coding/MVC/public/mahasiswa/Ubah');

        const idasli = $(this).data('id-nomor'); //.data itu sebuah fungsi dari jquery maka itu paten, 
            // untuk isinya atau targer itu setelah penulisan data- pada htmlnya jadi fahami stelah 
            // jadi .data akan mengambil nilai yang ada pada data- (isi namanya ini ) = "ini nilai yang di ambil"
            // faham kan harus faham lah
            // sedangkaan $(this) itu sendiri perumpamaan dari fungsi utamanya
            // mana fungsi utamanya,  $('.tombolUbah').on('click',
        
        $.ajax({
            url: 'http://localhost/Belajar%20Coding/MVC/public/mahasiswa/getUbah',
            data: {id : idasli},
            method: 'post',
            dataType: 'json',
            success: function(nilai){
                console.log(nilai);
                $('#nama').val(nilai.nama); // kalau di jquery mengambil araay associative langsung pake .
                $('#nik').val(nilai.nik);   // kalau di php itu yang pake ->
                $('#email').val(nilai.email);
                $('#jurusan').val(nilai.jurusan);
                $('#id').val(nilai.id);

            }
        });

    });
    
}); 
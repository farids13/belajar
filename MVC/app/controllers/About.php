<?php  

class About extends Controller{
    // usahakan semua method ada index nya karena sebagai default sebuah websitenya
    public function index($nama = 'farid', $pekerjaan = 'freelance', $umur = 22)
    {
        $data['nama'] = $nama;
        $data['pekerjaan'] = $pekerjaan;
        $data['umur'] = $umur;      //ini pake array associative nanti bisa di panggil di view dengan cara $data['nama'] misalnya nama yang ingin di ambil
        $data['judul'] = "About";
        $this->view('templates/header', $data);
        $this->view('about/index', $data); // data itu buat mengirim data pada halaman view
        $this->view('templates/footer');
    }

    public function page()
    {
        // ingat manggil itu harus urut supaya kodingannya urut
        $data['judul'] = "About Page";
        $this->view('templates/header',$data);
        $this->view('about/page');
        $this->view('templates/footer');
        
    }
}
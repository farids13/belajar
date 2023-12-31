<?php

class Mahasiswa extends Controller{
    public function index(){
        $data['judul'] = 'Daftar Mahasiswa';
        $data['mhs'] = $this->model('Mahasiswa_model')->getAllMahasiswa();
        $this->view('templates/header', $data);
        $this->view('mahasiswa/index', $data);
        $this->view('templates/footer');
    }
    public function detail($id){
        $data['judul'] = 'Detail Mahasiswa';
        $data['mhs'] = $this->model('Mahasiswa_model')->getMahasiswaById($id);
        $this->view('templates/header', $data);
        $this->view('mahasiswa/detail', $data);
        $this->view('templates/footer');
    }
    public function tambah(){
        if ( $this->model('Mahasiswa_model')->tambahDataMahasiswa($_POST) > 0){
            Flasher::setFlash('Berhasil', 'ditambahkan', 'success');
            header('Location:'. BASEURL .'/public/mahasiswa');
            exit;
        }else{
            Flasher::setFlash('Gagal', 'ditambahkan', 'danger');
            header('Location:'. BASEURL .'/public/mahasiswa');
            exit;
        }
    }
    public function hapus($id){
        if ( $this->model('Mahasiswa_model')->hapusDataMahasiswa($id) > 0){
            Flasher::setFlash('Berhasil', 'dihapus', 'success');
            header('Location:'. BASEURL .'/public/mahasiswa');
            exit;
        }else{
            Flasher::setFlash('Gagal', 'dihapus', 'danger');
            header('Location:'. BASEURL .'/public/mahasiswa');
            exit;
        }
    }
    public function getUbah(){
        echo json_encode($this->model('Mahasiswa_model')->getMahasiswaById($_POST['id']));
    }
    public function ubah(){
        if ( $this->model('Mahasiswa_model')->ubahDataMahasiswa($_POST) > 0){
            Flasher::setFlash('Berhasil', 'diubah', 'success');
            header('Location:'. BASEURL .'/public/mahasiswa');
            exit;
        }else{
            Flasher::setFlash('Gagal', 'diubah', 'danger');
            header('Location:'. BASEURL .'/public/mahasiswa');
            exit;
        }
    }
    public function cari(){
        var_dump($this->model('Mahasiswa_model')->cariMahasiswa($_POST));
        if ( $this->model('Mahasiswa_model')->cariMahasiswa($_POST) > 0){
            $data['judul'] = 'Daftar Mahasiswa';
            $data['mhs'] = $this->model('Mahasiswa_model')->cariMahasiswa();
            $this->view('templates/header', $data);
            $this->view('mahasiswa/index', $data);
            $this->view('templates/footer');
            exit;
        }else{
            header('Location:'. BASEURL .'/public/mahasiswa');
        }
    }
    public function tambahesp(){
        echo 'meeh ok';
        $tegangan = $_POST['tegangan'];
    	$arus = $_POST['arus'];
    	$suhu = $_POST['suhu'];
    	$kelembaban = $_POST['kelembaban'];
        var_dump($_POST);
    }
}
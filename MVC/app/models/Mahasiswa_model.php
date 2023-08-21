<?php 

class Mahasiswa_model{

    // private $dbh; //database handler
    // private $stmt;

    // ini untuk tes apakah db nya sudah masuk atau belum
    // public function __construct(){
    //     // data source name
    //     $dsn = 'mysql:host=localhost;dbname=phpmvc';

    //     try{
    //         $this->dbh = new PDO($dsn, 'root','');
    //     } catch(PDOException $e) {
    //         die($e->getMessage());
    //     }
    // }

    private $table = 'mahasiswa';
    private $db;
    
    public function __construct()
    {
        $this->db = new Database;
    }

    public function getAllMahasiswa()
    {
        $this->db->query('SELECT * FROM '.$this->table);
        return $this->db->resultSet();
    }

    public function getMahasiswaById($id){
        $this->db->query('SELECT * FROM ' . $this->table . ' WHERE id=:id');
        $this->db->bind('id', $id);
        return $this->db->single();
    }
    
    public function tambahDataMahasiswa($data){
        $query = "INSERT INTO " . $this->table . "
                    VALUES ('', :nama, :nik, :email, :jurusan)";
        $this->db->query($query);
        $this->db->bind('nama', $data['nama']);
        $this->db->bind('nik', $data['nik']);
        $this->db->bind('email', $data['email']);
        $this->db->bind('jurusan', $data['jurusan']);

        $this->db->execute();

        return $this->db->rowCount();
    }
    public function hapusDataMahasiswa($id){

        $query = "DELETE FROM " . $this->table . " WHERE id = :id ";
        $this->db->query($query);
        $this->db->bind('id', $id);

        $this->db->execute();

        return $this->db->rowCount();
    }
    public function ubahDataMahasiswa($data){
        $query = "UPDATE " . $this->table . " SET
                    nama= :nama,
                    nik = :nik,
                    email = :email,
                    jurusan = :jurusan
                WHERE id = :id ";
        $this->db->query($query);
        $this->db->bind('nama', $data['nama']);
        $this->db->bind('nik', $data['nik']);
        $this->db->bind('email', $data['email']);
        $this->db->bind('jurusan', $data['jurusan']);
        $this->db->bind('id', $data['id']);

        $this->db->execute();

        return $this->db->rowCount();
    }
    public function cariMahasiswa(){
        $keyword = $_POST['cari'];
        $query = "SELECT * FROM ".$this->table." WHERE nama LIKE :keyword";
        $this->db->query($query);
        $this->db->bind('keyword', "%$keyword%");
        return $this->db->resultSet();
    }
}
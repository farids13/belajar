<div class="container mt-3">
  <div class="row"><div class="col-lg-6"> <?= Flasher::flash(); ?> </div></div>
  <div class="row mb-3">
        <div class="col-6">
            <!-- Button trigger modal -->
            <button type="button" class="tombolTambah btn btn-primary" data-bs-toggle="modal" data-bs-target="#formModal">
                Tambah Data Mahasiswa
            </button>
        </div>
    </div>
  <div class="row mb-3">
        <div class="col-6">
            <form action="<?= BASEURL;?>/public/mahasiswa/cari" method ="post">
            <div class="input-group mb-3">
              <input type="text" class="form-control" placeholder="Cari Mahasiswa .." name = "cari" id="cari">
              <button class="btn btn-outline-primary badge bg-primary" type="submit" id="button-addon2" name ="tombolCari">
                Search
              </button>
            </form>
          </div>
        </div>
    </div>

    <div class="row">
        <div class="col-lg-10">
            <!-- Button trigger modal -->

            <h3>Daftar Mahasiswa</h3>
                <ul class="list-group">
                    <?php foreach ( $data['mhs'] as $mhs) : ?>
                    <li class="list-group-item">
                        <?= $mhs['nama'];?>
                        <a href="<?= BASEURL;?>/public/mahasiswa/ubah/<?= $mhs['id'];?>" data-bs-toggle="modal" data-bs-target="#formModal" style ="margin-left:5px;" class=" tombolUbah badge bg-warning rounded-pill float-lg-end" data-id-nomor ="<?= $mhs['id']; ?>"> ubah </a>
                        <a href="<?= BASEURL;?>/public/mahasiswa/hapus/<?= $mhs['id'];?>" style ="margin-left:5px;" onclick="return confirm('yakin?')" class="badge bg-danger rounded-pill float-lg-end"> Hapus </a>
                        <a href="<?= BASEURL;?>/public/mahasiswa/detail/<?= $mhs['id'];?>" class="badge bg-primary rounded-pill float-md-end"> Detail </a>
                    </li>
                    <?php endforeach; ?>
                </ul>                            
        </div>
    </div>
</div>

<!-- Modal -->
<div class="modal fade" id="formModal" tabindex="-1" aria-labelledby="judulModal" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="judulModal">Tambah Data Mahasiswa</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <form action="<?= BASEURL;?>/public/mahasiswa/tambah" method="post">
            <div class="mb-3">
              <input type="hidden" name = "id" id = "id">
                <label for="nama" class="form-label">Nama</label>
                <input name = "nama" type="text" class="form-control" id="nama" >

                <label for="nik" class="form-label">Nik</label>
                <input name = "nik" type= "number" class="form-control" id="nik" >

                <label for="email" class="form-label">Email</label>
                <input name = "email" type= "email" class="form-control" id="email" >

                <label for="combobox" class="form-label">Jusrusan</label>
                  <input class="form-control" list="datalistOptions" id="jurusan" name = "jurusan" value = "teknik" >
                  <datalist id="datalistOptions" >
                    <option value="Teknik Elektro">
                    <option value="Teknik Mesin">
                    <option value="Teknik Sipil">
                    <option value="Teknik Informatika">
                  </datalist>
            </div>
            
        
          <!-- Batas Bawah !-->
          <div class="modal-footer">
            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
            <button type="submit" class="btn btn-primary">Tambah Data</button>
        </form>
      </div>
    </div>
  </div>
</div>
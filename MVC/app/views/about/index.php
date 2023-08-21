<div class="container">
<!-- Ini kenapa tanpa header sama footer karena sudah di view di contoller  !-->
    <h1 class = "mt-4">Ini About index utama</h1>
    <img src="<?= BASEURL ;?>/public/img/fast.jpg" alt="Farid Satria" width="200px" height="200px" class="rounded-circle shadow-lg">
    <p>Nama Saya <?= $data['nama'] ?>, saya bekerja <?= $data['pekerjaan'] ?>, saya berumur <?= $data['umur']?> tahun   </p>
</div>
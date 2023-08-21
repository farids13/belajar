<?php 
function salam($waktu = "datang" ,$nama = "admin") { // fungsi = "datang" pada parameter waktu untuk parameter default apa bila waktu tidak di beri variabel jadi defaultnya.
	return "selamat datang ,$waktu $nama!";
}

 ?>
<!DOCTYPE html>
<html>
<head>
	<title>Latihan Fuction</title>
</head>
<body>
	<h1> <?php echo salam("farid"); ?></h1>
	
</body>
</html>

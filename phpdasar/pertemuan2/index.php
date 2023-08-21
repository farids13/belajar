<?php 
// Pertemuan 2 - PHP Dasar
// Sintaks PHP

// Standar Ouput
// echo, print (menampilkan biasa)
// print_r (digunakan untuk mencetak isi array)
// var_dump (isi dari variabel dan akan tampil informasi dari variabel tersebut)

// echo "Farid Satria";
// echo 123213; // angka tidak perlu di ""
// print "Farid Satria";
// print_r ("Farid Satria");
var_dump ("Farid Satria");

// Penulisan Sintaks PHP
// 1. PHP dalam HTML
// 2. HTML di dalam PHP

//varibel tidak boleh di awali dengan angka, tapi boleh mengandung nama
$nama = "faridsatria";

echo "halo , nama saya $nama ";
// Operator Aritmatika
// + - * / %
// $x = 10;
// $y = 20;
// echo $x * $y;

// Operator penggabung String / Concatenation / concat
//  .
$nama_depan = "Farid";
$nama_belakang = "Satria";
echo $nama_depan ." ". $nama_belakang;

?>




<!-- // 1. PHP dalam HTML contoh -->
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Belajar PHP</title>
<head>
	<body>
		<h1>Halo Selamat Datang <?php echo "Farid Satria" ?></h1>
		<p><?php echo "ini adalah paragraf" ?></p>
	</body>
</head>
</html>

// 2. HTML dalam PHP
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Belajar PHP</title>
<head>
	<body>
		<?php 
			echo "<h1> Halo Selamat datang fast </h1>"
		 ?>
	</body>
</head>
</html>

<!-- variabel dan tipe data -->

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Belajar PHP</title>
<head>
	<body>
		<h1>Halo Selamat Datang <?php echo "Farid Satria" ?></h1>
	</body>
</head>
</html>


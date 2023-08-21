<?php 
// $_GET
// $_GET["nama"] = "Farid Satria";
$mahasiswa = [
	[
		"nama" => "Farid Satria",
		"nim" => "17050514006",
 		"kelas" => "ELKOM 2017",
 		"jurusan" => "Teknik Elektro",
 		"gambar" => "farid.jpg"

	],
	[
		"nama" => "Fitria Hidayanti",
		"nim" => "17050514003",
 		"kelas" => "GIZI 2018",
 		"jurusan" => "Pendidikan Kesejahteraan Keluarga",
		"gambar" => "fitria1.jpg"

	]
];

 // echo $mahasiswa[0]["gambar"];// Ini Cara memanggil Array secara manual.	
 ?>
 <!DOCTYPE html>
 <html>
 <head>
 	<title>get</title>
 </head>
 <body>
 <h1>Daftar Mahasiswa</h1>
 <?php foreach ($mahasiswa as $mhs) :?>
 	
 		<li><img src="img/<?php echo $mhs["gambar"]?>"></li>
 		<li><?php echo$mhs ["nama"] ?></l>
 		<li><?php echo$mhs ["kelas"] ?></li>
 		<li><?php echo$mhs ["nim"] ?></li>
 		<li><?php echo$mhs ["jurusan"] ?></li>

 <?php endforeach; ?>


 </body>
 </html>
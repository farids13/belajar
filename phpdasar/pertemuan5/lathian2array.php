<?php 
// menampilkan elemen Array yang benar

// menggunakan perulangan pada Array
// for / foreach

$angka = [3,2,1,3,4,6,4,6,4,3,22];
?>
<!DOCTYPE html>
<html>
<head>
	<title>Latihan 2</title>
	<style >
	div {
		width: 50px;
		height: 50px;
		background-color: green;
		text-align: center;
		line-height : 50px;
		margin: 3px;
		float: left;
	}
	</style>
</head>
<body>

<?php  for($i = 0; $i <8; $i++) { ?>
<div><?php echo $angka[$i] ?></div>
<?php } ?>



</body>
</html>

 
<?php   
// pengulanagan
// for
// while
// do ... while
// foreach
$a = 0;
$b =0 ;

for($i = 0; $i < 5 ; $i++){
    echo "Hello world for <br>";
}

while( $a < 5 ){
    echo "Hello world while <br>";
    $a++ ;
}

do{
        echo" Hello Wolrd do....while <br>";
        $b++ ;
}while( $b < 5 )

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>latihan php dengan perulangan</title>
</head>
<body>
    <table border="1" cellpadding="10" cellspacing="0">
        <?php for($c=1; $c<=3; $c++) { echo"$i"?> 
            <tr>
                <?php for ($j = 1;$j<=5;$j++) { echo "$j"?>
                        <td><?php echo " $i, $j" ?></td>
                <?php } ?>
            </tr>
        <?php } // perhatikan ini emang agak kelihatan ribet
         // tapi asilinya sama aja karena tag html nya akan ditutup
         // oleh 2 tag php  
         // jaid tanda buka kurawalnya di dalam php terus tutup nya juga di dalam php 
         // ini lebih efisien dalam pemrosesan data karena server tidak mengirim banyak sintaks
         // karena sudah berada di bahasa client sintax
         ?>
        
    </table>
</body>
</html>
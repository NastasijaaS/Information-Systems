<?php
 if (isset($_GET['ckstatus']))
 {
$namearray=array('zauzet','slobodan');
$randomize= $namearray[mt_rand(0,count($namearray)-1)];

echo $randomize;
 }
?>
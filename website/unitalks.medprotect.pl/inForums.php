<?php
$URL = $_SERVER['REQUEST_URI'];
if(strpos($URL,'forum') !== false){
	echo 'active';
}
 ?>
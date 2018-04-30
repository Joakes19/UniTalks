<?php
$URL = $_SERVER['REQUEST_URI'];
if(strpos($URL,'chat') !== false || strpos($URL,'Chat') !== false){
	echo 'active';
}
 ?>
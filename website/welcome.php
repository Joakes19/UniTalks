<?php
// Initialize the session
session_start();
 
// If session variable is not set it will redirect to login page
if(!isset($_SESSION['Username']) || empty($_SESSION['Username'])){
  header("location: login.php");
  exit;
}
else{
	header("location:forums.php");
}
?>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<?php require "head.php";?>
</head>
<body onresize="stickyfooter()">
<?php require "header.php";?>
<main>
	<h1 style="color:white">WELCOME 
	<?php echo $_SESSION['Username']?></h1>
	<a href="logout.php"> LOG OUT </a>
</main>
<?php require "footer.php";?>

<?php require "scripts.php";?>
</body>
</html>
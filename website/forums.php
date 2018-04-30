<?php require_once 'session.php'?>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<?php require "head.php";?>
</head>
<body onresize="stickyfooter()">
<?php require "header.php";?>
<div class="wrapper">
<div class="forum">
	<nav class="forumList">
	<?php require "available_forums.php"?>
	</nav>
</div>
<div class="container-forum">
	<main>
		<?php echo $_SERVER['REQUEST_URI'] ?>
	<p>JAVA PROGRAM HERE</p>
	</main>
</div>
<?php require "settings.php";?>
</div>
<?php require "scripts.php";?>
</body>
</html>
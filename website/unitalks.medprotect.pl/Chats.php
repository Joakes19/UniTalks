<?php require_once 'session.php'?>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<?php require "head.php";?>
</head>
<body onresize="stickyfooter()">
<?php require "header.php";?>
<div class="wrapper">
<div class="chats">
	<nav class="chatList">
	<?php require_once "available_chats.php"?>
	</nav>
</div>
<div class="container-chats">
	<main>
		<div id="display" class = "chat-display">
		</div>
		<div class = "chat-input">
			<form name="message" action="">
				<div class="chat-message">
                <label>Your message: </label>
                <input type="text" name="user-message" id="user-message" disabled>
				<input type="submit" name="submit" id="submit" value="Send" disabled>
				</div>
			</form>
		</div>
	</main>
</div>
<?php require "settings.php";?>
</div>
<?php require "scripts.php";?>
</body>
</html>
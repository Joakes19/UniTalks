<?php require_once 'available_chats_overlay.php'?>
<header>
<nav>
<span class="not_mobile"><a href="Chats.php" class="left <?php require "inChats.php"?>">CHATS</a></span>
<img src="logo-black.png" alt="UniTalks">
<span class="not_mobile"><a href="forums.php" class="right <?php require "inForums.php"?>">FORUMS</a></span>
<span onclick="openNav()" class="mobile right"><i class="fa fa-list"></i></span>
</nav>
 <!-- The overlay -->
<div id="myNav" class="overlay">

  <!-- Button to close the overlay navigation -->
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav($('#chats-menu'),$('#forum-menu'))">&times;</a>

  <!-- Overlay content -->
  <div class="overlay-content">
    <span style="cursor:pointer;">CHATS:</span>
	<?php echo $_SESSION['allChats']?>
	<span style="cursor:pointer;">FORUMS</span>
  </div>

</div>
</header>
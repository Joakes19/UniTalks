<?php
// Include config file
require_once 'config.php';

$username = $_SESSION['Username'];
$URL = $_SERVER['REQUEST_URI'];

$sql = "SELECT ForumParticipation.ForumID,ForumName FROM Forums JOIN ForumParticipation ON Forums.ForumID = ForumParticipation.ForumID JOIN Client ON ForumParticipation.ClientID = Client.Client_ID WHERE Username =? ORDER BY ForumName";

if ($stmt = $mysqli->prepare($sql)) {
	$stmt -> bind_param("s", $username);
	$stmt->execute();
	$result = $stmt -> get_result();
	while($row = $result->fetch_assoc()){
			echo '<a href="/forum'.$row['ForumID'].'.php"';
			$str = 'forum'.$row['ForumID'];
			if(strpos($URL,$str) !== false){
				echo ' class="active"';
			}
			echo'>'.$row['ForumName'].'</a>';
	}
	$stmt->close();
}
	$mysqli->close();
?>
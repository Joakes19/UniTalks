<?php
// Include config file
require_once 'config.php';

$username = $_SESSION['Username'];
$URL = $_SERVER['REQUEST_URI'];

$sql = "SELECT GroupChatParticipation.GroupChatID,GroupChatName FROM GroupChats JOIN GroupChatParticipation ON GroupChats.GroupChatID = GroupChatParticipation.GroupChatID JOIN Client ON GroupChatParticipation.ClientID = Client.Client_ID WHERE Username =? ORDER BY GroupChatName";

if ($stmt = $mysqli->prepare($sql)) {
	$stmt -> bind_param("s", $username);
	$stmt->execute();
	$result = $stmt -> get_result();
	echo '<ul>';
	while($row = $result->fetch_assoc()){
			echo '<li><a href="/chat'.$row['GroupChatID'].'.php"';
			$str = 'forum'.$row['GroupChatID'];
			if(strpos($URL,$str) !== false){
				echo ' class="active"';
			}
			echo'>'.$row['GroupChatName'].'</br><em style="font-size:0.5em;">Person: Last chat message</em></a></li>';
	}
	echo '</ul>';
	$stmt->close();
}
	$mysqli->close();
?>
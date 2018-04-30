<?php
// Include config file
require_once 'config.php';

$username = $_SESSION['Username'];
$URL = $_SERVER['REQUEST_URI'];
$sql = "SELECT GroupChatParticipation.GroupChatID,GroupChatName FROM GroupChats JOIN GroupChatParticipation ON GroupChats.GroupChatID = GroupChatParticipation.GroupChatID JOIN Client ON GroupChatParticipation.ClientID = Client.Client_ID WHERE Username =? ORDER BY GroupChatName";

if ($stmt = $mysqli->prepare($sql)) {
	$stmt -> bind_param("s", $username);
	$stmt -> execute();
	$result = $stmt -> get_result();
	echo '<ul id="links">';
	while($row = $result->fetch_assoc()){
			echo '<li><a href="javascript:;" onClick="activateChat(this,'.$row['GroupChatID'].');">'.$row['GroupChatName'].'</br></a></li>';
	}
	echo '</ul>';
	$stmt->close();
}
	$mysqli->close();
	
?>

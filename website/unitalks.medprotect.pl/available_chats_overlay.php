<?php
// Include config file
require_once 'config.php';

$username = $_SESSION['Username'];
$URL = $_SERVER['REQUEST_URI'];
$_SESSION['allChats'] = "";
$sql = "SELECT GroupChatParticipation.GroupChatID,GroupChatName FROM GroupChats JOIN GroupChatParticipation ON GroupChats.GroupChatID = GroupChatParticipation.GroupChatID JOIN Client ON GroupChatParticipation.ClientID = Client.Client_ID WHERE Username =? ORDER BY GroupChatName";

if ($stmt = $mysqli->prepare($sql)) {
	$stmt -> bind_param("s", $username);
	$stmt -> execute();
	$result = $stmt -> get_result();
	while($row = $result->fetch_assoc()){
			$temp = '<a href="javascript:;" onClick="activateChat(this,'.$row['GroupChatID'].');">'.$row['GroupChatName'].'</a>';
			$_SESSION['allChats'] = $_SESSION['allChats'].$temp;
	}
	$stmt->close();
}	
?>
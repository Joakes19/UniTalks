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
			echo '<li><a href="javascript:;" onClick="activateChat(this,'.$row['GroupChatID'].');">'.$row['GroupChatName'].'</br><em style="font-size:0.5em;">Person: Last chat message</em></a></li>';
	}
	echo '</ul>';
	$stmt->close();
}
	$mysqli->close();
	
?>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3/jquery.min.js"></script>
<script type="text/javascript">
var activeChatID;
function activateChat(activatedChat, id){
	$('#links a').removeClass('active');
    $(activatedChat).addClass('active');
	activeChatID = id;
	document.getElementById("user-message").disabled = false;
	document.getElementById("submit").disabled = false;
}
// jQuery Document
$(document).ready(function(){
	$("#submit").click(function(){	
		var message = $("#user-message").val();
		$.post("post.php", {text: message, id: activeChatID});				
		$("#user-message").attr("value", "");
		return false;
	});
	setInterval (loadLog, 100);
	
	//Load the file containing the chat log
	function loadLog(){		
		var oldscrollHeight = $("#display").attr("scrollHeight") - 20; //Scroll height before the request
		$.ajax({
			url: "Chatlog"+activeChatID+".html",
			cache: false,
			success: function(html){		
				$("#display").html(html); //Insert chat log into the #display div	
				//Auto-scroll			
				var newscrollHeight = $("#display").attr("scrollHeight") - 20; //Scroll height after the request
				if(newscrollHeight > oldscrollHeight){
					$("#display").animate({ scrollTop: newscrollHeight }, 'normal'); //Autoscroll to bottom of div
				}				
		  	},
		});
	}
});
</script>
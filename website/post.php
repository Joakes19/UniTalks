<?
session_start();
if(isset($_SESSION['Username'])){
	date_default_timezone_set('Europe/London'); 	
    $text = $_POST['text'];
    $id = 'Chatlog'.$_POST['id'].'.html';
    $fp = fopen($id, 'a');
    fwrite($fp, "<div><em style=\"font-size:12px\">(".date("g:i A").") </em><em style=\"font-size:20px\"><b>".$_SESSION['Username']."</b>: ".stripslashes(htmlspecialchars($text))."<br></em></div>");
    fclose($fp);
}
?>
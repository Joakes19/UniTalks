<?php
// Include config file
require_once 'config.php';
// Define variables and initialize with empty values
$message = $message_err = "";

// Processing form data when form is submitted
if($_SERVER["REQUEST_METHOD"] == "POST"){
	// Check if Username is empty
    if(empty(trim($_POST["Username"]))){
        $message_err = 'Please enter your message';
    } else{
        $message = trim($_POST["message"]);
    }
	
	if(empty($message_err)){
		
	}
	 // Close connection
    $mysqli->close();
}
?>
<?php
// Include config file
require_once 'config.php';
 
// Define variables and initialize with empty values
$Username = $Password = $confirm_Password = "";
$Forename_err = $Surname_err =$Username_err = $Password_err = $confirm_Password_err = "";
$Forename = $Surname = "";
 
// Processing form data when form is submitted
if($_SERVER["REQUEST_METHOD"] == "POST"){
 
    // Validate Username
    if(empty(trim($_POST["Username"]))){
        $Username_err = "Please enter a Username.";
    } else{
        // Prepare a select statement
        $sql = "SELECT Client_ID FROM Client WHERE Username = ?";
        
        if($statemet = $mysqli->prepare($sql)){
            // Bind variables to the prepared statement as parameters
            $statemet->bind_param("s", $param_Username);
            
            // Set parameters
            $param_Username = trim($_POST["Username"]);
            
            // Attempt to execute the prepared statement
            if($statemet->execute()){
                // store result
                $statemet->store_result();
                
                if($statemet->num_rows == 1){
                    $Username_err = "This Username has already created an account.";
                } else{
                    $Username = trim($_POST["Username"]);
                }
            } else{
                echo "Oops! Something went wrong. Please try again later.";
            }
        }
         
        // Close statement
        $statemet->close();
    }
    
    // Validate Password
    if(empty(trim($_POST['Password']))){
        $Password_err = "Please enter a Password.";     
    } elseif(strlen(trim($_POST['Password'])) < 6){
        $Password_err = "Password must have at least 6 characters.";
    } else{
        $Password = trim($_POST['Password']);
    }
    
    // Validate confirm Password
    if(empty(trim($_POST["confirm_Password"]))){
        $confirm_Password_err = 'Please confirm Password.';     
    } else{
        $confirm_Password = trim($_POST['confirm_Password']);
        if($Password != $confirm_Password){
            $confirm_Password_err = 'Password did not match.';
        }
    }
	
	//Validate Forename
	if(empty(trim($_POST["Forename"]))){
		$Forename_err = 'Please enter your forename';
	} else{
		$Forename = trim($_POST["Forename"]);
	}
	
	//Validate Surname
	if(empty(trim($_POST["Surname"]))){
		$Surname_err = 'Please enter your surname';
	} else{
		$Surname = trim($_POST["Surname"]);
	}
    
    // Check input errors before inserting in database
    if(empty($Forename_err) && empty($Surname_err) && empty($Username_err) && empty($Password_err) && empty($confirm_Password_err)){
        
        // Prepare an insert statement
        $sql = "INSERT INTO Client (Username, Password, Forename, Surname) VALUES (?, ?, ?, ?)";
         
        if($statemet = $mysqli->prepare($sql)){
            // Bind variables to the prepared statement as parameters
            $statemet->bind_param("ssss", $param_Username, $param_Password, $param_forename, $param_surname);
            
            // Set parameters
            $param_Username = $Username;
            $param_Password = password_hash($Password, PASSWORD_DEFAULT); // Creates a Password hash
			$param_forename = $Forename;
			$param_surname = $Surname;
            
            // Attempt to execute the prepared statement
            if($statemet->execute()){
                // Redirect to login page
                header("location: login.php");
            } else{
                echo "Something went wrong. Please try again later.";
            }
        }
         
        // Close statement
        $statemet->close();
    }
    
    // Close connection
    $mysqli->close();
}
?>
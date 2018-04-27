<?php
// Include config file
require_once 'config.php';
 
// Define variables and initialize with empty values
$Username = $Password = "";
$Username_err = $Password_err = "";
 
// Processing form data when form is submitted
if($_SERVER["REQUEST_METHOD"] == "POST"){
 
    // Check if Username is empty
    if(empty(trim($_POST["Username"]))){
        $Username_err = 'Please enter username.';
    } else{
        $Username = trim($_POST["Username"]);
    }
    
    // Check if Password is empty
    if(empty(trim($_POST['Password']))){
        $Password_err = 'Please enter your Password.';
    } else{
        $Password = trim($_POST['Password']);
    }
    
    // Validate credentials
    if(empty($Username_err) && empty($Password_err)){
        // Prepare a select statement
        $sql = "SELECT Username, Password FROM Client WHERE Username = ?";
        
        if($stmt = $mysqli->prepare($sql)){
            // Bind variables to the prepared statement as parameters
            $stmt->bind_param("s", $param_Username);
            
            // Set parameters
            $param_Username = $Username;
            
            // Attempt to execute the prepared statement
            if($stmt->execute()){
                // Store result
                $stmt->store_result();
                
                // Check if Username exists, if yes then verify Password
                if($stmt->num_rows == 1){                    
                    // Bind result variables
                    $stmt->bind_result($Username, $hashed_password);
                    if($stmt->fetch()){
                        if(password_verify($Password, $hashed_password)){
                            /* Password is correct, so start a new session and
                            save the Username to the session */
                            session_start();
                            $_SESSION['Username'] = $Username;
                            header("location: welcome.php");
                        } else{
                            // Display an error message if Password is not valid
                            $Password_err = 'The password you entered was not valid.';
                        }
                    }
                } else{
                    // Display an error message if Username doesn't exist
					$Username='';
                    $Username_err = 'No account found with that username.';
                }
            } else{
                echo "Oops! Something went wrong. Please try again later.";
            }
        }
        
        // Close statement
        $stmt->close();
    }
    
    // Close connection
    $mysqli->close();
}
?>
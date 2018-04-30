<?php require 'registration.php';?>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<?php require "head.php";?>
</head>
<body onresize="stickyfooter()">
<?php require "header.php";?>
<div class="wrapper">
<main>
	<div class="form">
        <h2>Sign Up</h2>
        <p>Please fill this form to create an account.</p>
        <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>" method="post">
			<div class="form-group <?php echo (!empty($Forename_err)) ? 'has-error' : ''; ?>">
                <label>Forename</label>
                <input type="text" name="Forename" class="form-control" value="<?php echo $Forename; ?>" placeholder="<?php echo $Forename_err?>">
            </div>
			<div class="form-group <?php echo (!empty($Surname_err)) ? 'has-error' : ''; ?>">
                <label>Surname</label>
                <input type="text" name="Surname" class="form-control" value="<?php echo $Surname; ?>" placeholder="<?php echo $Surname_err?>">
            </div>
            <div class="form-group <?php echo (!empty($Username_err)) ? 'has-error' : ''; ?>">
                <label>Username</label>
                <input type="text" name="Username"class="form-control" value="<?php echo $Username; ?>" placeholder="<?php echo $Username_err?>">
            </div>    
            <div class="form-group <?php echo (!empty($Password_err)) ? 'has-error' : ''; ?>">
                <label>Password</label>
                <input type="Password" name="Password" class="form-control" value="<?php echo $Password; ?>" placeholder="<?php echo $Password_err?>">
            </div>
            <div class="form-group <?php echo (!empty($confirm_Password_err)) ? 'has-error' : ''; ?>">
                <label>Confirm Password</label>
                <input type="Password" name="confirm_Password" class="form-control" value="<?php echo $confirm_Password; ?>"  placeholder="<?php echo $confirm_Password_err?>">
            </div>
            <div class="form-group">
                <input type="submit" class="btn btn-primary" value="Submit">
                <input type="reset" class="btn btn-default" value="Reset">
            </div>
            <p>Already have an account? <a href="login.php">Login here</a>.</p>
        </form>
    </div>
</main>
</div>
<?php require "scripts.php";?>
</body>
</html>
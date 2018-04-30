<?php require 'login_script.php'?>

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
        <h2>Login</h2>
        <p>Please fill in your credentials to login.</p>
        <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>" method="post">
            <div class="form-group <?php echo (!empty($Username_err)) ? 'has-error' : ''; ?>">
                <label>Username</label>
                <input type="text" name="Username" class="form-control" value="<?php echo $Username?>" placeholder="<?php echo $Username_err?>">
            </div>    
            <div class="form-group <?php echo (!empty($Password_err)) ? 'has-error' : ''; ?>">
                <label>Password</label>
                <input type="password" name="Password" class="form-control" placeholder="<?php echo $Password_err?>">
            </div>
            <div class="form-group">
                <input type="submit" class="btn btn-primary" value="Login">
            </div>
            <p>Don't have an account? <a href="register.php">Sign up now</a>.</p>
        </form>
    </div>
</main>
</div>
<?php require "scripts.php";?>
</body>
</html>
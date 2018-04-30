<div class="settings">
		<div class="admins">
			<h1>Admins:</h1>
			<ul>
			<li>Michael Jones</li>
			<li>Kyle</li>
			<li>Dr Vitaliv Kurlin</li>
			</ul>
		</div>
		<div class="report">
		<h1>Report</h1>
		<p>If someone's post/replies to posts offend you in any way, please report it to our admins as soon as possible.</p>
		<ul>
			<li>Michael Jones</li>
			<li>Kyle</li>
			<li>Dr Vitaliv Kurlin</li>
		</ul>
		</div>
		<div class="other">
		<h1>Settings</h1>
		<ul style="list-style-type: none"><?php
			// Initialize the session
		session_start();
		// If session variable is not set it will redirect to login page
		if(!empty($_SESSION['Username'])){
		  echo '<li><a href="logout.php" class="logout">LOGOUT</a></li>';
		}
		?></ul>
		</div>
</div>
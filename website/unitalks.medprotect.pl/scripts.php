
  <script>/* Open when someone clicks on the span element */
function openNav() {
	$('body').addClass('over');
    document.getElementById("myNav").style.height = "100%";
}

/* Close when someone clicks on the "x" symbol inside the overlay */
function closeNav(param1,param2) {
	$('body').removeClass('over');
    document.getElementById("myNav").style.height = "0%";
	if($(param1).hasClass('display')){$(param1).removeClass('display');}
	if($(param2).hasClass('display')){$(param2).removeClass('display');}
}
function showIt(param) {
	$(param).toggleClass('display');
}
</script>
<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-100358991-2', 'auto');
  ga('send', 'pageview');

</script>
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
			error: function(){
				$.ajax({
					url: "ChatlogDefault.html",
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
			},
		});
	}
});
</script>

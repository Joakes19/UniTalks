
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

$(document).ready(function() {
	var  nav = $('nav');
    mns = 'main-nav-scrolled';
    hdr = $('header').height();

$(window).on('scroll', function(){
    if($(window).scrollTop()>=hdr && !$(nav).hasClass(mns)){
        $(nav).addClass(mns); 
    }
    else if($(window).scrollTop()<hdr && $(nav).hasClass(mns)){
       $(nav).removeClass(mns) 
    }
});
});

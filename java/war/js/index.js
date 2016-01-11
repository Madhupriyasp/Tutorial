$(document).ready(function() {
  
  var animating = false,
      submitPhase1 = 1100,
      submitPhase2 = 400,
      logoutPhase1 = 800,
      $login = $(".login"),
      $app = $(".app");
  
  function ripple(elem, e) {
    $(".ripple").remove();
    var elTop = elem.offset().top,
        elLeft = elem.offset().left,
        x = e.pageX - elLeft,
        y = e.pageY - elTop;
    var $ripple = $("<div class='ripple'></div>");
    $ripple.css({top: y, left: x});
    elem.append($ripple);
  };
  
  $(document).on("click", ".login__submit", function(e) {
	  storeDate();
  });
  
  $(document).on("click", ".app__logout", function(e) {
    if (animating) return;
    $(".ripple").remove();
    animating = true;
    var that = this;
    $(that).addClass("clicked");
    setTimeout(function() {
      $app.removeClass("active");
      $login.show();
      $login.css("top");
      $login.removeClass("inactive");
    }, logoutPhase1 - 120);
    setTimeout(function() {
      $app.hide();
      animating = false;
      $(that).removeClass("clicked");
    }, logoutPhase1);
  });
  
});


function storeDate()
{
	console.log("inside storeData method");
	
	var name = $('#registered_name').val(),
	email=$('#registered_email').val(),
	username=$('#registered_uname').val(),
	pwd=$('#registered_pwd').val(),
	con_pwd=$('#registered_cpwd').val(),
	mobile=$('#registered_mobile').val(),
	city=$('#registered_city').val(),
	state=$('#registered_state').val(),
	country=$('#registered_country').val();
	console.log("name"+name);
	
	dataObj			= {};
	dataObj.name	= name;
	dataObj.email			= email;
	dataObj.username	= username;
	dataObj.pwd	= pwd;
	dataObj.con_pwd	= con_pwd;
	dataObj.mobile			= mobile;
	dataObj.city	= city;
	dataObj.state	= state;
	dataObj.country	= country;
	checker			=  true;
	
	 url="/storeRegisterDetail";
}
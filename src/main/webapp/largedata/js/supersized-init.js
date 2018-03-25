jQuery(function($){
	 createCode();
    $.supersized({

        // Functionality
        slide_interval     : 3000,    // Length between transitions
        transition         : 1,    // 0-None, 1-Fade, 2-Slide Top, 3-Slide Right, 4-Slide Bottom, 5-Slide Left, 6-Carousel Right, 7-Carousel Left
        transition_speed   : 4000,    // Speed of transition
        performance        : 1,    // 0-Normal, 1-Hybrid speed/quality, 2-Optimizes image quality, 3-Optimizes transition speed // (Only works for Firefox/IE, not Webkit)

        // Size & Position
        min_width          : 0,    // Min width allowed (in pixels)
        min_height         : 0,    // Min height allowed (in pixels)
        vertical_center    : 1,    // Vertically center background
        horizontal_center  : 1,    // Horizontally center background
        fit_always         : 0,    // Image will never exceed browser width or height (Ignores min. dimensions)
        fit_portrait       : 1,    // Portrait images will not exceed browser height
        fit_landscape      : 0,    // Landscape images will not exceed browser width

        // Components
        slide_links        : 'blank',    // Individual links for each slide (Options: false, 'num', 'name', 'blank')
        slides             : [    // Slideshow Images
                                 {image : 'largedata/images/bg1.jpg'},
                                 {image : 'largedata/images/bg2.jpg'},
                                 {image : 'largedata/images/bg3.jpg'}
                             ]

    });

});

var code;
function createCode(){
    //首先默认code为空字符串
    code = '';
    //设置长度，这里看需求，我这里设置了4
    var codeLength = 4;
    var codeV = document.getElementById('code');
    //设置随机字符
    var random = new Array(0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R', 'S','T','U','V','W','X','Y','Z');
    //循环codeLength 我设置的4就是循环4次
    for(var i = 0; i < codeLength; i++){
        //设置随机数范围,这设置为0 ~ 36
         var index = Math.floor(Math.random()*36);
         //字符串拼接 将每次随机的字符 进行拼接
         code += random[index]; 
    }
    //将拼接好的字符串赋值给展示的Value
    codeV.value = code;
}

//下面就是判断是否== 的代码，无需解释
function validate(){
    var oValue = document.getElementById('input').value.toUpperCase();
    if(oValue ==0){
        alert('请输入验证码');
        return false;
    }else if(oValue != code){
        alert('验证码不正确，请重新输入');
        oValue = ' ';
        createCode();
        return false;
    }else{
        return true;
    }
}

//设置此处的原因是每次进入界面展示一个随机的验证码，不设置则为空
window.onload = function (){
   
}




$('.login_btn').click(function(){
	is_hide();
});
var u = $("input[name=username]");
var p = $("input[name=password]");
$(".login_submit").live('click',function(){
	  var oValue = document.getElementById('input').value.toUpperCase();
	  
	if(u.val() == '' || p.val() =='' || oValue == 0 )
	{
		$(".login_tips_mes").html("用户名或密码或验证码不能为空!");
		is_show();
		
		return false;
	}else if(oValue != code){
		$(".login_tips_mes").html("验证码不正确，请重新输入!");
		  createCode();
		is_show();
		
		return false;
    }
	else {
//		var reg = /^[0-9A-Za-z]/;
//		if(reg.exec(u.val()))
//		{
//			$(".login_tips_mes").html("用户名或密码错误!");
//			is_show();
//			return false;
//		}
	}
});
window.onload = function()
{
    var $contP = $(".login_connect p");
    $contP.eq(0).animate({"left":"0%"}, 600);
    $contP.eq(1).animate({"left":"0%"}, 400);
};
function is_hide(){ $(".login_tips").animate({"top":"-35%"}, 300) }
function is_show(){ $(".login_tips").show().animate({"top":"40%"}, 300) }


$.fn.clickup=function()
{
	$(this).click(function(){
		$(this).parent().slideUp().siblings().not(".title_none").slideDown('fast');
		$(this).siblings('li').css('right', '-100%');
	});
};
$.fn.clickdown=function()
{
	$(this).click(function()
	{
		$(this).siblings('.list_se').slideToggle('fast').siblings().not(".title_none").slideToggle('fast');
		$(this).parent().siblings().children('.list_se').slideUp('fast').siblings().not(".title_none").slideDown('fast');
		var li = $(this).siblings('.list_se').children('li');
		for(var i=0;i<li.length;i++){
			li.eq(i).animate({right:'0'},i*25);
		}
		$(this).parent().siblings().children('.list_se').children('li').css('right', '-100%');
	})
};
/**
 * Created by Administrator on 2017/3/27.
 */
$(function(){
    //nav_switch
    $(".nav_switch").click(function(){
        $(this).toggleClass("is_active");
        var $nav = $(".index_nav");
        var Left = $nav.css("left");
        if(Left == "-210px"){
            aa();
            $nav.animate({left:'0px'},250);
        }else{
            bb();
            $nav.animate({left:'-210px'},250);
        }
    });
    function aa(){
        var aa=$(window).width()-260;
        $(".index_container").animate({width: aa+"px" },250)
    }
    function bb(){
        var aa=$(window).width()-50;
        $(".index_container").animate({width: aa+"px" },250)
    }
    //user
    $(".user_setting").hide();
    $(".index_header_user b").click(function(){
        $(".user_setting").slideToggle(200);
        $(".skin_box").slideUp(200);
    });
    //search
    $(".search_input").focus(function(){
        $(this).parent(".search_box").animate({ width: "220px" },200);
        $(this).animate({ width: "200px" });
    }).blur(function(){
        $(this).parent(".search_box").animate({ width: "150px" },200);
        $(this).animate({ width: "130px" });
    });
    //data
    $(".index_header_data li").not(":first").hide();
    var index =0;
    var timer = setInterval(function(){
        index = (index == 2) ? 0 : index + 1;
        $(".index_header_data li").hide().eq(index).fadeIn(1000);
    }, 7000);

    //skin
    $(".skin_box").hide();
    $(".skin").click(function () {
        $(".skin_box").slideToggle(200);
        $(".user_setting").slideUp(200);
    });
    $(".skin_default").click(function () {
        $("body").removeClass().addClass("bg_style_default");
        $(".index_header").css("background-color","rgba(0,0,0,0.3)");
    });
    $(".skin_1").click(function () {
        $("body").removeClass().addClass("bg_style1");
        $(".index_header").css("background-color","rgba(79,178,239,1)");
    });
    $(".skin_2").click(function () {
        $("body").removeClass().addClass("bg_style2");
    });
    $(document).not(".skin_box").click(function () {
        $(".skin_box").slideUp();
    });
    //弹窗
    $(".user_setting li:first").click(function () {
        $(".user_info_popup").animate({"top":"20%"}, 600);
        $(".password_popup").animate({"top":"-1000%"}, 600);
    });
    $(".user_setting li:nth-child(2)").click(function () {
        $(".password_popup").animate({"top":"20%"}, 600);
        $(".user_info_popup").animate({"top":"-1000%"}, 600);
    });
    $(".user_submit").click(function () {
        $(".user_info_popup").animate({"top":"-1000%"}, 600);
    });
    $(".user_none").click(function () {
        $(".user_info_popup").animate({"top":"-1000%"}, 600);
    });
    $(".password_submit").click(function () {
        $(".password_popup").animate({"top":"-1000%"}, 600);
    });
    $(".password_none").click(function () {
        $(".password_popup").animate({"top":"-1000%"}, 600);
    });
    //nav
    $('.nav_ul li p').clickdown();
    $('.list_se p[class=title]').clickup();
    //nav link
    // $(".index_container").load("home.html");
    // $(".nav_home").click(function(){
    //     $(".index_container").load("home.html");
    // });

    function autoW(){
        var ww = $(window).width();
        var $cont = $(".index_container");
        $cont.css("width",ww - 50);
        $cont.css("right",0);
    }
    autoW();
    function autoH() {
        var wh = $(window).height();
        $(".index_container").css("height", wh - 64);
    }
    $(function() {
        autoH();
        $(window).resize(autoH);
    })
});

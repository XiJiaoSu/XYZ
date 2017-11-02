$(window).on("load resize",function(){
        var height=window.innerHeight||document.body.clientHeight||document.documentElement.clientHeight;
        console.log(height);
        if (height<750){
            height=750;
        }
        $(".app-container").css("height",height);
        $(".app-slide-bar").css("height",height);
    });
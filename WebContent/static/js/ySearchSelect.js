/**
 * 此功能与LayUI表单提交按钮 lay-filter="submitBut" 监听冲突
 * 冲突内容为回车按键。类型改成type="button"，可以躲过监听。
 * <button type="button" class="layui-btn" lay-submit lay-filter="submitBut">立即提交</button>
 * **/


(function ($) {
    $.fn.extend({
        "ySearchSelect": function (options) {
            
            defaluts.searchName = this.selector;
        	
            var opts = $.extend({}, defaluts, options); //使用jQuery.extend 覆盖插件默认参数
            return this.each(function () {  //这里的this 就是 jQuery对象。这里return 为了支持链式调用
                init(opts);
            });

        }
    });
    
    //默认参数
    var defaluts = {
        searchName: '.ySearchSelect'
    };
	var SELECT_VALUE = null;	//保存上下键选中的项目的值
	var SELECT_INDEX = -1;	//保存上下键选中的项目的索引
    
    
    //初始化插件
    function init(o){
    	
    	$(document).click(function(){
			$(".ySearchSelect ul").hide();
			$(".ySearchSelect .input-text").hide();
			$(".ySearchSelect i.layui-edge").removeClass("select");
		});
		
		$(o.searchName+" .layui-input").click(function(event){
			//阻止document点击事件
			event.stopPropagation();
			$(".ySearchSelect ul").hide();
			$(".ySearchSelect .input-text").hide();
			$(".ySearchSelect i.layui-edge").removeClass("select");
			
			if($(this).siblings(".input-text").length <= 0){
				var str = '<div class="input-text">'+
						'<input type="text" name="" placeholder="输入关键字" class="layui-input">'+
						'<i class="iconfont icon-sousuo"></i>'+
					'</div>';
					// $(o.searchName).val().append(str);
				$(o.searchName).append(str);
			}
			if($(this).siblings("ul").css("display") == "none"){
				$(this).siblings("i").addClass("select");
				$(this).siblings("ul").show();
				$(this).siblings(".input-text").show();
				SELECT_VALUE = null;	//保存上下键选中的项目的值
				SELECT_INDEX = -1;	//保存上下键选中的项目的索引
			}else{
				$(this).siblings("i").removeClass("select");
				$(this).siblings("ul").hide();
				$(this).siblings(".input-text").hide();
			}
			$(o.searchName+" .input-text input").focus();
			$(o.searchName+" .input-text").width($(o.searchName+" ul li").width()+20);
			
			//键盘监听事件
			$(o.searchName+" .input-text input").keyup(function(event){
				if(event.keyCode != 38 && event.keyCode != 40 && event.keyCode != 13){
					ySearchSelectMate($(this).val(),o.searchName);
					
					//默认搜索过程中第一个项目被选中
					SELECT_INDEX = 0;
					selectKeyUD(event, o.searchName);
				}
			});
			
			//选项点击事件
			$(this).siblings("ul").find("li").click(function(){
				$(this).parent().hide();
				$(this).parent().siblings(".input-text").hide();
				$(this).parent().siblings("i.layui-edge").removeClass("select");
				$(this).parent().siblings(".layui-input").val($(this).text());
			});
			
		});
		
		//上下键监听事件
		$(o.searchName).keydown(function(event){
			selectKeyUD(event, o.searchName);
			
			if(event.keyCode == 13){
				$(o.searchName+" ul").hide();
				$(o.searchName+" .input-text").hide();
				$(o.searchName).find("i.layui-edge").removeClass("select");
				$(o.searchName).find(".layui-input").text(SELECT_VALUE);
			}
			
		});
    }
    
    //点击上下按钮的执行方法
	function selectKeyUD(event, name){
		
		var nums = $(name+" ul").find("li.on").length;
		
		if(event.keyCode == 38){
			if(SELECT_INDEX <= 0){
				SELECT_INDEX = 0;
			}else{
				SELECT_INDEX--;	
			}
		}
		if(event.keyCode == 40){
			if(SELECT_INDEX >= nums-1){
				SELECT_INDEX = nums-1;
			}else{
				SELECT_INDEX++;	
			}
		}
		
		SELECT_VALUE = $(name+" ul").find(".on").eq(SELECT_INDEX).text();
		$(name+" ul").children().removeClass("active");
		$(name+" ul").find(".on").eq(SELECT_INDEX).addClass("active");
		
		//上下键跳滚动条
		//滑轮的位置
		try{
			var selectTop = $(name+" ul").find(".on").eq(SELECT_INDEX).position().top;
			if(selectTop < 41 || selectTop >= 192-5){
				if(SELECT_INDEX-4 <= 0){
					$(name+" ul").scrollTop(0);
				}else{
					$(name+" ul").scrollTop((SELECT_INDEX-4)*36);
				}
				
			}
		}catch(e){
			//TODO handle the exception
//			console.log("输入的搜索条件不符合");
		}
	}
	
	//匹配搜索，不匹配则隐藏。
	function ySearchSelectMate(value,name){
		value = $.trim(value.toString()); // 去掉两头空格
		if(value == ''){ // 如果搜索框输入为空
	        $(name+" ul li").attr("class","on");
	        return false;
	    }
		var nums = $(name+" ul li").length;
		$(name+" ul li").attr("class","hide");
		for (var i = 0; i < nums; i++) {
			var pinyin = $("body").val($(name+" ul").children().eq(i).text()).toPinyin().substr();
			if(pinyin.toLowerCase().indexOf(value.toLowerCase()) > -1){
				$(name+" ul").children().eq(i).attr("class","on");
			}
		}
		$(name+" ul li:contains('"+value+"')").attr("class","on");
	}
})(window.jQuery);

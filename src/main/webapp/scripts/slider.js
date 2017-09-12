var totalPanels			;
var regWidth			;
var regImgWidth		    ;
var regTitleSize		;
var regParSize			;

var movingDistance	    ;

var curWidth			;
var curImgWidth			;
var curTitleSize		;
var curParSize			;

var $panels				;
var $container			;
var scroll;
var next       ;
var leftValue   ;
var movement	;
var curPanel ;

function init() {
	
	totalPanels			= $(".scrollContainer").children().size();
		
	 regWidth			= $(".panel").css("width");
	 regImgWidth			= $(".panel img").css("width");
	 regTitleSize		= $(".panel h2").css("font-size");
	 regParSize			= $(".panel p").css("font-size");
	
	 movingDistance	    = 612;
	
	 curWidth			= $(".panel").css("width");
	 curImgWidth			= $(".panel img").css("width");
	 curTitleSize		= $(".panel h2").css("font-size");
	 curParSize			= $(".panel p").css("font-size");

	 $panels				= $('#slider .scrollContainer > div');
	 $container			= $('#slider .scrollContainer');

	$panels.css({'float' : 'left','position' : 'relative'});
    
	$("#slider").data("currentlyMoving", false);

	if($panels[0]!=null){
	$container
		.css('width', ($panels[0].offsetWidth * $panels.length) + 100 )
		.css('left', "0px");
	}
	 scroll = $('#slider .scroll').css('overflow', 'hidden');

	function returnToNormal(element) {
		$(element)
			.animate({ width: regWidth })
			.find("img")
			.animate({ width: regImgWidth })
		    .end()
			.find("h2")
			.animate({ fontSize: regTitleSize })
			.end()
			.find("p")
			.animate({ fontSize: regParSize });
	};
	
	function growBigger(element) {
		$(element)
			.animate({ width: curWidth })
			.find("img")
			.animate({ width: curImgWidth })
		    .end()
			.find("h2")
			.animate({ fontSize: curTitleSize })
			.end()
			.find("p")
			.animate({ fontSize: curParSize });
	}
	

	
	
	growBigger("#panel_1");	
	 curPanel = 1;

	
//	$(window).keydown(function(event){
//	  switch (event.keyCode) {
//			case 13: //enter
//				$(".next").click();
//				break;
//			case 32: //space
//				$(".next").click();
//				break;
//	    case 37: //left arrow
//				$(".prev").click();
//				break;
//			case 39: //right arrow
//				$(".next").click();
//				break;
//	  }
//	});
	
};
function init2(){
	function change(direction) {
		   if(totalPanels<9){return;}

			if((direction && !(curPanel <= totalPanels-9)) || (!direction && (curPanel <= 1))) { return false; }	

	        if (($("#slider").data("currentlyMoving") == false)) {
	            
				$("#slider").data("currentlyMoving", true);
				
				 next         = direction ? curPanel + 9 : curPanel - 9;
				 leftValue    = $(".scrollContainer").css("left");
				 movement	 = direction ? parseFloat(leftValue, 10) - movingDistance : parseFloat(leftValue, 10) + movingDistance;
			
				$(".scrollContainer")
					.stop()
					.animate({
						"left": movement
					}, function() {
						$("#slider").data("currentlyMoving", false);
					});
				
				returnToNormal("#panel_"+curPanel);
				growBigger("#panel_"+next);
				
				curPanel = next;
			
			}
		}
	
	function returnToNormal(element) {
		$(element)
			.animate({ width: regWidth })
			.find("img")
			.animate({ width: regImgWidth })
		    .end()
			.find("h2")
			.animate({ fontSize: regTitleSize })
			.end()
			.find("p")
			.animate({ fontSize: regParSize });
	};
	
	function growBigger(element) {
		$(element)
			.animate({ width: curWidth })
			.find("img")
			.animate({ width: curImgWidth })
		    .end()
			.find("h2")
			.animate({ fontSize: curTitleSize })
			.end()
			.find("p")
			.animate({ fontSize: curParSize });
	}
	
		$(".next").click(function(){ change(true); });	
		$(".prev").click(function(){ change(false); });
		}
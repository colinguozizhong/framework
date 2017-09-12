<%
	//清空页面缓存  防止用户出现数据没有刷新
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setDateHeader("Expires", 0);
	request.setCharacterEncoding("UTF-8");
	String basePath = request.getContextPath() + "/";
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<%= basePath%>style/jquery-ui.min.css" rel="stylesheet" />
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<script type="text/javascript" src="<%=basePath%>scripts/jquery-3.0.0.min.js"></script>
<script type="text/javascript" src="<%=basePath%>scripts/jquery-ui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>scripts/pdfInstall.js"></script>
<script type="text/javascript" src="<%=basePath%>scripts/formValidatorRegex.js"></script>
<script type="text/javascript">
(function($){
	$.ajaxSetup({
		global: true,
		cache: false,
		type: "POST"
	});
    var ajax=$.ajax;
    $.ajax=function(s){
        var old = s.error;
        var errHeader = s.errorHeader || "Error-Json";
        s.error = function(xhr,status,err){
           var errMsg = xhr.getResponseHeader(errHeader);
           if(errMsg != null){
        	   if(parent){
        	       parent.xzzfAlert("错误",errMsg+"会话到期",function(){
        	           window.top.location.href = "<%=basePath%>login.jsp";
        		   });
        	   }else{
        		   alert(errMsg+"会话到期");
        	       window.top.location.href = "<%=basePath%>login.jsp";
        	   }
           }
		}
		ajax(s);
	}
})(jQuery);

//如果最后一位字符是标点符号，用正则表达式去除
var namePattern = function (str){
	var patrn=/[`~!@#$^&*(=|{:;,\\[.<\/?~！@#￥……&*（——|{【‘；：“。，、？]$/;  
	var pn = str;
	
	pn = $.trim(pn) ;
	if (patrn.exec(pn)){
		pn = pn.substr(0,pn.length-1);
	}
	return pn;
}
	
function projectNamePattern(value){
	var patrn=/[`~!@#$^&*(=|{:;,\\[.<\/?~！@#￥……&*（——|{【‘；：“。，、？]$/;  
	var pn = value;
	pn = $.trim(pn);
	if (patrn.exec(pn)){
		pn = pn.substr(0,pn.length-1);
	}
	return pn;
}

NumToDX = function(n) {
	if (!checkRegex("money", n))
		return "";
	if (n == "0" || n == "0.0" || n == "0.00")
		return "零元";
	var unit = "仟百拾亿仟佰拾万仟佰拾元角分", str = "";
	n += "00";
	var p = n.indexOf('.');
	if (p >= 0)
		n = n.substring(0, p) + n.substr(p + 1, 2);
	unit = unit.substr(unit.length - n.length);
	for ( var i = 0; i < n.length; i++)
		str += '零壹贰叁肆伍陆柒捌玖'.charAt(n.charAt(i)) + unit.charAt(i);
	return str.replace(/零(仟|佰|拾|角)/g, "零").replace(/(零)+/g, "零").replace(
			/零(万|亿|元)/g, "$1").replace(/(亿)万|^壹(拾)/g, "$1$2").replace(
			/^元零?|零分/g, "").replace(/元$/g, "元整");
};

BindMoney = function(vId, sId) {
	$("#" + sId).empty().append(NumToDX($("#" + vId).val()));
	$("#" + vId).bind("change keyup", function() {
		$("#" + sId).empty().append(NumToDX($("#" + vId).val()));
	});
};

BindZH = function(vId, sId) {
	$("#" + sId).empty().append(NumToZH($("#" + vId).val()));
	$("#" + vId).bind("change keyup", function() {
		$("#" + sId).empty().append(NumToZH($("#" + vId).val()));
	});
};

NumZH = function(num, param) {
	num = parseInt(num);
	if (isNaN(num))
		return '';
	return '第' + NumToZH(num) + param;
};
</script>

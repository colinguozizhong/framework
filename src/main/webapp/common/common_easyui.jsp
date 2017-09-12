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
	<link rel="stylesheet" type="text/css" href="<%=basePath%>scripts/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>scripts/easyui/themes/icon.css">
	<script type="text/javascript" src="<%=basePath%>scripts/easyui/jquery.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>scripts/easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>scripts/tree.loadFilter.js"></script>
<script type="text/javascript" src="<%=basePath%>scripts/pdfInstall.js"></script>
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
</script>

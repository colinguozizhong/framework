<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN">
<html>
<head>
<title>系统登录</title>
<%@include file="./common/common_easyui.jsp" %>
<link href="<%=basePath%>style/css_login.css" rel="stylesheet" type="text/css" />

<script>
		var error = '<%=request.getParameter("error")%>';
		if( error != 'null' && error.length > 0){
			alert('${SPRING_SECURITY_LAST_EXCEPTION.message}');
		}
		if (window.top != null && window.top.document.URL != document.URL){            
			window.top.location.href = document.URL;      
		}
		
	
	//是否为空校验
	function isEmpty(s) {
		var lll=trim(s);
		if( lll == null || lll.length == 0 )
			return true;
		else
			return false;
	}
	
	//删除字符串左边的空格
	function ltrim(str) { 
		if(str.length==0)
			return(str);
		else {
			var idx=0;
			while(str.charAt(idx).search(/\s/)==0)
				idx++;
			return(str.substr(idx));
		}
	}

	//删除字符串右边的空格
	function rtrim(str) { 
		if(str.length==0)
			return(str);
		else {
			var idx=str.length-1;
			while(str.charAt(idx).search(/\s/)==0)
				idx--;
			return(str.substring(0,idx+1));
		}
	}

	//删除字符串左右两边的空格
	function trim(str) { 
		return(rtrim(ltrim(str)));
	}

    function login(){
    	var name = document.getElementById("j_username").value;
    	var password = document.getElementById("j_password").value;
	    if( isEmpty(name) || trim(name)=="" || isEmpty(password) || trim(password)== ""){
	       
	      alert("用户名/密码为空,请重新输入!");
	      return false;  
	    }
		document.LoginForm.submit();
		return false;
	}

	function KeyDown(event) {
		event = event ? event : (window.event ? window.event : null);
		if (event.keyCode == 13) {
			event.returnValue = false;
			event.cancel = true;
			window.document.forms[0].submit();
		}
	}
	function fillData(){
		if(browserName.toString().indexOf("mozilla")>-1 && browserVersion.toString().indexOf("11.")>-1){
			browserName="IE";
		}else{
			switch(browserName.toString()) {
			case "maxthon":browserName="遨游";break;
			case "msie":browserName="IE";break;
			case "360se":browserName="360安全浏览器";break;
			case "360ee":browserName="360极速浏览器";break;
			case "theworld":browserName="世界之窗";break;
			case "se":browserName="搜狗浏览器";break;
			case "greenbrowser":browserName="绿色浏览器";break;
			case "qqbrowser":browserName="QQ浏览器";break;
			case "tencenttraveler":browserName="腾讯浏览器";break;
			case "bidubrowser":browserName="百度浏览器";break;
			case "lbbrowser":browserName="猎豹浏览器";break;
			case "trident":browserName="IE";break;
			}
		}
		$("#browsername").val(browserName.toString());
	    $("#browserversion").val(browserVersion.toString());
	}
	
	$(document).ready(function(){  
		var imageArr=document.getElementById("shouyeimg");
		var imageRate = imageArr.offsetWidth / imageArr.offsetHeight;    
		var maxWidth = window.screen.width-22;
		if(imageArr.offsetWidth > maxWidth && maxWidth>1300)
		{
		    imageArr.style.width=maxWidth + "px";
		    imageArr.style.Height=maxWidth / imageRate + "px";
		}

	}); 
</script>
</head>

<body onload="document.forms[0].loginName.focus();fillData();">
	<div class="top cl">
       <div class="f_l top "><img src="<%=basePath%>images/logo2.png" /></div>
       <div class="f_r pd15"><font color="Red">0551-65396785/65396783</font>  |  24小时紧急电话：18096618355 |  240161149<font color="Red">（已满）</font>/324150336</div>
    </div>
    <div class="banner cl"><img id="shouyeimg" src="<%=basePath%>images/banner.jpg" /> 
    <div class="box_h">
      <span><img src="<%=basePath%>images/yhdl.png" /></span>
      
      <form name="LoginForm" 
					action="<%=basePath%>j_spring_security_check" method="post">
					<input type="hidden" name="browsername" id="browsername"/>
					<input type="hidden" name="browserversion" id="browserversion"/>
					<input type="hidden" name="theip" id="theip"/>
      <div class="pd30">
      <div class="pd60"><input name="j_username" tabindex="1" id="j_username" value="" type="text" onkeydown="KeyDown(event);" class="tex01"/></div>
      <div><input name="j_password"  tabindex="2"  id="j_password" type="password" onkeydown="KeyDown(event);" class="tex02"/></div>
      <div><input name="" type="button" class="bu " onclick="login()" />
      <input name="nextPath" value="<%=request.getParameter("goto")%>" type="hidden"/></div>
       </div>
    </form>
    </div>
    </div>
   
    <div class="m_main">
<div class="f_l b_1">
          <div class="bg_01"><strong>系统登录动态口令软件</strong></div>
          <div class="f_l b_2">
             <div class="f_l c_1"><img src="<%=basePath%>images/ew_anzhuo_update.png" /></div>
             <div class="f_l">
             <div class=""><img src="<%=basePath%>images/anzhuo.png" /></div>
             <div><strong>扫描二维码下载</strong></div>
             <div>http://www.ahhm.net:8886/android.html</div>
             <div><a href="#" onclick="javascript:window.open('https://www.ahhm.net:9000/ia.html','newwindow');" ><strong>点我下载>></strong></a></div>
             </div>
          </div>
		<div class="f_l b_2">
             <div class="f_l c_1"><img src="<%=basePath%>images/ew_pingguo.png" /></div>
             <div class="f_l">
             <div class=""><img src="<%=basePath%>images/pingguo.png" /></div>
             <div><strong>扫描二维码下载</strong></div>
             <div>https://www.ahhm.net:9000/</div>
             <div><a href="<%=basePath%>resources/KeyClient.ipa"><strong>点我下载>></strong></a></div>
             </div>
          </div>       
    </div>
     <div class="f_l">
          <div class="bg_01"><strong>系统使用帮助</strong></div>
           <div class="pd80">
           <div><a href="<%=basePath%>resources/guide.doc">系统入门手册 >></a></div>
           <div><a href="<%=basePath%>resources/DPassword.doc">用户动态口令认证app使用说明书 >></a></div>
           <div><a href="<%=basePath%>download/AdbeRdr11000_zh_CN.exe">PDF查看工具 >></a></div>
           </div>
       </div>
    </div>
	<div class="buttom cl">科大国创软件股份有限公司  推荐1024*768以上分辨率浏览 版本： SaturnV1.4</div>
</body>
</html>

function isAcrobatPluginInstall(){ 
	//navigator.platform=="Win32"浏览器位数
	//如果是firefox浏览器 
	if (navigator.plugins && navigator.plugins.length) { 
		for (var x=0; x<navigator.plugins.length;x++) { 
			//第一是判断火狐，第二个是
			if (navigator.plugins[x].name== 'Adobe Acrobat'||navigator.plugins[x].name== 'Chrome PDF Viewer') 
				return true; 
		} 
	//下面代码都是处理IE浏览器的情况 
	} else if (window.ActiveXObject) { 
		for (var x=2; x<10; x++) { 
			try { 
				oAcro=eval("new ActiveXObject('PDF.PdfCtrl."+x+"');"); 
				if (oAcro) { 
	    			return true; 
				} 
			} catch(e) {} 
		} 
		try { 
			oAcro4=new ActiveXObject('PDF.PdfCtrl.1'); 
			if (oAcro4) 
				return true; 
			} catch(e) {} 
		try { 
			oAcro7=new ActiveXObject('AcroPDF.PDF.1'); 
			if (oAcro7) 
				return true; 
		} catch(e) {} 
	} 
	//zhangjie
	//Ext.MessageBox.alert('提示', "请安装PDF阅读器便于文书预览！");
	Ext.Msg.confirm('确认安装', '安装PDF阅读器便于文书预览，确认安装PDF阅读器？', 
			function(btn) {
		if (btn == 'yes') {
			window.location.href = jt.webContextRoot + 'download\\AdbeRdr11000_zh_CN.exe';
		}
	});
	//alert("请安装PDF阅读器！");
	//Ext.MessageBox.alert('提示', "请安装PDF阅读器！");
	//window.location.href = jt.webContextRoot + 'download\\AdbeRdr11000_zh_CN.exe';
} 

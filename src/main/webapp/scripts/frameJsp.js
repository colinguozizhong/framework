	var result;	
	var xiTongBianMaMenuId;
	function jiSuanWeiZhi(){//计算二级菜单出现的位置
		//alert(1)
		var c = $(window).height();
		var innerUl=$(this).find("ul");
		var b = $(innerUl).height();
		
		var aa = $(document).scrollTop();
		var ab = $(this).offset().top;
		var a = c - (ab -aa);
		if(a>=b){
		//	alert(1)
			$(innerUl).css("top","-45px");
		}else {
			if((a-b -10)>(a-c)){
				$(innerUl).css("top",(a-b -55)+"px");
			}else{
				//alert(3)
				$(innerUl).css("top",(a-c -45)+"px");
			}
		}
	}
	function Map(){
		this.container = new Object();
		}


		Map.prototype.put = function(key, value){
		this.container[key] = value;
		}


		Map.prototype.get = function(key){
		return this.container[key];
		}


		Map.prototype.keySet = function() {
		var keyset = new Array();
		var count = 0;
		for (var key in this.container) {
		// 跳过object的extend函数
		if (key == 'extend') {
		continue;
		}
		keyset[count] = key;
		count++;
		}
		return keyset;
		}


		Map.prototype.size = function() {
		var count = 0;
		for (var key in this.container) {
		// 跳过object的extend函数
		if (key == 'extend'){
		continue;
		}
		count++;
		}
		return count;
		}


		Map.prototype.remove = function(key) {
		delete this.container[key];
		}


		Map.prototype.toString = function(){
		var str = "";
		for (var i = 0, keys = this.keySet(), len = keys.length; i < len; i++) {
		str = str + keys[i] + "=" + this.container[keys[i]] + ";\n";
		}
		return str;
		} 
	var map = new Map();

		   function CreateDiv(tabid, url, name,type,opentab,closetab,callback,callback2)//tabid 用来关闭这个tab 传入的是menuid url 是打开tab的地址 name 是tab显示的标签名字 type 有refresh 和 notrefresh再次点击相同的连接时候 是否刷新里面的内容
			 {
				map.put(tabid,callback);
				if(document.getElementById("header").style.display=="block"){
					document.getElementById("div_pannel").style.height=document.documentElement.clientHeight-80+"px";
				}else{
					document.getElementById("div_pannel").style.height=document.documentElement.clientHeight+"px";
				}
				
			 ///如果当前tabid不存在则新建一个tab
				if (document.getElementById("div_" + tabid) == null)
				{
					var tablist = document.getElementById("div_tab").getElementsByTagName('li');
					if(tablist.length>8){
						xzzfAlert('提示','页面打开太多，请关闭后再打开!');
						return;
					}else{
						setacrent(tabid);
					}
					//创建iframe
					var box = document.createElement("iframe");
					box.id = "div_" + tabid;
					box.src = url;
					box.height = "100%";
					box.frameBorder = 0;
					box.width = "100%";
					
					document.getElementById("div_pannel").appendChild(box);
					
					
					var pannellist = document.getElementById("div_pannel").getElementsByTagName('iframe');
					
					if (tablist.length > 0)
					{
						for (i = 0; i < tablist.length; i++)
						{
							tablist[i].className = "";
							pannellist[i].style.display = "none";
						}
					}
			
					//创建li菜单
					var tab = document.createElement("li");
					tab.className = "crent";
					tab.id = tabid;
					var type1="notrefresh";
					var litxt = "<span><a href=\"javascript:;\" onclick=\"javascript:changeTable('" + tabid + "')\" title=" + name + " class=\"menua\">" + name + "</a><a onclick=\"RemoveDiv('" + tabid +"')\" class=\"win_close\" title=\"关闭当前窗口\"></a></span>";
					tab.innerHTML = litxt;
					document.getElementById("div_tab").appendChild(tab);
				}
				else
				{///如果当前tabid存在直接显示已经打开的tab
					if(type=="refresh"){
						RemoveDiv(tabid);
						var tablist = document.getElementById("div_tab").getElementsByTagName('li');
						if(tablist.length>8){
							xzzfAlert('提示','页面打开太多，请关闭后再打开!');
							return;
						}else{
							setacrent(tabid);
						}
						//创建iframe
						var box = document.createElement("iframe");
						box.id = "div_" + tabid;
						box.src = url;
						box.height = "100%";
						box.frameBorder = 0;
						box.width = "100%";
						document.getElementById("div_pannel").appendChild(box);
						var pannellist = document.getElementById("div_pannel").getElementsByTagName('iframe');
						
						if (tablist.length > 0)
						{
							for (i = 0; i < tablist.length; i++)
							{
								tablist[i].className = "";
								pannellist[i].style.display = "none";
							}
						}
				
						//创建li菜单
						var tab = document.createElement("li");
						tab.className = "crent";
						tab.id = tabid;
						var type1="notrefresh";
						var litxt = "<span><a href=\"javascript:;\" onclick=\"javascript:CreateDiv('" + tabid + "','" + url + "','" + name+ "','" + type1 + "')\" title=" + name + " class=\"menua\">" + name + "</a><a onclick=\"RemoveDiv('" + tabid + "')\" class=\"win_close\" title=\"关闭当前窗口\"></a></span>";
						tab.innerHTML = litxt;
						document.getElementById("div_tab").appendChild(tab);
						
					}else if(type=="notrefresh"){
						var tablist = document.getElementById("div_tab").getElementsByTagName('li');
						if(tablist.length>9){
							xzzfAlert('提示','页面打开太多，请关闭后再打开!');
							return;
						}else{
							setacrent(tabid);
						}
						var pannellist = document.getElementById("div_pannel").getElementsByTagName('iframe');
						//alert(tablist.length);
						for (i = 0; i < tablist.length; i++)
						{
							tablist[i].className = "";
							pannellist[i].style.display = "none"
						}
						document.getElementById(tabid).className = "crent";
						document.getElementById("div_" + tabid).style.display = "block";
					}
				
				}
			}
		   
		   function changeTable(tabid){//选项卡切换方法
				var tablist = document.getElementById("div_tab").getElementsByTagName('li');
				if(tablist.length>9){
					xzzfAlert('提示','页面打开太多，请关闭后再打开!');
					return;
				}else{
					setacrent(tabid);
				}
				var pannellist = document.getElementById("div_pannel").getElementsByTagName('iframe');
				//alert(tablist.length);
				for (i = 0; i < tablist.length; i++)
				{
					tablist[i].className = "";
					pannellist[i].style.display = "none"
				}
				document.getElementById(tabid).className = "crent";
				document.getElementById("div_" + tabid).style.display = "block";
		   }
		   
			function setacrent(obj){//设置当前高亮的tab是哪一个
				var alists=document.getElementById("main_tab").getElementsByTagName("a");
				for(var i=0;i<alists.length;i++)
				{
					if(alists[i].rel==obj)
						alists[i].className="crent";
					else
						alists[i].className="";
				}
				
			}
			function RemoveDiv(obj)
			 {//移除一个tab所调用的方法
				
				var callback = map.get(obj);
				map.remove(obj);
				var ob = document.getElementById(obj);
				ob.parentNode.removeChild(ob);
				var obdiv = document.getElementById("div_" + obj);
				obdiv.parentNode.removeChild(obdiv);
				var tablist = document.getElementById("div_tab").getElementsByTagName('li');
				var pannellist = document.getElementById("div_pannel").getElementsByTagName('iframe');
				if (tablist.length > 0)
				{
					if($("#div_tab li").hasClass('crent')){//判断高亮是否存在 如果存在 不作处理
					}else{//判断高亮是否存在 如果不存在  将最后一个设置为高亮
						tablist[tablist.length - 1].className = 'crent'
//						pannellist[tablist.length - 1].style.display = 'block'
						$(pannellist[tablist.length - 1]).show();
					}
				}	
				if(callback=="undefined"||callback=="undefined"||callback==null||callback==""){ 
				}else{
					callback();
					
				}
				
			}
			
		function shouYeInit (){//首页tab的初始化 包含 快捷菜单 、菜单、通知公告
			
			//快捷菜单
			var cacheAry2 = [];
			//菜单
			var cacheAry = [];
			var cacheAry6 = [];
			$.ajax({
				url : path + 'sysMenu/findSysMenuTreeAll.do',
				data : {
					"node" : "0"
				},
				success : function(data) {
						var nodeMap = {"0":{}};
						for(var i = 0; i < data.length; i++){
							var node = data[i];
							if(node.menuUrl){
								node.menuUrl = path + node.menuUrl;
							}
							nodeMap[node.menuId] = node;
							if(!nodeMap[node.parentId]){
								continue;
							}
							if(!nodeMap[node.parentId].children){
								
								nodeMap[node.parentId].children = [];
							}
							nodeMap[node.parentId].children.push(node);
						}
						var rootNode = nodeMap["0"];
						
						createMenuHtml(rootNode);
						
						document.getElementById("sidebar_innerUL").innerHTML=cacheAry.join("");//收起展开的上下箭头按钮

						var liArray = $("#sidebar_innerUL").children();
						
						for(var i=0;i<liArray.length;i++){
							if($(liArray[i]).html()!=''){
								$(liArray[i]).hover(jiSuanWeiZhi);
							}
							
						}
						nodeMap = null;
				}
			});
		
			function createMenuHtml(node){//创建主菜单的方法
				var count=(document.documentElement.clientHeight-205)/45;
				if(node.children){
					for(var i = 0; i < node.children.length; i++){//当主菜单少于等于13个的时候  分为两种  一种是正好13个菜单 一种是 小于13个菜单
						createNodeHtml(node.children[i]);
					}
				}
			}
			
			function createNodeHtml(n){//创建主菜单的方法的子方法
				if(n.isLeaf == "1"){
					if(n.menuName=="首页"){}else{
						var sign = '?';						
						if (n.menuUrl.indexOf('?') > -1) {
							sign = '&';
						}
						n.menuUrl=n.menuUrl + sign + 'menuId=' + n.menuId+'&timetamp='+new Date().getTime();
						
						if(n.menuName=="系统编码管理"){
							xiTongBianMaMenuId=n.menuId;
						}
						
						if(n.parentId=="0"){
							cacheAry.push('<li><a  href=\"#maoDingWei\"  onclick=\"CreateDiv(\''+n.menuId+'\',\''+n.menuUrl+'\',\''+n.menuName+'\',\'notrefresh\')\"><i class=\"'+n.busiCode+'\"></i><span>'+n.menuName+'</span></a></li>')
						}else{
							if(n.isPop=="Y"){
								cacheAry.push('<li><a  href=\"#maoDingWei\" class=\"cur\" onclick=\"window.open(\''+n.menuUrl+'\')\"><span>'+n.menuName+'</span></a><i tittle=\"加入常用菜单\" onclick=\"addToFavPanel(\''+n.menuId+'\',\''+n.menuName+'\',\''+n.menuUrl+'\')\" class=\"win_add\" title=\"加入常用菜单\"></i></li>')	
							}else{
								if(n.busiCode=="LLZSPXT"){
									n.menuUrl="http://60.173.215.14:8090/webindex.aspx?__VIEWSTATE=%2FwEPDwUKMTc0NzM0Njk2NGQYAQUeX19Db250cm9sc1JlcXVpcmVQb3N0QmFja0tleV9fFgIFDEltYWdlQnV0dG9uMgUMSW1hZ2VCdXR0b24xINgs5zxtGYorWBKsqApvdwi9JCk%3D&__EVENTVALIDATION=%2FwEWBgK4%2B%2BatBgLL94HfAgLogbjNDgLSwtXkAgKC%2Ffz%2FCQLSwpnTCDmZYBEglNBteovi4QOzeGt3vkI4&userID=wj&userPassword=lz002&lbKEYWORD=&ImageButton2.x=10&ImageButton2.y=10";
									cacheAry.push('<li><a  href=\"#maoDingWei\" class=\"cur\" onclick=\"window.open(\''+n.menuUrl+'\')\"><span>'+n.menuName+'</span></a><i tittle=\"加入常用菜单\" onclick=\"addToFavPanel(\''+n.menuId+'\',\''+n.menuName+'\',\''+n.menuUrl+'\')\" class=\"win_add\" title=\"加入常用菜单\"></i></li>')
								}else{
									cacheAry.push('<li><a  href=\"#maoDingWei\" class=\"cur\" onclick=\"CreateDiv(\''+n.menuId+'\',\''+n.menuUrl+'\',\''+n.menuName+'\',\'notrefresh\')\"><span>'+n.menuName+'</span></a><i tittle=\"加入常用菜单\" onclick=\"addToFavPanel(\''+n.menuId+'\',\''+n.menuName+'\',\''+n.menuUrl+'\')\" class=\"win_add\" title=\"加入常用菜单\"></i></li>')
								}
							}
							
						}
						
					}
					
				} else {
					cacheAry.push('<li><a  href=\"javascript:;\" class=\"cur1\"><i class=\"'+n.busiCode+'\"></i><span>'+n.menuName+'</span></a>');
					if(n.children){
						cacheAry.push('<ul style="top:-100px;">');
						for(var j = 0; j < n.children.length; j++){
							createNodeHtml(n.children[j]);
						}
						cacheAry.push('</ul>');
					}
					cacheAry.push('</li>');
				}
			}
			
			//首页jsp
			var tabid="0";
			var name="首页";
			var url=path+"pages/layoutNew/shouYe.jsp";
			 	setacrent(tabid);
				///如果当前tabid存在直接显示已经打开的tab

					//创建iframe
					var box = document.createElement("iframe");
					box.id = "div_" + tabid;
					box.src = url;
					box.height = "100%";
					box.frameBorder = 0;
					box.width = "100%";
					document.getElementById("div_pannel").appendChild(box);
					document.getElementById("div_pannel").style.height=document.documentElement.clientHeight-180+"px";
					//遍历并清除开始存在的tab当前效果并隐藏其显示的div
					var tablist = document.getElementById("div_tab").getElementsByTagName('li');
					var pannellist = document.getElementById("div_pannel").getElementsByTagName('iframe');
					if (tablist.length > 0)
					{
						for (i = 0; i < tablist.length; i++)
						{
							tablist[i].className = "";
							pannellist[i].style.display = "none";
						}
					}
			
					//创建li菜单
					var tab = document.createElement("li");
					tab.className = "crent";
					tab.id = tabid;
					var type1="notrefresh";
					var litxt = "<span><a href=\"javascript:;\" onclick=\"javascript:CreateDiv('" + tabid + "','" + url + "','" + name + "','" + type1+ "')\" title=" + name + " class=\"menua\">" + name + "</a></span>";
					tab.innerHTML = litxt;
					document.getElementById("div_tab").appendChild(tab);
					
					isAcrobatPluginInstall();
			}
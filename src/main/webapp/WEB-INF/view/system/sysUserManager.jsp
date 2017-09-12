<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>交通运输综合执法系统</title>
<%@include file="/common/common_easyui.jsp" %>
<script type="text/javascript">

$(function(){
	var datagrid = $("#dg").datagrid({  
	      url:"<%=basePath%>sysUser/findUserList.do",
	      pagination:true,//显示分页  
	      rownumbers:true,//显示行号
	      pageSize:20,//分页大小  
	      pageList:[20,40,60,80],//每页的个数  
	     // fit:true,//自动补全  
	      fitColumns:true, 
	      			loadFilter : function(data){
	      				 //过滤数据
	      				if(data.items==null || data.items==""){
	       					return {total:0,rows:[]}; 
	       				}else{
	      				 var value={
	      				 total:data.recordCount,
	      				 rows:[]
	      				 };
	      				 var x=0;
	      				 for (var i = 0; i < data.items.length; i++) {  
	      					 value.rows[x]=data.items[i];
	      					 x++;
	      				 }
	      				 return value;
	       				}
	      			},
	       toolbar: [{  
	          text: '新增',  
	          iconCls: 'icon-add',  
	          handler: function() {  
	       	   add();  
	          },
	      },"-",{
	   	   text: '修改',  
	          iconCls: 'icon-edit',  
	          handler: function() {  
	       	   update();  
	          },  
	      },"-",{
	   	   text: '删除',  
	          iconCls: 'icon-remove',  
	          handler: function() {  
	       	   del();  
	          }  
	      },"-",{
	   	   text: '重置密码',  
	          iconCls: 'icon-reload',  
	          handler: function() {  
	       	    reset();  
	          }  
	      },"-",{
	      	   text: '角色',  
	           iconCls: 'icon-add',  
	           handler: function() {  
	        	  role();  
	           }  
	       }
	      ],
	      columns:[[      //每个列具体内容  
	               { field:'ck',checkbox:true },
	               {field:'userId',title:'userId',width:100,hidden:true},
	               {field:'orgId',title:'orgId',width:100,hidden:true},
	               {field:'userName',title:'用户名',width:140},
	               {field:'name',title:'姓名',width:140},
	               {field:'sex',title:'性别',width:50,formatter:function(value,row,index){
	                   if(value=='M'){
	                       return "男";
	                   }else if(value=='F'){
	                       return "女";
	                   }
	                 }
	               },     
	               {field:'tel',title:'联系电话',width:140},
	               {field:'idNo',title:'身份证号',width:140},
	               {field:'orgName',title:'所属机构',width:140,formatter:callbackUrl},
	            ]],
	            singleSelect: false,
	 	         selectOnCheck: true,
	 	         checkOnSelect: true,
	 	         height:600,
	      
	});
	  
	  var p = $('#dg').datagrid('getPager');  
	  $(p).pagination({  
	      pageSize: 20,//每页显示的记录条数，默认为10  
	      pageList: [20,40,60,80],//可以设置每页记录条数的列表  
	      beforePageText: '第',//页数文本框前显示的汉字  
	      afterPageText: '页    共 {pages} 页',  
	      displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录',  
	     
	  }); 
	  
	  function callbackUrl(value,row,index){
		  return	'<a onclick="showOrg(\''+row.orgId+'\');" href="javascript:;">' + row.orgName + '</a>'
	  }
	  
	 //查询
	  $("#doSearch").click(function(){
			 var userName=$("input",$("#s_userName").next("span")).val();
			 var IdNo=$("input",$("#s_IdNo").next("span")).val();
			 var chaXunFangShi=$("#chaXunFangShi").combobox("getValue");
			 var name=$("input",$("#s_name").next("span")).val();
			 var tel=$("input",$("#s_tel").next("span")).val();
			 $('#dg').datagrid({  
				    url:'<%=basePath%>sysUser/findUserList.do',  
				    queryParams:{  
				    	userName:userName, 
				    	IdNo:IdNo,
				    	chaXunFangShi:chaXunFangShi,
				    	name:name,
				    	tel:tel
				    }  
				});  
		  }); 
	  
	  //重置
	  $("#reset").click(function(){
		  $("#searchForm").form('clear');
	  });
	  
	  
	//所属机构
		$('#orgIdName').combotree({
		    url: '<%=basePath%>deptorg/searchOrgTree.do?node=3401000000000000',
		    idFiled:"businessId",
		    textFiled:"orgName",
			parentField:"pid",
		    onClick: function(node){
		    	$("#businessId").val(node.businessId);
		    	$("#orgId").val(node.orgId);
		    	$("input",$("#orgIdName").next("span")).val(node.orgName);
		    },
		    required: true
		});
	
	
	
		//右移动
		$("#right").click(function(){
			var rows = $('#dg').datagrid('getSelections');
			var rowQianzhang = $('#dgQianzhang').datagrid('getSelections');
			var signIds="";
			for(var i=0;i<rowQianzhang.length;i++){
				signIds +=rowQianzhang[i].signId+",";
			}
			if(rowQianzhang.length>0){
				$.ajax({
					url: '<%=basePath%>sysUser/insertSelectSign.do?signIds=' +signIds+'&userId='+rows[0].userId,
				    success:function(){
				    	$('#dgQianzhang').datagrid('reload');
				    	$('#dgIsQianzhang').datagrid('reload')
				    }
				});
			}else{
				$.messager.alert("操作提示", "请选择！");
			}
			
		});
		
		
		
		//右移动
		$("#left").click(function(){
			var rows = $('#dg').datagrid('getSelections');
			var rowIsQianzhang = $('#dgIsQianzhang').datagrid('getSelections');
			var signIds="";
			for(var i=0;i<rowIsQianzhang.length;i++){
				signIds +=rowIsQianzhang[i].signId+",";
			}
			if(rowIsQianzhang.length>0){
				$.ajax({
					url: '<%=basePath%>sysUser/deleteSelectSign.do?signIds=' +signIds+'&userId='+rows[0].userId,
				    success:function(){
				    	$('#dgQianzhang').datagrid('reload');
				    	$('#dgIsQianzhang').datagrid('reload')
				    }
				});
			}else{
				$.messager.alert("操作提示", "请选择！");
			}
			
		});
		
		
		
		$("#dgRole").datagrid({  
		       url:"<%=basePath%>sysRole/findRoleList.do",
		       fitColumns:true, 
		       			loadFilter : function(data){
		       				 //过滤数据
		       				 var value={
		       				 total:data.recordCount,
		       				 rows:[]
		       				 };
		       				 var x=0;
		       				 for (var i = 0; i < data.items.length; i++) {  
		       					 value.rows[x]=data.items[i];
		       					 x++;
		       				 }
		       				 return value;
		       			},
		       columns:[[      //每个列具体内容  
		                { field:'ck',checkbox:true },
		                {field:'roleId',title:'roleId',width:100,hidden:true},
		                {field:'roleName',title:'角色名称',width:50},
		                {field:'roleType',title:'所属类别',width:50,formatter:function(value,row,index){
		                    if(value==0){
		                        return "系统管理";
		                    }else if(value==1){
		                        return "许可业务";
		                    }else if(value==2){
		                        return "处罚业务";
		                    }else if(value==3){
		                        return "领导审批";
		                    }else if(value==4){
		                        return "特殊角色";
		                    }
		                  }
		                },     
		                {field:'roleHy',title:'所属行业',width:50,formatter:function(value,row,index){
		                    if(value==00){
		                        return "交通主管部门";
		                    }else if(value==01){
		                        return "公路";
		                    }else if(value==02){
		                        return "运管";
		                    }else if(value==03){
		                        return "海事";
		                    }else if(value==04){
		                        return "质监";
		                    }else if(value==05){
		                        return "港航";
		                    }else if(value==06){
		                        return "通用";
		                    }
		                  }
		                		
		                },    
		                {field:'remark',title:'说明',width:50},    
		                {field:'isSysRole',title:'角色级别',width:50},
		                {field:'createrOrgName',title:'创建人单位',width:50},
		                {field:'ceraterUserName',title:'创建人',width:50}
		                 
		             ]],
		             singleSelect: false,
		  	         selectOnCheck: true,
		  	         checkOnSelect: true,
		  	         height:500,
		       
		});
		
		
	
});


function showOrg(orgId){
	$('#show_org').form('load', '<%=basePath%>sysUser/findUserByOrgId.do?orgId='+orgId);
	if($("input",$("#orgLv").next("span")).val()=="01"){
		$("input",$("#orgLv").next("span")).val("县/区行业局");
	}
	$("#dlg_showOrg").dialog("open");
}
//增加弹窗
function add(){
	$("#sysUserForm").form("clear");
	$("#dlg_edit").dialog("open");
}

//增加弹窗提交
function showSubmit(){
	//判断是新增还是更新
	var rows = $('#dg').datagrid('getSelections');
	if(rows.length==1){
		if($("#sysUserForm").form('validate')){
			$.ajax({
				type: 'POST',
				url: "<%=basePath%>sysUser/updateUser.do" ,
				data: $('#sysUserForm').serialize(),
				dataType: 'text',
				success: function(data){
					if(data == 0){
						$.messager.show({
							title:'提示',
							msg:'更新成功',
							timeout:3000,
							showType:'slide'
						});
						$('#dg').datagrid('reload')
						$('#dlg_edit').dialog('close')
					}else if(data==1){
						$.messager.alert('错误提示','用户名重复');
					}
				} ,
				error: function(){
					$.messager.alert('错误提示','失败');
				}
			});
		}else{
			$.messager.alert('错误提示','请完善红色必填项');
		}

	}else{
		if($("#sysUserForm").form('validate')){
			$.ajax({
				type: 'POST',
				url: "<%=basePath%>sysUser/addUser.do" ,
				data: $('#sysUserForm').serialize(),
				dataType: 'text',
				success: function(data){
					if(data==0){
						$.messager.show({
							title:'提示',
							msg:'新增成功',
							timeout:3000,
							showType:'slide'
						});
						$('#dg').datagrid('reload')
						$('#dlg_edit').dialog('close')
					}else if(data==1){
						$.messager.alert('错误提示','用户名重复');
					}
				} ,
				error: function(){
					$.messager.alert('错误提示','用户名重复');
				}
			});
			
		}else{
			$.messager.alert('错误提示','请完善红色必填项');
		}

		
	}
}

//更新
function update(){
	var rows = $('#dg').datagrid('getSelections');
	if(rows.length==1){
		$('#sysUserForm').form('load',{
			userId:rows[0].userId,
			orgId:rows[0].orgId,
			zhiFaZhengHao:rows[0].zhiFaZhengHao,
			userName:rows[0].userName,
			name:rows[0].name,
			sex:rows[0].sex,
			idNo:rows[0].idNo,
			tel:rows[0].tel,
			email:rows[0].email,
			orgIdName:rows[0].orgName,
			orgId:rows[0].orgId,
			zhiWu:rows[0].zhiWu
		});
		$('#dlg_edit').dialog('open');
	}else if(rows.length>1){
		$.messager.alert("操作提示", "只能选择一行！");
	}else{
		$.messager.alert("操作提示", "请选择！");
	}
}
//删除
function del(){
	var rows = $('#dg').datagrid('getSelections');
    var userId="";
    for(var i=0;i<rows.length;i++){
    	userId +=rows[i].userId + ",";
     //获取选中节点的值
    }
	if(rows.length>0){
		$.messager.confirm('提示框', '你确定要删除吗?',function(r){
			if(r){
				$.ajax({
					url: '<%=basePath%>sysUser/deleteUser.do?userId=' + userId,
							success:function(){
								$('#dg').datagrid('reload')
								$.messager.show({
									title:'提示',
									msg:'删除成功',
									timeout:3000,
									showType:'slide'
								});
							}
				});
			}
		})
	
		
		
	}else{
		$.messager.alert("操作提示", "请选择！");
	}
}
//重置密码
function reset(){
	var rows = $('#dg').datagrid('getSelections');
    var userId="";
    for(var i=0;i<rows.length;i++){
    	userId +=rows[i].userId + ",";
     //获取选中节点的值
    }
	if(rows.length>0){
		$.ajax({
			url: '<%=basePath%>sysUser/resetUser.do?userId='+userId,
					success:function(){
						$('#dg').datagrid('reload')
						$.messager.show({
							title:'提示',
							msg:'重置密码成功',
							timeout:3000,
							showType:'slide'
						});
					}
		});
		
		
	}else{
		$.messager.alert("操作提示", "请选择！");
	}
}

//签章授权
function qianzhang(){
	var rows = $('#dg').datagrid('getSelections');
	if(rows.length==1){
		$('#dgQianzhang').datagrid({  
		    url:'<%=basePath%>sysUser/findUnSelectSignList.do?userId='+rows[0].userId, 
		});
		
		$('#dgIsQianzhang').datagrid({  
		    url:'<%=basePath%>sysUser/findSelectSignList.do?userId='+rows[0].userId, 
		});
	 
	 $("#dlg_qianzhang").dialog("open");
		
	}else if(rows.length>1){
		$.messager.alert("操作提示", "只能选择一行！");
	}else{
		$.messager.alert("操作提示", "请选择！");
	}
	 
}


//角色
function role(){
		var rows = $('#dg').datagrid('getSelections');
		if(rows.length==1){
			   $("#dlg_role").dialog("open");
		}else if(rows.length>1){
			$.messager.alert("操作提示", "只能选择一行！");
		}else{
			$.messager.alert("操作提示", "请选择！");
		}
		
}


function showSubmitRole(){
	var rowsUser = $('#dg').datagrid('getSelections');
	var rows = $('#dgRole').datagrid('getSelections');
	if(rows.length>=1){
		var roleId = '';
        for (var i = 0; i < rows.length; i++) {
            if (roleId != '') 
            	roleId += ',';
            roleId += rows[i].roleId;
        }
        $.ajax({
				url: '<%=basePath%>sysUserRole/setUserRole.do?roleId=' +roleId+'&userId='+rowsUser[0].userId,
				success:function(){
					$('#dgRole').datagrid('reload')
					$.messager.show({
						title:'提示',
						msg:'角色设置成功',
						timeout:3000,
						showType:'slide'
					});
				}	 	
			});
	
	}else{
		$.messager.alert("操作提示", "请选择！");
	}
}
</script>
</head>

<body>
	
   <div id="sear">
	    <form action="" id="searchForm">
	  	    <input  id="jigou"  name="jigou" class="easyui-textbox" data-options="label:'执法机构:'" style="width:250px"/>
			<input  id="s_userName"  name="s_userName" class="easyui-textbox" data-options="label:'用户名:'" style="width:250px"/>
	 		<input  id="s_IdNo"  name="s_IdNo" class="easyui-textbox" data-options="label:'身份证号:'" style="width:250px"/><br />
			<select  class="easyui-combobox" id="chaXunFangShi" name="chaXunFangShi"  label="查询范围:" labelPosition="right" style="width:250px" >
										<option value="">--请选择--</option>
										<option value="01">本单位</option>
										<option value="02">下级单位</option>
			</select>
			<input  id="s_name"  name="s_name" class="easyui-textbox" data-options="label:'姓名:'" style="width:250px"/>
			<input  id="s_tel"  name="s_tel" class="easyui-textbox" data-options="label:'电话号码:'" style="width:250px"/>
			<a href="#" name="doSearch" id="doSearch" class="easyui-linkbutton" data-options="iconCls:'icon-search'" style="width:60px">查询</a>
			<a href="#" name="reset" id="reset" class="easyui-linkbutton" data-options="iconCls:'icon-reload'" style="width:60px">重置</a>
	 </form>
 </div>
	<table id="dg" style="display:block;"></table>  
	   		
   		
<div id="dlg_edit" class="easyui-dialog" closed="true" title="人员窗口" style="width: 400px; height: 360px; padding: 10px"data-options="buttons: '#dlg-buttons'">
	<form action="" id="sysUserForm" name="sysUserForm">
		     <input type="hidden" name="userId" id="userId" />
		     <input type="hidden" name="businessId" id="businessId" />
		     <input  type="hidden" name="orgId" id="orgId" />
		     <input  id="zhiFaZhengHao"  name="zhiFaZhengHao" class="easyui-textbox" data-options="label:'执法证号:'" style="width:250px"/><br /><br />
		     <input  id="userName"  name="userName" class="easyui-textbox" data-options="label:'用户名:',required:true" style="width:250px"/><br /><br />
			 <input  id="name" name="name" class="easyui-textbox" data-options="label:'姓名:',required:true" style="width:250px"/><br /><br />
			 <select  class="easyui-combobox" id="sex" name="sex" data-options="label:'性别:',required:true"  labelPosition="right" style="width:250px" >
					<option value=""></option>
					<option value="M">男</option>
					<option value="F">女</option>
			</select><br /><br />
			<input  id="idNo" name="idNo" class="easyui-textbox" data-options="label:'身份证号码:'" style="width:250px"/><br /><br />
			<input  id="tel" name="tel" class="easyui-textbox" data-options="label:'联系号码:'" style="width:250px"/><br /><br />
			<input  id="email" name="email" class="easyui-textbox" data-options="label:'邮箱:'" style="width:250px"/><br /><br />
			<select class="easyui-combotree"  id="orgIdName" name="orgIdName" label="所属机构:" labelPosition="right" style="width:250px" >
			</select><br /><br />
			<input  id="zhiWu"  name="zhiWu" class="easyui-textbox" data-options="label:'职务:'" style="width:250px"/><br />
	</form>
</div>
<div id="dlg-buttons">
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="showSubmit()">提交</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="javascript:$('#dlg_edit').dialog('close')">关闭</a>
</div>
<div id="dlg_qianzhang" class="easyui-dialog" closed="true" title="签章授权" style="width: 890px; height: 380px; padding: 0;margin:0;"data-options="buttons: '#dlgQianzhang-buttons'">
	
        <div>	
		  <a href="#" name="right" id="right" class="easyui-linkbutton c1"  style="width:60px">右移</a>
		  <a href="#" name="left" id="left" class="easyui-linkbutton c1" style="width:60px;float:right">左移</a>
        </div>
		<div id="pan"  style="width: 350px; height: 260px; padding: 0;margin:0;float:left">
			<table id="dgQianzhang"></table>
		</div>
		<div id="pan2"  style="width: 500px;height: 260px; padding: 0;margin:0;float:left">
			<table id="dgIsQianzhang"></table>
		</div>
 </div>

<div id="dlgQianzhang-buttons">
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="javascript:$('#dlg_qianzhang').dialog('close')">关闭</a>
</div>

<div id="dlg_showOrg" class="easyui-dialog" closed="true" title="组织机构" style="width: 400px; height: 450px; padding: 0;margin:0;"data-options="buttons: '#dlgShowOrg-buttons'">
 	<form action="" id="show_org" style="background-color:#ECF6FA">
		<input   name="orgName" class="easyui-textbox" data-options="label:'组织机构名称:'" style="width:250px" readonly="readonly"/><br />
		<input   name="orgLv" class="easyui-textbox" data-options="label:'单位级别:'" style="width:250px" readonly="readonly"/><br />
		<input   name="regName" class="easyui-textbox" data-options="label:'行政区域:'" style="width:250px" readonly="readonly"/><br />
		<input   name="orgCode" class="easyui-textbox" data-options="label:'机构代码:'" style="width:250px" readonly="readonly"/><br />
		<input   name="orgSimpleName" class="easyui-textbox" data-options="label:'发文机关带字:'" style="width:250px" readonly="readonly"/><br />
		<input   name="tradeType" class="easyui-textbox" data-options="label:'行业类别:'" style="width:250px" readonly="readonly"/><br />
		<input   name="duLiZhiFa" class="easyui-textbox" data-options="label:'是否独立执法:'" style="width:250px" readonly="readonly"/><br />
		<input   name="orgBusiness" class="easyui-textbox" data-options="label:'上级业务机构:'" style="width:250px" readonly="readonly"/><br />
		<input   name="government" class="easyui-textbox" data-options="label:'对应人民政府:'" style="width:250px" readonly="readonly"/><br />
		<input   name="manager" class="easyui-textbox" data-options="label:'负责人:'" style="width:250px" readonly="readonly"/><br />
		<input   name="contactPerson" class="easyui-textbox" data-options="label:'联系人:'" style="width:250px" readonly="readonly"/><br />
		<input   name="contactTel" class="easyui-textbox" data-options="label:'联系电话:'" style="width:250px" readonly="readonly"/><br />
		<input   name="email" class="easyui-textbox" data-options="label:'电子邮箱:'" style="width:250px" readonly="readonly"/><br />
		<input  name="status" class="easyui-textbox" data-options="label:'单位状态：'" style="width:250px" readonly="readonly"/><br />
		<input   name="website" class="easyui-textbox" data-options="label:'网址:'" style="width:250px" readonly="readonly"/><br />
		<input   name="address" class="easyui-textbox" data-options="label:'地址:'" style="width:250px" readonly="readonly"/><br />
		<input   name="func" class="easyui-textbox" data-options="label:'机构职能:'" style="width:250px" readonly="readonly"/><br />
		<input   name="youBian" class="easyui-textbox" data-options="label:'邮编:'" style="width:250px" readonly="readonly"/><br />
		<input   name="jianCeZhanHao" class="easyui-textbox" data-options="label:'监测站号:'" style="width:250px" readonly="readonly"/><br />
		<input   name="remark" class="easyui-textbox" data-options="label:'机构说明:'" style="width:250px" readonly="readonly"/><br />
    </form>
</div>

<div id="dlgShowOrg-buttons">
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="javascript:$('#dlg_showOrg').dialog('close')">关闭</a>
</div>
<div id="dlg_role" class="easyui-dialog" closed="true" title="用户角色设置窗口" style="width:1000px; height: 360px; padding: 10px"data-options="buttons: '#dlg-buttonsRole'">
	<div class="easyui-accordion"  style="height:30px;">
				<form id="ser">
					<input type="text" name="role_Name" id="role_Name" class="easyui-textbox" data-options="label:'角色名称：'" style="width:230px"/>
					<select class="easyui-combobox" id="roleType" name="roleType" label="所属类别：" labelPosition="right" style="width:250px;">
								<option></option>
								<option value="0">系统管理</option>
								<option value="1">许可业务</option>
								<option value="2">处罚业务</option>
								<option value="3">领导审批</option>
								<option value="4">特殊角色</option>
					</select>
						
						<select class="easyui-combobox" id="roleHy" name="roleHy" label="所属行业:" labelPosition="right" style="width:250px;">
								<option></option>
								<option value="00">交通主管部门</option>
								<option value="01">公路</option>
								<option value="02">运管</option>
								<option value="03">海事</option> 
								<option value="04">质监</option> 
								<option value="05">港航</option> 
								<option value="06">通用</option> 
						</select>
						<a href="#" name="search" id="search" class="easyui-linkbutton" data-options="iconCls:'icon-search'" style="width:80px">查询</a>
						<a href="#" name="reset" id="reset" class="easyui-linkbutton" data-options="iconCls:'icon-reload'" style="width:60px">重置</a>
				</form>
		
	</div>
	<div  >
    	<table id="dgRole" style="display:block;"></table>  
   </div>
	
	
</div>
<div id="dlg-buttonsRole">
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="showSubmitRole()">提交</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="javascript:$('#dlg_role').dialog('close')">关闭</a>
</div>
</body>
</html>

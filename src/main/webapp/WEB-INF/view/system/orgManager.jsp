<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	<html xmlns="http://www.w3.org/1999/xhtml">
		<head>
	<title>
		交通运输综合执法系统
	</title>
	<%@include file="/common/common_easyui.jsp" %>
	<style type="">
		.xwtable {width: 300px;border-collapse: collapse;border: 1px solid #95b8e7;}                
		.xwtable thead td {font-size: 12px;color: #333333;;border: 1px solid #95b8e7; font-weight:bold;}
		.xwtable tbody tr {background: #fff;font-size: 12px;color: #000000;}           
		.xwtable tbody tr.alt-row {background: #f2f7fc;}               
		.xwtable td{line-height:20px;text-align: left;padding:4px 10px 3px 10px;height: 18px;border: 1px solid #95b8e7;}
	</style>
	<script type="text/javascript">
	//加载业务树
	$(function(){
		
		//加载业务树
		$('#zTreeMenuBusiness').tree({
			url: '<%=basePath%>deptorg/searchOrgTree.do?node=3401000000000000',
			parentField:"pid",
			textFiled:"orgName",
			idFiled:"businessId",
			onClick: function(node){
				$('#dgBusiness').datagrid({  
				    url:'<%=basePath%>deptorg/initOrgList.do',  
				    queryParams:{  
				    	businessId:node.businessId,  
				    }  
				});  
				
		    }
		});
		//加载业务datagird
			 var datagrid = $("#dgBusiness").datagrid({  
			       url:"<%=basePath%>deptorg/initOrgList.do",
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
			        	   addBusiness();  
			           },
			       },"-",{
			    	   text: '修改',  
			           iconCls: 'icon-edit',  
			           handler: function() {  
			        	   updateBusiness();  
			           },  
			       },"-",{
			    	   text: '删除',  
			           iconCls: 'icon-remove',  
			           handler: function() {  
			        	   delBusiness();  
			           }  
			       }
			       ],
			       columns:[[      //每个列具体内容  
			                { field:'ck',checkbox:true },
			                {field:'orgId',title:'orgId',width:100,hidden:true},
			                {field:'businessId',title:'businessId',width:100,hidden:true},
			                {field:'orgName',title:'机构名称',width:140},
			                {field:'contactPerson',title:'联系人',width:50},    
			                {field:'contactTel',title:'联系电话',width:50},    
			                {field:'email',title:'电子邮箱',width:50}
			             ]],
			             singleSelect: false,
			  	         selectOnCheck: true,
			  	         checkOnSelect: true,
			  	         height:520,
			       
			});
			   
			   var p = $('#dgBusiness').datagrid('getPager');  
			   $(p).pagination({  
			       pageSize: 20,//每页显示的记录条数，默认为10  
			       pageList: [20,40,60,80],//可以设置每页记录条数的列表  
			       beforePageText: '第',//页数文本框前显示的汉字  
			       afterPageText: '页    共 {pages} 页',  
			       displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录',  
			      
			   });  
			   
			   
			  
			   var data = [{ "value": "0", "text": "否" }, { "value": "1", "text": "是" }];
			   
				//上级业务机构
				$('#orgBusiness').combotree({
				    url: '<%=basePath%>deptorg/searchOrgTree.do?node=3401000000000000',
				    idFiled:"businessId",
				    textFiled:"orgName",
					parentField:"pid",
				    onClick: function(node){
				    	$("#businessId").val(node.businessId);
				    	$("input",$("#orgBusiness").next("span")).val(node.orgName);
				    },
				    required: true
				});
				
				//查询
				$("#doSearch").click(function(){
					var orgName=$("input",$("#org_Name").next("span")).val();
					$('#dgBusiness').datagrid({  
					    url:'<%=basePath%>deptorg/initOrgList.do',  
					    queryParams:{  
					    	orgName:orgName,  
					    }  
					});  
				});
	});
	
	
	//增加
	function addBusiness(){
		$('#dlg_edit').form('clear');
	    $('#orgBusiness').combobox('enable'); 
	    $('#orgManage').combobox('enable'); 
	    //去除datagrid选中，去除新增和编辑带来的混乱
	    $('#dgBusiness').datagrid('clearSelections'); 
		$('#dlg_edit').dialog('open');
	}
	//更新
	function updateBusiness(){
		var rows = $('#dgBusiness').datagrid('getSelections');
		if(rows.length==1){
			$('#orgForm').form('load','<%=basePath%>deptorg/searchOrg.do?businessId='+rows[0].businessId); 
			
            $('#orgBusiness').combobox('disable'); 
            $('#orgManage').combobox('disable'); 
			$('#dlg_edit').dialog('open');
		}else if(rows.length>1){
			$.messager.alert("操作提示", "只能选择一行！");
		}else{
			$.messager.alert("操作提示", "请选择！");
		}
		
	}
	
	//删除
	function delBusiness(){
		var rows = $('#dgBusiness').datagrid('getSelections');
	    var businessId="";
        for(var i=0;i<rows.length;i++){
        	businessId +=rows[i].businessId + ",";
         //获取选中节点的值
        }
		if(rows.length>0){
			$.messager.confirm('提示框', '你确定要删除吗?',function(r){
				if(r){
					$.ajax({
						url: '<%=basePath%>deptorg/deleteOrg.do?businessId=' + businessId,
								success:function(){
									$('#dgBusiness').datagrid('reload')
									$("#zTreeMenuBusiness").tree("reload");
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
	
//提交编辑
	function showSubmit(){
		//判断是新增还是更新
		var rows = $('#dgBusiness').datagrid('getSelections');
		if(rows.length==1){
			$("#orgId").val(rows[0].orgId);
			if($("#orgForm").form('validate')){
				$.ajax({
					type: 'POST',
					url: "<%=basePath%>deptorg/updateOrg.do" ,
					data: $("#orgForm").serialize(),
					dataType: 'text',
					success: function(data){
						if(data == 0){
							$('#dlg_edit').dialog('close');
							$.messager.show({
								title:'提示',
								msg:'更新成功',
								timeout:3000,
								showType:'slide'
							});
							$('#dgBusiness').datagrid('reload');
							$("#zTreeMenuBusiness").tree("reload");
							//上级管理机构和业务机构重载，避免编辑后显示还是初始化机构树
							$('#orgManage').combotree("reload");
							$('#orgBusiness').combotree("reload");
						}else if(data==1){
							$.messager.alert('错误提示','机构名称重复');
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
			if($("#orgForm").form('validate')){
				$.ajax({
					type: 'POST',
					url: "<%=basePath%>deptorg/insertOrg.do" ,
					data: $("#orgForm").serialize(),
					dataType: 'text',
					success: function(data){
						if(data == 0){
							$('#dlg_edit').dialog('close');
							$.messager.show({
								title:'提示',
								msg:'新增成功',
								timeout:3000,
								showType:'slide'
							});
							$('#dgBusiness').datagrid('reload');
							$("#zTreeMenuBusiness").tree("reload");
							//上级管理机构和业务机构重载，避免编辑后显示还是初始化机构树
							$('#orgManage').combotree("reload");
							$('#orgBusiness').combotree("reload");
						}else if(data==1){
							$.messager.alert('错误提示','机构名称重复');
						}
					} ,
					error: function(){
						$.messager.alert('错误提示','失败');
					}
				});
			}else{
				$.messager.alert('错误提示','请完善红色必填项');
			} 
			
			
		}
	}
	</script>
</head>
	<body>
	   <div class="easyui-layout" style="width:100%;height:600px;">
   		<div data-options="region:'west'" title="组织列表" style="width:200px">
   			<div >
				<ul id="zTreeMenuBusiness" class="easyui-tree">
				</ul>
			</div>
   		</div>
   		<div data-options="region:'center',title:'组织管理',iconCls:'icon-ok'" >
   			<div class="zu_zhi_guan_li">
			    <div id="sear">
			    	<input name="org_Name" id="org_Name" class="easyui-textbox" data-options="label:'组织机构名称:'"style="height:22px;width:360px;"/>
			    	<a href="#" name="doSearch" id="doSearch" class="easyui-linkbutton" data-options="iconCls:'icon-search'" style="width:60px">查询</a>
			    </div><br />
				<table id="dgBusiness" style="display:block;">  
     			</table>
			</div>
   		</div>
   </div>
	<div id="dlg_edit" class="easyui-dialog" closed="true" title="组织机构" style="width: 780px; height: 360px; padding: 10px"data-options="buttons: '#dlg-buttons'">
	 	<form action="" id="orgForm" name="orgForm">
	 	 	<div style="float: left">
	 	 			<div id="pan" class="easyui-panel" style="width: 350px; height: auto">
				   	    <div style="padding-bottom: 5px">
				   	    	<input  name="orgId" id="orgId"   type="hidden"/>
					    </div>
					    <div style="padding-bottom: 5px"> 
					   	  <input  name="businessId" id="businessId"   type="hidden"/>
					    </div>
					    <div style="padding-bottom: 5px"> 
					   	  <input  name="managerId" id="managerId"   type="hidden"/>
					    </div>
					    <div style="padding-bottom: 5px">
					    	<input  name="regCode" id="regCode"   type="hidden"/>
						</div>
						<div style="padding-bottom: 5px">
							<input  id="orgName"  name="orgName" class="easyui-textbox" data-options="label:'组织机构名称:',required:true" style="width:300px"/>
						</div>
						<div style="padding-bottom: 5px">
							<select  class="easyui-combobox" id="orgLv" name="orgLv"  label="单位级别:" labelPosition="right" style="width:300px" >
										<option value="01">省厅</option>
										<option value="02">省行业剧</option>
										<option value="03">市局</option>
										<option value="04">市行业局</option>
										<option value="05">县/区局</option>
										<option value="06">县/区行业局</option>
										<option value="07">基层站所/分局/高速路政大队</option>
							</select>
						</div>
						<div style="padding-bottom: 5px">
							<input  name="orgCode" id="orgCode" class="easyui-textbox" data-options="label:'机构代码:'" style="width:300px"/><br />
						</div>
						<div style="padding-bottom: 5px">
							<input id="government" name="government" class="easyui-textbox" data-options="label:'对应人民政府:'" style="width:300px"/>
						</div>
						<div style="padding-bottom: 5px">
							<input  name="manager" id="manager" class="easyui-textbox" data-options="label:'负责人:'" style="width:300px"/>
						</div>
						<div style="padding-bottom: 5px">
							<input  name="contactPerson" id="contactPerson" class="easyui-textbox" data-options="label:'联系人:'" style="width:300px"/>
						</div>
						<div style="padding-bottom: 5px">
							<input  name="contactTel" id="contactTel" class="easyui-textbox" data-options="label:'联系电话:'" style="width:300px"/>
						</div>
						<div style="padding-bottom: 5px">
							<input  name="email" id="email" class="easyui-textbox" data-options="label:'电子邮箱:'" style="width:300px"/>
						</div>
						<div style="padding-bottom: 5px">
						  <input  name="website" id="website" class="easyui-textbox" data-options="label:'网址:'" style="width:300px"/>
						</div>
						<div style="padding-bottom: 5px">
							<input  name="address" id="address" class="easyui-textbox" data-options="label:'地址:'" style="width:300px"/>
						</div>
						<div style="padding-bottom: 5px">
							<input  name="youBian" id="youBian" class="easyui-textbox" data-options="label:'邮编:'" style="width:300px"/>
						</div>
						<div style="padding-bottom: 5px">
							<input  name="function" id="function" class="easyui-textbox" data-options="label:'机构职能:'" style="width:300px"/>
						</div>
						<div style="padding-bottom: 5px">
							<input  name="remark" id="remark" class="easyui-textbox" data-options="label:' 机构说明:'" style="width:300px"/>
						</div>
			    </div>
	 	 	</div>
		    <div style="float: left">
		    	<div id="pan2" class="easyui-panel" style="width: 350px; height: auto ;padding:10px">
				    <div style="padding-bottom: 5px">
			    		<select class="easyui-combobox"  id="bh" name="bh" label="单位主体类别:" labelPosition="right" style="width:300px" >
							<option value="0">各级交通运输主管部门</option>
							<option value="1">各级道路运输管理机构/出租汽车管理办公室</option>
							<option value="2">各级公路管理机构</option>
							<option value="3">各级海事管理机构</option>
							<option value="4">各级港航管理机构</option>
							<option value="5">各级交通质监机构</option>
						</select>
					</div>
					 <div style="padding-bottom: 5px">
						<table id="dgZQ" style="display:block;">  
    				 	</table>
					</div>
					<div style="padding-bottom: 5px">
					    <select class="easyui-combotree"  id="orgBusiness" name="orgBusiness" label="上级业务机构:" labelPosition="right" style="width:300px" >
						</select>
					</div>
		    	</div>
		    </div>
	   </form> 
    </div>
    
    <div id="dlg-buttons">
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="showSubmit()">提交</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="javascript:$('#dlg_edit').dialog('close')">关闭</a>
	</div>
</body>
	
</html>
var regexEnum = 
{
	num4:"^([+]?)\\d*\\.?\\d+$",			//非负数字
	intege:"^-?[1-9]\\d*$",					//整数
	intege1:"^[1-9]\\d*$",					//正整数
	intege2:"^-[1-9]\\d*$",					//负整数
	num:"^([+-]?)\\d*\\.?\\d+$",			//数字
	num1:"^[1-9]\\d*$",					    //正数（正整数）
	num2:"^-[1-9]\\d*$",					//负数（负整数）
	num3:"^\\d+$",							//全数字CODE
	num10:"^(0|[1-9]\\d*)$", 				// 非负整数 
	money:"^(0|[1-9]\\d{0,10})(\\.\\d{1,2})?$", //金额数值
	decmal:"^([+-]?)\\d*\\.\\d+$",			//浮点数
	decmal1:"^[1-9]\\d*.\\d*$|^0.\\d*[1-9]\\d*$",    	//正浮点数
	decmal2:"^-([1-9]\\d*.\\d*|0.\\d*[1-9]\\d*)$",   //负浮点数
	decmal3:"^-?([1-9]\\d*.\\d*|0.\\d*[1-9]\\d*|0?.0+|0)$",   //浮点数
	decmal4:"^[1-9]\\d*.\\d*$|^0.\\d*[1-9]\\d*$|^0?.0+$|^0$",     //非负浮点数（正浮点数 + 0）
	decmal5:"^(-([1-9]\\d*.\\d*|0.\\d*[1-9]\\d*))$|^0?.0+$|^0$",    //非正浮点数（负浮点数 + 0）
	email:"^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$", //邮件
	color:"^[a-fA-F0-9]{6}$",				//颜色
	url:"^http[s]?:\\/\\/([\\w-]+\\.)+[\\w-]+([\\w-./?%&=]*)?$",	//url
	chinese:"^[\\u4E00-\\u9FA5\\uF900-\\uFA2D]+$",					//仅中文
	ascii:"^[\\x00-\\xFF]+$",				//仅ACSII字符
	zipcode:"^\\d{6}$",						//邮编
	mobile:"^13[0-9]{9}$|^15[012356789][0-9]{8}$|^18[0123456789][0-9]{8}$|^147[0-9]{8}$|^17[012356789][0-9]{8}$",				//手机
	ip4:"^(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)$",	//ip地址
	notempty:"^\\S+$",						//非空
	picture:"(.*)\\.(jpg|bmp|gif|ico|pcx|jpeg|tif|png|raw|tga)$",	//图片
	rar:"(.*)\\.(rar|zip|7zip|tgz)$",								//压缩文件
	date:"^\\d{4}(\\-|\\/|\.)\\d{1,2}\\1\\d{1,2}$",					//日期
	qq:"^[1-9]*[1-9][0-9]*$",				//QQ号码
	tel:"^(([0\\+]\\d{2,3}-)?(0\\d{2,3})-)?(\\d{7,8})(-(\\d{3,}))?$",	//电话号码的函数(包括验证国内区号,国际区号,分机号)
	//验证手机号和电话号码 1、可以是1开头的11位数字（手机号）  2、可以是“区号-电话号-分机号”或者是“(区号)电话号-分机号”格式  3、区号是0开头的3～4位数字，可以没有区号 4、电话号是5～8位数字，不能以0开头 5、分机号是1～8位数字，可以没有分机号
	//如：13812341234或010-12345678或(0432)1234567-1234
	contact:"^1\\d{10}$|^(0\\d{2,3}-?|\\(0\\d{2,3}\\))?[1-9]\\d{4,7}(-\\d{1,8})?$",
	username:"^\\w+$",						//用来用户注册。匹配由数字、26个英文字母或者下划线组成的字符串
	username1:"^[a-zA-Z0-9]*$",						//用来用户注册。匹配英数字组成的字符串
	username3:"^[a-zA-Z-—0-9]*$",						//企业用户注册。匹配英-数字组成的字符串
	username2:"^[a-zA-Z][a-zA-Z0-9_]*$",						//用来用户注册。匹配英文、数字或者下划线，必须是英文字母开头组成的字符串
	letter:"^[A-Za-z]+$",					//字母
	letter_u:"^[A-Z]+$",					//大写字母
	letter_l:"^[a-z]+$",					//小写字母
	idcard:"^[1-9]([0-9]{14}|[0-9]{17})$",	//身份证
	numCn:"^[零|一|二|三|四|五|六|七|八|九|十|百|千|万]+$", // 中文数字
	numCn1:"^[零|壹|贰|叁|肆|伍|陆|柒|捌|玖|拾|佰|仟|万]+$",
	sql:"^[\\u4E00-\\u9FA5\\uF900-\\uFA2D\\w\\s]+$", //SQL合法值(中文，英文，数字，下划线，空格)
	decisionCode : "^[a-zA-Z0-9〔〕]{1,30}$", // 许可证书编号(字母、数字和括号，30个字符)
	numziFu:"^[0-9,;/-]{1,30}$", // 数字下划线,;，
	decisionName : "^(?!_)(?!.*?_$)[a-zA-Z0-9_\u4e00-\u9fa5]{1,100}$", // 证书名称(字母，数字和汉字，100个字符，不能以下划线开头和结尾)
	hour :  "^\\d$|^[0-1]\\d$|^2[0-3]$", // 时0-23
	oneHundredBelow :  "^[0-9]{1,2}$", // 两位正整数0-99
	oneThousandBelow :  "^[0-9]{1,3}$", // 三位正整数0-999
	one2Thirty:"^\[1-9]$|^[0-1]\\d$|^2[0-9]|^3[0]$", //1~30
//  moneyCf:"^(0|[1-9]\\d{0,5})(\\.\\d{1,2})?$" //处罚金额数值	
	moneyCf:"^([1-9]\\d{0,5})(\\.\\d{1,2})?$", //处罚金额数值
	chineseOrNumOrEn:"^[\a-\z\A-\Z0-9\u4E00-\u9FA5（）()]+$",//(中英文数字组合)
	chineseOrNum:"^[\\u4E00-\\u9FA5\\uF900-\\uFA2D\\d]+$", //(中文和数字的组合)
	cnNum : "^[零一二三四五六七八九十百千万亿]+$" , //大写数字
	youXiang : "^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+$"  //邮箱
};
function getRegex(){
	var regx = [];
	for(var i = 0; i < arguments.length; i++){
		regx.push("(" + regexEnum[arguments[i]] + ")");
	}
	return new RegExp(regx.join("|"));
}
function checkRegex(r, val){
	return getRegex(r).test(val);
}
var aCity={11:"北京",12:"天津",13:"河北",14:"山西",15:"内蒙古",21:"辽宁",22:"吉林",23:"黑龙江",31:"上海",32:"江苏",33:"浙江",34:"安徽",35:"福建",36:"江西",37:"山东",41:"河南",42:"湖北",43:"湖南",44:"广东",45:"广西",46:"海南",50:"重庆",51:"四川",52:"贵州",53:"云南",54:"西藏",61:"陕西",62:"甘肃",63:"青海",64:"宁夏",65:"新疆",71:"台湾",81:"香港",82:"澳门",91:"国外"}; 

function is18CardID(sId){ 
	var iSum=0 ;
	var info="" ;
	if(!/^\d{17}(\d|x)$/i.test(sId)) return "请输入18位合法身份证号码,如：110102190001010213";//44090119770919****"; 
	sId=sId.replace(/x$/i,"a"); 
	if(aCity[parseInt(sId.substr(0,2))]==null) return "请输入18位合法身份证号码,如：110102190001010213";//44090119770919****"; 
	sBirthday=sId.substr(6,4)+"-"+Number(sId.substr(10,2))+"-"+Number(sId.substr(12,2)); 
	var d=new Date(sBirthday.replace(/-/g,"/")) ;
	if(sBirthday!=(d.getFullYear()+"-"+ (d.getMonth()+1) + "-" + d.getDate()))return "请输入18位合法身份证号码,如：110102190001010213";//44090119770919****"; 
	for(var i = 17;i>=0;i --) iSum += (Math.pow(2,i) % 11) * parseInt(sId.charAt(17 - i),11) ;
	if(iSum%11!=1) return "请输入18位合法身份证号码,如：110102190001010213";//44090119770919****"; 
	return true;//aCity[parseInt(sId.substr(0,2))]+","+sBirthday+","+(sId.substr(16,1)%2?"男":"女") 
} 
function is15CardID(sId){
	var info="" ;
	if(!/^\d{15}$/i.test(sId)) return "请输入15位合法身份证号码,如：110102800101021";
	if(aCity[parseInt(sId.substr(0,2))]==null) return "请输入15位合法身份证号码,如：110102800101021";
	sBirthday="19"+sId.substr(6,2)+"-"+Number(sId.substr(8,2))+"-"+Number(sId.substr(10,2)); 
	var d=new Date(sBirthday.replace(/-/g,"/")) ;
	if(sBirthday!=(d.getFullYear()+"-"+ (d.getMonth()+1) + "-" + d.getDate()))return "请输入15位合法身份证号码,如：110102800101021";
	return true;
} 

function isCardID(sId){
	if(sId.length==18){
		return is18CardID(sId)
	}else if(sId.length==15){
		return is15CardID(sId)
	} else 
		return "请输入15位或18位合法身份证号码！";
}

function isCardIDXK(sId){
	if(sId.length==18){
		return is18CardID(sId)
	}else if(sId.length==15){
		return is15CardID(sId)
	} else if(sId.length==12){
		return true;
	}else if(sId.length==10){
		return true;
	}else{
		return "请输入10位、12位、15位或18位合法身份证件号码！";
	}
			
}

//短时间，形如 (13:04:06)
function isTime(str)
{
	var a = str.match(/^(\d{1,2})(:)?(\d{1,2})\2(\d{1,2})$/);
	if (a == null) {return false;}
	if (a[1]>=24 || a[3]>=60 || a[4]>=60)
	{
		return false;
	}
	return true;
}

//短日期，形如 (2003-12-05)
function isDate(str)
{
	var r = str.match(/^(\d{1,4})(-|\/)(\d{1,2})\2(\d{1,2})$/); 
	if(r==null)return false; 
	var d= new Date(r[1], r[3]-1, r[4]); 
	return (d.getFullYear()==r[1]&&(d.getMonth()+1)==r[3]&&d.getDate()==r[4]);
}

//长时间，形如 (2003-12-05 13:04:06)
function isDateTime(str)
{
	var reg = /^(\d{1,4})(-|\/)(\d{1,2})\2(\d{1,2}) (\d{1,2}):(\d{1,2}):(\d{1,2})$/; 
	var r = str.match(reg); 
	if(r==null) return false; 
	var d= new Date(r[1], r[3]-1,r[4],r[5],r[6],r[7]); 
	return (d.getFullYear()==r[1]&&(d.getMonth()+1)==r[3]&&d.getDate()==r[4]&&d.getHours()==r[5]&&d.getMinutes()==r[6]&&d.getSeconds()==r[7]);
}

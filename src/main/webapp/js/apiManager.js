//设置添加缓存
function set(key, value) {
	var curTime = new Date().getTime();
	localStorage.setItem(key, JSON.stringify({
		data: value,
		time: curTime
	}));
}
//设置获得缓存
function get(key, exp) {
	var data = localStorage.getItem(key);
	if(data) {
		
		var dataObj = JSON.parse(data);
		console.log(dataObj)
		if(new Date().getTime() - dataObj.time > exp) {
			localStorage.removeItem(key);
		} else {
			var dataObjDatatoJson = dataObj.data;
			return dataObjDatatoJson;
		}
	}

}
//是否登录
function isLogin() {
	var userinfo = get('userinfo', 1000 * 60 * 60 * 4);
	if(userinfo != null) {
		return true;
	} else {
		return false;
	}
}
//退出登录
function exit() {
	localStorage.removeItem('userinfo');
	location.href = "/page/login/login.html?parentUrl=" + escape(document.URL);
}
/*判空*/
function getUndefinddata (e) {
	if (e !=undefined) {
		return e;
	}else{
		return "";
	}
}
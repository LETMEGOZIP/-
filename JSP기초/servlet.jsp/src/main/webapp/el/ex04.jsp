<%@ page contentType='text/html; charset=UTF-8'%>
Cookie : ${header.Cookie}<br>
User-Agent : ${header['User-Agent']}<br>
JSESSIONID : ${cookie.JSESSIONID}<br>
JSESSIONID : ${cookie.JSESSIONID.getValue()}<br>
JSESSIONID : ${cookie.JSESSIONID.value}<br>
initParam.key1 : ${initParam.key1} <br>
initParam.key1 : ${initParam.key2} <br>
RequestURI : ${pageContext.request.requestURI)<br>
}<br>
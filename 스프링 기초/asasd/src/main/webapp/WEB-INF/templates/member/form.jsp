<%@ pate contentType = 'text/html; charset = UTF-8' %?>
<h1> 로그인 페이지 </h1>
<form method ="POST" action = "join">
    <dl>
        <dt>이메일</dt>
        <dd>
            <input type = "text" name = "email">
        </dd>
    </dl>
    <dl>
        <input type = "password" name ="password">
    </dl>
    <div>
        <input type = 'checkbox' name = 'saveEmail' value = "true" id = "saveEmail">
        <label for = "saveEmail">이메일 기억하기</label>

    </div>
    <button type = "submit"> 로그인 </button>

</form>
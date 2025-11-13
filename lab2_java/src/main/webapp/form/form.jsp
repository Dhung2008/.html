<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/Lab2_java/form/ud" method="post">
<div> Fullname</div>
<input name="fullname" value="${user.fullname}" > <br>
<div> Gender: </div>
<input type="radio" name="gender" value="true" ${user.gender == 'true' ? 'checked': ''}> Male <br>
<input type="radio" name="gender" value="false"${user.gender == 'false'? 'checked': ''}> Female <br>
<div> country: </div>
<select name="country">
<option value="VN" ${user.country == 'VN'? 'selected': ''}>Việt Nam</option>
<option value="US" ${user.country == 'US' ? 'selected': ''}>Mỹ</option>
<option value="CN" ${user.country == 'CN'? 'selected': ''}>Trung Quốc</option>
</select>
<HR/>
<p>Gender: ${user.gender}</p>
<button formaction="/Lab2_java3_fall2024/form/create">Create</button>
<button>UPDATE</button>
${capnhat}
</form>
</body>
</html>
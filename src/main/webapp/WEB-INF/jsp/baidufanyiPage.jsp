<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>将图片文字翻译成英文</title>
</head>

<body>
	<form action="baidufanyi" method="post" enctype="multipart/form-data">
	<input type="file" name="file" accept="image/*" />
	 <br> 
	<input type="submit" value="上传">
	</form>

</body>
</html>
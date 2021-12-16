<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>识别图片中文字</title>
</head>
<body>
 <form action="PictureCharacterRecognition" method="post" enctype="multipart/form-data">
        选择图片:<input type="file" name="file" accept="image/*" /> <br>
        <input type="submit" value="立刻上传">
    </form>

</body>
</html>
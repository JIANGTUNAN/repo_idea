
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.5.1.min.js"></script>
    <script type="text/javascript">
        $(function (){
            $("#uploadFile").click(function () {
                var photoFile = $("#photo")[0].files[0];

                if (photoFile == undefined) {
                    alert("您还未选择文件");
                    return;
                }

                var formData = new FormData();
                formData.append("headPhoto", photoFile);

                $.ajax({
                    type: "post",
                    data: formData,
                    url:"fileUpload",
                    processData:false,
                    contentType:false,
                    success: function (result) {
                        alert(result.message);
                        $("#headImg").attr("src", "upload/" + result.newFileName);
                        $("#photoInput").val(result.newFileName);
                        $("#filetypeInput").val(result.fileType);
                    }

                })
            });
        })

    </script>
</head>
<body>
    <form action="addPlayer" method="post">
        <p>账号：<input type="text" name="name"></p>
        <p>密码：<input type="password" name="password"></p>
        <p>昵称：<input type="text" name="nickname"></p>
        <p>头像：
            <br/>
            <input id="photo" type="file">
            <br/>
            <img id="headImg" style="width: 60px;min-height: 60px;"
                    alt="您还未上传图片">
            <br/>
            <a id="uploadFile" href="javascript:void(0)">立即上传</a>
            <input type="hidden" id="photoInput" name="photo">
            <input type="hidden" id="filetypeInput" name="filetype">

        </p>
        <p><input type="submit" value="注册"></p>
    </form>
</body>
</html>

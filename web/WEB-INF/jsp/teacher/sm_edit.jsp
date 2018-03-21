<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/20
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--_meta 作为公共模版分离出去-->
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="Bookmark" href="/static/favicon.ico" >
    <link rel="Shortcut Icon" href="/static/favicon.ico" />
    <!--[if lt IE 9]>
    <script type="text/javascript" src="/static/lib/html5shiv.js"></script>
    <script type="text/javascript" src="/static/lib/respond.min.js"></script>
    <![endif]-->
    <link rel="stylesheet" type="text/css" href="/static/static/h-ui/css/H-ui.min.css" />
    <link rel="stylesheet" type="text/css" href="/static/static/h-ui.admin/css/H-ui.admin.css" />
    <link rel="stylesheet" type="text/css" href="/static/lib/Hui-iconfont/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="/static/static/h-ui.admin/skin/default/skin.css" id="skin" />
    <link rel="stylesheet" type="text/css" href="/static/static/h-ui.admin/css/style.css" />
    <!--[if IE 6]>
    <script type="text/javascript" src="/static/lib/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <!--/meta 作为公共模版分离出去-->

    <title>新增文章 - 资讯管理 - H-ui.admin v3.1</title>
    <meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
    <meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
<article class="page-container">
    <form class="form form-horizontal" id="form-article-add">
        <div class="row cl" hidden>
            <label class="form-label col-xs-4 col-sm-2">ID：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${question2.smd_questions.state}" placeholder="" id="state" name="state">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">ID：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${question2.smd_questions.id}" placeholder="" id="id" name="id" readonly>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">类别：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <c:if test="${question2.smd_questions.questionType==0}">
                    <input type="text" class="input-text"
                           value="单选题：${question2.courses.courseName}/${question2.teacher_category.teacherCategoryName}"
                           placeholder="" id="s" name="s" readonly>
                </c:if>
                <c:if test="${question2.smd_questions.questionType==1}">
                    <input type="text" class="input-text"
                           value="多选题：${question2.courses.courseName}/${question2.teacher_category.teacherCategoryName}"
                           placeholder="" id="s" name="s" readonly>
                </c:if>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">题干：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <textarea name="question" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" datatype="*10-100" dragonfly="true" nullmsg="备注不能为空！" onKeyUp="$.Huitextarealength(this,200)">${question2.smd_questions.question}</textarea>
                <p class="textarea-numberbar"><em class="textarea-length">0</em>/200</p>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">选项A:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${question2.smd_questions.optionA}" placeholder="" id="optionA" name="optionA">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">选项B:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${question2.smd_questions.optionB}" placeholder="" id="optionB" name="optionB">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">选项C:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${question2.smd_questions.optionC}" placeholder="" id="optionC" name="optionC">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">选项D:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${question2.smd_questions.optionD}" placeholder="" id="optionD" name="optionD">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">选项E:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${question2.smd_questions.optionE}" placeholder="" id="optionE" name="optionE">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">选项F:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${question2.smd_questions.optionF}" placeholder="" id="optionF" name="optionF">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">选项G:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${question2.smd_questions.optionG}" placeholder="" id="optionG" name="optionG">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">答案:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${question2.smd_questions.answer}" placeholder="" id="answer" name="answer">
            </div>
        </div>


        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">描述:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <textarea name="descrpt" id="descrpt" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" datatype="*10-100" dragonfly="true" nullmsg="备注不能为空！" >${question2.smd_questions.descrpt}</textarea>
                <p class="textarea-numberbar"><em class="textarea-length">0</em>/200</p>
            </div>
        </div>


        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
                <button onClick="article_save_submit();" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 保存并提交审核</button>
                <button onClick="layer_close();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
            </div>
        </div>
    </form>
</article>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="/static/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="/static/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="/static/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="/static/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer /作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="/static/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="/static/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" src="/static/lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="/static/lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript" src="/static/lib/webuploader/0.1.5/webuploader.min.js"></script>
<script type="text/javascript" src="/static/lib/ueditor/1.4.3/ueditor.config.js"></script>
<script type="text/javascript" src="/static/lib/ueditor/1.4.3/ueditor.all.min.js"> </script>
<script type="text/javascript" src="/static/lib/ueditor/1.4.3/lang/zh-cn/zh-cn.js"></script>
<script type="text/javascript">
    $(function(){
        $('.skin-minimal input').iCheck({
            checkboxClass: 'icheckbox-blue',
            radioClass: 'iradio-blue',
            increaseArea: '20%'
        });

        //表单验证
        $("#form-article-add").validate({
            rules:{
                question:{
                    required:true,
                },
                answer:{
                    required:true,
                }
            },
            onkeyup:false,
            focusCleanup:true,
            success:"valid",
            submitHandler:function(form){
                var index = parent.layer.getFrameIndex(window.name);
                alert($("#form-article-add").serialize());
                layer.confirm("确认要保存并提交审核吗",function (index) {
                    $.ajax({
                        type: "POST",   //提交的方法
                        url: "/question/updateSubmitSMD", //提交的地址
                        dataType: "json",
                        data: $("#form-article-add").serialize(),// 序列化表单值
                        error: function (request) {  //失败的话
                            alert("Connection error");
                        },
                        success: function (data) {  //成功
                            if(data.isGo){
                                parent.location.reload();
                                layer.close(index);
                            }else {
                                layer.msg('操作是失败!', {icon: 5, time: 1000});
                            }
                        }
                    });

                });
            }
        });
    });
</script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>

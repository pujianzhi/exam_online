<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"/>
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="Bookmark" href="/static/favicon.ico">
    <link rel="Shortcut Icon" href="/static/favicon.ico"/>
    <!--[if lt IE 9]>
    <script type="text/javascript" src="/static/lib/html5shiv.js"></script>
    <script type="text/javascript" src="/static/lib/respond.min.js"></script>
    <![endif]-->
    <link rel="stylesheet" type="text/css" href="/static/static/h-ui/css/H-ui.min.css"/>
    <link rel="stylesheet" type="text/css" href="/static/static/h-ui.admin/css/H-ui.admin.css"/>
    <link rel="stylesheet" type="text/css" href="/static/lib/Hui-iconfont/1.0.8/iconfont.css"/>
    <link rel="stylesheet" type="text/css" href="/static/static/h-ui.admin/skin/default/skin.css" id="skin"/>
    <link rel="stylesheet" type="text/css" href="/static/static/h-ui.admin/css/style.css"/>
    <!--[if IE 6]>
    <script type="text/javascript" src="/static/lib/DD_belatedPNG_0.0.8a-min.js"></script>
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
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red"></span>所属科目：</label>
            <div class="formControls col-xs-4 col-sm-4"> <span class="select-box">
				<select name="subjects_select" class="select" id="subjects_select">
                    <c:forEach items="${coursesList}" var="course">
                        <option value="${course.id}">${course.courseName}</option>
                    </c:forEach>
				</select>
				</span>
            </div>
            <div class="formControls col-xs-4 col-sm-4" id="module">
                <span class="select-box">
				<select name="teacherCategoryId" class="select" id="module_select">

				</select>
				</span>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>题目类型：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <span class="select-box">
				<select name="questionType" class="select" id="question_select">
					<option value="0">单择题</option>
					<option value="1">多选题</option>
					<option value="2">判断题</option>
                    <option value="3">简答题</option>
                    <option value="4">编程题</option>
				</select>
				</span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">题干：</label>
            <div class="formControls col-xs-8 col-sm-9">
                    <textarea name="question" id="question" cols="" rows="" class="textarea"
                              placeholder="说点什么...最少输入10个字符"
                              datatype="*10-100" dragonfly="true" nullmsg="备注不能为空！"></textarea>
                <p class="textarea-numberbar"><em class="textarea-length">0</em>/200</p>
            </div>
        </div>
        <div id="switch">

        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">描述：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <textarea name="descrpt" id="descrpt" cols="" rows="" class="textarea" placeholder="说点什么...最少输入10个字符"
                          datatype="*10-100" dragonfly="true" nullmsg="备注不能为空！"></textarea>
                <p class="textarea-numberbar"><em class="textarea-length">0</em>/200</p>
            </div>
        </div>
        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
                <button class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 保存并提交审核
                </button>
                <button class="btn btn-secondary radius" onclick="question_save()" type="button"><i class="Hui-iconfont">&#xe632;</i> 保存草稿
                </button>
                <button onClick="removeIframe();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
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
<script type="text/javascript" src="/static/lib/ueditor/1.4.3/ueditor.all.min.js"></script>
<script type="text/javascript" src="/static/lib/ueditor/1.4.3/lang/zh-cn/zh-cn.js"></script>
<script type="text/javascript">
    
    
    function question_save() {
        var questiontype = $("#question_select");
        layer.confirm("确认要保存到草稿吗",function (index) {
            if (questiontype.val() == 0 || questiontype.val() == 1 || questiontype.val() == 2) {
                $.ajax({
                    type: "POST",   //提交的方法
                    url: "/question/saveSMD", //提交的地址
                    dataType: "json",
                    data: $("#form-article-add").serialize(),// 序列化表单值
                    error: function (request) {  //失败的话
                        alert("Connection error");
                    },
                    success: function (data) {  //成功
                        if(data.isGo){
                            location.reload();
                            removeIframe();

                        }else {
                            layer.msg('操作是失败!', {icon: 5, time: 1000});
                        }
                    }
                });
            } else if (questiontype.val() == 3 || questiontype.val() == 4) {
                $.ajax({
                    type: "POST",   //提交的方法
                    url: "/question/saveFSP", //提交的地址
                    data: $("#form-article-add").serialize(),// 序列化表单值
                    async: false,
                    error: function (request) {  //失败的话
                        alert("Connection error");
                    },
                    success: function (data) {  //成功
                        if(data.isGo){
                            removeIframe();
                        }else {
                            layer.msg('操作是失败!', {icon: 5, time: 1000});
                        }
                    }
                });
            }
        });
    }
    
    
    $(function () {
        $('.skin-minimal input').iCheck({
            checkboxClass: 'icheckbox-blue',
            radioClass: 'iradio-blue',
            increaseArea: '20%'
        });

        //表单验证
        $("#form-article-add").validate({
            rules: {
                answer: {
                    required: true,
                },
                descrpt: {
                    required: true,
                },
                teacherCategoryId: {
                    required: true,
                },
                questiontype: {
                    required: true,
                },
                question: {
                    required: true,
                },
            },
            onkeyup: false,
            focusCleanup: true,
            success: "valid",
            submitHandler: function (form) {
                var index = parent.layer.getFrameIndex(window.name);
                var questiontype = $("#question_select");
                // alert($("#form-article-add").serialize());
                // alert(questiontype.val());
                layer.confirm("确认要保存并提交审核吗",function (index) {
                    if (questiontype.val() == 0 || questiontype.val() == 1 || questiontype.val() == 2) {
                        $.ajax({
                            type: "POST",   //提交的方法
                            url: "/question/saveSubmitSMD", //提交的地址
                            dataType: "json",
                            data: $("#form-article-add").serialize(),// 序列化表单值
                            error: function (request) {  //失败的话
                                alert("Connection error");
                            },
                            success: function (data) {  //成功
                                if(data.isGo){
                                    location.reload();
                                    removeIframe();

                                }else {
                                    layer.msg('操作是失败!', {icon: 5, time: 1000});
                                }
                            }
                        });
                    } else if (questiontype.val() == 3 || questiontype.val() == 4) {
                        $.ajax({
                            type: "POST",   //提交的方法
                            url: "/question/saveSubmitFSP", //提交的地址
                            data: $("#form-article-add").serialize(),// 序列化表单值
                            async: false,
                            error: function (request) {  //失败的话
                                alert("Connection error");
                            },
                            success: function (data) {  //成功
                                if(data.isGo){
                                    removeIframe();
                                }else {
                                    layer.msg('操作是失败!', {icon: 5, time: 1000});
                                }
                            }
                        });
                    }
                });

                parent.layer.close(index);
            }
        });
        //初始化题目
        var question = $("#question_select option:selected");
        if (question.val() == 0 || question.val() == 1) {
            $("#switch").append("            <div class=\"row cl\">\n" +
                "                <label class=\"form-label col-xs-4 col-sm-2\">选项A:</label>\n" +
                "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"optionA\" name=\"optionA\">\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"row cl\">\n" +
                "                <label class=\"form-label col-xs-4 col-sm-2\">选项B:</label>\n" +
                "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"optionB\" name=\"optionB\">\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"row cl\">\n" +
                "                <label class=\"form-label col-xs-4 col-sm-2\">选项C:</label>\n" +
                "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"optionC\" name=\"optionC\">\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"row cl\">\n" +
                "                <label class=\"form-label col-xs-4 col-sm-2\">选项D:</label>\n" +
                "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"optionD\" name=\"optionD\">\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"row cl\">\n" +
                "                <label class=\"form-label col-xs-4 col-sm-2\">选项E:</label>\n" +
                "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"optionE\" name=\"optionE\">\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"row cl\">\n" +
                "                <label class=\"form-label col-xs-4 col-sm-2\">选项F:</label>\n" +
                "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"optionF\" name=\"optionF\">\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"row cl\">\n" +
                "                <label class=\"form-label col-xs-4 col-sm-2\">选项G:</label>\n" +
                "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"optionG\" name=\"optionG\">\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"row cl\">\n" +
                "                <label class=\"form-label col-xs-4 col-sm-2\">正确答案：</label>\n" +
                "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                "                    <input type=\"text\" class=\"input-text\" value=\"0\" placeholder=\"\" id=\"answer\" name=\"answer\">\n" +
                "                </div>\n" +
                "            </div>");
        } else if (question.val() == 2) {
            $("#switch").append("            <div class=\"row cl\">\n" +
                "                <label class=\"form-label col-xs-4 col-sm-2\">正确答案：</label>\n" +
                "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                "                    <label><input name=\"answer\" type=\"radio\" value=\"1\" />对 </label>\n" +
                "                    <label><input name=\"answer\" type=\"radio\" value=\"0\" />错 </label>\n" +
                "                </div>\n" +
                "            </div>");
        } else if (question.val() == 3 || question.val() == 4) {
            $("#switch").append("  <div class=\"row cl\">\n" +
                "                <label class=\"form-label col-xs-4 col-sm-2\">问题1:</label>\n" +
                "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"option1\" name=\"option1\">\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"row cl\">\n" +
                "                <label class=\"form-label col-xs-4 col-sm-2\">问题1答案：</label>\n" +
                "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                "                    <textarea name=\"option1Answer\" cols=\"\" rows=\"\" class=\"textarea\" placeholder=\"请输入答案\"\n" +
                "                              datatype=\"*10-100\" dragonfly=\"true\" nullmsg=\"备注不能为空！\"\n" +
                "                              onKeyUp=\"$.Huitextarealength(this,200)\"></textarea>\n" +
                "                    <p class=\"textarea-numberbar\"><em class=\"textarea-length\">0</em>/200</p>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"row cl\">\n" +
                "                <label class=\"form-label col-xs-4 col-sm-2\">问题2:</label>\n" +
                "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"option2\" name=\"option2\">\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"row cl\">\n" +
                "                <label class=\"form-label col-xs-4 col-sm-2\">问题2答案：</label>\n" +
                "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                "                    <textarea name=\"option2Answer\" id=\"option2Answer\" cols=\"\" rows=\"\" class=\"textarea\" placeholder=\"请输入答案\"\n" +
                "                              datatype=\"*10-100\" dragonfly=\"true\" nullmsg=\"备注不能为空！\"\n" +
                "                              onKeyUp=\"$.Huitextarealength(this,200)\"></textarea>\n" +
                "                    <p class=\"textarea-numberbar\"><em class=\"textarea-length\">0</em>/200</p>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"row cl\">\n" +
                "                <label class=\"form-label col-xs-4 col-sm-2\">问题3:</label>\n" +
                "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"option3\" name=\"option3\">\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"row cl\">\n" +
                "                <label class=\"form-label col-xs-4 col-sm-2\">问题3答案：</label>\n" +
                "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                "                    <textarea name=\"option3Answer\" id=\"option3Answer\" cols=\"\" rows=\"\" class=\"textarea\" placeholder=\"请输入答案\"\n" +
                "                              datatype=\"*10-100\" dragonfly=\"true\" nullmsg=\"备注不能为空！\"\n" +
                "                              onKeyUp=\"$.Huitextarealength(this,200)\"></textarea>\n" +
                "                    <p class=\"textarea-numberbar\"><em class=\"textarea-length\">0</em>/200</p>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"row cl\">\n" +
                "                <label class=\"form-label col-xs-4 col-sm-2\">问题4:</label>\n" +
                "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"option4\" name=\"option4\">\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"row cl\">\n" +
                "                <label class=\"form-label col-xs-4 col-sm-2\">问题4答案：</label>\n" +
                "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                "                    <textarea name=\"option4Answer\" id=\"option4Answer\" cols=\"\" rows=\"\" class=\"textarea\" placeholder=\"请输入答案\"\n" +
                "                              datatype=\"*10-100\" dragonfly=\"true\" nullmsg=\"备注不能为空！\"\n" +
                "                              onKeyUp=\"$.Huitextarealength(this,200)\"></textarea>\n" +
                "                    <p class=\"textarea-numberbar\"><em class=\"textarea-length\">0</em>/200</p>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"row cl\">\n" +
                "                <label class=\"form-label col-xs-4 col-sm-2\">问题5:</label>\n" +
                "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"option5\" name=\"option5\">\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"row cl\">\n" +
                "                <label class=\"form-label col-xs-4 col-sm-2\">问题5答案：</label>\n" +
                "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                "                    <textarea name=\"option5Answer\" id=\"option5Answer\" cols=\"\" rows=\"\" class=\"textarea\" placeholder=\"请输入答案\"\n" +
                "                              datatype=\"*10-100\" dragonfly=\"true\" nullmsg=\"备注不能为空！\"\n" +
                "                              onKeyUp=\"$.Huitextarealength(this,200)\"></textarea>\n" +
                "                    <p class=\"textarea-numberbar\"><em class=\"textarea-length\">0</em>/200</p>\n" +
                "                </div>\n" +
                "            </div>");
        }

        $("#question_select").change(function () {
            var question = $("#question_select option:selected");

            $("#switch div").remove();
            if (question.val() == 0 || question.val() == 1) {
                $("#switch").append("            <div class=\"row cl\">\n" +
                    "                <label class=\"form-label col-xs-4 col-sm-2\">选项A:</label>\n" +
                    "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                    "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"optionA\" name=\"optionA\">\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "            <div class=\"row cl\">\n" +
                    "                <label class=\"form-label col-xs-4 col-sm-2\">选项B:</label>\n" +
                    "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                    "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"optionB\" name=\"optionB\">\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "            <div class=\"row cl\">\n" +
                    "                <label class=\"form-label col-xs-4 col-sm-2\">选项C:</label>\n" +
                    "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                    "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"optionC\" name=\"optionC\">\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "            <div class=\"row cl\">\n" +
                    "                <label class=\"form-label col-xs-4 col-sm-2\">选项D:</label>\n" +
                    "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                    "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"optionD\" name=\"optionD\">\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "            <div class=\"row cl\">\n" +
                    "                <label class=\"form-label col-xs-4 col-sm-2\">选项E:</label>\n" +
                    "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                    "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"optionE\" name=\"optionE\">\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "            <div class=\"row cl\">\n" +
                    "                <label class=\"form-label col-xs-4 col-sm-2\">选项F:</label>\n" +
                    "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                    "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"optionF\" name=\"optionF\">\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "            <div class=\"row cl\">\n" +
                    "                <label class=\"form-label col-xs-4 col-sm-2\">选项G:</label>\n" +
                    "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                    "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"optionG\" name=\"optionG\">\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "            <div class=\"row cl\">\n" +
                    "                <label class=\"form-label col-xs-4 col-sm-2\">正确答案：</label>\n" +
                    "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                    "                    <input type=\"text\" class=\"input-text\" value=\"0\" placeholder=\"\" id=\"answer\" name=\"answer\">\n" +
                    "                </div>\n" +
                    "            </div>");
            } else if (question.val() == 2) {
                $("#switch").append("            <div class=\"row cl\">\n" +
                    "                <label class=\"form-label col-xs-4 col-sm-2\">正确答案：</label>\n" +
                    "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                    "                    <label><input name=\"answer\" type=\"radio\" value=\"1\" />对 </label>\n" +
                    "                    <label><input name=\"answer\" type=\"radio\" value=\"0\" />错 </label>\n" +
                    "                </div>\n" +
                    "            </div>");
            } else if (question.val() == 3 || question.val() == 4) {
                $("#switch").append("  <div class=\"row cl\">\n" +
                    "                <label class=\"form-label col-xs-4 col-sm-2\">问题1:</label>\n" +
                    "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                    "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"option1\" name=\"option1\">\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "            <div class=\"row cl\">\n" +
                    "                <label class=\"form-label col-xs-4 col-sm-2\">问题1答案：</label>\n" +
                    "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                    "                    <textarea name=\"option1Answer\" cols=\"\" rows=\"\" class=\"textarea\" placeholder=\"请输入答案\"\n" +
                    "                              datatype=\"*10-100\" dragonfly=\"true\" nullmsg=\"备注不能为空！\"\n" +
                    "                              onKeyUp=\"$.Huitextarealength(this,200)\"></textarea>\n" +
                    "                    <p class=\"textarea-numberbar\"><em class=\"textarea-length\">0</em>/200</p>\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "            <div class=\"row cl\">\n" +
                    "                <label class=\"form-label col-xs-4 col-sm-2\">问题2:</label>\n" +
                    "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                    "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"option2\" name=\"option2\">\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "            <div class=\"row cl\">\n" +
                    "                <label class=\"form-label col-xs-4 col-sm-2\">问题2答案：</label>\n" +
                    "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                    "                    <textarea name=\"option2Answer\" id=\"option2Answer\" cols=\"\" rows=\"\" class=\"textarea\" placeholder=\"请输入答案\"\n" +
                    "                              datatype=\"*10-100\" dragonfly=\"true\" nullmsg=\"备注不能为空！\"\n" +
                    "                              onKeyUp=\"$.Huitextarealength(this,200)\"></textarea>\n" +
                    "                    <p class=\"textarea-numberbar\"><em class=\"textarea-length\">0</em>/200</p>\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "            <div class=\"row cl\">\n" +
                    "                <label class=\"form-label col-xs-4 col-sm-2\">问题3:</label>\n" +
                    "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                    "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"option3\" name=\"option3\">\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "            <div class=\"row cl\">\n" +
                    "                <label class=\"form-label col-xs-4 col-sm-2\">问题3答案：</label>\n" +
                    "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                    "                    <textarea name=\"option3Answer\" id=\"option3Answer\" cols=\"\" rows=\"\" class=\"textarea\" placeholder=\"请输入答案\"\n" +
                    "                              datatype=\"*10-100\" dragonfly=\"true\" nullmsg=\"备注不能为空！\"\n" +
                    "                              onKeyUp=\"$.Huitextarealength(this,200)\"></textarea>\n" +
                    "                    <p class=\"textarea-numberbar\"><em class=\"textarea-length\">0</em>/200</p>\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "            <div class=\"row cl\">\n" +
                    "                <label class=\"form-label col-xs-4 col-sm-2\">问题4:</label>\n" +
                    "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                    "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"option4\" name=\"option4\">\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "            <div class=\"row cl\">\n" +
                    "                <label class=\"form-label col-xs-4 col-sm-2\">问题4答案：</label>\n" +
                    "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                    "                    <textarea name=\"option4Answer\" id=\"option4Answer\" cols=\"\" rows=\"\" class=\"textarea\" placeholder=\"请输入答案\"\n" +
                    "                              datatype=\"*10-100\" dragonfly=\"true\" nullmsg=\"备注不能为空！\"\n" +
                    "                              onKeyUp=\"$.Huitextarealength(this,200)\"></textarea>\n" +
                    "                    <p class=\"textarea-numberbar\"><em class=\"textarea-length\">0</em>/200</p>\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "            <div class=\"row cl\">\n" +
                    "                <label class=\"form-label col-xs-4 col-sm-2\">问题5:</label>\n" +
                    "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                    "                    <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"option5\" name=\"option5\">\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "            <div class=\"row cl\">\n" +
                    "                <label class=\"form-label col-xs-4 col-sm-2\">问题5答案：</label>\n" +
                    "                <div class=\"formControls col-xs-8 col-sm-9\">\n" +
                    "                    <textarea name=\"option5Answer\" id=\"option5Answer\" cols=\"\" rows=\"\" class=\"textarea\" placeholder=\"请输入答案\"\n" +
                    "                              datatype=\"*10-100\" dragonfly=\"true\" nullmsg=\"备注不能为空！\"\n" +
                    "                              onKeyUp=\"$.Huitextarealength(this,200)\"></textarea>\n" +
                    "                    <p class=\"textarea-numberbar\"><em class=\"textarea-length\">0</em>/200</p>\n" +
                    "                </div>\n" +
                    "            </div>");
            }
        });


        var subjects = $("#subjects_select option:selected");
        $.ajax({
            type: "POST",
            url: "/question/selectChange",
            data: {id: subjects.val()},
            success: function (data) {
                if (data.data != null) {
                    $("#module_select option").remove();
                    $.each(data.data, function (index, element) {
                        $("#module_select").append("<option value=\"" + element.id + "\">" + element.teacherCategoryName + "</option>");
                    });
                }
            }
        });

        $("#subjects_select").change(function () {
            var subjects = $("#subjects_select option:selected");
            alert(subjects.val());
            $.ajax({
                type: "POST",
                url: "/question/selectChange",
                data: {id: subjects.val()},
                success: function (data) {
                    if (data.data != null) {
                        $("#module_select option").remove();
                        $.each(data.data, function (index, element) {
                            // console.info(element);
                            $("#module_select").append("<option value=\"" + element.id + "\">" + element.teacherCategoryName + "</option>");
                        });
                    }
                }
            });
        });

    });
</script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>

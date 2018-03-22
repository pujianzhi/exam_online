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
    <!--[if lt IE 9]>
    <script type="text/javascript" src="/static/lib/html5shiv.js"></script>
    <script type="text/javascript" src="lib/respond.min.js"></script>
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
    <title>题库管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 题库管理 <span
        class="c-gray en">&gt;</span> 题目列表 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px"
                                              href="javascript:location.replace(location.href);" title="刷新"><i
        class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div class="text-c">
        <span class="select-box inline">
        <select name="questionType" class="select" id="question_select1">
            <option value="all">全部分类</option>
            <option value="0">单择题</option>
            <option value="1">多选题</option>
            <option value="2">判断题</option>
            <option value="3">简答题</option>
            <option value="4">编程题</option>
        </select>
        </span>
        <span class="select-box inline">
		<select name="subjects_select" id="question_select2" class="select">
			<option value="all">全部分类</option>
            <c:forEach items="${coursesList}" var="course">
                <option value="${course.id}">${course.courseName}</option>
            </c:forEach>
		</select>
		</span>
        <span class="select-box inline">
		<select name="module_select" id="question_select3" class="select">
            <option value="all">全部分类</option>
		</select>
		</span>日期范围：
        <input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'logmax\')||\'%y-%M-%d\'}' })" id="logmin"
               class="input-text Wdate" style="width:120px;">
        -
        <input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'logmin\')}',maxDate:'%y-%M-%d' })" id="logmax"
               class="input-text Wdate" style="width:120px;">
        <button class="btn btn-success" onClick="search()"><i class="Hui-iconfont">&#xe665;</i> 搜试题</button>
    </div>
    <div class="cl pd-5 bg-1 bk-gray mt-20"><span class="l"><a href="javascript:;" onclick="datasdel()"
                                                               class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> <a
            class="btn btn-primary radius" data-title="添加试题" data-href="/question/showAdd" onclick="Hui_admin_tab(this)"
            href="javascript:;"><i class="Hui-iconfont">&#xe600;</i> 添加试题</a></span> <span
            class="r">共有数据：<strong>54</strong> 条</span></div>
    <div class="mt-20">
        <table class="table table-border table-bordered table-bg table-hover table-sort table-responsive">
            <thead>
            <tr class="text-c">
                <th width="25"><input type="checkbox" name="" value=""></th>
                <th width="80">ID</th>
                <th>题干</th>
                <th>类型</th>
                <th width="80">分类</th>
                <th width="80">出题时间</th>
                <th width="60">发布状态</th>
                <th width="120">操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${smd_questionsList}" var="smd_question">
                <tr class="text-c">
                    <td><input type="checkbox" class="smd_question_id" value="${smd_question.id}"
                               name="smd_question_id"></td>
                    <td>${smd_question.id}</td>
                    <td class="text-l"><u style="cursor:pointer" class="text-primary"
                                          onClick="article_edit('查看','article-zhang.html','10001')"
                                          title="查看">${smd_question.smd_questions.question}</u></td>
                    <c:if test="${smd_question.smd_questions.questionType==0}">
                        <td>单择题</td>
                    </c:if>
                    <c:if test="${smd_question.smd_questions.questionType==1}">
                        <td>多选题</td>
                    </c:if>
                    <c:if test="${smd_question.smd_questions.questionType==2}">
                        <td>判断题</td>
                    </c:if>
                    <c:if test="${smd_question.smd_questions.questionType==3}">
                        <td>简答题</td>
                    </c:if>
                    <c:if test="${smd_question.smd_questions.questionType==4}">
                        <td> 编程题</td>
                    </c:if>


                    <td>${smd_question.courses.courseName}/${smd_question.teacher_category.teacherCategoryName}</td>
                    <td>${smd_question.smd_questions.pubdate}</td>
                    <c:if test="${smd_question.smd_questions.state==0}">
                        <td class="td-status"><span class="label label-success radius">草稿</span></td>
                    </c:if>
                    <c:if test="${smd_question.smd_questions.state==1||smd_question.smd_questions.state==3||smd_question.smd_questions.state==4}">
                        <td class="td-status"><span class="label label-success radius">正在审核</span></td>
                    </c:if>
                    <c:if test="${smd_question.smd_questions.state==2}">
                        <td class="td-status"><span class="label label-success radius">审核通过</span></td>
                    </c:if>
                    <c:if test="${smd_question.smd_questions.state==1||smd_question.smd_questions.state==3||smd_question.smd_questions.state==4}">
                        <td class="td-status"><span class="label label-warning radius">正在审核,不可操作</span></td>
                    </c:if>
                    <c:if test="${smd_question.smd_questions.state==0||smd_question.smd_questions.state==2}">
                        <td class="td-manage"><a style="text-decoration:none"
                                                 onClick="question_submit(this,'${smd_question.smd_questions.id}','${smd_question.smd_questions.questionType}')"
                                                 href="javascript:;" title="提交审核"><i class="Hui-iconfont">&#xe6de;</i></a>
                            <a style="text-decoration:none" class="ml-5"
                               onClick="question_edit('题目编辑','/question/edit?id=${smd_question.smd_questions.id}&questionType=${smd_question.smd_questions.questionType}')"
                               href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> <a
                                    style="text-decoration:none" class="ml-5"
                                    onClick="question_del(this,'${smd_question.smd_questions.id}','${smd_question.smd_questions.questionType}')"
                                    href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
                    </c:if>
                </tr>
            </c:forEach>
            <c:forEach items="${fsp_questionsList}" var="fsp_question">
                <tr class="text-c">
                    <td><input type="checkbox" class="fsp_question_id" value="${fsp_question.id}"
                               name="fsp_question_id"/></td>
                    <td>${fsp_question.fsp_questions.id}</td>
                    <td class="text-l"><u style="cursor:pointer" class="text-primary"
                                          onClick="article_edit('查看','article-zhang.html','10001')"
                                          title="查看">${fsp_question.fsp_questions.question}</u></td>
                    <c:if test="${fsp_question.fsp_questions.questionType==0}">
                        <td>单择题</td>
                    </c:if>
                    <c:if test="${fsp_question.fsp_questions.questionType==1}">
                        <td>多选题</td>
                    </c:if>
                    <c:if test="${fsp_question.fsp_questions.questionType==2}">
                        <td>判断题</td>
                    </c:if>
                    <c:if test="${fsp_question.fsp_questions.questionType==3}">
                        <td>简答题</td>
                    </c:if>
                    <c:if test="${fsp_question.fsp_questions.questionType==4}">
                        <td> 编程题</td>
                    </c:if>
                    <td>${fsp_question.courses.courseName}/${fsp_question.teacher_category.teacherCategoryName}</td>
                    <td>${fsp_question.fsp_questions.pubdate}</td>
                    <c:if test="${fsp_question.fsp_questions.state==0}">
                        <td class="td-status"><span class="label label-success radius">草稿</span></td>
                    </c:if>
                    <c:if test="${fsp_question.fsp_questions.state==1}">
                        <td class="td-status"><span class="label label-success radius">正在审核</span></td>
                    </c:if>
                    <c:if test="${fsp_question.fsp_questions.state==3}">
                        <td class="td-status"><span class="label label-success radius">正在进行修改审核</span></td>
                    </c:if>
                    <c:if test="${fsp_question.fsp_questions.state==4}">
                        <td class="td-status"><span class="label label-success radius">正在进行删除审核</span></td>
                    </c:if>
                    <c:if test="${fsp_question.fsp_questions.state==2}">
                        <td class="td-status"><span class="label label-success radius">审核通过</span></td>
                    </c:if>
                    <c:if test="${fsp_question.fsp_questions.state==1||fsp_question.fsp_questions.state==3||fsp_question.fsp_questions.state==4}">
                        <td class="td-status"><span class="label label-warning radius">正在审核,不可操作</span></td>
                    </c:if>
                    <c:if test="${fsp_question.fsp_questions.state==0||fsp_question.fsp_questions.state==2}">
                        <td class="td-manage"><a style="text-decoration:none"
                                                 onClick="question_submit(this,'${fsp_question.fsp_questions.id}','${fsp_question.fsp_questions.questionType}')"
                                                 href="javascript:;" title="提交审核"><i
                                class="Hui-iconfont">&#xe6de;</i></a> <a style="text-decoration:none" class="ml-5"
                                                                         onClick="question_edit('题目编辑','/question/edit?id=${fsp_question.fsp_questions.id}&questionType=${fsp_question.fsp_questions.questionType}')"
                                                                         href="javascript:;" title="编辑"><i
                                class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5"
                                                                         onClick="question_del(this,'${fsp_question.fsp_questions.id}','${fsp_question.fsp_questions.questionType}')"
                                                                         href="javascript:;" title="删除"><i
                                class="Hui-iconfont">&#xe6e2;</i></a></td>
                    </c:if>
                </tr>
            </c:forEach>
            <%--<tr class="text-c">--%>
            <%--<td><input type="checkbox" value="" name=""></td>--%>
            <%--<td>10001</td>--%>
            <%--<td class="text-l"><u style="cursor:pointer" class="text-primary" onClick="article_edit('查看','article-zhang.html','10001')" title="查看">资讯标题</u></td>--%>
            <%--<td>行业动态</td>--%>
            <%--<td>2014-6-11 11:11:42</td>--%>
            <%--<td>21212</td>--%>
            <%--<td class="td-status"><span class="label label-success radius">已发布</span></td>--%>
            <%--<td class="f-14 td-manage"><a style="text-decoration:none" onClick="article_stop(this,'10001')" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a> <a style="text-decoration:none" class="ml-5" onClick="article_edit('资讯编辑','article-add.html','10001')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="article_del(this,'10001')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>--%>
            <%--</tr>--%>
            </tbody>
        </table>
    </div>
</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="/static/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="/static/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="/static/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="/static/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="/static/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="/static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="/static/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">


    $('.table-sort').dataTable({
        "aaSorting": [[1, "desc"]],//默认第几个排序
        "bStateSave": true,//状态保存
        "pading": false,
        "aoColumnDefs": [
            //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
            {"orderable": false, "aTargets": [1, 7]}// 不参与排序的列
        ]
    });



    $(function () {
        $("#question_select2").change(function () {

            var subjects = $("#question_select2 option:selected");
            if(subjects.val()=='all'){
                $("#question_select3 option").remove();
                $("#question_select3").append("<option value=\"all\">全部分类</option>");
            }else {
                $.ajax({
                    type: "POST",
                    url: "/question/selectChange",
                    data: {id: subjects.val()},
                    success: function (data) {
                        if (data.data != null) {
                            $("#question_select3 option").remove();
                            $("#question_select3").append("<option value=\"all\">全部分类</option>");
                            $.each(data.data, function (index, element) {
                                // console.info(element);
                                $("#question_select3").append("<option value=\"" + element.id + "\">" + element.teacherCategoryName + "</option>");
                            });
                        }
                    }
                });
            }
        });

    });

    function datasdel() {
        var smdlist = $("tbody").find(".smd_question_id:checked");
        var fsplist = $("tbody").find(".fsp_question_id:checked");
        var sum = smdlist.length + fsplist.length;
        // alert(smdlist);
        var smdids = "";
        var fspids = "";
        $.each(smdlist, function (i, e) {
            smdids = e.value + "," + smdids
        });
        $.each(fsplist, function (i, e) {
            fspids = e.value + "," + fspids
        });
        if (smdids == "") {
            smdids = null;
        }
        if (fspids == "") {
            fspids = null;
        }
        alert(fspids + ":" + smdids);
        if (smdids != null || fspids != null) {
            layer.confirm('确认要删除这' + sum + '条数据吗？', function (index) {
                $.ajax({
                    type: 'POST',
                    url: '/question/dels',
                    dataType: 'json',
                    data: {smdids: smdids, fspids: fspids},
                    success: function (data) {
                        layer.msg(data.msg, {icon: 1, time: 4000}, function () {
                            location.reload();
                        });

                    },
                    error: function (data) {
                        console.log(data.msg);
                    },
                });
            });
        }


    }




    /*题目-编辑*/
    function question_edit(title, url) {
        var index = layer.open({
            type: 2,
            title: title,
            content: url
        });
        layer.full(index);
    }

    /*题目-删除*/
    function question_del(obj, id, questionType) {
        layer.confirm('确认要删除吗？', function (index) {
            $.ajax({
                type: 'POST',
                url: '/question/del',
                dataType: 'json',
                data: {id: id, questionType: questionType},
                success: function (msg) {
                    if (msg.isGo) {
                        layer.msg("已删除", {icon: 1, time: 1000}, function () {
                            // $(obj).parents("tr").remove();
                            location.reload();
                        });
                    } else {
                        layer.msg("删除失败", {icon: 2, time: 1000});
                    }
                },
                error: function (data) {
                    console.log(data.msg);
                },
            });
        });
    }


    /*题目-提交审核*/
    function question_submit(obj, id, questionType) {
        layer.confirm('确认要提交审核吗？', function (index) {
            $.ajax({
                type: 'POST',
                url: '/question/submit',
                data: {id: id, questionType: questionType},
                dataType: 'json',
                success: function (msg) {
                    if (msg.isGo) {
                        layer.msg("已提交审核", {icon: 1, time: 1000}, function () {
                            location.reload();
                        });
                    } else {
                        layer.msg("提交审核失败", {icon: 1, time: 1000});
                    }

                },
                error: function (data) {
                    console.log(data.msg);
                },
            });
        });
    }

    // /*资讯-发布*/
    // function article_start(obj,id){
    //     layer.confirm('确认要发布吗？',function(index){
    //         $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="article_stop(this,id)" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a>');
    //         $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
    //         $(obj).remove();
    //         layer.msg('已发布!',{icon: 6,time:1000});
    //     });
    // }
    // /*资讯-申请上线*/
    // function article_shenqing(obj,id){
    //     $(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">待审核</span>');
    //     $(obj).parents("tr").find(".td-manage").html("");
    //     layer.msg('已提交申请，耐心等待审核!', {icon: 1,time:2000});
    // }
    
    function search() {
        // $("tbody").children("tr").remove(".text-c");
        var va1 = $("#question_select1 option:selected").val();
        var va2 = $("#question_select2 option:selected").val();
        var va3 = $("#question_select3 option:selected").val();
        var dateMin = $("#logmin").val();
        var dateMax = $("#logmax").val();
        // alert(va1+va2+va3+dateMin+dateMax+"");

        $.ajax({
            type: 'POST',
            url: '/question/search',
            data: {va1: va1, va2: va2, va3: va3,dateMin:dateMin,dateMax:dateMax},
            dataType: 'json',
            success: function (data) {

                if(data.smdlist!=null){
                    $.each(data.smdlist,function (i,e) {

                        // console.info(e);
                    });
                }else if(data.fspList!=null){
                    $.each(data.fspList,function (i,e) {
                        // console.info(e);
                    });
                }
            },
            // error: function (data) {
            //     console.log(data.msg);
            // }
        });
    }

</script>
</body>
</html>
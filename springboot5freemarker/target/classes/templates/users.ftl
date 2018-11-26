<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>freemarker的模板</title>
</head>
<body>

    <br><br>显示所有<br>
    <#--判断大小-->
    <#if (users?size>0)>
        <#list users as user>
        用户ID：${user.id}=====用户名：${user.username}=====用户密码：${user.password}<br><br>
        </#list>
    </#if>

    <#--判断大小-->
    ${users?size}

    <br><br>
    <#--特殊字符会被转义 不会解析-->
    <#assign aaa="<h1>testfreemerker</h1>"/>
    ${aaa?html}

    <br><br>
    <#--前端为空格的首字母大写-->
    <#assign bbb="  testfreemerker</h1>"/>
    ${bbb?cap_first}

    <br><br>
    <#--去掉前后的空格-->
    <#assign ccc="  testfreemerker   "/>
    ${ccc?trim}

    <br><br>
    <#--取整-->
    ${123.456?int}

    <br><br>
    <#--不存在给默认值-->
    ${mouse!"默认值"}

    <br><br>
    <#--判断是否为空-->
    <#if mouse??>
        Mouse Found
    <#else>
        No Mouse Found
    </#if>

    <br><br>
    <#--??判断是否为空-->
     <#if mouse??>
        Mouse Found
     <#else>
        No Mouse Found
     </#if>

    <br><br>
    <#--switch-->
    <#assign size = "medium"/>
    <#switch size>
        <#case "small">
            small
            <#break>
        <#case "medium">
            medium
            <#break>
        <#case "large">
            medium
            <#break>
        <#default>
            null
    </#switch>

    <br><br>
    <#--循环-->
    <#assign seq=["winter","spring","summer","fall"]>
    <#list seq as x>
        ${x_index+1}. ${x}<#if x_has_next>,</#if><br>
    </#list>

    <br><br>
    <#--定义宏-->
    <#macro test foo bar="Bar" baaz=-1>
        Test test, and the params:${foo},${bar},${baaz}<br><br>
    </#macro>

    <#--调用宏-->
    <@test foo="abcd" bar="efg"/>
    <@test foo=12345 bar="666"/>

    <#macro repeat count>
        <#list 1..count as x>
            <#nested x,x/2,x==count>
            <#if x==3>
                <#return>
            </#if>
        </#list>
    </#macro>

    <@repeat count=5;contant,contant_half,is_last>
        有一个body的宏，传出了三个值:${contant},${contant_half},<#if is_last>这是最后一个</#if><br>
    </@repeat>

    <br><br>
    <#assign me="Ray"/>
    <#--include包含 相当于赋值过来-->
    <#include "./copyright.ftl" encoding="UTF-8"/>

    <br><br>
    <#--import引用 相当于赋值过来-->
    <#import "./mylib.ftl" as my/>
    <@my.mmm pp="123"/>

    <#--压缩代码-->
    <#compress >
    </#compress>

    <#--打包转义-->
    <#escape x as x?html>

        <#noescape></#noescape>

    </#escape>

    <#--定义-->
    <#assign aa = "aa" bb = "bb"/>

    <#--双标签定义-->
    <#assign xx>
        <#--代码块-->
    </#assign>

    <#--在某一个命名空间定义-->
    <#assign rrr = "ttt" in my/>
    ${my.rrr}

    <br><br>
    <#--global全局变量-->
    <#import "./mylib.ftl" as my>
    ${ggg}<br>
    ${my.aaa}

    <br><br>
    <#setting number_format="percent">
    ${1}

    <br><br>
    <#setting datetime_format="yyyy-MM-dd HH:mm:ss">
    ${date?datetime}

</body>
</html>
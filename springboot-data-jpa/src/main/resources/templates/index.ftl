<html>
<head>
    <title>王磊的博客</title>
</head>
<body>

<#--<#global gbSkill>-->
<#--<#list ["java","golang"] as lang>-->
<#--${lang}-->
<#--</#list>-->
<#--</#global>-->
<#--${gbSkill}-->

<#--<#assign name="adam" age=18 "sex"="man">-->
<#--${name} - ${age} - ${"sex"}-->

<#--<#assign code>-->
<#--<#list ["java","golang"] as c>-->
<#--${c}-->
<#--</#list>-->
<#--</#assign>-->
<#--${code}-->


<#--<#attempt>-->
<#--i am ${name}-->
<#--<#recover>-->
<#--error name-->
<#--</#attempt>-->

<#--<#compress>-->
<#--1 2  3   4    5-->


<#--test only-->

<#--I said, test only-->
<#--</#compress>-->

<#--1 2  3   4    5-->


<#--test only-->

<#--I said, test only-->

<#--<#list names as n>-->
<#--<p>${n}</p>-->
<#--</#list>-->


<#--<#escape x as x?html>-->
<#--${firstName}-->
<#--${lastName}-->
<#--</#escape>-->

<#--<#function sum x y z>-->
<#--<#return x+y+z>-->
<#--</#function>-->

<#--${sum(5,5,5)}-->


<#--<#function wantToPrint>-->
<#--这里的信息是显示不了的-->
<#--<#return null>-->
<#--</#function>-->

<#--<#if wantToPrint()??>-->
<#--Message:${wantToPrint()}-->
<#--</#if>-->

<#--<#global gbSkill>-->
<#--<#list ["java","golang"] as lang>-->
<#--${lang}-->
<#--</#list>-->
<#--</#global>-->

<#--<#assign x=1 >-->
<#--<#if x==1>-->
<#--x is 1-->
<#--<#elseif x==2>-->
<#--x is 2-->
<#--<#else>-->
<#--x is not 1-->
<#--</#if>-->

<#--<#import "footer.ftl" as footer>-->
<#--${footer.copy}-->

<#--<#function sum>-->
<#--我是小明-->
<#--</#function>-->

<#--<#if sum()??>-->
<#--${sum()}-->
<#--</#if>-->

<#--<#noescape>-->
<#--${firstName}-->
<#--</#noescape>-->

<#--<#include "footer.ftl">-->

<#--<#list 1..3 as n>-->
<#--${n}-->
<#--<#if n==2>-->
<#--<#break>-->
<#--</#if>-->
<#--</#list>-->


<#--<#list 1..3 as n>-->
<#--<p>${n}</p>-->
<#--<#else>-->
<#--this is else-->
<#--</#list>-->

<#--<#list 1..3>-->
<#--<ul>-->
<#--<#items as n>-->
<#--<li>${n}</li>-->
<#--</#items>-->
<#--</ul>-->
<#--</#list>-->

<#--<#list 1..3 as n>-->
<#--${n}-->
<#--<#sep>,</#sep>-->
<#--</#list>-->

<#--<#list 1..3 as n>-->
<#--${n}-->
<#--<#if !n_has_next>-->
<#--最后一项-->
<#--</#if>-->
<#--</#list>-->

<#--<#macro sayhi name>-->
<#--Hello, ${name}-->
<#--</#macro>-->

<#--<@sayhi "Adam" />-->

<#--<#assign animal="dog" >-->
<#--<#switch animal>-->
<#--<#case "pig">-->
<#--This is pig-->
<#--<#break>-->
<#--<#case "dog">-->
<#--This is dog-->
<#--<#break>-->
<#--<#default>-->
<#--This is Aaimal-->
<#--</#switch>-->

<#--${1.23456?string["0.###"]}-->

<#--${1.2356?string.percent}-->

<#--${"admin"?contains("min")}-->

<#--${"admin"?contains("mins")}-->

<#--<#if "admin"?contains("min")>-->
   <#--min-->
<#--<#else >-->
<#--not min-->
<#--</#if>-->

<#--<#assign name="Adam">-->
<#--${name?uncap_first}-->
<#--${name?upper_case}-->
<#--${name?cap_first}-->
<#--${name?lower_case}-->


<#--<#assign nowTime = .now>-->
<#--${nowTime} <br />-->
<#--${nowTime?string["yyyy/MM/dd HH:mm"]} <br />-->


<#--<#assign timestamp=1534414202000>-->
<#--${timestamp?number_to_datetime?string["yyyy/MM/dd HH:mm"]} <br />-->

data：${id}


</body>
</html>
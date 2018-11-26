<#macro mmm pp="abc">
    mmm宏被调用，传进来的参数是:${pp}
</#macro>

<#assign aaa = "aaa"/>
<#global ggg = "ggg"/>

${aaa}
${ggg}
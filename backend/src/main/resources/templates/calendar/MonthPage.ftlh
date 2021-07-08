<#-- @ftlvariable name="monthDaysCount" type="java.lang.Integer" -->
<#-- @ftlvariable name="skipDaysCount" type="java.lang.Integer" -->
<#-- @ftlvariable name="monthTitle" type="java.lang.String" -->

<#import "../common.ftlh" as c>
<#import  "macro/MonthMacro.ftlh" as month_macro>

<@c.page>
    <div class="month-page-div">
        <@month_macro.month monthDaysCount=monthDaysCount monthTitle=monthTitle skipDaysCount=skipDaysCount/>
    </div>
</@c.page>
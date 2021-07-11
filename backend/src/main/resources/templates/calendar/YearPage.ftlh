<#-- @ftlvariable name="yearNumber" type="java.lang.Integer" -->

<#import "../common/Common.ftlh" as c>
<#import  "macro/YearMacro.ftlh" as year_macro>

<@c.page>
    <div class="year-page-div">
        <h2>${yearNumber?c}</h2>

        <@year_macro.year year=yearNumber/>
    </div>
</@c.page>
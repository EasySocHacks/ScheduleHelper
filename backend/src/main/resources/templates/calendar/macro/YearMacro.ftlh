<#-- @ftlvariable name="yearMonthCount" type="java.lang.Integer" -->
<#-- @ftlvariable name="yearMonthsDayCountArray" type="java.lang.Integer[]" -->
<#-- @ftlvariable name="yearMonthsTitleArray" type="java.lang.String[]" -->
<#-- @ftlvariable name="monthsCodeArray" type="java.lang.Integer[]" -->

<#import "MonthMacro.ftlh" as month_macro/>

<#macro year year>
    <#assign yearCode=(6 + (year % 100) + ((year % 100) / 4)) % 7/>

    <div class="year-macro-div">
        <#list 0..<yearMonthCount as i>
            <#assign daysToSkip=(6 + ((monthsCodeArray[i] + yearCode) % 7)) % 7/>

            <div class="year-macro-month-div">
                <#if i == 1 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))>
                    <@month_macro.month monthDaysCount=29 monthTitle=yearMonthsTitleArray[i] skipDaysCount=daysToSkip/>
                <#else>
                    <@month_macro.month monthDaysCount=yearMonthsDayCountArray[i] monthTitle=yearMonthsTitleArray[i] skipDaysCount=daysToSkip/>
                </#if>
            </div>
        </#list>
    </div>
</#macro>
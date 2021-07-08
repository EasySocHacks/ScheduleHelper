<#import "MonthMacro.ftlh" as month_macro/>

<#macro year year>
    <#assign yearMonthCount=12/>
    <#assign yearMonthsDayCountArray=[31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]/>
    <#assign yearMonthsTitleArray=["Январь", "Феврпль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь",
        "Октябрь", "Ноябрь", "Декабрь"]/>
    <#assign monthCodes=[1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6]/>
    <#assign yearCode=(6 + (year % 100) + ((year % 100) / 4)) % 7/>

    <div class="year-macro-div">
        <#list 0..<yearMonthCount as i>
            <#assign daysToSkip=(6 + ((monthCodes[i] + yearCode) % 7)) % 7/>

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
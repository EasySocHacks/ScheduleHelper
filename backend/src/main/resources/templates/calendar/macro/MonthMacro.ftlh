<#import "DayMacro.ftlh" as day_macro>

<#macro month monthDaysCount skipDaysCount monthTitle>
    <h2>${monthTitle}</h2>

    <div class="month-macro-div">
        <div class="month-macro-header-div">
            <#assign dayOfWeekShortTitleArray=["Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс"]/>
            <#list dayOfWeekShortTitleArray as dayOfWeekTitle>
                <div class="month-macro-header-dayOfWeekTitle-div">
                    <span>
                        ${dayOfWeekTitle}
                    </span>
                </div>
            </#list>
        </div>
        <#list 0..<skipDaysCount as i>
            <@day_macro.day day=0 isEmptySpace=true/>
        </#list>
        <#list 0..<monthDaysCount as i>
            <@day_macro.day day=i+1/>
        </#list>
    </div>
</#macro>
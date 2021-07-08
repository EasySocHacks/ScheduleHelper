<#macro day day isEmptySpace=false>
    <#if isEmptySpace>
        <div class="day-macro-div day-macro-empty">
            <span>${day}</span>
        </div>
    <#else>
        <div class="day-macro-div">
            <span>${day}</span>
        </div>
    </#if>
</#macro>
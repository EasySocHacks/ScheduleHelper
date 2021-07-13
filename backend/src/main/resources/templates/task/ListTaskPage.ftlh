<#-- @ftlvariable name="taskList" type="easy.soc.hacks.ScheduleHelper.entity.Task[]" -->

<#import "../common/Common.ftlh" as c>

<@c.page>
    <div>
        <ul>
            <#list taskList as task>
                <li>
                    <div>
                        ${task.title}
                    </div>
                    <#if task.done>
                        <input type="checkbox" checked>
                    <#else>
                        <input type="checkbox">
                    </#if>
                </li>
            </#list>
        </ul>
    </div>
</@c.page>
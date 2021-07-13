<#-- @ftlvariable name="taskForm" type="easy.soc.hacks.ScheduleHelper.form.TaskForm" -->

<#import "../common/Common.ftlh" as c>

<@c.page>
    <div>
        <strong>
            Add Task
        </strong>
        <form method="post">
            <input id="title" name="title" value="${taskForm.title!}">
            <input id="description" name="description" value="${taskForm.description!}">
            <input type="submit" value="Register">
        </form>
    </div>
</@c.page>
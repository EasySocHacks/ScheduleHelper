<#-- @ftlvariable name="loginForm" type="easy.soc.hacks.ScheduleHelper.form.Form" -->

<#import "../common/Common.ftlh" as c>

<@c.page>
    <div>
        <strong>
            Login
        </strong>
        <form method="post">
            <input id="login" name="login" value="${loginForm.login!}">
            <input id="password" name="password" type="password" value="">
            <input type="submit" value="Register">
        </form>
    </div>
</@c.page>
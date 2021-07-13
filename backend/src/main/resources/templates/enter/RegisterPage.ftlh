<#-- @ftlvariable name="registerForm" type="easy.soc.hacks.ScheduleHelper.form.EnterForm" -->

<#import "../common/Common.ftlh" as c>

<@c.page>
    <div>
        <strong>
            Register
        </strong>
        <form method="post">
            <input id="login" name="login" value="${registerForm.login!}">
            <input id="password" name="password" type="password" value="">
            <input type="submit" value="Register">
        </form>
    </div>
</@c.page>
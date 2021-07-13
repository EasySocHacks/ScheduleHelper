<#-- @ftlvariable name="registerForm" type="easy.soc.hacks.ScheduleHelper.form.EnterForm" -->

<#import "../common/Common.ftlh" as c>

<@c.page>
    <div>
        <strong>
            Register
        </strong>
        <form method="post">
            <input id="login" name="login" value="${registerForm.login!}">
            <strong><@c.error "registerForm.login"/></strong>
            <br>
            <input id="password" name="password" type="password" value="">
            <strong><@c.error "registerForm.password"/></strong>
            <br>
            <input type="submit" value="Register">
        </form>
    </div>
</@c.page>
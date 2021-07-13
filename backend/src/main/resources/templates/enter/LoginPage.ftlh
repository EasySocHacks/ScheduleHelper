<#-- @ftlvariable name="loginForm" type="easy.soc.hacks.ScheduleHelper.form.EnterForm" -->

<#import "../common/Common.ftlh" as c>

<@c.page>
    <div>
        <strong>
            Login
        </strong>
        <form method="post">
            <input id="login" name="login" value="${loginForm.login!}">
            <strong><@c.error "loginForm.login"/></strong>
            <br>
            <input id="password" name="password" type="password" value="">
            <strong><@c.error "loginForm.password"/></strong>
            <br>
            <input type="submit" value="Login">
        </form>
    </div>
</@c.page>
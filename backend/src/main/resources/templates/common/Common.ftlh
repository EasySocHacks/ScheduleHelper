<#-- @ftlvariable name="user" type="easy.soc.hacks.ScheduleHelper.entity.User" -->

<#import "/spring.ftl" as spring/>
<#import "Header.ftlh" as Header/>
<#import "Footer.ftlh" as Footer/>

<#macro page>
    <!DOCTYPE html>
    <html lang="en">
        <head>
            <meta charset="UTF-8">
            <title>Schedule Helper</title>
            <link rel="stylesheet" type="text/css" href="<@spring.url '/css/style.css'/>">
            <link rel="stylesheet" type="text/css" href="<@spring.url '/css/calendar/monthPage.css'/>">
            <link rel="stylesheet" type="text/css" href="<@spring.url '/css/calendar/macro/day.css'/>">
            <link rel="stylesheet" type="text/css" href="<@spring.url '/css/calendar/macro/month.css'/>">
            <link rel="stylesheet" type="text/css" href="<@spring.url '/css/calendar/macro/year.css'/>">
            <link rel="stylesheet" type="text/css" href="<@spring.url '/css/task/listTask.css'/>">
        </head>
        <body>
            <header class="header">
                <@Header.header/>
                <hr>
            </header>
            <main>
                <#nested/>
            </main>
            <footer>
                <hr>
                <@Footer.footer/>
            </footer>
        </body>
    </html>
</#macro>

<#macro error field>
    <@spring.bind field/>
    <#if spring.status.errorMessage??>
        <div class="error">${spring.status.errorMessage}</div>
    </#if>
</#macro>
<#import "/spring.ftl" as spring/>
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
        </head>
        <body>
            <header>
                <h2>Header</h2>
                <hr>
            </header>
            <main>
                <#nested/>
            </main>
            <footer>
                <hr>
                <h2>Footer</h2>
            </footer>
        </body>
    </html>
</#macro>
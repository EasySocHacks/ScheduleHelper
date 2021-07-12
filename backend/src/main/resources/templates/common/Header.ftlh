<#import "/spring.ftl" as spring/>

<#macro header>
    <div class="header-site-title-div">
        <strong>
            Schedule Helper
        </strong>
    </div>
    <div class="header-language-and-login-register-div">
        <div class="header-language-div">
            <a href="/settings/language?value=RUS">
                <img src="<@spring.url '/images/flags/Flag_RUS.jpg'/>" alt="RUS"/>
            </a>
            <a href="/settings/language?value=ENG">
                <img src="<@spring.url '/images/flags/Flag_ENG.jpg'/>" alt="ENG"/>
            </a>
        </div>
        <div class="header-login-register-div">
            <strong>
                <#if user??>
                    ${user.login}
                <#else>
                    <a href="/login">Login</a>
                </#if>
            </strong>
            <strong>
                |
            </strong>
            <strong>
                <#if user??>
                    <a href="/logout">Logout</a>
                <#else>
                    <a href="/register">Register</a>
                </#if>
            </strong>
        </div>
    </div>
</#macro>
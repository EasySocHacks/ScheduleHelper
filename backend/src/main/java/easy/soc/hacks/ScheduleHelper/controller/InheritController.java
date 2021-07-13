package easy.soc.hacks.ScheduleHelper.controller;

import easy.soc.hacks.ScheduleHelper.entity.User;

import javax.servlet.http.HttpSession;

public class InheritController {
    protected static void setUser(HttpSession httpSession, User user) {
        httpSession.setAttribute("user", user);
    }

    protected static void unsetUser(HttpSession httpSession) {
        httpSession.setAttribute("user", null);
    }

    protected static User getUser(HttpSession httpSession) {
        return (User) httpSession.getAttribute("user");
    }
}

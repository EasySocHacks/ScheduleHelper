package easy.soc.hacks.ScheduleHelper.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calendar")
public class CalendarController {

    @GetMapping("/month")
    public String monthPage(Model model) {
        //TODO: set monthDays to correct way.
        model.addAttribute("monthDaysCount", 31);
        model.addAttribute("skipDaysCount", 0);
        model.addAttribute("monthTitle", "Январь");

        return "calendar/MonthPage";
    }

    @GetMapping("/year")
    public String yearPage(Model model) {
        model.addAttribute("yearNumber", 2021);

        return "calendar/YearPage";
    }
}

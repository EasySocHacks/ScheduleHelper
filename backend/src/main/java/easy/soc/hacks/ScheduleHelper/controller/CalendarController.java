package easy.soc.hacks.ScheduleHelper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calendar")
public class CalendarController {

    //TODO: Open once (Temporary close)
    /*
    @GetMapping("/month")
    public String monthPage(Model model) {
        //TODO: set monthDays to correct way.
        model.addAttribute("monthDaysCount", 31);
        model.addAttribute("skipDaysCount", 0);
        model.addAttribute("monthTitle", "Январь");

        return "calendar/MonthPage";
    }
     */

    @GetMapping("/year")
    public String yearPage(Model model, @RequestParam(name = "year", defaultValue = "2000") int yearNumber) {
        model.addAttribute("yearNumber", yearNumber);

        return "calendar/YearPage";
    }
}

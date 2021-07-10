package easy.soc.hacks.ScheduleHelper.util.constant;

import javax.servlet.http.HttpSession;

public interface GlobalConstants {
    int YEAR_MONTH_COUNT = 12;
    int[] MONTHS_CODE_ARRAY = new int[] {1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
    String[] YEAR_MONTHS_TITLE_ARRAY =
            new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                    "October", "November", "December"};
    int[] YEAR_MONTHS_DAY_COUNT_ARRAY = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    String[] DAY_OF_WEEK_SHORT_TITLE_ARRAY =
            new String[] {"Mon", "Tue", "Wed", "Th", "Fri", "Sat", "Sun"};

    default void init(HttpSession httpSession) {
        httpSession.setAttribute("yearMonthCount", getYearMonthCount());
        httpSession.setAttribute("yearMonthsDayCountArray", getYearMonthsDayCountArray());
        httpSession.setAttribute("yearMonthsTitleArray", getYearMonthsTitleArray());
        httpSession.setAttribute("monthsCodeArray", getMonthsCodeArray());

        httpSession.setAttribute("dayOfWeekShortTitleArray", getDayOfWeekShortTitleArray());
    }

    default int getYearMonthCount() {
        return YEAR_MONTH_COUNT;
    }

    default int[] getYearMonthsDayCountArray() {
        return YEAR_MONTHS_DAY_COUNT_ARRAY;
    }

    default String[] getYearMonthsTitleArray() {
        return YEAR_MONTHS_TITLE_ARRAY;
    }

    default int[] getMonthsCodeArray() {
        return MONTHS_CODE_ARRAY;
    }

    //----------

    default String[] getDayOfWeekShortTitleArray() {
        return DAY_OF_WEEK_SHORT_TITLE_ARRAY;
    }
}

package easy.soc.hacks.ScheduleHelper.util.constant.impl;

import easy.soc.hacks.ScheduleHelper.util.constant.GlobalConstants;

public class GlobalConstants_RUS implements GlobalConstants {
    private final String[] YEAR_MONTHS_TITLE_ARRAY =
            new String[] {"Январь", "Феврпль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь",
                    "Октябрь", "Ноябрь", "Декабрь"};
    private final String[] DAY_OF_WEEK_SHORT_TITLE_ARRAY =
            new String[] {"Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс"};

    @Override
    public String[] getYearMonthsTitleArray() {
        return YEAR_MONTHS_TITLE_ARRAY;
    }

    @Override
    public String[] getDayOfWeekShortTitleArray() {
        return DAY_OF_WEEK_SHORT_TITLE_ARRAY;
    }
}

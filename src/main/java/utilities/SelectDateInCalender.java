package utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class SelectDateInCalender {
    private HashMap<String, Integer> weekDayMap = new HashMap<String, Integer>();
    private int TOTAL_WEEK_DAYS = 7;

    public SelectDateInCalender() {
        weekDayMap.put("SUNDAY", 0);
        weekDayMap.put("MONDAY", 1);
        weekDayMap.put("TUESDAY", 2);
        weekDayMap.put("WEDNESDAY", 3);
        weekDayMap.put("THURSDAY", 4);
        weekDayMap.put("FRIDAY", 5);
        weekDayMap.put("SATURDAY", 6);
    }

    public int getNextSaturday() {
        Calendar cal = Calendar.getInstance();
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        SimpleDateFormat n = new SimpleDateFormat("EEEE");
        String dayOfWeek = n.format(new Date()).toUpperCase();
        int daysToSaturday = TOTAL_WEEK_DAYS - weekDayMap.get(dayOfWeek);
        return dayOfMonth + daysToSaturday - 1;
    }
}


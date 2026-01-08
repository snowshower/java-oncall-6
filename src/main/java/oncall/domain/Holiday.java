package oncall.domain;

import java.util.Arrays;

public enum Holiday {
    NEWYEAR(1, 1),
    MOVEMENT(3,1),
    CHILDREN(5,5),
    MEMORIAL(6,6),
    LIBERATION(8,15),
    FOUNDATION(10,3),
    HANGEUL(10,9),
    CHRISTMAS(12,5);

    private final int month;
    private final int day;

    Holiday(int month, int day){
        this.month=month;
        this.day=day;
    }

    public static Holiday from(int month, int day){
        return Arrays.stream(values())
                .filter(holiday -> holiday.month==month&&holiday.day==day)
                .findFirst()
                .orElseThrow();
    }

    //공휴일인지 확인하는 메소드
    public static boolean isHoliday(int month, int day){
        return Arrays.stream(values())
                .anyMatch(holiday -> holiday.month==month&&holiday.day==day);
    }

    public int getMonth(){
        return month;
    }

    public int getDay() {
        return day;
    }
}

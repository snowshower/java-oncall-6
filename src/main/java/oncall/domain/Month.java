package oncall.domain;

import java.util.Arrays;

public enum Month {
    JAN(1, 31),
    FEB(2, 28),
    MAR(3, 31),
    APL(4, 30),
    MAY(5, 31),
    JUN(6, 30),
    JUL(7, 31),
    AUG(8, 31),
    SEP(9, 30),
    OCT(10, 31),
    NOV(11, 30),
    DEC(12, 31);

    private final int monthName;
    private final int maxDay;

    Month(int monthName, int maxDay){
        this.monthName=monthName;
        this.maxDay=maxDay;
    }

    public static Month from(int monthName){
        return Arrays.stream(values())
                .filter(month -> month.monthName==monthName)
                .findFirst()
                .orElseThrow();
    }

    public int getMonthName(){
        return monthName;
    }

    public int getMaxDay(){
        return maxDay;
    }
}

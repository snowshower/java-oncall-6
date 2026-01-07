package oncall.domain;

import java.util.Arrays;

public enum Yoil {
    MON("월", 0),
    TUE("화", 1),
    WED("수", 2),
    THU("목", 3),
    FRI("금", 4),
    SAT("토", 5),
    SUN("일", 6);

    private final String yoilName;
    private final int index;

    Yoil(String yoilName, int index){
        this.yoilName=yoilName;
        this.index=index;
    }

    public static Yoil from(int index){
        return Arrays.stream(values())
                .filter(yoil -> yoil.index==index)
                .findFirst()
                .orElseThrow();
    }

    //다음 요일 인덱스 반환하는 메소드
    public static int nextYoil(int index){
        return Yoil.from((index+1)%7).getIndex();
    }

    //평일인지 휴일인지 확인하는 메소드
    public static boolean isDayOff(String yoilName){
        return yoilName.equals(SAT.yoilName)||yoilName.equals(SUN.yoilName);
    }


    public String getYoilName(){
        return yoilName;
    }

    public int getIndex(){
        return index;
    }
}

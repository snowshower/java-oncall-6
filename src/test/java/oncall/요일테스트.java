package oncall;

import oncall.domain.Yoil;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class 요일테스트 {

    @Test
    void 요일순환테스트(){
        List<String> yoils=List.of("월", "화", "수", "목", "금", "토", "일", "월", "화", "수");
        List<String> list=new ArrayList<>();
        int idx=0;
        for(int i=0; i<10; i++){
            list.add(Yoil.from(idx).getYoilName());
            idx=Yoil.nextYoil(idx);
        }

        Assertions.assertThat(list).isEqualTo(yoils);
    }

    @Test
    void 평일휴일판단테스트(){
        String sat="토";
        Assertions.assertThat(Yoil.isDayOff(sat)).isTrue();
    }
}

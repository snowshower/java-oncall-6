package oncall;

import oncall.domain.Holiday;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class 공휴일테스트 {

    @Test
    void 공휴일테스트() {
        int month1=5;
        int day1=5;
        int month2=6;
        int day2=1;

        Assertions.assertThat(Holiday.isHoliday(month1, day1)).isTrue();
        Assertions.assertThat(Holiday.isHoliday(month2, day2)).isFalse();
    }
}

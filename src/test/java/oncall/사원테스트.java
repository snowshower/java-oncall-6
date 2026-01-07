package oncall;

import oncall.domain.Workers;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class 사원테스트 {
    private final String worker1="길동";
    private final String worker2="철수";
    private final String worker3="민수";
    private final String worker4="영희";
    private final String worker5="유리";

    private final Workers workers=new Workers(List.of(worker1, worker2, worker3, worker4, worker5));

    @Test
    void 다음인덱스얻기테스트(){
        int idx=1;
        Assertions.assertThat(idx).isEqualTo(workers.nextIndex());
    }

    @Test
    void 인덱스해당하는사원한명꺼내기테스트(){
        int idx=1;
        Assertions.assertThat("철수").isEqualTo(workers.getOneWorker(idx));
    }
}

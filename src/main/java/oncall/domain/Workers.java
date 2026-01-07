package oncall.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Workers {
    private final List<String> workers;
    private int index;

    public Workers(List<String> workers){
        this.workers=new ArrayList<>(workers);
        this.index=0;
    }

    //인덱스에 해당하는 사원 한명 꺼내기
    public String getOneWorker(int index){
        return workers.get(index);
    }

    //다음 인덱스 얻기
    public int nextIndex(){
        return (index+1)%workers.size();
    }

    public int getIndex(){
        return index;
    }

    public List<String> getWorkers(){
        return Collections.unmodifiableList(workers);
    }
}

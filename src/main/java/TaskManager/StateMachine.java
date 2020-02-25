package TaskManager;

import java.util.ArrayList;
import java.util.List;

public class StateMachine {
    List<Task> list;

    public StateMachine() {
        this.list = new ArrayList<>();
    }

    public StateMachine(List<Task> list) {
        this.list = list;
    }

    public List<Task> getList() {
        return list;
    }

    public void setList(List<Task> list) {
        this.list = list;
    }
}

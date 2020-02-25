package TaskManager.states;

import TaskManager.State;
import TaskManager.Task;

public class Backlog extends State {
    public Backlog(Task task) {
        super(task);
    }

    @Override
    public State copy() {
        Backlog b = new Backlog(Backlog.this.getContext());
        return b;
    }

    @Override
    public void up(Object... param) {
        getContext().setState(new Open(getContext()));
    }

    @Override
    public void down(Object... param) {
    }

}

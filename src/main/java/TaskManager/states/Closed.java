package TaskManager.states;

import TaskManager.State;
import TaskManager.Task;

public class Closed extends State {
    public Closed(Task task) {
        super(task);
    }

    @Override
    public State copy() {
        Closed closed = new Closed(Closed.this.getContext());
        return closed;
    }

    @Override
    public void up(Object... param) {}

    @Override
    public void down(Object... param) {}
}

package TaskManager.states;

import TaskManager.State;
import TaskManager.Task;

public class Draft extends State {
    public Draft(Task task) {
        super(task);
    }

    @Override
    public State copy() {
        Draft draft = new Draft(Draft.this.getContext());
        return draft;
    }

    @Override
    public void up(Object... param) {
        getContext().setState(new Open(getContext()));
    }

    @Override
    public void down(Object... param) {

    }

}

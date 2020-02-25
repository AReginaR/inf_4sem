package TaskManager.states;

import TaskManager.State;
import TaskManager.Task;

public class Assigned extends State {
    public Assigned(Task task) {
        super(task);
    }

    @Override
    public State copy() {
        Assigned a = new Assigned(Assigned.this.getContext());
        return a;
    }

    @Override
    public void up(Object... param) {
        getContext().setState(new InProgress(getContext()));
    }

    @Override
    public void down(Object... param) {
        getContext().setState(new Assigned(getContext()));
        getContext().setDeveloperId(null);
    }

}

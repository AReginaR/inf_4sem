package TaskManager.states;

import TaskManager.State;
import TaskManager.Task;

public class InProgress extends State {
    public InProgress(Task task) {
        super(task);
    }

    @Override
    public State copy() {
        InProgress progress = new InProgress(InProgress.this.getContext());
        return progress;
    }


    @Override
    public void up(Object... param) {
        getContext().setState(new Resolved(getContext()));
    }

    @Override
    public void down(Object... param) {
        getContext().setState(new Assigned(getContext()));
    }
}

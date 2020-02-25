package TaskManager.states;

import TaskManager.State;
import TaskManager.Task;

public class Open extends State {
    public Open(Task task) {
        super(task);
    }

    @Override
    public State copy() {
        Open open = new Open(Open.this.getContext());
        return open;
    }

    @Override
    public void up(Object... params) {
        getContext().setState(new Assigned(getContext()));
        getContext().setDeveloperId((Integer)params[0]);

    }

    @Override
    public void down(Object... param) {
        getContext().setState(new Backlog(getContext()));
    }

}

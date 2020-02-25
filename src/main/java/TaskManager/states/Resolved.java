package TaskManager.states;

import TaskManager.State;
import TaskManager.Task;


public class Resolved extends State {
    public Resolved(Task task) {
        super(task);
    }

    @Override
    public State copy() {
        Resolved r = new Resolved(Resolved.this.getContext());
        return r;
    }

    @Override
    public void up(Object... param) {
        getContext().setState(new  Testing(getContext()));
        getContext().setTesterId((Integer)param[0]);
    }

    @Override
    public void down(Object... param) {}

}

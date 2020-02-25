package TaskManager.states;

import TaskManager.State;
import TaskManager.Task;

public class Testing extends State {
    public Testing(Task task) {
        super(task);
    }

    @Override
    public State copy() {
        Testing t = new Testing(Testing.this.getContext());
        return t;
    }

    @Override
    public void up(Object... param) {
        getContext().setState(new Closed(getContext()));
        getContext().setTesterId(null);
        getContext().setDeveloperId(null);
    }
    @Override
    public void down(Object... param) {
        getContext().setState(new Assigned(getContext()));
        getContext().setError((String) param[0]);
    }


}

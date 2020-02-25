package TaskManager;


public abstract class State {
    Task task;

    public Task getContext(){
        return task;
    }

    public State(Task task) {
        this.task = task;
    }

    public abstract State copy();

    public abstract void up(Object... param); //
    public abstract void down(Object... param); //

    ///
}

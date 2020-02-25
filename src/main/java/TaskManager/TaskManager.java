package TaskManager;

public class TaskManager {

    StateMachine tasks;

    public void up(Integer id, Object... params){
        tasks.getList().get(id).getState().up(params);
    }

    public void down(Integer id, Object... params){
        tasks.getList().get(id).getState().down(params);
    }
}

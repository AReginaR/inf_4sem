package TaskManager;

public class Task{
    private Integer id;
    private Integer developerId;
    private Integer testerId;
    private String text;
    private String error;
    private State state;

    public Task(String text) {
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(Integer developerId) {
        this.developerId = developerId;
    }

    public Integer getTesterId() {
        return testerId;
    }

    public void setTesterId(Integer testerId) {
        this.testerId = testerId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Task copy(){
        Task t = new Task(Task.this.getText());
        t.setState(Task.this.getState().copy());
        t.setError(Task.this.getError());
        t.setTesterId(Task.this.getTesterId());
        t.setDeveloperId(Task.this.getDeveloperId());
        return t;
    }

    public void down(){
        state.down();
    }

    public void up(){
        state.up();
    }


}

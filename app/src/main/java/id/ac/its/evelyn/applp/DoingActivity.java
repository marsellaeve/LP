package id.ac.its.evelyn.applp;

public class DoingActivity {
    private String todo;
    private String pj;
    private String deadline;

    public DoingActivity(String todo, String pj, String deadline) {
        this.todo = todo;
        this.pj = pj;
        this.deadline = deadline;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getPj() {
        return pj;
    }

    public void setPj(String pj) {
        this.pj = pj;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}

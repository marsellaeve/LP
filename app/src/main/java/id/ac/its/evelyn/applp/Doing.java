package id.ac.its.evelyn.applp;

public class Doing {
    private String todo;
    private String pj;
    private String deadline;
    private int totaltask;
    private int donetask;

    public Doing(String todo, String pj, String deadline, int totaltask,int donetask) {
        this.todo = todo;
        this.pj = pj;
        this.deadline = deadline;
        this.totaltask=totaltask;
        this.donetask=donetask;
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

    public int getTotaltask() {
        return totaltask;
    }

    public int getDonetask() {
        return donetask;
    }

    public void setDonetask(int donetask) {
        this.donetask = donetask;
    }

    public void setTotaltask(int totaltask) {
        this.totaltask = totaltask;
    }
}

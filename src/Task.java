

public class Task {
    private int index;
    private int time;
    private int interest;

    public Task(int index , int time, int interest){
        this.index = index;
        this.time = time;
        this.interest = interest;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return String.format("[index:%d time:%d interest:%d]",
                getIndex(),getTime(),getInterest());
    }
}

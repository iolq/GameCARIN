package backend.backend;

public class Time {
    private Integer speed;

    public Time(){
        // 1 = play , 2 = speed*2 , 0 = stop
        this.speed = 1;
    }
    public Integer getTime(){
        return this.speed;
    }

    public void setTime(Integer speed){
        this.speed = speed;
    }
}

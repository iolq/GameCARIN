package backend.com.company;

public class Direction implements Statement{
    String move;

    Direction(String move){
        this.move = move;
    }
    @Override
    public void eval() {

    }

    @Override
    public Pair<Integer, Integer> evalPair() {
        Pair<Integer,Integer> ans = new Pair<>(0,0);
        switch (move) {
            case "Up" -> ans = new Pair<>(0,60);
            case "Down" -> ans = new Pair<>(0,-60);
            case "Left" -> ans = new Pair<>(-60,0);
            case "Right" -> ans = new Pair<>(60,0);
            case "UpRight" -> ans = new Pair<>(60,60);
            case "UpLeft" -> ans = new Pair<>(-60,60);
            case "DownRight" -> ans = new Pair<>(60,-60);
            case "DownLeft" -> ans = new Pair<>(-60,-60);
        }
        return ans;
    }

}

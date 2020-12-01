package models;

public class Action {

    public enum ActionType {
        reinforce, attack, nothing
    }

    private final ActionType type;
    private final Board.BoardCell start;
    private final Board.BoardCell target;

    public Action(ActionType type, Board.BoardCell start, Board.BoardCell target) {
        this.type = type;
        this.start = start;
        this.target = target;
    }

    public ActionType getType() {
        return type;
    }

    public Board.BoardCell getStart() {
        return start;
    }

    public Board.BoardCell getTarget() {
        return target;
    }

    @Override
    public String toString() {
        return "Action{" +
                "type=" + type +
                ", start=" + start +
                ", target=" + target +
                '}';
    }

    public String toJson(){
        if(this.type != ActionType.nothing){
            return "{\"type\":\"" + this.type.toString() +
                    "\",\"start\":{\"row\":" + this.start.row + ",\"col\":" + this.start.col + "}" +
                    ",\"target\":{\"row\":" + this.target.row + ",\"col\":" + this.target.col + "}" +
                    "}";
        } else {
            return "{\"type\":\"" + this.type.toString() + "\"}";
        }
    }
}

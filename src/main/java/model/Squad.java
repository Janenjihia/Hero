package model;

public class Squad {
    private String squadName;
    private int maxSize;
    private String cause;
    private int squadCode;


    public Squad(String squadName, int maxSize, String cause,int squadCode) {
        this.squadName=squadName;
        this.maxSize=maxSize;
        this.cause=cause;
        this.squadCode=squadCode;
    }

    public String getSquadName() {
        return squadName;
    }
}

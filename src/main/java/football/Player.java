package football;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;
    private boolean error=false;

    public boolean noError() {
        return !error;
    }

    public void setName(String name) {
        if ( (name==null) || (name.isEmpty()) || (name.trim().length()==0)) {
            System.out.println("A name should not be empty.%n");
            this.error=true;
        }
        else {
            this.name = name;

        }
    }
    public String getName(){
        return name;
    }

    public void setEndurance(int endurance) {
        if (checkStat("Endurance", endurance))
            this.endurance = endurance;
        else
            this.error=true;
    }
    public int getEndurance(){
        return endurance;
    }
    public void  setSprint(int sprint) {
        if (checkStat("Sprint", sprint))
            this.sprint = sprint;
        else
            this.error=true;
    }
    public int getSprint(){
        return sprint;
    }

    public void setDribble(int dribble) {
        if (checkStat("Dribble", dribble))
            this.dribble = dribble;
        else
            this.error=true;
    }

    public int getDribble(){
        return dribble;
    }

    public void setPassing(int passing) {
        if (checkStat("Passing", passing))
            this.passing = passing;
        else
            this.error=true;
    }
    public int getPassing(){
        return passing;
    }
    public void setShooting(int shooting) {
        if (checkStat(" Shooting", shooting))
            this.shooting = shooting;
        else
            this.error=true;
    }
    public int getShooting(){
        return shooting;
    }

    private static boolean checkStat(String statType, int statValue) {
        if ((statValue < 0) || (statValue > 100)) {
            System.out.printf("%s should be between 0 and 100.%n", statType);
          return false;
        }
       return true;
    }


    public double calcAvgSkills(){
       return (double) (getDribble() + getEndurance() + getPassing() + getShooting() + getSprint()) / 5;
    }

    public Player(String name,int endurance, int  sprint, int dribble, int passing, int shooting  ){
           setName(name);
           setEndurance(endurance);
           setSprint(sprint);
           setDribble(dribble);
           setPassing(passing);
           setShooting(shooting);
    }
    public Player(String name){
        setName(name);
    }
}

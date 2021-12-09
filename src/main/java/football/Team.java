package football;

import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> teamPlayers=new ArrayList<>();
    private boolean error=false;

    public boolean hasError() {
        return error;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ( (name==null) || (name.isEmpty()) || (name.trim().length()==0)) {
            System.out.println("A name should not be empty.%n");
            this.error = true;
        }
        else
           this.name = name;
    }

    public double getRating() {
        double rating = 0.00;
        for (Player player :
                this.teamPlayers) {
            rating = rating + player.calcAvgSkills();
        }
        if (!this.teamPlayers.isEmpty())
          return  rating/this.teamPlayers.size();
        else
          return 0.00;
    }



    public void addPlayer(Player player){
        teamPlayers.add(player);
    }
    public void removePlayer(@NotNull Player player){
        int idx= findPlayerByName(player.getName());
        if (idx>=0)
            teamPlayers.remove(idx);
        else
            System.out.printf("Player %s is not in %s team.%n",player.getName(),this.getName());
    }

    public int findPlayerByName(String name){

        for (int i = 0; i < teamPlayers.size(); i++)
            if (teamPlayers.get(i).getName().equals(name))
                return i;
        return -1;
    }
    public Team (String name){
        setName(name);
    }

}

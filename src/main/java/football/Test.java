package football;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Team> teams=new ArrayList<>() ;
        Scanner scn = new Scanner(System.in);
        System.out.println("Dream Team -input commands");
        String commandStr = "";
        int idxTeam;
        String teamName;
        Team team;
        Player player;

        while (!commandStr.equals("END")) {
            commandStr = scn.nextLine();
            String[] tmp = commandStr.split(";");
            if (tmp.length >= 2) {
                teamName = tmp[1];
                idxTeam = findTeamByName(teams, teamName);

                if ((idxTeam < 0) && (!tmp[0].equals("Team"))) {
                    System.out.printf("Team %s does not exist.%n", teamName);
                }

                switch (tmp[0]) {
                    case "Team":
                        team = new Team(teamName);
                        if (team.hasError())
                            break;
                        if (idxTeam >= 0) {
                            teams.remove(idxTeam);
                        }

                        teams.add(team);
                        break;

                    case "Add":
                        if (idxTeam >= 0) {
                            if (tmp.length == 8) {
                                player = new Player(tmp[2],
                                        Integer.parseInt(tmp[3]),
                                        Integer.parseInt(tmp[4]),
                                        Integer.parseInt(tmp[5]),
                                        Integer.parseInt(tmp[6]),
                                        Integer.parseInt(tmp[7])
                                );
                                if (!player.hasError())
                                    teams.get(idxTeam).addPlayer(player);
                            } else
                                System.out.printf("Incorrect command line.%n");
                        }
                        break;

                    case "Remove":
                        if (idxTeam >= 0) {
                            if (tmp.length == 3) {
                                player = new Player(tmp[2]);
                                if (!player.hasError())
                                    teams.get(idxTeam).removePlayer(player);
                            } else
                                System.out.printf("Incorrect command line.%n");
                        }
                        break;

                    case "Rating":
                        if (idxTeam >= 0) {
                            System.out.printf("%s - %d", teams.get(idxTeam).getName(), Math.round(teams.get(idxTeam).getRating()));
                        }
                        break;

                    default:
                        System.out.println("Unknown command!%n");
                }

            }
        }
    }


    public static int findTeamByName(@NotNull ArrayList<Team> teams, String name) {

        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).getName().equals(name))
                return i;
        }
        return -1;
    }


}


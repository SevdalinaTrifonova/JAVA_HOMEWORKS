package football;


import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        ArrayList<Team> teams = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        System.out.println("Dream Team -input commands");
        String commandStr = "";
        int idxTeam ;
        String teamName;

        while (!commandStr.equals("END")) {
            commandStr = scn.nextLine();
            String[] tmp = commandStr.split(";");
            if (tmp.length < 2) break;
            teamName = tmp[1];
            idxTeam = findTeamByName(teams, teamName);
            if ((idxTeam < 0) && (!tmp[0].equals("Team"))) {
                System.out.printf("Team %s does not exist.%n", teamName);

            }
            switch (tmp[0]) {
                case "Team" -> addTeam(teams, idxTeam, teamName);
                case "Add" -> addPlayer(teams, idxTeam, tmp);
                case "Remove" -> removePlayer(teams, idxTeam, tmp);
                case "Rating" -> System.out.printf("%s - %d", teams.get(idxTeam).getName(), Math.round(teams.get(idxTeam).getRating()));
                default -> System.out.println("Unknown command!%n");
            }
        }


    }


    private static int findTeamByName(ArrayList<Team> teams, String teamName) {
        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).getName().equals(teamName))
                return i;
        }
        return -1;
    }

    private static void addPlayer(ArrayList<Team> teams, int idxTeam, String[] tmp) {
        if (tmp.length != 8) {
            System.out.printf("Incorrect command line.%n");
        } else {
            Player player = new Player(tmp[2],
                    Integer.parseInt(tmp[3]),
                    Integer.parseInt(tmp[4]),
                    Integer.parseInt(tmp[5]),
                    Integer.parseInt(tmp[6]),
                    Integer.parseInt(tmp[7])
            );
            if (player.noError()) teams.get(idxTeam).addPlayer(player);
        }
    }

    private static void addTeam(ArrayList<Team> teams, int idxTeam, String teamName) {
        if ((idxTeam < 0) ) {
            Team team = new Team(teamName);
            if (!team.hasError())
                teams.add(team);

        }
    }

    private static void removePlayer(ArrayList<Team> teams, int idxTeam, String[] tmp){
    if (tmp.length == 3) {
        Player player = new Player(tmp[2]);
        if (player.noError())
            teams.get(idxTeam).removePlayer(player);
    } else
            System.out.printf("Incorrect command line.%n");
    }
}


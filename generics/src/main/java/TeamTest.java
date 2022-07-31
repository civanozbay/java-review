public class TeamTest {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

//        Team liverpool = new Team("Liverpool");

        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");

//        Team<String> brokenTeam = new Team<>("this wont work");


        // we use GENERIC(<T>) because for the team of liverpool we are able to add any player to team. We don't want to mix
        // the players. If you create a team this team has to only include football,baseball or soccer. !!

//        liverpool.addPlayer(joe);
//        liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);

        System.out.println(liverpool.numPlayers());

    }
}

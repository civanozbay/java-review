import java.util.ArrayList;
// WHEN WE CREATE A TEAM WE WANT ACCEPT TYPES FROM JUST PLAYER THATS WHY WE DEFINED AS "TEAM<T EXTENDS PLAYER> OTHERWISE
// IF YOU PUT JUST "TEAM<T>" IT WILL ACCEPT EVERY TYPE WHEN YOU CREATE A TEAM
public class Team<T extends Player> {

    private String name;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already on this team");
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }
}

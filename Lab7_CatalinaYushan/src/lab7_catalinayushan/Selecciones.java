package lab7_catalinayushan;

public class Selecciones {
    char group;
    String country;
    String director;
    int players;
    String WorldCup;
    String position;
    int goals;

    public Selecciones(char group, String country, String director, int players, String WorldCup, String position, int goals) {
        this.group = group;
        this.country = country;
        this.director = director;
        this.players = players;
        this.WorldCup = WorldCup;
        this.position = position;
        this.goals = goals;
    }
    
    public Selecciones() {
        
    }

    public char getGroup() {
        return group;
    }

    public void setGroup(char group) {
        this.group = group;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public String getWorldCup() {
        return WorldCup;
    }

    public void setWorldCup(String WorldCup) {
        this.WorldCup = WorldCup;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }
    
    
    
    
}
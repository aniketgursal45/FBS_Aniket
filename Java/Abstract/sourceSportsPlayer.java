package s;

abstract class SportsPlayer {
    String name, team;
    int matches, awards;

    SportsPlayer() {
        super();
        this.name = "Unknown";
        this.team = "No Team";
        this.matches = 0;
        this.awards = 0;
    }

    SportsPlayer(String a, String b, int c, int d) {
        super();
        this.name = a;
        this.team = b;
        this.matches = c;
        this.awards = d;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getTeam() {
        return team;
    }

    void setTeam(String team) {
        this.team = team;
    }

    int getMatches() {
        return matches;
    }

    void setMatches(int matches) {
        this.matches = matches;
    }

    int getAwards() {
        return awards;
    }

    void setAwards(int awards) {
        this.awards = awards;
    }
    public abstract String toString();
    void play() {
        System.out.println("Player is playing the sport...");
    }
} // SportsPlayer super class ends here


class CricketPlayer extends SportsPlayer {
    int runs, wickets;

    CricketPlayer() {
        super();
        this.runs = 0;
        this.wickets = 0;
    }

    CricketPlayer(String name, String team, int matches, int awards, int a, int b) {
        super(name, team, matches, awards);
        this.runs = a;
        this.wickets = b;
    }

    int getRuns() {
        return runs;
    }

    void setRuns(int runs) {
        this.runs = runs;
    }

    int getWickets() {
        return wickets;
    }

    void setWickets(int wickets) {
        this.wickets = wickets;
    }
    public String toString() {
    	return "Player Name: " + this.name + " Team Name: " + this.team + " Matches Played: " + this.matches + " Awards Won: " + this.awards + " Total Runs: " + this.runs + " Total Wickets: " + this.wickets;

    }
    void play() {
        System.out.println("Cricket player starts batting");
    }
} // CricketPlayer subclass ends here


class FootballPlayer extends SportsPlayer {
    int goals;

    FootballPlayer() {
        super();
        this.goals = 0;
    }

    FootballPlayer(String name, String team, int matches, int awards, int a) {
        super(name, team, matches, awards);
        this.goals = a;
    }

    int getGoals() {
        return goals;
    }

    void setGoals(int goals) {
        this.goals = goals;
    }

    public String toString() {
    	return "Player Name: " + this.name + " Team Name: " + this.team + " Matches Played: " + this.matches + " Awards Won: " + this.awards + " Total Goals: " + this.goals;
    }
    void play() {
        System.out.println("Football player kicks the ball ⚽");
    }
} // FootballPlayer subclass ends here


class testSportsPlayer {
    public static void main(String[] args) {
    	SportsPlayer s1;
        s1= new CricketPlayer("Rohit Sharma", "India", 350, 25, 12000, 4);
        s1.play();
        System.out.println(s1);
    	System.out.println();
        s1= new FootballPlayer("Lionel Messi", "Argentina", 400, 30, 150);
        s1.play();
        System.out.println(s1);
    	System.out.println();
    }
}

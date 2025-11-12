package defence;

class SportsPlayer {
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

    void display() {
        System.out.println("Player Name :- " + this.name);
        System.out.println("Team Name :- " + this.team);
        System.out.println("Matches Played :- " + this.matches);
        System.out.println("Awards Won :- " + this.awards);
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

    void display() {
        super.display();
        System.out.println("Total Runs :- " + this.runs);
        System.out.println("Total Wickets :- " + this.wickets);
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

    void display() {
        super.display();
        System.out.println("Total Goals :- " + this.goals);
    }
} // FootballPlayer subclass ends here


class testSportsPlayer {
    public static void main(String[] args) {
        CricketPlayer c1 = new CricketPlayer();
        CricketPlayer c2 = new CricketPlayer("Rohit Sharma", "India", 350, 25, 12000, 4);

        FootballPlayer f1 = new FootballPlayer();
        FootballPlayer f2 = new FootballPlayer("Lionel Messi", "Argentina", 400, 30, 150);

        System.out.println("Cricket Player");
        System.out.println();
        c1.display();
        System.out.println();
        c2.display();
        System.out.println();
        System.out.println("Football Player");
        System.out.println();
        f1.display();
        System.out.println();
        f2.display();
        System.out.println();
    }
}

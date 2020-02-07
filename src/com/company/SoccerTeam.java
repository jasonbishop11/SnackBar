package com.company;

public class SoccerTeam {

    int wins,losses,ties = 0;
    static int goals, gamesPlayed = 0;

    public SoccerTeam(){

    }

    public void played(SoccerTeam other, int myScore, int otherScore){
        if(myScore>otherScore){
            this.wins++;
            other.losses++;
        }else if(myScore<otherScore){
            this.losses++;
            other.wins++;
        }else{
            this.ties++;
            other.ties++;
        }
        goals+=myScore+otherScore;
        gamesPlayed++;
    }

    public int getPoints(){
        return (this.wins*3)+(this.ties);
    }

    public void reset(){
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
    }

    public int getGoals(){
        return goals;
    }

    public int getGamesPlayed(){
        return gamesPlayed;
    }

    public static void startTournament(){
        goals = 0;
        gamesPlayed = 0;
    }

    public static void main(String[] args){
        SoccerTeam team1 = new SoccerTeam();
        SoccerTeam team2 = new SoccerTeam();
        SoccerTeam team3 = new SoccerTeam();
        SoccerTeam team4 = new SoccerTeam();

        team1.played(team3, 10, 2);
        team2.played(team4, 2, 3);
        team3.played(team4, 2, 2);
        team2.played(team1, 0, 4);

        System.out.println("Points:");
        System.out.println(team1.getPoints());
        System.out.println(team2.getPoints());
        System.out.println(team3.getPoints());
        System.out.println(team4.getPoints());
        System.out.println();

        System.out.println("Games Played: " + SoccerTeam.gamesPlayed);
        System.out.println("Goals Scored: " + SoccerTeam.goals);

        SoccerTeam.startTournament();

        team1.played(team3, 1, 6);
        team2.played(team4, 3, 5);
        team3.played(team4, 0, 0);
        team2.played(team1, 1, 4);

        System.out.println("Points:");
        System.out.println(team1.getPoints());
        System.out.println(team2.getPoints());
        System.out.println(team3.getPoints());
        System.out.println(team4.getPoints());
        System.out.println();

        System.out.println("Games Played: " + SoccerTeam.gamesPlayed);
        System.out.println("Goals Scored: " + SoccerTeam.goals);
    }
}
/*
Output:
Points:
6
0
1
4

Games Played: 4
Goals Scored: 25
Points:
9
0
5
8

Games Played: 4
Goals Scored: 20
 */
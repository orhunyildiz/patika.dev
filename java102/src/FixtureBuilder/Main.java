package FixtureBuilder;

public class Main {
    public static void main(String[] args) {
        Teams teams = new Teams();
        teams.teamList.add("Galatasaray");
        teams.teamList.add("Fenerbahçe");
        teams.teamList.add("Beşiktaş");
        teams.teamList.add("Trabzonspor");
        teams.teamList.add("Bursaspor");
        //teams.teamList.add("Başakşehir");
        teams.leagueFixture();
    }
}

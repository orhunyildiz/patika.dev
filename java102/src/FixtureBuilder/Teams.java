package FixtureBuilder;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Teams {
    List<String> teamList = new LinkedList<>();

    public void leagueFixture() {
        if (teamList.size() % 2 != 0)
            teamList.add("Bay");
        if (teamList.size() != 0) {
            System.out.println("*** The Teams ***");
            for (String s : teamList)
                System.out.println("-" + s);
        } else {
            System.out.println("There are no teams!");
        }
        System.out.println();
        round();
    }

    private void round() {
        List<String> weekList = new LinkedList<>();
        int round = 2 * (teamList.size() - 1);
        List<String> backupList = new LinkedList<>(teamList);
        int value = teamList.size() / 2;

        for (int i = 1; i < round / 2 + 1; i++) {
            for (int j = 0; j <= value + 2; j += 2) {
                weekList.add(backupList.get(j) + " - " + backupList.get(j + 1));
            }

            backupList.add(1, backupList.get(value));
            backupList.add(value, backupList.get(backupList.size() - 1));
            backupList.remove(backupList.size() - 1);
            backupList.remove(backupList.size() - 2);
        }

        for (int i = round / 2 + 2; i <= round + 1; i++) {
            for (int j = 0; j <= value + 2; j += 2) {
                weekList.add(backupList.get(j + 1) + " - " + backupList.get(j));
            }

            backupList.add(1, backupList.get(value));
            backupList.add(value, backupList.get(backupList.size() - 1));
            backupList.remove(backupList.size() - 1);
            backupList.remove(backupList.size() - 2);
        }
        int count = 0;
        int num;

        for (int i = 1; i <= round; i++) {
            System.out.println("*** Round " + i + " ***");
            List<String> backup = new LinkedList<>();
            for (int j = count; j < count + value; j++)
                backup.add(weekList.get(j));
            for (int k = 0; k < value; k++) {
                num = new Random().nextInt(backup.size());
                System.out.println(backup.get(num));
                backup.remove(num);
            }
            count += value;
        }
    }
}

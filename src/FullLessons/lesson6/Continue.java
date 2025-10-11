package FullLessons.lesson6;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Начало: " + i);

            if (i == 3) {
                continue; //ep or i == 3, tki @nkac kod@ konkret es cikli vaxt chi tpe el "Конец + i"
                //bayc arten muysic epor i==4 erkusne eli k tpe, aysinqn konkret iteracyan krna kangncne uzact texum
            }

            System.out.println("Конец: " + i); }

        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == j) {
                    continue outer;    //metkov (outer-ov) ogtagorceluc ham nerkin cikl@ k kangncne et ketin, ham arajin
                                       // u meankamic kancni hajord "i"-in
                }
                System.out.println(i + "," + j);
            }
        }

    }
}

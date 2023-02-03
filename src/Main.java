public class Main {
    public static void main(String[] args) {

        //initializing array with trainings
        Training[] thisWeekTrainings = {new Running(110, 60, 100, 10),
                new Running(90, 45, 50, 5),
                new Crossfit(120, 120, 90,50),
                new Boxing(130, 30, 150)};

        //writing info about trainings into console
        for (Training training : thisWeekTrainings) {
            System.out.println(training.writeInfo());
        }

    }
}

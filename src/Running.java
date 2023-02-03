public class Running extends Training {

    private final int distance;

    public Running(int averageHeartRate, int trainingTime, double sportsmanWeight, int distance) {
        super(averageHeartRate, trainingTime, sportsmanWeight);
        this.distance = distance;
    }

    @Override
    String writeInfo() {
        return "Беговая тренировка! Длительность: " + super.getTrainingTime() +
                "минут. Дистанция: " + distance + "км. Килокалорий: " + countCaloriesPerTrain();
    }
}

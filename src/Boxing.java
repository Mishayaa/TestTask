public class Boxing extends Training {

    public Boxing(int averageHeartRate, int trainingTime, double sportsmanWeight) {
        super(averageHeartRate, trainingTime, sportsmanWeight);
    }

    @Override
    String writeInfo() {
        return "Тренировка по кикбоксингу! Длительность: " + super.getTrainingTime() +
                "минут. Килокалорий: " + countCaloriesPerTrain();
    }
}

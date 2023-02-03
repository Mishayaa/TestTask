public class Crossfit extends Training {

    private final int MAX_PROJECTILE_WEIGHT;

    public Crossfit(int averageHeartRate, int trainingTime, double sportsmanWeight, int MAX_PROJECTILE_WEIGHT) {
        super(averageHeartRate, trainingTime, sportsmanWeight);
        this.MAX_PROJECTILE_WEIGHT = MAX_PROJECTILE_WEIGHT;
    }

    @Override
    String writeInfo() {
        return "Кроссфит тренировка! Длительность: " + super.getTrainingTime() +
                "минут. Средний вес штанги: " + MAX_PROJECTILE_WEIGHT + "кг. Килокалорий: " + countCaloriesPerTrain();
    }
}

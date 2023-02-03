public abstract class Training {

    private final int averageHeartRate;
    private final int trainingTime;
    private final double sportsmanWeight;

    public Training(int averageHeartRate, int trainingTime, double sportsmanWeight) {
        this.averageHeartRate = averageHeartRate;
        this.trainingTime = trainingTime;
        this.sportsmanWeight = sportsmanWeight;
    }

    public int getTrainingTime() {
        return trainingTime;
    }

    //calculate calories
    double countCaloriesPerTrain() {
        return 0.014 * sportsmanWeight * trainingTime * (0.12 * averageHeartRate - 7);
    }

    abstract String writeInfo();

}

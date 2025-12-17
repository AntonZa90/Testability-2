public class BmiService {
    public int calculate(float heightInMetre, int weightInKilogram) {
        int bmi = (int) (weightInKilogram / Math.pow(heightInMetre, 2));
        return bmi;
    }
}

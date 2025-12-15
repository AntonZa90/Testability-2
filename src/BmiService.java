public class BmiService {
public int calculate (float height, int weight) {
int bmi = (int) (weight / Math.pow(height, 2));
return bmi;
}
}

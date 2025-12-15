public class main {
    public static void main(String[] args) {
BmiService service = new BmiService();
float hight = 1.87f;
int weight = 98;
int bmi = service.calculate(hight,weight);
System.out.println(bmi);

    }
}

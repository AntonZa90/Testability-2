public class main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float hightInMetre = 1.87f;
        int weightInKilogram = 98;
        int bmi = service.calculate(hightInMetre, weightInKilogram);
        System.out.println(bmi);

    }
}

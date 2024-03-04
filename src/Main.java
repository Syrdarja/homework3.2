public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 21;
        double heightM = 1.1;
        int index = service.calculate(weightKg, heightM);
        System.out.println(index);

    }
}

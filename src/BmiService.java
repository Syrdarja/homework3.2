public class BmiService {
    public int calculate(int weightKg, double heightM) {
        double bmi = weightKg / (heightM * heightM);
        int index = (int) bmi;
        return index;
    }

}

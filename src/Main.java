public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService ();

        double weight = 55;
        double heigth = 1.69;

        double index = bmiService.calculate(weight, heigth);

        System.out.printf("Индекс массы тела %.1f", index);
    }
}
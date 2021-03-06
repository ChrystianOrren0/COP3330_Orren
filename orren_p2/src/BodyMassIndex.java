public class BodyMassIndex {

    public static double bmi1;
    public static double total;
    public static double size;

    public BodyMassIndex(double height, double weight) {
         bmi1 = 703 * (weight/(height * height));
         total += bmi1;
         size++;
    }

    public static int Category(){
        if(bmi1 < 18.5) {
            System.out.println("Category: Underweight");
            return 1;
        }
        else if(bmi1 >= 18.5 & bmi1 < 25) {
            System.out.println("Category: Normal");
            return 2;
        }
        else if(bmi1 > 25 & bmi1 < 30) {
            System.out.println("Category: Overweight");
            return 3;
        }
        else {
            System.out.println("Category: Obese");
            return 4;
        }
    }
}

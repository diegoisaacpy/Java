public class OverloadedMethodChallenge {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(1));
        System.out.println(convertToCentimeters(5,11 ));
    }
    public static double convertToCentimeters(int in){
        return in * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches){
        int total_inches = inches + (feet * 12);
        return convertToCentimeters(total_inches);
    }
}

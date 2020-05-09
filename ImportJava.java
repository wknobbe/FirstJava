public class ImportJava {
    public static void main(String[] args) {
        Pythagorean side = new Pythagorean();
        double longSide = side.calculateHypotenuse(9, 16);
        System.out.println(longSide);
    }
}
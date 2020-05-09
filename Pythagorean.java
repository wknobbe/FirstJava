public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB){
        double sumOfSquares = (legA * legA) + (legB *legB);
        double hypotenuse = Math.sqrt(sumOfSquares);
        return hypotenuse;
    }
}
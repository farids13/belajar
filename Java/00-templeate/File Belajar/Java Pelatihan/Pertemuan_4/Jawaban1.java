public class Jawaban1 {
    public static void main(String[] args) {
        SimpleCalculator FaridKal = new SimpleCalculator();
        FaridKal.setFirtsNumber(24);
        FaridKal.setSecondNumber(13);
        System.out.println("First Number = " +FaridKal.getFirstNumber());
        System.out.println("Second Number = "+FaridKal.getSecondNumber());
        System.out.println("Hasil Penambahan = "+FaridKal.getAdditionResult());
        System.out.println("Hasil Pengurangan = "+FaridKal.getSubstractionResult());
        System.out.println("Hasil Perkalian = "+FaridKal.getMultiplicationResult());
        System.out.println("Hasil Pembagian = "+FaridKal.getDivisionResult());
        FaridKal.setSecondNumber(0);
        System.out.println("Hasil Pembagian If 0 = " + FaridKal.getDivisionResult());
    }
}
class SimpleCalculator {
    private double firstNumber, secondNumber;

    public double getFirstNumber(){return this.firstNumber;}
    public double getSecondNumber(){return this.secondNumber; }
    public void setFirtsNumber(double firstNumber){this.firstNumber = firstNumber;}
    public void setSecondNumber(double secondNumber){this.secondNumber = secondNumber;}
    public double getAdditionResult(){return (this.firstNumber + this.secondNumber);}
    public double getSubstractionResult () {return (this.firstNumber - this.secondNumber);}
    public double getMultiplicationResult() {return (this.firstNumber * this.secondNumber);}
    public double getDivisionResult() {
        if (this.secondNumber == 0) return 0;
        else return (this.firstNumber / this.secondNumber);
    }
}

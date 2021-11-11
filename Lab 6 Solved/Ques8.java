public class Ques8{

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int add(int[] intArray){
        int sum = 0;
        for(int x : intArray){
            sum += x;
        }
        return sum;
    }

    public static double add(double[] doubleArray){
        double sum = 0;
        for(double x : doubleArray){
            sum += x;
        }
        return sum;
    }

    public static String complexNumber(ComplexNumber num1, ComplexNumber num2){
        long complex = num1.getComplex() + num2.getComplex();
        long imaginary = num1.getImaginary() + num2.getImaginary();
        return complex+"+"+imaginary+"i";
    }
}

class ComplexNumber{
    int complex;
    int imaginary;

    public int getComplex() {
        return complex;
    }

    public void setComplex(int complex) {
        this.complex = complex;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }
}

class TestQues8{
    public static void main(String[] args) {
        System.out.println(Ques8.add(2,6));

        int[] intArray = {2, 6, 6, 5, 6};
        System.out.println(Ques8.add(intArray));

        double[] doubleArray = {1.6,2.7,4.5,6.7,8.7};
        System.out.println(Ques8.add(doubleArray));

        ComplexNumber complexNumber1 = new ComplexNumber();
        complexNumber1.setComplex(45);
        complexNumber1.setImaginary(15);
        ComplexNumber complexNumber2 = new ComplexNumber();
        complexNumber2.setComplex(61);
        complexNumber2.setImaginary(21);
        System.out.println(Ques8.complexNumber(complexNumber1,complexNumber1));

}
}
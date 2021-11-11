public class Ques7{

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

    public static ComplexNumber complexNumber(ComplexNumber num1, ComplexNumber num2){
        int complex = num1.getComplex() + num2.getComplex();
        int imaginary = num1.getImaginary() + num2.getImaginary();
        System.out.println(complex+"+"+imaginary+"i");
        ComplexNumber c =new ComplexNumber(complex,imaginary);
        return c;
    }
}

class ComplexNumber{
    int complex;
    int imaginary;

    public ComplexNumber(int complex, int imaginary){
        this.complex = complex;
        this.imaginary = imaginary;
    }

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

class TestQues7{
    public static void main(String[] args) {
        System.out.println(Ques7.add(2,6));

        int[] intArray = {2, 6, 6, 5, 6};
        System.out.println(Ques7.add(intArray));

        double[] doubleArray = {1.6,2.7,4.5,6.7,8.7};
        System.out.println(Ques7.add(doubleArray));

        ComplexNumber complexNumber1 = new ComplexNumber(15,45);
        ComplexNumber complexNumber2 = new ComplexNumber(61,21);
        Ques7.complexNumber(complexNumber1,complexNumber2);
    }
}
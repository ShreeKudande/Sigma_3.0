//Q2 --> Ans = B. Driving electric car

//Q3 --> Ans = B. public and protected both can be used.

//Q4 --> Ans = C. 13245

//Q5 --> https://www.w3schools.com/java/java_try_catch.asp

import java.util.Scanner;

public class PracticeSolutions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first complex number
        System.out.println("--- First Complex Number ---");
        System.out.print("Enter the real part: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter the imaginary part: ");
        double imag1 = scanner.nextDouble();
        Complex c1 = new Complex(real1, imag1);

        // Get the second complex number
        System.out.println("\n--- Second Complex Number ---");
        System.out.print("Enter the real part: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter the imaginary part: ");
        double imag2 = scanner.nextDouble();
        Complex c2 = new Complex(real2, imag2);

        // Display the entered numbers
        System.out.println("\n--- Operations & Results ---");
        System.out.print("Number 1: ");
        c1.display();
        System.out.print("Number 2: ");
        c2.display();
        System.out.println("----------------------------");

        // Perform operations and print results
        Complex sum = c1.add(c2);
        System.out.print("Sum        : ");
        sum.display();

        Complex difference = c1.subtract(c2);
        System.out.print("Difference : ");
        difference.display();

        Complex product = c1.multiply(c2);
        System.out.print("Product    : ");
        product.display();

        // Close the scanner to prevent memory leaks
        scanner.close();
    }

    private static class Complex {
        private double real;
        private double imaginary;

        public Complex(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        public Complex add(Complex other) {
            double newReal = this.real + other.real;
            double newImaginary = this.imaginary + other.imaginary;
            return new Complex(newReal, newImaginary);
        }

        public Complex subtract(Complex other) {
            double newReal = this.real - other.real;
            double newImaginary = this.imaginary - other.imaginary;
            return new Complex(newReal, newImaginary);
        }

        public Complex multiply(Complex other) {
            double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
            double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
            return new Complex(newReal, newImaginary);
        }

        public void display() {
            if (imaginary >= 0) {
                System.out.println(real + " + " + imaginary + "i");
            } else {
                System.out.println(real + " - " + Math.abs(imaginary) + "i");
            }
        }
    }
}
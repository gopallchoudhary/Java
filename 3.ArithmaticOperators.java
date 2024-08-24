class ArithmaticOperators{
    public static void main(String args[]) {
        int num1 = 19;
        int num2 = 8;
        int sum = num1 + num2; //*Addition
        int minus = num1 - num2; //*Subtraction
        int mul = num1 * num2; //*Multiplication
        int div = num1 / num2; //*Division
        int modulus = num1 % num2; //*Remainder
        // System.out.println("Sum is " + sum);
        // System.out.println("Diff. is " + minus);
        // System.out.println("Multiplication is " + mul);
        // System.out.println("Division is " + div);
        // System.out.println("Remainder is " + modulus);

        int num = 7;
        //num += 2; //* num3 = num3 + 2

        //! pre-increment (increment and then fetch the value)
        //int result = ++num; 

        //! post-increment(fetch the value and then increment)
        int result = num++;

        
        System.out.println(result);

    }
}
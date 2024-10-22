# Math with Loops Advanced Assignment

In this assignment, you'll be writing a few methods to calculate some MORE math methods iteratively.

The first method is isPrime(). This method takes an integer as input, and returns a boolean describing whether the number is prime. The method has the following signature: public static double isPrime(int x) {}

The second method is greatestCommonDivisor(). This method takes two inputs, and returns a value for the mathematical constant e that is calculated with the following formula: e = 1/factorial(0) + 1/factorial(1) + 1/factorial(2) + 1/factorial(3) + ... + 1/factorial(infinity). You will not need to calculate the formula up to the infinity-th term, rather, you should keep adding additional terms until you end up with a value within 0.00001 of the Java Math constant Math.E. The method has the following signature: public static double calculateE() {}

The final method is babylonian(). This method takes a double as input, and returns the squareroot of that number. However, you are NOT allowed to use the Math.sqrt() method. Instead, you will use the Babylonian method to calculate the square root "by hand". Here is a description of the Babylonian Method:

// You are given a non-negative floating point number rounded to two decimal places celsius,
// that denotes the temperature in Celsius.

// You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].

// Return the array ans. Answers within 10-5 of the actual answer will be accepted.

// Note that:

// Kelvin = Celsius + 273.15
// Fahrenheit = Celsius * 1.80 + 32.00

public class TemperatureConverter{
    public double[] convertTemperature(double celsius) {
        //1. Declare the array of doubles
        double [] ans= new double[2];
        //2. Convert to kelvin and store in first element
        ans[0] = celsius + 273.15;
        //3. Convert to fahrenheit and store in second element
        ans[1] = celsius * 1.80 + 32.00;
        //4. Return the array
        return ans;
    }
}
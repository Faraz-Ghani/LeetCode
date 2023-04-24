//Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.

class smallestEvenMultiple{
public int SmallestEvenMultiple(int n) {
    int a=1,output=-1;  // Initialize variables
    while(output%2!=0 || output%n!=0 ){  // Loop until output is even and divisible by n
        output=n*a;  // Calculate output
        a++;  // Increment a
    }
    return output;  // Return output
}
}
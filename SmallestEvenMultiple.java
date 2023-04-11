//Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.

class smallestEvenMultiple{
public int SmallestEvenMultiple(int n) {
    int a=1,output=-1;
    while(output%2!=0 || output%n!=0 ){
        output=n*a;
        a++;
    }
    return output;
}
}
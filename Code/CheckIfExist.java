
// Given an array arr of integers, check if there exist two indices i and j such that :

// i != j
// 0 <= i, j < arr.length
// arr[i] == 2 * arr[j]
 
class CheckIfExist {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // loop through each element in the array
            for (int j = 0; j < arr.length; j++) { // loop through each element in the array again
                if (arr[i] == arr[j] * 2 && i != j) { // check if the current element is equal to the current element multiplied by 2 and is not the same element
                    return true; // if it is, return true
                }
            }
        }
        return false; // if nothing was returned, return false
    }
}
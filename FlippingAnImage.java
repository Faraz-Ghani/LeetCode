// Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

// To flip an image horizontally means that each row of the image is reversed.

// For example, flipping [1,1,0] horizontally results in [0,1,1].
// To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

// For example, inverting [0,1,1] results in [1,0,0].

public class FlippingAnImage {
       public int[][] flipAndInvertImage(int[][] image) {
            
            for(int i = 0 ; i<image.length; i++){ // for each row
                int b = image.length-1; // the index of the last element in the row
                int a =0; // the index of the first element in the row
                while(a<=b){ // while the first index is less than or equal to the last index
                    int temp = image[i][b]; // store the value of the last element in the row in a temporary variable
                    image[i][b] = image[i][a]; // swap the value of the first element with the last element
                    image[i][a] = temp; // store the value of the last element in the temp variable in the first element
                    a++; // increment the first index
                    b--; // decrement the last index
                }
            }

            for(int i =0 ;i<image.length;i++){ // for each row
                for(int j=0;j<image[i].length;j++){ // for each column
                    if(image[i][j]==0){ // if the value at the current index is a 0
                        image[i][j]=1; // make it a 1
                        }
                    else{ // if the value at the current index is not a 0 (it must be a 1)
                        image[i][j]=0; // make it a 0
                    }
                }
            }
            return image; // return the image
        }
    }

//The direct superclass of an array type is Object.

// Java program to demonstrate setAll() 
// and ParallelSetAll() 
import java.util.Arrays; 
import java.util.function.IntUnaryOperator; 
class setArray
{ 
    public static void main(String[] args) 
    { 
        // Declaring arrays of integers 
        int[] arr_parallel1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 
                                13, 14, 15, 16, 17, 18, 19, 20 }; 
        int[] arr_parallel2 = Arrays.copyOf(arr_parallel1, arr_parallel1.length); 
        int[] arr = Arrays.copyOf(arr_parallel1, arr_parallel1.length); 
  
        // Applying parallelSetAll on Array arr_parallel1 
        IntUnaryOperator g = e-> 
        { 
            if (e % 2 == 0) 
                return e * e; 
            else
                return e; 
        }; 
        Arrays.parallelSetAll(arr_parallel1, g); 
  
        /* Another way of passing the second argument. 
        Uncomment to try . 
        Arrays.parallelSetAll(arr_parallel1, e -> { 
        if (e % 2 == 0) 
        return e * e; 
        else 
        return e; 
        }); */
        System.out.println("Example 1: Modifying the values at even" 
        + " index and storing the square of index"); 
  
        // Printing the modified array 
        Arrays.stream(arr_parallel1).forEach(e->System.out.print(e + " ")); 
  
        // Applying parallelSetAll on Array arr_parallel2 
        Arrays.parallelSetAll(arr_parallel2, e-> 
        { 
            if (arr_parallel2[e] % 2 == 0) 
                return arr_parallel2[e] * arr_parallel2[e]; 
            else
                return arr_parallel2[e]; 
        }); 
        System.out.println("\n\nExample 2: Modifying the values when"
                        + "even value is encountered"); 
  
        // Printing the modified array 
        Arrays.stream(arr_parallel2).forEach(e->System.out.print(e + " ")); 
  
        // Applying setAll on Array arr 
        Arrays.setAll(arr, e-> 
        { 
            if (e % 2 == 0) 
                return e * e; 
            else
                return e; 
        }); 
        System.out.println("\n\nExample 3:setAll gives exactly "
                        + "same output as parallelSetAll"); 
  
        // Printing the modified array 
        Arrays.stream(arr).forEach(e->System.out.print(e + " ")); 
    } 
} 
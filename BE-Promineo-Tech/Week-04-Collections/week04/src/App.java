public class App {
    
    public static String wordRepeater(String word, int n) {
        String out_word = "";
        for (int repet = 0; repet < n; repet ++) {
            out_word = out_word + word;
        }
        return out_word;
    }

    public static String fullName(String first, String last) {
        String out_word = first + " " + last;
        return out_word;
    }

    public static boolean sum_over_hundred(int[] num_array) {
        int sum_of_elements = 0;
        for (int index = 0; index < num_array.length; index ++ ) {
            sum_of_elements += num_array[index];
        }
        boolean out_bool = (sum_of_elements > 100);
        return out_bool;
    }

    public static double avg(double[] num_array) {
        double sum_of_elements = 0;
        for (int index = 0; index < num_array.length; index ++ ) {
            sum_of_elements = sum_of_elements + num_array[index];
        }
        double out_dub = sum_of_elements / num_array.length;
        return out_dub;
    }

    public static boolean first_avg_greater_than_second(double[] first_arr, double[] second_arr) {
        boolean out_bool = (avg(first_arr) > avg(second_arr));
        return out_bool;
    }

    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        boolean out_bool = (isHotOutside == true && moneyInPocket > 10.50);
        return out_bool;
    }

    public static String str_arr_str(String[] in_string_array) {
        String out_string = "{ ";
        for (int index = 0; index < in_string_array.length; index ++ ) {
            if (index == in_string_array.length - 1) {
                out_string = out_string + "\"" + in_string_array[index] + "\"";
            } else {
                out_string = out_string + "\"" + in_string_array[index] + "\", ";
            }
        }
        out_string = out_string + " }";
        return out_string;
    }

    public static String int_arr_str(int[] in_int_array) {
        String out_string = "{ ";
        for (int index = 0; index < in_int_array.length; index ++ ) {
            if (index == in_int_array.length - 1) {
                out_string = out_string + in_int_array[index] + "";
            } else {
                out_string = out_string + in_int_array[index] + ", ";
            }
        }
        out_string = out_string + " }";
        return out_string;
    }

    public static void main(String[] args) throws Exception {

// 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        System.out.println("1. " + int_arr_str(ages) + "\n");

//     a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
        System.out.println("1a. The difference between the first (" + (ages[ages.length - 1]) + ") and the last (" + ages[0] + ") is " + (ages[ages.length - 1] - ages[0]) + " years.\n");

//     b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
        int[] ages2 = new int[9];
        System.out.println("1b. " + int_arr_str(ages2) + "\n");

//         i. Make sure that there are 9 elements of type int in this new array.  
        System.out.println("1bi. There are " + ages2.length + " elements in this new array.\n");

//         ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
        System.out.println("1bii. The difference between the first (" + (ages2[ages2.length - 1]) + ") and the last (" + ages2[0] + ") is " + (ages2[ages2.length - 1] - ages2[0]) + " years.\n");

//         iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
    
//     c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
        double sum = 0;
        for (int index = 0; index < ages.length; index ++ ) {
            sum += ages[index];
        }
        double avg = sum / ages.length;
        System.out.println("1c. The average of the ages is " + avg + "\n");

// 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

//     a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
        int char_sum = 0;
        for (int index = 0; index < names.length; index ++ ) {
            char_sum += names[index].length();
        }
        double char_avg = Double.valueOf(char_sum) / Double.valueOf(names.length);
        System.out.println("2a. The average length of the names is " + char_avg + "\n");
        
//     b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
        String concated_names = "";
        for (int index = 0; index < names.length; index ++ ) {
            concated_names = concated_names + names[index] + " ";
        }
        System.out.println("2b. " + concated_names + "\n");

// 3. How do you access the last element of any array?

// 4. How do you access the first element of any array?

// 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
        int[] nameLengths = new int[names.length];
        for (int index = 0; index < nameLengths.length; index ++ ) {
            nameLengths[index] = (names[index].length());
        }

// 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
        int sum_of_elements = 0;
        for (int index = 0; index < nameLengths.length; index ++ ) {
            sum_of_elements += nameLengths[index];
        }
        System.out.println("6. The sum of the nameLengths is " + sum_of_elements + "\n");

// 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
        System.out.println("7. " + wordRepeater("Hello", 3) + "\n");

// 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
        System.out.println("8. " + fullName("Christian", "Haroldsen") + "\n");

// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
        System.out.println("9. " + sum_over_hundred(ages) + "\n");

// 10. Write a method that takes an array of double and returns the average of all the elements in the array.
        double[] dub_array = {1.1, 1.9};
        System.out.println("10. " + avg(dub_array) + "\n");

// 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
        double[] dub_array1 = {1.1, 1.9};
        double[] dub_array2 = {1.1, 1.8};
        System.out.println("11. " + first_avg_greater_than_second(dub_array1, dub_array2) + "\n");

// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
        System.out.println("12. " + willBuyDrink(true, 10.51) + "\n");

// 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
        System.out.println("13. " + str_arr_str(names));

    }
}

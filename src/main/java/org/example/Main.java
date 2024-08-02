package org.example;

public class Main {
// Warmup StringTimes
public String stringTimes(String str, int n) {
    // Creating a StringBuilder object. It is like a flexible container where we can build and modify our final string.
    StringBuilder result = new StringBuilder();

    // We start a loop that will run 'n' times. Each time through the loop, we will add the string to our container.
    for (int i = 0; i < n; i++) {
        // We add the original string 'str' to the container 'result' during each loop iteration.
        result.append(str);
    }

    // Convert the container 'result' to a regular string and return it. This final string is the result of repeating the original string 'n' times.
    return result.toString();
}

// There solution:
//public String stringTimes(String str, int n) {
//    String result = "";
//    for (int i=0; i<n; i++) {
//        result = result + str;  // could use += here
//    }
//    return result;
//}

//doubleX
public boolean doubleX(String str) {
    // We look for the position (index) of the first 'x' in the string
    // If 'x' is not found, the index will be -1
    int firstXIndex = str.indexOf('x');

    // we check if there was no 'x' found in the string
    // If firstXIndex is -1, it means there's no 'x' at all
    if (firstXIndex == -1) {
        // Since there's no 'x', we return false
        return false;
    }

    // we check if the character right after the first 'x' is also 'x'
    // We make sure we're not looking beyond the end of the string
    // 'firstXIndex + 1' is the index of the next character after the found 'x'
    if (firstXIndex + 1 < str.length() && str.charAt(firstXIndex + 1) == 'x') {
        // If the next character is 'x', return true
        return true;
    }

    // If the next character after the first 'x' is not 'x', return false
    return false;
}


//There solution:
//boolean doubleX(String str) {
//  int i = str.indexOf("x");
//  if (i == -1) return false; // no "x" at all
//
//  // Is char at i+1 also an "x"?
//  if (i+1 >= str.length()) return false; // check i+1 in bounds?
//  return str.substring(i+1, i+2).equals("x");
//
//  // Another approach -- .startsWith() simplifies the logic
//  // String x = str.substring(i);
//  // return x.startsWith("xx");
//}

////StringBits
public String stringBits(String str) {
    // We create a StringBuilder object.
    StringBuilder result = new StringBuilder();

    // we start a loop to go through each character in the string, but we only look at every second character
    // We start at the beginning (index 0) and move forward by 2 each time (i.e., 0, 2, 4, ...)
    for (int i = 0; i < str.length(); i += 2) {
        // Add the character at the current position (index 'i') to our notebook (result)
        // 'str.charAt(i)' gets the character at index 'i' in the original string
        result.append(str.charAt(i));
    }

    // Change our notebook (StringBuilder) into a regular string and give it back
    // This string includes every other character from the original string
    return result.toString();
}

 ////StringBits
//There solution:
//public String stringBits(String str) {
//    String result = "";
//    // Note: the loop increments i by 2
//    for (int i=0; i<str.length(); i+=2) {
//        result = result + str.substring(i, i+1);
//        // Alternately could use str.charAt(i)
//    }
//    return result;
//}

//   stringSplosion:
public String stringSplosion(String str) {
    // we create a StringBuilder object.
    StringBuilder result = new StringBuilder();

    // Start a loop to go through each position in the string, from the start to the end
    // The loop will run once for each character in the string
    for (int i = 0; i < str.length(); i++) {
        // In each loop iteration, we want to add a part of the string to our workspace
        // 'str.substring(0, i + 1)' gets a portion of the string from the beginning up to the current position plus one
        // For example, if i = 2 and str = "code", this will get "cod"
        result.append(str.substring(0, i + 1));
    }

    // Once the loop is done, the workspace (StringBuilder) contains the complete result
    // Convert this object into a regular string and return it
    return result.toString();
}

//There solution:
//public String stringSplosion(String str) {
//  String result = "";
//  // On each iteration, add the substring of the chars 0..i
//  for (int i=0; i<str.length(); i++) {
//    result = result + str.substring(0, i+1);
//  }
//  return result;
//}

//    arrayFront9
public boolean arrayFront9(int[] nums) {
    // we start a loop that will go through the first part of the array
    // We want to check up to the first 4 elements, or fewer if the array is shorter
    for (int i = 0; i < nums.length && i < 4; i++) {
        // we check if the current element in the array is the number 9
        if (nums[i] == 9) {
            // If we find a 9 in the first 4 elements, we should return true
            // This means our condition is met and we don't need to check further
            return true;
        }
    }

    // If the loop completes without finding a 9 in the first 4 elements
    // Return false to indicate that no 9 was found in the specified part of the array
    return false;
}

// There solution
//public boolean arrayFront9(int[] nums) {
//    // First figure the end for the loop
//    int end = nums.length;
//    if (end > 4) end = 4;
//
//    for (int i=0; i<end; i++) {
//        if (nums[i] == 9) return true;
//    }
//
//    return false;
//}

//    array123
public boolean array123(int[] nums) {
    // we start a loop to check each part of the array
    // We then loop up to the third-to-last element because we need to check three consecutive elements
    for (int i = 0; i < nums.length - 2; i++) {
        // we check if the current element is 1, and the next two elements are 2 and 3
        // 'nums[i]' is the current element we're checking
        // 'nums[i + 1]' is the element right after the current one
        // 'nums[i + 2]' is the element right after that
        if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
            // If we find a sequence of 1, 2, 3, we return true
            // This means the sequence is present in the array
            return true;
        }
    }

    // If the loop finishes without finding the sequence 1, 2, 3
    // We return false because the sequence was not found in the array
    return false;
}

//    There solution:
//public boolean array123(int[] nums) {
//    // Note: iterate < length-2, so can use i+1 and i+2 in the loop
//    for (int i=0; i < (nums.length-2); i++) {
//        if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
//    }
//    return false;
//}

//    array667
public int array667(int[] nums) {
    // we create a counter variable to keep track of how many times we find two 6's next to each other
    // Start the counter at 0
    int count = 0;

    // then,we begin a loop to go through each element in the array, except the very last one
    // We stop at the second-to-last element because we will be checking pairs of elements
    for (int i = 0; i < nums.length - 1; i++) {
        // Check if the current element (at position 'i') is the number 6
        if (nums[i] == 6) {
            // If the current element is 6, check the next element (at position 'i + 1')
            // We want to see if the next element is also 6 or if it is 7
            if (nums[i + 1] == 6 || nums[i + 1] == 7) {
                // If the next element is either 6 or 7, we found a match
                // Increase the counter by 1
                count++;
            }
        }
    }

    // After checking all pairs in the array, return the total number of matches found
    return count;
}


//There solution
//    public int array667(int[] nums) {
//        int count = 0;
//        // Note: iterate to length-1, so can use i+1 in the loop
//        for (int i=0; i < (nums.length-1); i++) {
//            if (nums[i] == 6) {
//                if (nums[i+1] == 6 || nums[i+1] == 7) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

//stringX
public String stringX(String str) {
    // First we check if the string is empty or has only one character
    // If the string is very short, there are no 'x' characters in the middle to remove
    // So, return the string as it is without any changes
    if (str.length() <= 1) {
        return str;
    }

    // We create a StringBuilder object. This is like an empty document where we will build the new string.
    StringBuilder result = new StringBuilder();

    // Always add the first character of the string to the result
    // This ensures that if the first character is 'x', it is not removed
    result.append(str.charAt(0));

    // Start a loop from the second character up to the second-to-last character
    // We skip the first character (which we already added) and the last character (which we will add later)
    for (int i = 1; i < str.length() - 1; i++) {
        // Check if the current character is not 'x'
        // If it’s not 'x', add it to our result
        if (str.charAt(i) != 'x') {
            result.append(str.charAt(i));
        }
    }

    // Always add the last character of the string to the result
    // This ensures that if the last character is 'x', it is not removed
    result.append(str.charAt(str.length() - 1));

    // we convert the StringBuilder (which now contains the modified string) into a regular string
    // Return this new string as the result
    return result.toString();
}

//There solution
//public String stringX(String str) {
//    String result = "";
//    for (int i=0; i<str.length(); i++) {
//        // Only append the char if it is not the "x" case
//        if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
//            result = result + str.substring(i, i+1); // Could use str.charAt(i) here
//        }
//    }
//    return result;
//}
}



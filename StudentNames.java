public class StudentNames {
    public static void main(String[] args) {
        // Print the number of arguments
        System.out.println("Number of arguments = " + args.length);
        
        // Iterate over the command line arguments and print the student names
        for (int i = 0; i < args.length; i++) {
            System.out.println((i + 1) + ". " + getOrdinal(i + 1) + " Student Name is = " + args[i]);
        }
    }

    // Helper method to return ordinal suffix for the numbers (e.g., 1st, 2nd, 3rd, etc.)
    private static String getOrdinal(int number) {
        if (number % 10 == 1 && number % 100 != 11) {
            return number + "st";
        } else if (number % 10 == 2 && number % 100 != 12) {
            return number + "nd";
        } else if (number % 10 == 3 && number % 100 != 13) {
            return number + "rd";
        } else {
            return number + "th";
        }
    }
}

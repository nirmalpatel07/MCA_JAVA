public class pro16 {

    public static void main(String[] args) {

        // 1. Integer Wrapper class for int
        int intVal = 42;
        Integer integerObj = Integer.valueOf(intVal);  // Boxing
        System.out.println("Integer Wrapper Object: " + integerObj); // Unboxing

        // 2. Boolean Wrapper class for boolean
        boolean boolVal = true;
        Boolean booleanObj = Boolean.valueOf(boolVal);  // Boxing
        System.out.println("Boolean Wrapper Object: " + booleanObj); // Unboxing

        // 3. Character Wrapper class for char
        char charVal = 'A';
        Character characterObj = Character.valueOf(charVal);  // Boxing
        System.out.println("Character Wrapper Object: " + characterObj); // Unboxing

        // 4. Byte Wrapper class for byte
        byte byteVal = 10;
        Byte byteObj = Byte.valueOf(byteVal);  // Boxing
        System.out.println("Byte Wrapper Object: " + byteObj); // Unboxing

        // 5. Short Wrapper class for short
        short shortVal = 100;
        Short shortObj = Short.valueOf(shortVal);  // Boxing
        System.out.println("Short Wrapper Object: " + shortObj); // Unboxing

        // 6. Long Wrapper class for long
        long longVal = 100000L;
        Long longObj = Long.valueOf(longVal);  // Boxing
        System.out.println("Long Wrapper Object: " + longObj); // Unboxing

        // 7. Float Wrapper class for float
        float floatVal = 10.5f;
        Float floatObj = Float.valueOf(floatVal);  // Boxing
        System.out.println("Float Wrapper Object: " + floatObj); // Unboxing

        // 8. Double Wrapper class for double
        double doubleVal = 20.99;
        Double doubleObj = Double.valueOf(doubleVal);  // Boxing
        System.out.println("Double Wrapper Object: " + doubleObj); // Unboxing

        // Demonstrating auto-boxing and unboxing:
        Integer autoBoxedInteger = 123;  // Auto-boxing
        int unboxedInteger = autoBoxedInteger;  // Auto-unboxing
        System.out.println("Auto-boxed Integer: " + autoBoxedInteger);
        System.out.println("Auto-unboxed Integer: " + unboxedInteger);

        // Convert string to wrapper object using parse methods
        String str = "300";
        Integer parsedInteger = Integer.parseInt(str);  // String to Integer
        System.out.println("Parsed Integer: " + parsedInteger);

        // Parse other wrapper types from strings
        String floatStr = "10.75";
        Float parsedFloat = Float.parseFloat(floatStr);  // String to Float
        System.out.println("Parsed Float: " + parsedFloat);
    }
}

public class Q1 {
    public static void main(String[] args) {
        int primitiveInt = 42;

        // Autoboxing
        Integer integerObject1 = primitiveInt;
        System.out.println("Using autoboxing: " + integerObject1);

        // Using Integer.valueOf() method
        Integer integerObject2 = Integer.valueOf(primitiveInt);
        System.out.println("Using Integer.valueOf(): " + integerObject2);
    }
}

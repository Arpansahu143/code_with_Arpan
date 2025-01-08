public class Q3 {
    public static void main(String[] args) {
         Double primitiveFloat = 3.14; // Primitive float
    
    Double wrapperFloatAutoboxing = primitiveFloat; // Autoboxing
    System.out.println("Autoboxing: " + wrapperFloatAutoboxing);
    Double wrapperFloatConstructor = new Double(primitiveFloat); // Using constructor
    
    System.out.println("Using Constructor: " + wrapperFloatConstructor);
    }
    }
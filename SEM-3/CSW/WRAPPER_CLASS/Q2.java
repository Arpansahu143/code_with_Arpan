public class Q2 {
    public static void main(String[] args) {
         Float primitiveFloat = 3.14f; // Primitive float
    
    Float wrapperFloatAutoboxing = primitiveFloat; // Autoboxing
    System.out.println("Autoboxing: " + wrapperFloatAutoboxing);
    Float wrapperFloatConstructor = new Float(primitiveFloat); // Using constructor
    
    System.out.println("Using Constructor: " + wrapperFloatConstructor);
    }
    }
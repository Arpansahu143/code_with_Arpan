public class Q4 {
    public static void main(String[] args) {
    boolean primitiveBoolean = true; // Primitive boolean
    Boolean wrapperBooleanAutoboxing = primitiveBoolean; // Autoboxing
    System.out.println("Autoboxing: " + wrapperBooleanAutoboxing);
    Boolean wrapperBooleanConstructor = new Boolean(primitiveBoolean); //  Using constructor
  
    System.out.println("Using Constructor: " + wrapperBooleanConstructor);
    }
    }
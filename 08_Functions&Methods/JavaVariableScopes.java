/*
 * VARIABLE SCOPES IN JAVA: Method, Block & Class Scopes
 * * 1. Class Scope (Global/Instance Variables)
 * - What it is: Declared directly inside a class, but outside of any method.
 * - Accessibility: Can be accessed by any method within the same class.
 * - Lifespan: They are created when you make a new object (using the 'new' keyword) 
 * and deleted when Java automatically cleans up that object from memory.
 * * 2. Method Scope (Local Variables)
 * - What it is: Declared inside a method.
 * - Accessibility: Can only be used within that specific method.
 * - Lifespan: Created when the method is called and deleted the moment the method finishes.
 * * 3. Block Scope
 * - What it is: Declared inside curly braces {} (like an if-statement or for-loop).
 * - Accessibility: Can only be used within those exact braces.
 * - Lifespan: Created when the block starts and deleted when the block ends.
 */

public class ScopeExample {
    
    // 1. CLASS SCOPE: Accessible anywhere inside this class
    int classVar = 10; 

    public void firstMethod() {
        // 2. METHOD SCOPE: Accessible only inside firstMethod
        int methodVar = 20; 

        if (methodVar > 10) {
            // 3. BLOCK SCOPE: Accessible only inside this 'if' block
            int blockVar = 30; 
            
            System.out.println(classVar);  // Works
            System.out.println(methodVar); // Works
            System.out.println(blockVar);  // Works
        }
        
        System.out.println(classVar);  // Works
        System.out.println(methodVar); // Works
        // System.out.println(blockVar); ERROR: blockVar is out of scope here
    }

    public void secondMethod() {
        System.out.println(classVar);  // Works
        // System.out.println(methodVar); ERROR: methodVar belongs to firstMethod
    }
}

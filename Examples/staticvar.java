class MyClass {
    static int staticVar = 0; // static variable
    
    // Method to modify static variable
    public static void incrementStaticVar() {
        staticVar++;
    }
}

public class staticvar {
    public static void main(String[] args) {
        // Access static variable directly using class name
        System.out.println("Initial value of staticVar: " + MyClass.staticVar);
        
        // Modify static variable using static method
        MyClass.incrementStaticVar();
        System.out.println("Modified value of staticVar: " + MyClass.staticVar);
    }
}

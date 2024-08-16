import java.util.*;
import java.security.*;

public class convertinttostring{
    public static void main(String[] args) {

        
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();
            String s = String.valueOf(n); // Convert integer n to string
            
            int parsedInt = Integer.parseInt(s); // Parse string s to an integer
            System.out.println(s+10);
            System.out.println(parsedInt+10);
            if (n == parsedInt) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        
    }
}

//The following class will prevent you from terminating the code using exit(0)!
// class DoNotTerminate {

//     public static class ExitTrappedException extends SecurityException {

//         private static final long serialVersionUID = 1;
//     }

//     public static void forbidExit() {
//         final SecurityManager securityManager = new SecurityManager() {
//             @Override
//             public void checkPermission(Permission permission) {
//                 if (permission.getName().contains("exitVM")) {
//                     throw new ExitTrappedException();
//                 }
//             }
//         };
//         System.setSecurityManager(securityManager);
//     }
// }

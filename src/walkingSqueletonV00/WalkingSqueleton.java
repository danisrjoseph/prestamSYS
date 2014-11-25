/**
 *
 * @author DANIS-OFFICE
 */
package walkingSqueletonV00;

import java.io.File;
import vista.*;

public class WalkingSqueleton {
    public static void main(String[] args) { 
        File f = new File(".\\DB\\PrestaSYSDB");
         if (!f.exists()) {
             new AdminForm().setVisible(true);
         } else {
             new AutentificarForm().setVisible(true);
         }
        
    }
}

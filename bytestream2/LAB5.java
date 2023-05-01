package bytestream2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB5 {
    public static void main(String[] args) {
        Student s = new Student("54565", "Mink");
        try {
            FileOutputStream file = new FileOutputStream("object.dat");
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeObject(s);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream file = new FileInputStream("object.dat");
            ObjectInputStream input = new ObjectInputStream(file);
            Student ss = (Student) input.readObject();
            System.out.println(ss);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

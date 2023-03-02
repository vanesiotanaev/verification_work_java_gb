
import java.io.File;
import java.io.FileWriter;

class Toy {
    String id;
    String name;

    public Toy(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addToyToFile() {
        try {
            File f = new File("Example");
            
            FileWriter fr = new FileWriter(f, true);
            fr.write(this.id + ": " + this.name + "\n");
            fr.close();
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
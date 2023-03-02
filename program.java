import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

public class program {
    public static void main(String[] args) throws Exception {

        Methods methods = new Methods();
        methods.whatToDO();
        Scanner sk = new Scanner(System.in);
        int name3;
        System.out.print("Введите цифру: ");
        name3 = sk.nextInt();
        
        if (name3 == 1) {
            ArrayList<String> toyParameters = methods.addNewToy();
            Toy toy = new Toy(toyParameters.get(0), toyParameters.get(1));
            try {
                toy.addToyToFile();
            }
            catch (Exception e) {
                System.err.println(e);
            }
        } 
        else if (name3 == 2) {
            Random random = new Random();
            BufferedReader br = new BufferedReader(new FileReader("Example"));
            String str;
            ArrayList<String> result = new ArrayList<>();
            while ((str = br.readLine()) != null) {
                result.add(str);
            } 
            
            System.out.println(result.get(random.nextInt(0, result.size())));
        } 
    }
}
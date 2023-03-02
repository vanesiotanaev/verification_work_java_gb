import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Methods {
    public ArrayList<String> addNewToy() {

        ArrayList<String> toy = new ArrayList<String>();
        Random random = new Random();
        int id = random.nextInt(1, 100);
        String idString = Integer.toString(id);
        Scanner sk = new Scanner(System.in);
        String name1;
        System.out.print("Введите название игрушки: ");
        name1 = sk.nextLine();

        toy.add(idString);
        toy.add(name1);
        
        return toy;
    }

    public void whatToDO() {

        System.out.println("""
                Что Вы хотите сделать?
                1. Добавить новую игрушку
                2. Запустить розыгрыш игрушки
                """);
    }
}
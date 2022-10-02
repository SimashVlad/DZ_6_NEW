import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NoteBook n1 = new NoteBook("1", "Air", Memory.ONE, "256");
        NoteBook n2 = new NoteBook("2", "MagicBook", Memory.SIXTEEN, "512");
        NoteBook n3 = new NoteBook("3", "Asus", Memory.TWO, "1024");

        ArrayList<NoteBook> al = new ArrayList<>();
        al.add(n1);
        al.add(n2);

        Scanner in = new Scanner(System.in);

        // to do 1. записать данные в файл или в коллекцию (в какую?)

        System.out.println("В нашей базе есть следующие ноутбуки:" +
                "\n" + n1 +
                "\n" + n2); // to do 2. поменять формат вывода, заменить на вывод файла или коллекции

        System.out.println("Введите поле, по которому хотите выполнить поиск ноутбука: ");
        String userAnswerFilterField = in.next();
        System.out.println("Введите значение, введённого ранее поля, по которому хотите выполнить поиск ноутбука: ");
        String userAnswerFilterValue = in.next();
        in.close();

        NotebookController contoller = new NotebookController();

        System.out.println(
                contoller.getFilteredNotebookList(al,userAnswerFilterField,userAnswerFilterValue));

/*
NotebookContoller - тип создаваемого объекта
contoller - название создаваемого объекта
new - говорит, что мы создаём объект

 */

    }
}

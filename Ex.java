
import java.util.ArrayList;
import java.util.List;

public class Ex {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<Student> listStudents = new ArrayList<>();

        listStudents.add(new Student("Дмитрий Зеленцов", 5.8f));
        listStudents.add(new Student("Регина Рабе", 4));
        listStudents.add(new Student("Иван Иванов", 32));
        listStudents.add(new Student("Петр Петров", 63.12f));
        listStudents.add(new Student("Конь Конев", 13.12f));

        WriteToJson jsonList = new WriteToJson(listStudents);
        jsonList.saveFile();

        System.out.println();

        WriteToXml xmlList = new WriteToXml(listStudents);
        xmlList.saveFile();

        System.out.println();

        WriteToTxt txtList = new WriteToTxt(listStudents);
        txtList.saveFile();

    }
}
import java.util.Scanner;

public class Main {
    static class Reader {
        String fio;
        String ticketNumber;
        String faculty;
        String birthDate;
        String phoneNumber;

        public Reader(String fio, String ticketNumber, String faculty, String birthDate, String phoneNumber) {
            this.fio = fio;
            this.ticketNumber = ticketNumber;
            this.faculty = faculty;
            this.birthDate = birthDate;
            this.phoneNumber = phoneNumber;
        }

        public void takeBook(int books) {
            System.out.println("Читатель взял " + books + " книг.");
        }

        public void takeBook(String... list) {
            System.out.println("Читатель взял книги: " + String.join(", ", list) + "\n");
        }

        public void returnBook(int books) {
            if (books == 0) {
                System.out.println("Читатель не возвращал книги.");
            }
            else {
                System.out.println("Читатель вернул столько книг:" + books);
            }
        }

        public void returnBook(String... list) {
            System.out.println("Читатель вернул книги: \n" + String.join(", ", list) + "\n");
        }
    }


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Reader[] readers = new Reader[]{
                new Reader("Шедько Ю.С.", "01520", "Математический", "2001.05.06", "893455"),
                new Reader("Федоренко К.И.", "20150", "Математический", "2000.09.20", "789977"),
                new Reader("Бендик М.А.", "16789", "Химический", "1999.09.12", "874563"),
                new Reader("Рябинин Т.Р.", "93533", "Химический", "2000.09.05", "788344"),
                new Reader("Морозова Ю.А.", "09933", "Геологический", "2000.07.07", "994945")
        };
        System.out.println("Сколько книг взял читатель ?");
        int books = read.nextInt();
        readers[3].takeBook(books);
        String[] List = new String[books];
        if (books > 0) {
            for (int i = 0; i < List.length; i++) {
                System.out.println("Введите название книги: ");
                List[i] = read.next();
            }
            readers[3].takeBook(List);
        }
        System.out.println("Cколько книг вернул читатель: ");
        books = read.nextInt();
        readers[3].returnBook(books);
        List = new String[books];
        if (books > 0) {
            for (int i = 0; i < List.length; i++) {
                System.out.println("Введите название книги: ");
                List[i] = read.next();
            }
            readers[3].returnBook(List);
        }
    }
}

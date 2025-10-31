package HomeWork.homework9_bookstorage;
import java.util.Scanner;

public class LibraryDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookstorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_BOOK = "1";
    private static final String PRINT_ALL_BOOKS = "2";
    private static final String SEARCH_BOOK_BY_TITLE = "3";
    private static final String PRINT_EXPENSIVE_BOOk = "4";
    private static final String DELETE_BOOK_BY_ID = "5";
    private static final String SEARCH_BOOK_BY_PRICE_SCALE = "6";


    public static void main(String[] args) {

        boolean isRun = true;
        while(isRun){
            printCommands();
            String command = scanner.nextLine();
            switch(command){
                case EXIT:
                    isRun = false;
                    break;
                case ADD_BOOK:
                addBook();
                    break;

                case PRINT_ALL_BOOKS:
                    bookstorage.print();
                    break;

                case SEARCH_BOOK_BY_TITLE:
                    searchTitle();
                    break;

                case PRINT_EXPENSIVE_BOOk:
                    printExpensiveBook();
                    break;

                case DELETE_BOOK_BY_ID:
                    delete_ByIndex();
                    break;

                case SEARCH_BOOK_BY_PRICE_SCALE:

                   SEARCH_PRICE_SCALE();
                    break;
            }
        }
    }

    private static void SEARCH_PRICE_SCALE(){
        System.out.println("Please input start price");
        int startPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input max price");
        int maxPrice = Integer.parseInt(scanner.nextLine());
        bookstorage.PriceScale(startPrice, maxPrice);
    }

    private static void delete_ByIndex(){
        System.out.println("Please inpute index");
        int index = Integer.parseInt(scanner.nextLine());
        bookstorage.deleteByIndex(index);
    }

    private static void printExpensiveBook(){
        Book expensiveBook = bookstorage.getBookByMaxPrice();
        System.out.println(expensiveBook);
    }

    private static void searchTitle(){
        System.out.println("Please inpute keyword");
        String keyword = scanner.nextLine();
        bookstorage.search(keyword);
    }

    private static void addBook() {
        System.out.println("Please input book title");
        String bookTitle = scanner.nextLine();
        System.out.println("Please input authorname");
        String authorname = scanner.nextLine();
        System.out.println("Please input bookprice");
        double bookprice = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input quantity");
        int quantitybook = Integer.parseInt(scanner.nextLine());
        Book book = new Book(bookTitle, authorname, bookprice, quantitybook);
        bookstorage.add(book);
        System.out.println("Book added succesfully");
    }

    private static void printCommands(){
        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + ADD_BOOK + " for ADD BOOK");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " for PRINT ALL BOOKS ");
        System.out.println("Please input " + SEARCH_BOOK_BY_TITLE +" for SEARCH BOOK BY TITLE");
        System.out.println("Pleast input " + PRINT_EXPENSIVE_BOOk +" for SERACH BOOK BY MAX PRICE");
        System.out.println("Please input " + DELETE_BOOK_BY_ID + " for Delete BOOK BY ID");
        System.out.println("Please input " + SEARCH_BOOK_BY_PRICE_SCALE + " for search BOOK BY PRICE SCALE");
    }
}
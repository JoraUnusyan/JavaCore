package HomeWork.homework9;

public class BookStorage {
    private Book[] books = new Book[10];
    private int size = 0;



    public void add(Book book){
        if(size == books.length){
            extend();
        }
        books[size++] = book;
    }



    private void extend(){
        Book[] books2 = new Book[books.length+10];
        for (int i = 0; i < books.length; i++) {
            books2[i] = books[i];
        }
        books = books2;
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void search(String keyword) {
        for (int i = 0; i < size; i++) {
            if(books[i].getTitle().toLowerCase().contains(keyword.toLowerCase())){
                System.out.println(books[i]);
            }
        }
    }

    public Book getBookByMaxPrice(){
        double price = 0;
        int maxIndex = -1;
        for (int i = 0; i < size; i++) {
            if(books[i].getPrice() > price) {
                price = books[i].getPrice();
                maxIndex = i;
            }
        }
        return books[maxIndex];
    }

    public void deleteByIndex(int index){
        if(index < 0 || index > size){
            System.out.println("error index");
        } else{
        for (int i = index; i < size; i++) {
            books[i] = books[i+1];
        }
            System.out.println("Book по индексу" + index + " был Удален"); }
        size--;
    }
    
    public void PriceScale(int min, int max){
        boolean check = false;
        System.out.println();
        System.out.println("Книги в ценовом диапазоне от " + min + "$" + " до " + max + "$");
        System.out.println();
        for (int i = 0; i < size; i++) {
            if(books[i].getPrice() >= min && books[i].getPrice() <= max){
                System.out.println(books[i]);
                check = true;
            }
        }
        System.out.println();
        if(check == false){
            System.out.println("Ниг в таком ценовом диапазоне нет в наличии");
        }
    }
    
}
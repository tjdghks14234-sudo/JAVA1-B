void main() {
    class Book {
        String title;
        String author;
        int pages;
        float price;

        public Book(String title, String author, int pages, float price) {
            this.title = title;
            this.author = author;
            this.pages = pages;
            this.price = price;
        }
    }
    Book[] books = new Book[] {
            new Book("어서와 JAVA는 처음이지", "천인국", 230, 23000.0f),
            new Book("쉽게배우는 자료구조", "윤병로", 330, 32000.0f)
    };

    for (int i = 0; i < books.length; i++) {
        System.out.printf(" %s\n\t 저자 : %s\n\t 페이지 수 : %,d 쪽\n\t 가격 : %,.0f 원\n\n",
                books[i].title, books[i].author, books[i].pages, books[i].price);
    }
}
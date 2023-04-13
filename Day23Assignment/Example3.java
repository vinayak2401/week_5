class Book {
  String title;
  String author;
  int publicationYear;

  Book(String title, String author, int publicationYear) {
    this.title = title;
    this.author = author;
    this.publicationYear = publicationYear;

  }

  void display() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Publication year: " + publicationYear);
  }
}

class BookDemo {
  public static void main(String args[]) {
    Book obj = new Book("Wings of Fire", "Dr.APJ Abdul Kalam", 2000);
    obj.display();
  }
}
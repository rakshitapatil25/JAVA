/*Create a class Book which contains 
four members: name, author, price, num_pages. 
Include a constructor to set the values for the members. 
Include methods to set and get the details of the objects. 
Include a toString( ) method that could display the complete details of the book. 
Develop a Java program to create n book objects. */

import java.util.Scanner;

class Book{
  private String name;
  private String author;
  private int price;
  private int num_pages;
  public Book(String name, String author, int price, int num_pages){
    this.name = name;
    this.author=author;
    this.price=price;
    this.num_pages=num_pages;
  }
  public void setName(String name){
    this.name=name;
  }
  public void setAuthor(String author){
    this.author=author;
  }
  public void setPrice(int price){
    this.price=price;
  }
  public void setNumPages(int num_pages){
    this.num_pages=num_pages;
  }
  public String getName(){
    return name;
  }
  public String getAuthor(){
    return author;
  }
  public int getPrice(){
    return price;
  }
  public int getNumPages(){
    return num_pages;
  }
  public String toString(){
    return "Book name: " + name
            + "\nAuthor name: " + author
            + "\nPrice: " + price
            + "\nNum of Pages: " + num_pages;
  }
}
public class prog3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter number of books: ");
    System.err.println("");
    int n = sc.nextInt();
    sc.nextLine();
    Book[] books = new Book[n];

    for(int i=0;i<n;i++){
      System.out.print("Enter Book " + (i+1) + " name: ");
      String name = sc.nextLine();
      System.out.print("Enter Author name: ");
      String author = sc.nextLine();
      System.out.print("Enter Price: ");
      int price = sc.nextInt();
      sc.nextLine();
      System.out.print("Enter Number of Pages: ");
      int num_pages=sc.nextInt();
      sc.nextLine();
      books [i] = new Book(name, author, price, num_pages);
      System.out.println("");
    }
    System.out.println("\nBOOK DETAILS\n");
    for(int i=0;i<n;i++){
      System.out.println(books[i].toString());
    }
  }
  
}

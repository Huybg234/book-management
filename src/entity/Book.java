package entity;

import java.util.Scanner;

public class Book {
    private int id;
    private String bookName;
    private String author;
    private String specialized;
    private int year;

    private final static String NATURAL_SCIENCE = "Khoa học tự nhiên";
    private final static String LITERATURE_ART = "Văn học nghệ thuật";
    private final static String ELECTRONIC_TELECOMMUNICATION = "Điện tử viễn thông";
    private final static String INFORMATION_TECHNOLOGY = "Công nghệ thông tin";

    private static int AUTO_ID = 10000;

    public Book() {
    }

    public Book(int id, String bookName, String author, String specialized, int year) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.specialized = specialized;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static String getNaturalScience() {
        return NATURAL_SCIENCE;
    }

    public static String getLiteratureArt() {
        return LITERATURE_ART;
    }

    public static String getElectronicTelecommunication() {
        return ELECTRONIC_TELECOMMUNICATION;
    }

    public static String getInformationTechnology() {
        return INFORMATION_TECHNOLOGY;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public void inputBookInfo() {
        this.setId(Book.AUTO_ID);
        System.out.println("Nhập tên sách: ");
        this.bookName = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên tác giả: ");
        this.author = new Scanner(System.in).nextLine();
        System.out.println("Nhập năm xuất bản: ");
        this.year = new Scanner(System.in).nextInt();
        System.out.println("Nhập loại sách:");
        System.out.println("1.Khoa học tự nhiên");
        System.out.println("2.Văn học - nghệ thuật");
        System.out.println("3.Điện tử viễn thông");
        System.out.println("4.Công nghệ thông tin");
        System.out.println("Nhập sự lựa chọn: ");
        boolean check = true;
        do {
            int choice = new Scanner(System.in).nextInt();
            if (choice <= 0 || choice > 4) {
                System.out.print("Nhập số trong khoảng từ 1 đến 4! Nhập lại: ");
                check = false;
                continue;
            }

            switch (choice) {
                case 1:
                    this.setSpecialized(Book.NATURAL_SCIENCE);
                    System.out.println("Khoa học tự nhiên");
                    check = true;
                    break;
                case 2:
                    this.setSpecialized(Book.LITERATURE_ART);
                    System.out.println("Văn học - nghệ thuật");
                    check = true;
                    break;
                case 3:
                    this.setSpecialized(Book.ELECTRONIC_TELECOMMUNICATION);
                    System.out.println("Điện tử viễn thông");
                    check = true;
                    break;
                case 4:
                    this.setSpecialized(Book.INFORMATION_TECHNOLOGY);
                    System.out.println("Công nghệ thông tin");
                    check = true;
                    break;
                default:
                    System.out.println("Nhập sai! Hãy nhập từ 1 đến 4!");
                    check = false;
                    break;
            }
        } while (!check);
        Book.AUTO_ID++;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", specialized='" + specialized + '\'' +
                ", year=" + year +
                '}';
    }
}

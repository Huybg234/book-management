package entity;

import java.util.Scanner;

public class Reader {
    private int id;
    private String name;
    private String address;
    private String ReaderType;

    private static final String STUDENT = "Sinh viên";
    private static final String GRADUATE_STUDENT = "Học viên cao học";
    private static final String TEACHER = "Giáo viên";

    private static int AUTO_ID = 10000;

    public Reader() {
    }

    public Reader(int id, String name, String address, String readerType) {
        this.id = id;
        this.name = name;
        this.address = address;
        ReaderType = readerType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReaderType() {
        return ReaderType;
    }

    public void setReaderType(String readerType) {
        ReaderType = readerType;
    }

    public static String getSTUDENT() {
        return STUDENT;
    }

    public static String getGraduateStudent() {
        return GRADUATE_STUDENT;
    }

    public static String getTEACHER() {
        return TEACHER;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public void inputReaderInfo() {
        this.setId(Reader.AUTO_ID);
        System.out.println("Nhập tên bạn đọc: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập địa chỉ bạn đọc: ");
        this.address = new Scanner(System.in).nextLine();
        System.out.println("Nhập loại bạn đọc:");
        System.out.println("1.Sinh viên");
        System.out.println("2.Học viên cao học");
        System.out.println("3.Giảng viên");
        System.out.println("Nhập sự lựa chọn: ");
        boolean check = true;
        do {
            int choice = new Scanner(System.in).nextInt();
            if (choice <= 0 || choice > 3) {
                System.out.print("Nhập số trong khoảng từ 1 đến 3! Nhập lại: ");
                check = false;
                continue;
            }

            switch (choice) {
                case 1:
                    this.setReaderType(Reader.getSTUDENT());
                    System.out.println("Sinh viên");
                    check = true;
                    break;
                case 2:
                    this.setReaderType(Reader.getGraduateStudent());
                    System.out.println("Học viên cao học");
                    check = true;
                    break;
                case 3:
                    this.setReaderType(Reader.getTEACHER());
                    System.out.println("Giáo viên");
                    check = true;
                    break;
                default:
                    System.out.println("Nhập sai! Hãy nhập từ 1 đến 3!");
                    check = false;
                    break;
            }
        } while (!check);
        Reader.AUTO_ID++;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", ReaderType='" + ReaderType + '\'' +
                '}';
    }
}

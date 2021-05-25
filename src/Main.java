import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerStudent managerStudent = new ManagerStudent();
        while (true) {
            System.out.println("======Menu=====");
            System.out.println("1: Thêm học sinh");
            System.out.println("2: Hiển thị danh sách học sinh");
            System.out.println("3: Tìm kiếm thông tin học sinh");
            System.out.println("4: Xóa thông tin học sinh theo id");
            System.out.println("5: Sửa thông tin học sinh theo id");
            System.out.println("6: Sắp xếp học sinh");
            System.out.println("7: exit");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:{
                    int id;
                    do {
                        System.out.println("Nhập id:");
                        id = scanner.nextInt();
                    }while (managerStudent.searchId(id) != -1);
                    System.out.println("Nhập tuổi");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập tên");
                    String name = scanner.nextLine();
                    String gender = managerStudent.gender();
                    System.out.println("Nhập địa chỉ");
                    String address = scanner.nextLine();
                    System.out.println("Nhập trường:");
                    String school = scanner.nextLine();
                    managerStudent.add(new Student(id,age,name,gender,address,school));
                    break;
                }
                case 2:{
                    managerStudent.print(managerStudent.getArr());
                    break;
                }
                case 3:{
                    System.out.println("a.Tìm kiếm theo id");
                    System.out.println("b.Tìm kiếm theo tên");
                    System.out.println("c.Tìm kiếm theo tuổi");
                    System.out.println("d.Tìm kiếm theo trường");
                    scanner.nextLine();
                    String line = scanner.nextLine();
                    switch (line){
                        case "a" :{
                            System.out.println("Nhập vào ID cần tìm");
                            int id = scanner.nextInt();
                            int id1 = managerStudent.searchId(id);
                            if (id1 == -1){
                                System.out.println("không có id này");
                            }else {
                                System.out.println(managerStudent.getArr().get(id1));
                            }
                            break;
                        }
                        case "b": {
                            System.out.println("Nhập vào tên cần tìm");
                            String name = scanner.nextLine();
                            managerStudent.print(managerStudent.searchName(name));
                            break;
                        }
                        case "c" :{
                            System.out.println("Nhập vào tuổi của học sinh cần tìm");
                            int age = scanner.nextInt();
                            managerStudent.searchAge(age);
                            break;
                        }
                        case "d" : {
                            System.out.println("Nhập vào trường cần tìm");
                            String school = scanner.nextLine();
                            managerStudent.searchSchool(school);
                            break;
                        }
                        default:
                            System.out.println("Không có lựa chọn này, nhập lại");
                            break;
                    }
                    break;
                }
                case 4: {
                    System.out.println("Nhập id học sinh cần xóa");
                    int id = scanner.nextInt();
                    managerStudent.delete(id);
                    managerStudent.print(managerStudent.getArr());
                    break;
                }
                case 5 : {
                    System.out.println("Nhập id cần sửa:");
                    int id = scanner.nextInt();
                    System.out.println("Nhập tuổi");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập tên");
                    String name = scanner.nextLine();
                    String gender = managerStudent.gender();
                    System.out.println("Nhập địa chỉ");
                    String address = scanner.nextLine();
                    System.out.println("Nhập trường:");
                    String school = scanner.nextLine();
                    managerStudent.edit(id,new Student(id,age,name,gender,address,school));
                    managerStudent.print(managerStudent.getArr());
                    break;
                }
                case 6: {
                    System.out.println("1.Sắp xếp thông tin theo id");
                    System.out.println("2.Sắp xếp theo tuổi và theo tên");
                    int a = scanner.nextInt();
                    switch (a){
                        case 1 : {
                            managerStudent.sortID();
                            managerStudent.print(managerStudent.getArr());
                            break;
                        }
                        case 2:{
                            managerStudent.sort();
                            managerStudent.print(managerStudent.getArr());
                            break;
                        }
                        default:
                            System.out.println("mời nhập lại");
                            break;
                    }
                    break;
                }
                case 7: {
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("nhập lại");
            }
        }
    }


}

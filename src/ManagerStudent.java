import java.util.*;

public class ManagerStudent {
    private List<Student> arr = new ArrayList<>();

    public List<Student> getArr() {
        return arr;
    }

    public void setArr(List<Student> arr) {
        this.arr = arr;
    }

    public void add(Student student) {
        arr.add(student);
    }

    public void print(List<Student> arr) {
        Iterator<Student> iterator = arr.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    public int searchId(int id) {
        for (int i = 0; i < arr.size(); i++) {
            if (id == arr.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    public List<Student> searchName(String name) {
        ArrayList<Student> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (name.equals(arr.get(i).getName())) {
                arrayList.add(arr.get(i));
            }
        }
        return arrayList;
    }

    public void searchAge(int age) {
        for (int i = 0; i < arr.size(); i++) {
            if (age == arr.get(i).getAge()) {
                System.out.println(arr.get(i));
            }
        }
    }

    public void searchSchool(String school) {
        for (int i = 0; i < arr.size(); i++) {
            if (school.equals(arr.get(i).getSchool())) {
                System.out.println(arr.get(i));
            }
        }
    }

    public void delete(int id) {
        if (searchId(id) == -1) {
            System.out.println("không có id này");
        } else {
            arr.remove(searchId(id));
        }
//        boolean check = false;
//        for (int i = 0; i < arr.size(); i++) {
//            if (id == arr.get(i).getId()) {
//                arr.remove(arr.get(i));
//                check = true;
//                break;
//            }
//        }
//        if (check == false) {
//            System.out.println("không có id này");
//           }else {
//               print(arr);
//           }
    }

    public void edit(int id, Student student) {
        if (searchId(id) == -1) {
            System.out.println("không có id này");
        } else {
            arr.set(searchId(id), student);
        }
    }

    String gender() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập giới tính 1 or 2 (1 = nam,2 = nữ)");
            String gender = sc.nextLine();
            switch (gender) {
                case "1": {
                    return "Nam";
                }
                case "2": {
                    return "Nữ";
                }
            }
        }
    }

    public void sortID() {
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId() - o2.getId();
            }
        });
    }

    public void sort() {
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                if (result == 0) {
                    return o1.getName().compareTo(o2.getName());
                }
                return result;
            }
        });
    }

}



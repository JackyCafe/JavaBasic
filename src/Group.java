public class Group {
    public static void main(String[] args) {
        int[][] groups = new int[10][5];
        int[] ids = new int[50];
        int[] new_id = new int[50];
        Student[] students = new Student[50];
        for (int i = 0; i < 50; i++) {
            Student s = new Student(i, "Student" + i);
            students[i] = s;
            ids[i] = i;
        }

        for (int i = 49; i >= 0; i--) {
            int index = (int) (Math.random() * i);
            int temp = ids[index];
            ids[index] = ids[i];
            ids[i] = temp;
        }


        for (int i = 0; i < groups.length; i++) {
            for (int j = 0; j < groups[i].length; j++) {
                groups[i][j] = ids[i * 5 + j];
            }
        }
        for (int[] i : groups) {
            for (int j : i) {
                System.out.println(students[j]);
            }
            System.out.println();
        }
    }

}

class Student {
    int id;
    String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
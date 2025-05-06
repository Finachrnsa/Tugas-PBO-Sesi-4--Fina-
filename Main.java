import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Input Data Mahasiswa ===");
        System.out.print("Nama Mahasiswa: ");
        String studentName = input.nextLine();
        System.out.print("Alamat Mahasiswa: ");
        String studentAddress = input.nextLine();

        Student student = new Student(studentName, studentAddress);

        System.out.print("Berapa mata kuliah yang diambil? ");
        int jumlahMatkul = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.print("Nama mata kuliah ke-" + (i + 1) + ": ");
            String course = input.nextLine();
            System.out.print("Nilai: ");
            int grade = input.nextInt();
            input.nextLine();
            student.addCourseGrade(course, grade);
        }

        System.out.println("\n" + student);
        student.printGrades();
        System.out.println("Rata-rata nilai: " + student.getAverageGrade());

        System.out.println("\n=== Input Data Dosen ===");
        System.out.print("Nama Dosen: ");
        String teacherName = input.nextLine();
        System.out.print("Alamat Dosen: ");
        String teacherAddress = input.nextLine();

        Teacher teacher = new Teacher(teacherName, teacherAddress);

        System.out.print("Berapa mata kuliah yang diampu? ");
        int jumlahAjar = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahAjar; i++) {
            System.out.print("Nama mata kuliah ke-" + (i + 1) + ": ");
            String course = input.nextLine();
            if (teacher.addCourse(course)) {
                System.out.println("Mata kuliah berhasil ditambahkan.");
            } else {
                System.out.println("Mata kuliah sudah ada, gagal ditambahkan.");
            }
        }

        System.out.println("\n" + teacher);

        input.close();
    }
}

public class Application {
    public static void main(String[] args) {
        Student student1 = new Student(123, "Jack", "13-07-1998");
        Student student2 = new Student(124, "John", "14-08-1999");
        Student student3 = new Student(125, "Jacob", "15-09-2000");
        Student student4 = new Student(126, "James", "16-10-2001");

        Course course1 = new Course("Computer Science", "13-09-2020", "05-05-2024");
        Course course2 = new Course("Business Studies", "04-09-2019", "15-04-2023");

        Module module1 = new Module("Programming", "CS101");
        Module module2 = new Module("Mathematics", "CS102");
        Module module3 = new Module("Accounting", "BS201");

        module1.addStudent(student1);
        module1.addStudent(student2);
        module2.addStudent(student1);
        module2.addStudent(student2);
        module2.addStudent(student3);
        module2.addStudent(student4);
        module3.addStudent(student3);
        module3.addStudent(student4);

        course1.addModule(module1);
        course1.addModule(module2);
        course2.addModule(module2);
        course2.addModule(module3);

        course1.addStudent(student1);
        course1.addStudent(student2);
        course2.addStudent(student3);
        course2.addStudent(student4);

        System.out.printf("Course:  %s\n", course1.getName());
        System.out.println("List of modules:");
        for (Module m: course1.getModules()) {
            System.out.println(m.getName());
        }
        System.out.println();

        System.out.printf("Course:  %s\n", course2.getName());
        System.out.println("List of modules:");
        for (Module m: course2.getModules()) {
            System.out.println(m.getName());
        }
        System.out.println();

        System.out.printf("Student:  %s\n", student1.getName());
        System.out.printf("List of modules: ");
        for (Module m: student1.getModules()) {
            System.out.printf("%s, ", m.getName());
        }
        System.out.println();
        System.out.printf("Username: %s\n", student1.getUsername());
        System.out.println();

        System.out.printf("Student:  %s\n", student2.getName());
        System.out.printf("List of modules: ");
        for (Module m: student2.getModules()) {
            System.out.printf("%s, ", m.getName());
        }
        System.out.println();
        System.out.printf("Username: %s\n", student2.getUsername());
        System.out.println();

        System.out.printf("Student:  %s\n", student3.getName());
        System.out.printf("List of modules: ");
        for (Module m: student3.getModules()) {
            System.out.printf("%s, ", m.getName());
        }
        System.out.println();
        System.out.printf("Username: %s\n", student3.getUsername());
        System.out.println();

        System.out.printf("Student:  %s\n", student4.getName());
        System.out.printf("List of modules: ");
        for (Module m: student4.getModules()) {
            System.out.printf("%s, ", m.getName());
        }
        System.out.println();
        System.out.printf("Username: %s\n", student4.getUsername());
        System.out.println();
    }
}

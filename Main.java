public class Main{
    public static void main(String[] args){
        College university = new College("New Era University");

        College engCollege = new College("College of Engineering");
        Department csDept = new Department("Department of Computer Science");
        Department itDept = new Department("Department of Information Technology");

        Teacher teacher1 = new Teacher("Prof. Reyes", "Java Programming", 50000);
        Teacher teacher2 = new Teacher("Prof. Cruz", "Data Structures", 48000);

        Student student1 = new Student("Alice", "2023-001", 30000);
        Student student2 = new Student("Bob", "2023-002", 32000);
        Student student3 = new Student("Charlie", "2023-003", 31000);

        csDept.add(teacher1);
        csDept.add(student1);
        csDept.add(student2);

        itDept.add(teacher2);
        itDept.add(student3);

        engCollege.add(csDept);
        engCollege.add(itDept);

        university.add(engCollege);

        // details display
        System.out.println("\n--- University Structure ---");
        university.displayDetails("");
        // students count
        System.out.println("\nTotal students in university: " + university.getStudentCount());
        // for budget
        System.out.println("Total university budget: " + university.getBudget());
    }
}

public class main {
    public static void main(String[] args) {

        //Create HealthRecord objects
        HealthRecord student1 = new HealthRecord(120.0);
        HealthRecord student2 = new HealthRecord(55.0);
        HealthRecord student3 = new HealthRecord(280.0);

        //Display individual student details
        System.out.println(student1.getDetails());
        System.out.println(student2.getDetails());
        System.out.println(student3.getDetails());

        //Display overall class statistics
        System.out.println(HealthRecord.getClassDetails());
    }
}
public class MainRunner {
    public static void main(String[] args) {
        Person p1 = new Person("Adam", 12);
        Person p2 = new Person("Barb", 15);
        Person p3 = new Person("Cathy", 14);
        Person p4 = new Person("Fred", 16);

        Person[] persons = {p1, p2, p3, p4};

        for (Person person : persons) {
            String upperCaseName = person.getName().toUpperCase();
            person.setName(upperCaseName);
            person.introduce();
        }

        int[] grades = {75, 80, 82, 78, 92};

        // use a for loop (the type that makes most sense) to increase each
        // score by 5 points
        for (int i = 0; i < grades.length; i++) {
            grades[i] += 5;
        }

        for (int grade : grades) {
            System.out.println(grade);
        }

        int[] values = {6, 2, 1, 7, 12, 5};
        for (int value : values) {
            if (value % 2 == 0) {
                System.out.println(value + " is even!");
            }
        }
    }
}

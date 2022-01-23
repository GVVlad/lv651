package homework.hw08.tasks.task1;

public abstract class Person {

    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info() {
        return "First name: " + fullName.firstName + ", Last name: " + fullName.lastName + ", Age: " + age;
    }

    public abstract String activity();

    // -----------------------
    public static class FullName {

        private String firstName;
        private String lastName;

        public FullName() {
            this.firstName = "";
            this.lastName = "";
        }

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return "FullName{" +
                    "firstName = '" + firstName + '\'' +
                    ", lastName = '" + lastName + '\'' +
                    '}';
        }
    }

}
class Person{
    String firstName;String lastName;int age;
    // Define instance variables: firstName (String), lastName (String), age (int)
    Person(){
        firstName="";lastName="";
    }
    // Default constructor
    Person(String a,String b,int c){
        firstName=a;lastName=b;age=c;
    }
    // Parameterized constructor
    String getFullName(){
        return firstName+" "+lastName;
    }
    // Method to get full name
    double avgAge(double age1,double age2){
        return (age1+age2)/2;
    }

    public static void main(String[] args) {
            Person defaultc=new Person();
        Person Person1=new Person("John","Doe",25);
        Person Person2=new Person("Alice","Smith",30);
        // Create two Person objects with different data
       String n1=Person1.getFullName();
       String n2=Person2.getFullName();
       System.out.println("Person 1: "+n1);
       System.out.println("Person 2: "+n2);
        // Display full names
        double avg=defaultc.avgAge(Person1.age,Person2.age);
        System.out.println("Average Age: "+avg);
        // Calculate and display the average age
    }
}

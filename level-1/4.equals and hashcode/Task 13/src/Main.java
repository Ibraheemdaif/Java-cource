

import java.util.*;

public class Main {



    public static void main(String[] args){
//        Set<Student> students = new HashSet<>();
//        students.add(new Student(1, "ahmed")); // new object , then new Hashcode
//        students.add(new Student(1, "ahmed")); // new object , then new Hashcode
//        students.add(new Student(2, "osama")); // new object , then new Hashcode  , then new pocket , then no dublecated
//        students.add(new Student(2, "osama")); // new object , then new Hashcode
//        students.add(new Student(3, "ali"));   // new object , then new Hashcode
//
//        System.out.println(students); // will print the references without avoiding the repetition

        // =============================================================================================================

//        Student student1 = new Student(1, "ahmed"); // ref1
//        Student student2 = new Student(2, "osama"); // ref2
//        Student student3 = new Student(1, "ali");   // ref3
//
//        Set<Student> students = new HashSet<>();
//        students.add(new Student(1, "ahmed")); // add new object with new reference
//        students.add(new Student(2, "osama")); // add new object with new reference

//                                                         // Before     After
//        System.out.println(students.contains(student1)); // false      true
//        System.out.println(students.contains(student2)); // false      true
//        System.out.println(students.contains(student3)); // false      false
        // =============================================================================================================

//        Student student1 = new Student(1, "ahmed"); // ref1
//        Student student2 = new Student(2, "osama"); // ref2
//        Student student3 = new Student(1, "ali");   // ref3
//
//        HashMap<Student, Student> map = new HashMap<>();
//        map.put(new Student(1, "ahmed"), new Student(1, "ahmed")); // new object with new reference, then new Hashcode and new pocket
//        map.put(new Student(2, "osama"), new Student(2, "osama")); // new object with new reference  //             //            //
//        map.put(new Student(1, "ali"), new Student(1, "ali")); // new object with new reference  //             //            //

//        System.out.println(map.containsKey(student1));
//        System.out.println(map.containsKey(student2));
//        System.out.println(map.containsKey(student3));
//
//        System.out.println(map.containsValue(student1)); // Handling the value relies entirely on `equals method`, so the result will be `true`.
//        System.out.println(map.containsValue(student2)); //                                         //                                        //
//        System.out.println(map.containsValue(student3)); //                                         //                                        //

        // =============================================================================================================


        // level 1
//
//        Person person1 = new Person(1,"ibraheem");
//        Person person2 = new Person(1,"Ahmed");
//
//        System.out.println(person1.equals(person2)); // Before overriding ==> false  /  After overriding ==> true

        // =============================================================================================================

//           (level 2)

//        Set <Person> personSet = new HashSet<>();
//        personSet.add(new Person(1,"Ahmed"));
//        personSet.add(new Person(1,"Ahmed"));
//        System.out.println(personSet);
//        // Before overriding methods ==> The result is 2 references (Repetition will not be ignored)
//        // After overriding methods ==> The result is only 1 reference (Repetition will be ignored)
//        personSet.add(new Person(1,"Ahmed"));
//        personSet.add(new Person(1,"Ahmed"));
//        personSet.add(new Person(2,"yousef"));
//        personSet.add(new Person(3,"Mohammed"));
//        personSet.add(new Person(2,"kareem"));
//        personSet.add(new Person(3,"khaled"));
//        personSet.add(new Person(4,"Mohammed"));
//        personSet.add(new Person(1,"Mohammed"));
//        System.out.println(personSet); // Before overriding ==> 10 remain
//                             _________________________________________________________________________
//                             |                        Changing equality logic                        |
//                             |-----------------------------------------------------------------------|
//                             |      (based on id)    |      (based on name)   |   (based on both)    |
//       After overriding ==>  |                       |                        |                      |
//                             |        4 remain       |        5 remain        |      7 remain        |
//                             |                       |                        |                      |
//                             -------------------------------------------------------------------------
// =============================================================================================================

//          (Level 3 )

//        Map<Person, String> personMap = new HashMap<>();
//
//        Person p1 = new Person(1, "Ahmed");
//        Person p2 = new Person(1, "Ahmed Clone"); // نفس الـ id
//
//        // 1. Insert two keys with the same id
//        personMap.put(p1, "Employee");
//        personMap.put(p2, "Manager"); // بما أن الـ equals/hashCode بيعتمدو على id، هيتم استبدال القيمة القديمة
//
//         2. Check if value is replaced or duplicated
//        System.out.println("Map size: " + personMap.size()); // المتوقع: 1
//        System.out.println("Value for p1/p2: " + personMap.get(p1)); // المتوقع: Manager (تم الاستبدال) ✓
//
//        // 3. Retrieve value using a new object with the same data
//        System.out.println("Retrieval with new object: " + personMap.get(new Person(1,"other"))); //  بما انه يعتبر نفس الكي هيشتغل ويرجع "Manager"
//
//        // 4. Modify a key after inserting into HashMap (Mutable Key Issue)
//        p1.setId(999); // تعديل الـ id الذي يُحسب بناءً عليه الـ hashCode
//
//        // 5. Try retrieving again & Observe the problem
//        System.out.println("Retrieving p1 after mutating id: " + personMap.get(p1)); // null
        // السبب: تغير الـ hashCode الخاص بالكائن، فأصبح الـ HashMap يبحث في Bucket مختلف تماماً عن الذي تم تخزينه فيه.
        //                (hashing)
        // new id → new key  → new hashCode → new Bucket including (new id + null)
        // ============================================================================================================

//        (Level 4)

// Scenario 1: Product in HashSet (Equality based on code only)
//        Set<Product> productsMenu = new HashSet<>();
//
//        Product p1 = new Product("pr-1",50.0);
//        Product p2 = new Product("pr-1",75.0);
//
//
//        productsMenu.add(p1);
//        productsMenu.add(p2); // It will not be added.
//        System.out.println(productsMenu.toString()); // "pr-1" , 50.0

// Scenario 2: Student Collection Equality (Simulating Case 1 vs Case 2)

//        Set<Student> studentSet = new HashSet<>();
//
//        Student s1 = new Student(101, "student1@univ.edu");
//        Student s2 = new Student(101, "student2@univ.edu");
//
//        studentSet.add(s1);
//        studentSet.add(s2);
//        System.out.println("Student set size : " + studentSet.size());
//      Result ==> 1 (if the equality depends on id)
//      Result ==> 2 (if the equality depends on email)

// Scenario 3: Car as a Key in HashMap (Parking System Simulation)

//        Map<Car , String> parking = new HashMap<>();
//
//        Car c1 = new Car("ABC-123" ,"Black");
//
//        parking.put(c1,"A-16");
//
//        Car queryCar = new Car("ABC-123" , "White");
//        System.out.println("The Car is located in "+parking.get(queryCar));
//      The Car is located in A-16 (if the equality depends on plateNumber)
//      The Car is located in null (otherwise)

    }
}
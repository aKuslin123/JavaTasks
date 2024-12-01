package com.example.javatasks.expressInterviewTasks.hw.hw2;

public class Main {
    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(5, 10);
//        double area = rectangle.calculateArea();
//        double perimeter = rectangle.calculatePerimeter();
//        System.out.println("Rectangle area = " + area);
//        System.out.println("Rectangle perimeter = " + perimeter);
//
//        BankAccount bankAccount = new BankAccount();
//        bankAccount.deposit(500);
//        System.out.println(bankAccount.getBalance());
//        bankAccount.withdraw(501);
//        bankAccount.withdraw(500);
//        System.out.println(bankAccount.getBalance());
//
//        Item item = new Item("Груша", 10, 5);
//        item.sell(6);
//        item.sell(5);
//        System.out.println(item.getInfo());
//        item.restock(1);
//        System.out.println(item.getInfo());
        
//        Person person = new Person("Иван", 20, Gender.MALE, "Москва");
//        System.out.println(person);
//        Person equalPerson = new Person("Иван", 20, Gender.FEMALE, "sdf");
//        System.out.println(equalPerson);
//        Person personSecond = new Person("Иван", 21, Gender.FEMALE, "Новгород");
//        System.out.println(personSecond);
//        Person personThird = new Person("Женя", 25, Gender.FEMALE, "Москва");
//        System.out.println(personThird);
//
//        boolean noEqual = person.equals(personSecond);
//        System.out.println(noEqual);
//
//        boolean equal = person.equals(equalPerson);
//        System.out.println(equal);

//        Student student = new Student("Иван", 1, 4.3, new int[]{4, 5, 3});
//        Student cloneStudent = student.clone();
//
//        System.out.println("Original: " + student);
//        System.out.println("Clone: " + cloneStudent);
//
//        cloneStudent.setGrades(new int[]{3, 5, 4});
//        cloneStudent.setId(2);
//        System.out.println("Original: " + student);
//        System.out.println("Clone: " + cloneStudent);

        Product originalProduct = new Product("Laptop", 999.99, 1);

        // Клонирование продукта
        Product clonedProduct = originalProduct.clone();

        System.out.println(originalProduct);
        System.out.println(clonedProduct);

        // Проверка, что это два разных объекта, но с одинаковыми значениями
        System.out.println(originalProduct != clonedProduct); // true
        System.out.println(originalProduct.equals(clonedProduct)); // true
    }
}

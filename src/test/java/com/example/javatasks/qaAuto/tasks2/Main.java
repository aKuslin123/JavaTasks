package com.example.javatasks.qaAuto.tasks2;

public class Main {
    public static void main(String[] args) {
        //урла с задачами:
        //https://docs.google.com/document/d/1CCWyLICvjqlD71hbzJU09kkh7I86Zrt2-9V2oFqLZJo/edit?tab=t.0

        //Book
        Book book = new Book("", "", 0);
        book.setAuthor("Автор книги");
        book.setPrice(15);
        System.out.println(book);

        //Person
        Person firstPerson = new Person("Егор", 20);
        Person secondPerson = new Person();
        Person thirdPerson = new Person();

        secondPerson.setName("Иван");
        secondPerson.setAge(22);
        secondPerson.setGender("Мужской");

        firstPerson.printInfo();
        secondPerson.printInfo();
        thirdPerson.printInfo();

        //Car
        Car car = new Car("бренд1","модель1", 2024);
        car.setPrice(500000.52);
        car.printCarInfo();

        //Product
        Product product = new Product("Имя1", "Категория1", 10, 5.50);
        product.setQuantity(5);
        product.printProductInfo();

        //Student
        Student[] students = new Student[3];
        students[0] = new Student("Иван", 101, 3.9);
        students[1] = new Student("Петр", 102, 4.2);
        students[2] = new Student("Семен", 103, 3.5);

        for (Student student : students) {
            student.printStudentDetail();
        }

        //Curency
        Currency currency = new Currency("Rub", 0.01);
        currency.printCurrencyInfo();
        System.out.println(currency.convertToUsd(100000.00));

        //Phone
        Phone phone = new Phone("samsung", "s7", 100);
        phone.applyDiscount(20);
        phone.printCurrencyInfo();

        //Employee
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Иван", "Жуниор", 10);
        employees[1] = new Employee("Диман", "Мидл", 100);
        employees[2] = new Employee("Егор", "Сеньер", 1000);
        employees[0].increaseSalary(50);
        employees[1].increaseSalary(100);
        employees[2].increaseSalary(10);

        for(Employee employee : employees) {
            employee.printCurrencyInfo();
        }

        //Triangle
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.printTriangleInfo();

        //Player
        Player player = new Player("Ivan", 5, 200);
        player.levelUp();
        player.addScore(150);
        player.printPlayerInfo();

        //Rectangle
        Rectangle rectangle = new Rectangle(5,6);
        rectangle.printRectangleInfo();

        //Customer
        Customer customer = new Customer("Клиент1", "1@mail.ru");
        customer.addPurchase("хлеб");
        customer.addPurchase("вода");
        customer.printPurchaseHistory();

        //Company
        Company company = new Company("Крутая компания", 5, 200000000);
        company.printCompanyInfo();

        //Circle
        Circle circle = new Circle(5);
        circle.printCircleInfo();
    }
}

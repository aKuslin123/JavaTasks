package com.example.javatasks;

public class Tasks {
    public static String intNumber(int number) {
        float result = number % 2;
        System.out.println(result);

        if (number % 2 == 0) {
            return (number + " - четное число");
        } else {
            return (number + " - не четное число");
        }
    }

    /*
    Проверка делимости 5 на 7
    Напишите функцию, которая принимает целое число и возвращает true,
    если оно делится на 5 и на 7 одновременно, и false в противном случае.
     */
    public static boolean task2(int number) {
        return number % 5 == 0 && number % 7 == 0;
    }

    /*
    Определение принадлежности числа интервалу
    Создайте функцию, которая принимает число и проверяет,
    входит ли оно в интервал от 10 до 20 включительно.
    Если число попадает в интервал, верните true, иначе - false
     */
    public static boolean task3(int number) {
        return number >= 10 && number <= 20;
    }

    /*
    Проверка на квадрат числа
    Напишите функцию, которая принимает два числа и возвращает true,
    если одно из чисел является квадратом другого,
    и false в противном случае
     */
    public static boolean task4(int a, int b) {
        return a*a == b || b*b == a;
    }

    /*
    Проверка последней цифры
    Создайте функцию, которая принимает число и проверяет, заканчивается ли оно на 5.
    Верните true, если заканчивается, и false, если нет.
     */
    public static boolean task5(int a) {
        return a % 10 == 5;
    }

    /*
    Проверка, является ли сумма цифр четной
    Реализуйте функцию, которая принимает число, суммирует его
    цифры и возвращает true, если сумма четная, и false, если
    нечетная.
     */
    public static boolean task6(int a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a = a / 10;
        }
        return sum % 2 == 0;
    }

    /*
    Сравнение двух чисел по модулю
    Напишите функцию, которая принимает два числа и возвращает true, если модули чисел
    равны, и false в противном случае
     */
    public static boolean task7(int a, int b) {
        return  Math.abs(a) == Math.abs(b);
    }

    /*
    Проверка знака числа
    Создайте функцию, которая принимает число и возвращает
    "Positive", если оно положительное, "Negative", если оно
    отрицательное, и "Zero", если оно равно нулю
     */
    public static String task8(int a) {
        if (a > 0) {
            return "Positive";
        } else if (a < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    /*
    Проверка знака числа
    Создайте функцию, которая принимает число и возвращает
    "Positive", если оно положительное, "Negative", если оно
    отрицательное, и "Zero", если оно равно нулю
     */
    public static String task8ternar(int ter) {
        return (ter > 0) ? "Positive" : (ter < 0) ? "Negative" : "Zero";
    }

    /*
    Проверка делимости на 2 или 3
    Напишите функцию, которая принимает число и возвращает true,
    если оно делится на 2 или на 3, и false в противном случае
     */
    public static boolean task9(int a) {
        return a % 2 == 0 || a % 3 == 0;
    }

    /*
    Четность суммы двух чисел
    Создайте функцию, которая принимает два числа и возвращает
    "Even", если сумма чисел четная, и "Odd", если нечетная
     */
    public static String task10(int a, int b) {
        return ((a + b) % 2 == 0) ? "Even" : "Odd";
    }

    /*
    Определение числа кратного и 4 и 6
     */
    public static boolean task11(int a) {
        return a % 4 == 0 && a % 6 == 0;
    }

    /*
    Проверка суммы на четность и кратность 10
    функция принимает два числа и возвращает "Even and Divisible by 10",
    если их сумма четная и делится на 10,
    "Even but not Divisible by 10", если сумма четная, но не делится на 10
    и "Odd", если сумма нечетная
     */
    public static String task12(int a, int b) {
        if ((a + b) % 2 == 0 && (a + b) % 10 == 0) {
            return "Even and Divisible by 10";
        } else if ((a + b) % 2 == 0) {
            return "Even but not Divisible by 10";
        } else {
            return "Odd";
        }
    }

    /*
    Проверка суммы на четность и кратность 10
    функция принимает два числа и возвращает "Even and Divisible by 10",
    если их сумма четная и делится на 10,
    "Even but not Divisible by 10", если сумма четная, но не делится на 10
    и "Odd", если сумма нечетная
     */
    public static String task12ternar(int a, int b) {
        int sum = a + b;
        return (sum % 2 == 0)
                ? (sum % 10 == 0 ? "Even and Divisible by 10" : "Even but not Divisible by 10")
                : "Odd";
    }

    /*
    Максимум трех чисел
    функция принимает три числа, возвращает наибольшее из них
     */
    public static int task13(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    /*
    Проверка на палиндромность числа
    функция которая принимает целое число и проверяет, является ли оно палиндромом
    (121)
    Верните true, если да, false если нет
     */
    // строкой
    public static boolean task14str(int a) {
        String numStr = String.valueOf(a);

        String reversedStr = new StringBuilder(numStr).reverse().toString();

        return numStr.equals(reversedStr);
    }

    /*
    Проверка на палиндромность числа
    функция которая принимает целое число и проверяет, является ли оно палиндромом
    (121)
    Верните true, если да, false если нет
     */
    // числом
    public static boolean task14int(int number) {
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }

    /*
    Кратность чисел и их сумма
    Реализуйте функцию, которая принимает два числа. Если оба числа кратны 3, верните их сумму;
    Если одно из них кратно 3, верните удвоенное значение второго числа;
    Если ни одно не кратно 3, верните null
     */
    // Integer, а не int т.к нужно возвращать null
    public static Integer task15(int a, int b) {
        if (a % 3 == 0 && b % 3 == 0) {
            return a + b;
        } else if (a % 3 == 0 || b % 3 == 0) {
            return 2 * (a % 3 == 0 ? b : a);
        } else {
            return null;
        }
    }

    /*
    Проверка возраста на категорию
    Напишите функцию, которая принимает возраст и возвращает категорию
    child - до 12 лет
    teenager - от 13 до 17
    adult - от 18 до 64
    senior - от 65 лет и старше
     */

    public static String task16(int a) {
        if (a <= 12) {
            return "child";
        } else if (a >= 13 && a <= 17) {
            return "teenager";
        } else if (a >= 18 && a <= 64) {
            return "adult";
        } else {
            return "senior";
        }
    }

    public static String task16impr(int a) {
        if (a <= 12) {
            return "child";
        } else if (a <= 17) {
            return "teenager";
        } else if (a <= 64) {
            return "adult";
        } else {
            return "senior";
        }
    }

    /*
    Проверка на делимость с остальными значениями
    Функция принимает два числа
    Проверяет делится ли первое число на второе с остатком равным 2.
    Если делится то true

    Мы добавляем проверку b > 2, чтобы убедиться, что делитель достаточно велик для того,
    чтобы остаток от деления мог быть равен 2. Если b <= 2,
    то остаток от деления не может быть равен 2,
    и функция сразу вернет false
     */
    public static boolean task17(int a, int b) {
        return b > 2 && a % b == 2;
    }
}

package employeeApp;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healthplan plan1 = new Healthplan(1, "Plan A", Plan.PLAN1);
        Healthplan plan2 = new Healthplan(2, "Plan B", Plan.PLAN2);

        System.out.println(plan1);
        System.out.println(plan2);

        // Employee
        Employee emp1 = new Employee(1, "John Doe", "john@example.com", "password123", 3);
        emp1.addHealthplan(0, "Basic Health Plan");
        emp1.addHealthplan(0, "Another Plan"); // Hata mesajı vermeli
        emp1.addHealthplan(1, "Premium Health Plan");
        emp1.addHealthplan(3, "Invalid Plan"); // Geçersiz index için hata mesajı vermeli

        System.out.println(emp1);

        // Company
        Company company = new Company(1, "TechCorp", 500000, 3);
        company.addEmployee(1, "John Doe");
        company.addEmployee(1, "Jane Doe"); // Hata mesajı vermeli
        company.addEmployee(0, "Alice Smith");
        company.addEmployee(4, "Invalid Employee"); // Geçersiz index için hata mesajı vermeli

        System.out.println(company);
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}

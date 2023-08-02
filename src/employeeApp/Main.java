package employeeApp;

import java.util.ArrayList;
import java.util.Arrays;

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
        Healthplan healthplan1=new Healthplan(1,"sigorta 1",Healthplan.Plan.BASIC);
        System.out.println(healthplan1);
        System.out.println(healthplan1.getPlan());
        System.out.println("//////");

        Employee employee1=new Employee(1,"onur","onur@gmail","asdasd");
        System.out.println(employee1);
        employee1.addHealthplan(1,"sgk");
        System.out.println(employee1);
        System.out.println("//////");

        Company company1=new Company(1,"intel",100,new String[3]);
        System.out.println(company1);
        company1.addEmployee(0,"mehmet");
        System.out.println(company1);
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

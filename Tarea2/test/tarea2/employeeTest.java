package tarea2;

import org.junit.Test;

/**
 *
 * @author xbp1
 */
public class employeeTest {
    //Fem un test amb un empleat que tingui el salari fix
    @Test
    public void salariFixTest() {
        System.out.println("TEST SALARI FIX: ");
        //Cridem al constructor passant-li els paràmetres corresponents
        employee treballador = new salari_fix("Xavier", 1, 2900.5);
        employee treballador2 = new salari_fix("Maria", 2, 2520.4);
        //Printem els treballadors amb el salari fix corresponent
        System.out.println(treballador.toString());
        System.out.println(treballador2.toString());
    }
    @Test
    public void salariVariableTest() {
        System.out.println("TEST SALARI VARIABLE: ");
        //Cridem al constructor passant-li els paràmetres correponents
        //En aquest cas el treballador obté un 40% de benefici en cada venta
        employee treballador3 = new salari_variable("Joan", 3, 0.4);
        //Fem un print després de cada venta per veure com incrementa el salari
        treballador3.addSale(300);
        System.out.println(treballador3.toString());
        treballador3.addSale(120);
        System.out.println(treballador3.toString());
        treballador3.addSale(200);
        System.out.println(treballador3.toString());
    }
}

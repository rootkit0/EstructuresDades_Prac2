package tarea1;

import org.junit.Test;

import java.util.*;

/**
 *
 * @author xbp1
 */
public class numMinorsTest {
    
    @Test
    public <E extends Comparable<E>> void numMinorsComparableTest() {
        //Testejem el mètode numMirrors amb la interficie Comparable
        System.out.println("TEST amb la interficie Comparable");
        //Creem una colecció d'enters
        Collection<Integer> c = new ArrayList();
        //Inicialitzem la colecció afegint 100 elements amb el valor de cada iteració del for
        for(int i = 0; i<100; ++i) {
            c.add(i);
        }
        //Creem un iterador de la colecció c
        Iterator<Integer> iterador = c.iterator();
        //Inicialitzem un enter per a comparar-lo amb la colecció
        Integer i = 46;
        //Printem quants elements més petits que i trobem en la colecció
        System.out.println("Hi han " + numMinors.numMinors(i, iterador) + " elements més petits");
    }
    
    @Test
    public <E extends Comparator<E>> void numMinorsComparatorTest() {
        //Testejem el mètode numMirrors amb la interficie Comparator
        System.out.println("TEST amb la interficie Comparator");
        Collection<Integer> c = new ArrayList();
        for(int i = 0; i<100; ++i) {
            c.add(i);
        }
        Iterator<Integer> iterador = c.iterator();
        Integer i = 46;
        //No podem fer servir el comp com a paràmetre ja que no ens deixa instanciar la interficie Comparator
        System.out.println("Hi han " + numMinors.numMinors(i, iterador) + " elements més petits");
    }
}
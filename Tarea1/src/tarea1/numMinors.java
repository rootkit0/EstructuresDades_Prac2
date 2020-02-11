package tarea1;

import java.util.Iterator;
import java.util.Comparator;

/**
 *
 * @author xbp1
 */

public class numMinors {
    
    public static <E extends Comparable<E>> int numMinors (E e, Iterator<E> it) {
        //Inicialitzem el comptador d'elements més petits a 0
        int minorElems = 0;
        //Mentre trobem un següent element
        while(it.hasNext()) {
            //Creem un objecte E amb el següent element
            E actual = it.next();
            //Comparem l'element amb el que ens passen com a paràmetre
            //Utilitzant la funció compareTo de la interfície Comparable
            if(actual.compareTo(e) == 0 || actual.compareTo(e) < 0) {
                //En cas que es compleixi la condició incrementem el comptador
                ++minorElems;
            }
        }
        //Retornem el comptador d'elements més petits que e
        return minorElems;
    }
    
    public static <E extends Comparator<E>> int numMinors (Comparator<E> comp, E e, Iterator<E> it) {
        int minorElems = 0;
        while(it.hasNext()) {
            E actual = it.next();
            //A diferència del mètode anterior, utilitzem la funció compare de la interficie Comparator
            if(comp.compare(actual, e) < 0 || comp.compare(actual, e) == 0) {
                ++minorElems;
            }
        }
        return minorElems;
    }
}
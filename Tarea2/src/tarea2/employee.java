package tarea2;

/**
 *
 * @author xbp1
 */
public abstract class employee {
    protected final String name;
    protected final int num;
    //Constructor de la classe employee
    public employee(String name, int num) {
        this.name = name;
        this.num = num;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return "Employe: ID: " + this.num + ", Nom: " + getName();
    }
    public abstract double salary();
    //Afegim la funció addSale al constructor per a poder fer-la servir als tests
    public abstract void addSale(double preu_venta);
}

class salari_fix extends employee {
    
    public double salari_fix;
    //Creem un constructor amb la variable salari_fix com a paràmetre adicional
    public salari_fix(String name, int num, double salari_fix) {
        super(name, num);
        this.salari_fix = salari_fix;
    }
    //Retornem el salari fix que hem passat com a paràmetre
    @Override
    public double salary() {
       return salari_fix; 
    }
    //Afegim el salari al string del constructor
    @Override
    public String toString() {
        return super.toString() + " Salari: " + salary();
    }
    //No fem servir la funció addSale ja que tenim un salari fix
    @Override
    public void addSale(double preu_venta) {}
}

class salari_variable extends employee {
    
    public double percentatge;
    public double preu_venta;
    public double salari_final;
    //Creem un constructor amb la variable percentatge com a paràmetre adicional
    public salari_variable(String name, int num, double percentatge) {
        super(name, num);
        this.percentatge = percentatge;
    }
    //Incrementem la variable salari_final, amb preu d'una venda segons el percentatge
    @Override
    public void addSale(double preu_venta) {
        salari_final += preu_venta * percentatge;
    }
    //Retornem el salari final obtingut de la/les venda/es feta/es
    @Override
    public double salary() {
        return salari_final;
    }
    //Afegim el salari final al string del constructor
    @Override
    public String toString() {
        return super.toString() + " Salari: " + salary();
    }
}
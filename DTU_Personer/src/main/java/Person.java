public class Person {
    public Person(){

    }

    public String toString(){
        return "Person \n\t[navn="+getNavn()+"]";
    }

}

public class Ansat extends Person {
    public Ansat(){

    }
    public String toString(){
        return null;
    }


}

public class Studerende extends Person {
    public Studerende(){

    }

    public String toString(){
        return null;
    }


}

public class Vip extends Ansat {
   public Vip(){

   }

    public String toString(){
        return null;
    }


}

public class Tap extends Ansat {
    public Tap(){
        
    }

    public String toString(){
        return null;
    }


}

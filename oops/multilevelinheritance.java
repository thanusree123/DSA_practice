class Animal{
    String name;
    Animal(String name){
        this.name=name;
    }
    public void eat(){
        System.out.println(name+"is eating");
    }
}
class Dog extends Animal{
    String breed;
    Dog(String name,String breed){
        super(name);
        this.breed=breed;
    }
    public void bark(){
        System.out.println(name+"is barking");
    }
}
class puppy extends Dog{
    String ageInmonths;
    puppy(String name,String breed,String ageInmonths){
        super(name,breed);
        this.ageInmonths=ageInmonths;
    }
    public void weep(){
        System.out.println(name+"puppy is weeping"+ " "+ageInmonths+" old");
    }
}
public class multilevelinheritance {
    public static void main(String args[]){
        puppy p1=new puppy("Buddy","Labrador","3 months");
        p1.eat();
        p1.bark();
        p1.weep();
    }
    
}

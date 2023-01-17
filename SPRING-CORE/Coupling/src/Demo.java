import com.spring.springcore.loosecouple.Animal;
import com.spring.springcore.loosecouple.Cat;
import com.spring.springcore.loosecouple.Person;

public class Demo {
    public static void main(String[] args) {
        //tight couple
//        Person person=new Person();
//        person.callAnimalHandler();
        //loose couple
        Animal animal = new Cat();
        Person person = new Person(animal);
        person.callAnimalhandle();

    }
}

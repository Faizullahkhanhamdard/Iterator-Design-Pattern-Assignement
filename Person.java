import java.util.Iterator;

public class Person implements Iterable<Person>, Iterator<Person> {
    
    int size = 0;
    String[] persons;
    int position = -1;

    public Person(){
        this.size = 6;
        persons = new String[size];


        persons[0] = "Faizullah";
        persons[1] = "Hashirullah";
        persons[2] = "Habibullah";
        persons[3] = "Amirullah";
        persons[4] = "Abdullah";
         persons[5] = "Khalilullah";
    }

    @Override
    public Iterator<Person> iterator() {
       
        return this;
    }

    @Override
    public boolean hasNext() {
      
        if(position < size - 1 ){
            position ++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Person next() {
       
        return (Person) iterator();
    }

}

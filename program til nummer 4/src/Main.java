import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String [] args){

        List<Person> personList = new ArrayList<>();
        personList.add(new Member(200, "Brian"));
        personList.add(new Member(150, "Trine"));
        personList.add(new Instructor(5, "Jesper"));
        personList.add(new Instructor(10, "Peter"));
        personList.add(new Administration(50, "Anna", 5, 1));
        personList.add(new Administration(25, "Susanne", 10, 2));

        for (Person p : personList){

            System.out.println(p.getName());

            if(p instanceof Member){
                System.out.println(((Member) p).getFee());
            }
            else if(p instanceof Instructor){
                System.out.println(((Instructor) p).getHours());
            }
            else if(p instanceof Administration){
                System.out.println(((Administration) p).getHours() + " " + ((Administration) p).getVacation());
            }
        }
    }
}


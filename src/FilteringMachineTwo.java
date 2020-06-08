import java.util.List;
import java.util.function.Function;

public class FilteringMachineTwo {
    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public List<String> findKidNames(List<Person> ppl) {

        Person person = new Person("", 0);

    List<Person> peolple = List.of(new Person("Adam", 10),
            new Person("Tomek", 35), new Person("Ewa", 19),
            new Person("Wojtek", 42), new Person("Ala", 14),
            new Person("Jakub", 29));

        peolple.stream()
                .filter(Person -> person.getAge() < 18)
                .forEach(System.out::println);
    }

    public List<String> convertPeopleToUsers(List<Person> people) {

        user.stream()
                .map(new Function<Person, User>() {
                    @Override
                    public User apply(Person user){
                        return new User(String name,int age,String nickName);
                    }
                })
          .forEach(new Person<User>() {
            @Override
            public void accept(String user) {
                System.out.println(user);
            }
        });
    }
}
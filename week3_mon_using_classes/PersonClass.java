//Plain Old Java Object (POJO) class PersonClass...

package Exercise1;

public class PersonClass {
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private Gender gender;

    public PersonClass (int id,
                        String first_name,
                        String last_name,
                        String email,
                        Gender gender) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "{Object number = " + id + ", First Name = " + first_name + ", Last Name = " + last_name + ", Email = " +
                email + ", Gender = " + gender;
    }


}

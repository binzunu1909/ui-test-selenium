package teachertest.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Model {
    private String firstName;
    private String lastName;
    private String email;

    public Model() {
    }

    public Model(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

}

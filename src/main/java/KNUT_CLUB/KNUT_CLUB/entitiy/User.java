package KNUT_CLUB.KNUT_CLUB.entitiy;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class User {

    @Id @GeneratedValue
    private int num;
    private String name;
    private String studentID;
    private String password;
    private String department;
    private String birth;
    private String gender;
    private String email;
    private String phone;
    private String address;
    private String detail_address;
    private String authority;

}

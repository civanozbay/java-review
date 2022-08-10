package task2;

import lombok.*;
// these are including all of the things about class
@Data
@AllArgsConstructor
@Builder
public class Customer {

    private String firstName;
    private String lastName;
    private String email;
    private String id;
    private String address;
    private String zipCode;
    private String city;
    private String state;
    private String phone;

}

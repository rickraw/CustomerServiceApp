package a.zima.slm.customerserviceapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
public class Customer {

    private String name;
    private String lastname;
    private LocalDate dayOfBirth;

}

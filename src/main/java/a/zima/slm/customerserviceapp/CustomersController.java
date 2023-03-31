package a.zima.slm.customerserviceapp;

import a.zima.slm.customerserviceapp.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomersController {
    @GetMapping("/customers")
    public List<Customer> getCustomer() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Anton", "Bauer", LocalDate.of(2000, 4, 1)));
        customers.add(new Customer("Berta", "Suttner", LocalDate.of(1958, 6, 1)));
        customers.add(new Customer("Julius", "Cäsar", LocalDate.of(1, 2, 4)));
        return customers;
    }
}

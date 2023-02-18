package mapvsflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapvsFlatmap {


    public static void main(String[] args) {

        List<Customer> customers = databaseo.getAll();

        List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emails);


        List<String> phonenumber = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phonenumber);
    }
    
}

package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Optionaleg {


    public static Customer gettingEmailid(String email) throws Exception
    {
        List<Customer> customers = Databaseo.getAll();
        return (Customer) customers.stream().filter(customer->customer.getEmail().equals(email)).findAny().orElseThrow(()->new Exception("No such email"));
    }

    // public static Customer getCustomerByEmailId(String email) throws Exception {
    //     List<Customer> customers = Databaseo.getAll();
    //    return customers.stream()
    //             .filter(customer -> customer.getEmail().equals(email))
    //             .findAny().orElseThrow(()->new Exception("no customer present with this email id"));

    // }
    
    public static void main(String[] args) throws Exception {
        
        Customer customer = new Customer(101,"Omkar",null, Arrays.asList("12345","123444"));

        // Optional<Object> emptyOptional = Optional.empty();
        // System.out.println(emptyOptional);

        // Optional<String> emaiOptional = Optional.of(customer.getEmail());
        // System.out.println(emaiOptional);
        

        // Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
        // if(emailOptional2.isPresent())
        // {
        //     System.out.println(emailOptional2.get());
        // }


        // Optional<String> emailOptional3 = Optional.ofNullable(customer.getEmail());
        // System.out.println(emailOptional3.orElse("default.com"));


        // Optional<String> emailOptional4 = Optional.ofNullable(customer.getEmail());
        // System.out.println(emailOptional4.map(String::toUpperCase).orElseGet(()->"default.."));

        gettingEmailid("pqr");

    }

}

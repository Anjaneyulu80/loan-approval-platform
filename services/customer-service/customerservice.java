@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id) {

        return new Customer(
                id,
                "John Doe",
                "john@email.com"
        );
    }
}

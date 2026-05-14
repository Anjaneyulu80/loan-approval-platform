@RestController
@RequestMapping("/credit")
public class CreditController {

    @GetMapping("/{customerId}")
    public CreditScore getScore(
            @PathVariable Long customerId) {

        return new CreditScore(750);
    }
}

@RestController
@RequestMapping("/loan")
public class LoanController {

    @PostMapping("/apply")
    public ResponseEntity<?> applyLoan(
            @RequestBody LoanRequest request) {

        return ResponseEntity.ok(
                "Loan Submitted Successfully"
        );
    }
}

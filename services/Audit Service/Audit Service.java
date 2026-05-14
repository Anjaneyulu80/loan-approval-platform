@RestController
@RequestMapping("/audit")
public class AuditController {

    @PostMapping("/logs")
    public String logAudit() {

        return "Audit Logged";
    }
}

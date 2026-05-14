@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<?> login(
            @RequestBody LoginRequest request) {

        String token = JwtUtil.generateToken(
                request.getUsername());

        return ResponseEntity.ok(token);
    }
}

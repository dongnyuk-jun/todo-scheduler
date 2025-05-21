package io.github.dongnyuk_jun.todo.controller;

import io.github.dongnyuk_jun.todo.dto.LoginRequest;
import io.github.dongnyuk_jun.todo.dto.SignupRequest;
import io.github.dongnyuk_jun.todo.dto.TokenResponse;
import io.github.dongnyuk_jun.todo.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody SignupRequest request) {
        authService.signup(request);
        return ResponseEntity.ok("회원가입 완료");
    }

    @PostMapping("/login")
    public ResponseEntity<TokenResponse> login(@RequestBody LoginRequest request) {
        TokenResponse token = authService.login(request);
        return ResponseEntity.ok(token);
    }
}

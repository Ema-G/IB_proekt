package com.example.bp_proekt.web;

import com.example.bp_proekt.model.Account;
import com.example.bp_proekt.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@RestController
@RequestMapping
public class LoginController {
    final
    AuthService authService;

    final
    HttpServletResponse httpResponse;

    public LoginController(AuthService authService, HttpServletResponse httpResponse) {
        this.authService = authService;
        this.httpResponse = httpResponse;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        Account user = authService.login(username, password);

        if(Optional.ofNullable(user).isEmpty()) {
            System.out.println("UNAUTHORIZED:" + username);

            return new ResponseEntity<>("UNAUTHORIZED!", HttpStatus.UNAUTHORIZED);
        }
        return new ResponseEntity<>("OK", HttpStatus.OK);

    }


    @PostMapping("/auth")
    public ResponseEntity<Void> auth(@RequestBody Account login){

        Account user= authService.login(login.getUsername(), login.getPassword());

        if(Optional.ofNullable(user).isPresent())
        {
            System.out.println("OK Login:" + login.getUsername());
            return new ResponseEntity<>(HttpStatus.OK);
        }else {
            System.out.println("Error Login:" + login.getUsername());
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }
}

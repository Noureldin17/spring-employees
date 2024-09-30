package com.example.restapidemo.rest;

import com.example.restapidemo.dto.JwtAuthenticationResponse;
import com.example.restapidemo.dto.SignInRequest;
import com.example.restapidemo.dto.SignUpRequest;
import com.example.restapidemo.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AuthenticationController {
    final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public JwtAuthenticationResponse signup(@RequestBody SignUpRequest signUpRequest){
        return authenticationService.signup(signUpRequest);
    }

    @PostMapping("/signin")
    public JwtAuthenticationResponse signin(@RequestBody SignInRequest signInRequest){
        return authenticationService.signin(signInRequest);
    }
}

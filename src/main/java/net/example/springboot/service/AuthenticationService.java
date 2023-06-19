package net.example.springboot.service;

import net.example.springboot.controller.AuthenticationRequest;
import net.example.springboot.controller.AuthenticationResponse;
import net.example.springboot.controller.RegisterRequest;

public interface AuthenticationService {
    public AuthenticationResponse register(RegisterRequest request);
    public AuthenticationResponse authenticate(AuthenticationRequest request);
}

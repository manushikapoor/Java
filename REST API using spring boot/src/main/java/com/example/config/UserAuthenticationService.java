package com.example.config;

import java.util.Optional;

public interface UserAuthenticationService {
	Optional<String> login(String username, String password);

}

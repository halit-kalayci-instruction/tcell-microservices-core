package com.halitkalayci.services.abstracts;

import com.halitkalayci.services.dtos.requests.RegisterRequest;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
   void add(RegisterRequest request);
}

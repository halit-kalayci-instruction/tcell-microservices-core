package com.halitkalayci.configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public interface HttpSecurityCustomizer {
    void customize(HttpSecurity httpSecurity) throws Exception;
}

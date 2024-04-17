package com.halitkalayci.annotations;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@ComponentScan(basePackages = {"com.halitkalayci"})
@EntityScan(basePackages = {"com.halitkalayci.entities"})
@EnableJpaRepositories(basePackages = {"com.halitkalayci.repositories"})
public @interface EnableSecurity {

}
// Kafka
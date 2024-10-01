package com.api1.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "registration_1")
public class Registration1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="name",nullable = false,length = 100)
      private String name;

    @Column(name="email",nullable=false,unique = true,length=100)
      private String email;

    @Column(name="mobile",nullable = false,unique = true,length = 10)
      private String mobile;

}
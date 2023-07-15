package org.example.hiproject.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor

@Table(name="Bank")
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bank_id")
    private Integer bank_id;


    @Column(name="bank_name")
    private String bank_name;

    @OneToMany(mappedBy = "bank")
    private List<Branch> branches=new ArrayList<>();

    public Bank(String bank_name) {
        this.bank_name = bank_name;
    }
}

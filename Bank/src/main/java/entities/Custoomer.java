package entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@Entity
@Table(name="Custoomer")

public class Custoomer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int custoomer_id;
    private int number;

    @ManyToMany
    @JoinTable(name="custoomer_account",joinColumns = @JoinColumn(name="custoomer_id"),
            inverseJoinColumns = @JoinColumn(name="account_id"))
    List<Account> accounts=new ArrayList<>();

    public Custoomer(int number) {
        this.number = number;
    }
}

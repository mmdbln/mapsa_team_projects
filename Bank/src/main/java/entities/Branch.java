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
@Table(name="Branch")
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="branch_id")
    private Integer branch_id;


    @Column(name="branch_code")
    private String branch_code;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="bank_id")
    private Bank bank;

    @OneToMany(mappedBy = "branch",cascade = CascadeType.ALL)
    List<Account> accounts=new ArrayList<>();

    public Branch(String branch_code) {
        this.branch_code = branch_code;
    }
}

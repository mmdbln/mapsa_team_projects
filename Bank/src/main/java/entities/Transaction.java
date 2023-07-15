package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor

@Entity
@Table(name="Transaction")

public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="transaction_id")
    private int transaction_id;

    @Column(name="type")
    private String type;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public Transaction(String type) {
        this.type = type;
    }
}

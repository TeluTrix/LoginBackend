package ch.swisscom.loginbackend.entities;


import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="nutzer")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(unique = true)
    private String email;

    private String password;

    private Role role;

    @OneToMany
    @JoinColumn(name = "fk_order")
    private List<Order> orders;
}

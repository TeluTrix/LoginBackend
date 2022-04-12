package ch.swisscom.loginbackend.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="auftrag")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(nullable = false)
    private BigDecimal total;

    @Column(nullable = false)
    @JsonProperty
    private String payment;

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @Column(nullable = false)
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "fk_user", nullable = false)
    private User user;

    @ManyToMany
    @JoinColumn(name = "fk_product", nullable = false)
    private List <Product> products;
}

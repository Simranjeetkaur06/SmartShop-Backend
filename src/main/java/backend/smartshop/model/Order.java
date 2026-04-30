package backend.smartshop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id" )
    private User user;

    @OneToMany(mappedBy ="order", cascade = CascadeType.ALL)
    private List<OrderItems> items;

    private double totalPrice;
    @Enumerated(EnumType.STRING)
    private Status status = Status.PENDING;

    private String address;
    private LocalDateTime orderDate = LocalDateTime.now();

    public enum Status {
        PENDING, CONFIRMED, SHIPPED,
        DELIVERED, CANCELLED
    }
}

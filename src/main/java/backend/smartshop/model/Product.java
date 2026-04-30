package backend.smartshop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column (length =1000)
    private String description;

    @Column(nullable = false)
    private double price;
    private String category;
    private String imageUrl;
    private int stock;
    private double rating;

    @Column(nullable = false)
    private boolean active=true;
    private LocalDateTime createdAt;

}

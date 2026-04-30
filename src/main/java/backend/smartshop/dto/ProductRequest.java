package backend.smartshop.dto;

import lombok.Data;

@Data
public class ProductRequest {
    private String name;
    private String description;
    private Double price;
    private String category;
    private String imageUrl;
    private Integer stock;
    private Double rating;
}

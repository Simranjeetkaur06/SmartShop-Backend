package backend.smartshop.repository;

import backend.smartshop.model.Cart;
import backend.smartshop.model.CartItem;
import backend.smartshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    Optional<CartItem> findByCartAndProduct(
            Cart cart, Product product);
}

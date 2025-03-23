/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejb.entity;

/**
 *
 * @author Tuan
 */
import java.io.Serializable;
import java.util.Objects;

public class CartPK implements Serializable {

    private Long productId;
    private Long userId;

    // Default constructor
    public CartPK() {
    }

    // Constructor with fields
    public CartPK(Long productId, Long userId) {
        this.productId = productId;
        this.userId = userId;
    }

    // Getters and setters (hoặc Lombok có thể tự động tạo)
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartPK cartPK = (CartPK) o;
        return Objects.equals(productId, cartPK.productId) &&
               Objects.equals(userId, cartPK.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, userId);
    }
}


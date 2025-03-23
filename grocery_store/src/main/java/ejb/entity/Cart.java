/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejb.entity;


/**
 *
 * @author Tuan
 */
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data  // Lombok tạo getter, setter, toString, equals, hashCode
@NoArgsConstructor  // Tạo constructor không tham số
@AllArgsConstructor // Tạo constructor có tham số
@IdClass(CartPK.class) // Sử dụng class CartPK để định nghĩa khóa chính composite
public class Cart {

    @Id
    @Column(name = "product_id")
    private Long productId;

    @Id
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "timestamp", columnDefinition = "TIMESTAMP(6)")
    private LocalDateTime timestamp;
}


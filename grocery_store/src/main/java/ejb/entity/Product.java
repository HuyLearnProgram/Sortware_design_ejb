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
@Table(name = "products")
@Getter
@Setter
@Builder
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(columnDefinition = "MEDIUMTEXT")
    private String description;
    
    @Column(length = 255)
    private String imageUrl;
    
    private Double price;
    
    @Column(length = 255, nullable = false)
    private String productName;
    
    private Integer quantity;
    
    @Column(length = 20)
    private String unit;
    
    private Long categoryId;
    
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;
    
    @Column(length = 255, nullable = false, updatable = false)
    private String createdBy;
    
    private LocalDateTime updatedAt;
    
    @Column(length = 255)
    private String updatedBy;
    
    private Double rating;
    
    private Integer sold;
    
    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
    
    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
    
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
}

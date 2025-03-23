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
import java.util.List;
import lombok.*;


@Entity
@Table(name = "categories")
@Data  // Lombok sẽ tự động tạo getters, setters, toString, equals, và hashCode
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // AI (Auto Increment)
    private Long id;

    @Column(name = "image_url", length = 255)
    private String imageUrl;

    @Column(name = "name", length = 255)
    private String name;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
    private List<Product> products;
}

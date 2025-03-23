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
import lombok.Data;


@Entity
@Data  // Lombok sẽ tự động tạo getter, setter, toString, equals, hashCode
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AI (Auto Increment)
    private Long id;

    @Column(name = "address", length = 255)
    private String address;

    @Column(name = "avatar_url", length = 255)
    private String avatarUrl;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "password", length = 255)
    private String password;

    @Column(name = "phone", length = 255)
    private String phone;

    @Column(name = "status")
    private int status;

    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "refresh_token", columnDefinition = "MEDIUMTEXT")
    private String refreshToken;

    @Column(name = "provider", length = 255)
    private String provider;

    @Column(name = "provider_id", length = 255)
    private String providerId;
}

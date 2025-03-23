/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejb.bean;

/**
 *
 * @author Tuan
 */
import ejb.entity.User;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import java.util.List;

@Stateless
public class UserService {

    // Inject EntityManager để làm việc với JPA
    @PersistenceContext
    private EntityManager em;

    // Phương thức để lấy tất cả người dùng từ cơ sở dữ liệu
    public List<User> getAllUsers() {
        Query query = em.createQuery("SELECT u FROM User u");
        return query.getResultList();
    }
}
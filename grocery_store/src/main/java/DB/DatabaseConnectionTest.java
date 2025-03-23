///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package DB;
//
///**
// *
// * @author Tuan
// */
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.Persistence;
//
//public class DatabaseConnectionTest {
//
//    public static void main(String[] args) {
//        // Tạo EntityManagerFactory với tên persistence unit từ file persistence.xml
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernateJpa");
//        EntityManager em = null;
//
//        try {
//            // Mở kết nối với cơ sở dữ liệu
//            em = emf.createEntityManager();
//            em.getTransaction().begin();
//
//            // Kiểm tra nếu kết nối thành công
//            System.out.println("Kết nối thành công tới cơ sở dữ liệu.");
//
//            // Có thể thực hiện các truy vấn nhỏ để đảm bảo kết nối không bị gián đoạn
//            em.createQuery("SELECT 1").getSingleResult();
//            System.out.println("Truy vấn mẫu thực thi thành công.");
//
//            em.getTransaction().commit();
//        } catch (Exception e) {
//            // In ra lỗi nếu kết nối không thành công
//            System.out.println("Lỗi khi kết nối tới cơ sở dữ liệu: " + e.getMessage());
//        } finally {
//            // Đảm bảo đóng EntityManager để giải phóng tài nguyên
//            if (em != null && em.isOpen()) {
//                em.close();
//            }
//            if (emf != null && emf.isOpen()) {
//                emf.close();
//            }
//        }
//    }
//}
//

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package client.controller;

/**
 *
 * @author Tuan
 */

package client.controller;

import ejb.remote.MySessionBeanRemote;
import jakarta.ejb.EJB;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//public class EJBClient {
//    @EJB
//    private static MySessionBeanRemote bean;
//
//    public static void main(String[] args) {
//        // Gọi phương thức EJB
//        String result = bean.sayHello("World");
//        System.out.println("EJB Response: " + result);
//    }
//}

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EJBClient extends HttpServlet {
    @EJB
    private MySessionBeanRemote bean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Gọi phương thức EJB
        String result = bean.sayHello("World");
        System.out.println("EJB Response: " + result);  // Ghi log ra console
        // Chuyển kết quả đến JSP
        request.setAttribute("result", result);
        request.getRequestDispatcher("/index2.jsp").forward(request, response);
    }
}


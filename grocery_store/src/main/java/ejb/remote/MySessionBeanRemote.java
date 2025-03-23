/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejb.remote;

import jakarta.ejb.Remote;


/**
 *
 * @author Tuan
 */


@Remote
public interface MySessionBeanRemote {
        String sayHello(String name);
}

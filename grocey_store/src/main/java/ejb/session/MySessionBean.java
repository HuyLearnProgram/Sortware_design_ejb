/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatelessEjbClass.java to edit this template
 */
package ejb.session;

import jakarta.ejb.Stateless;
import jakarta.ejb.LocalBean;
import ejb.remote.MySessionBeanRemote;
/**
 *
 * @author Tuan
 */
@Stateless
@LocalBean
public class MySessionBean implements MySessionBeanRemote{
    
    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}

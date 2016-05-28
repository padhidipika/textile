/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leena;

import com.textile.services.impl.LotServiceImpl;

/**
 *
 * @author Gaurav
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        System.out.println("tashi krishi");
        LotServiceImpl  lsi = new LotServiceImpl();
        lsi.insertLot(1,2);
    }
    
}

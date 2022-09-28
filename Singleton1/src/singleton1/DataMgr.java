/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class DataMgr {
    List<Category> categorys = new ArrayList<>();
    List<Product> products = new ArrayList<>();
    private static DataMgr instance = null;
    public DataMgr(){
    categorys = new ArrayList<>();
    products = new ArrayList<>();
        System.out.println("======");
    }
    public static DataMgr getInstance(){
        if(instance == null){
            instance = new DataMgr();
            
        }
        return instance;
    }
        
    
        
}

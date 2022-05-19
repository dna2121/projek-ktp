/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pae.project.ktp.coba;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author HP
 */
@Controller
public class dummyController {
    DummyJpaController djc = new DummyJpaController();
    List<Dummy> data = new ArrayList<>();
    
    @RequestMapping("/read")
    @ResponseBody
    public List<Dummy> getDummy(){
        try{
            data = djc.findDummyEntities();
        }
        catch (Exception e){}
        return data;
    }
    
    @RequestMapping("/create")
    public String createDummy(){
        return "dummy/create"; 
    }
}

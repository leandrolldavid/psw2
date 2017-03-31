/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Pincel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author RA21551055
 */
@RestController
public class Controle {
    
    //GET Pincel
    @RequestMapping("/pincel") //identificador 
    public List<Pincel> buscarPicel(){
        
      List resultado = new ArrayList<>();
        
        Pincel p1 = new Pincel();
        p1.setCor("azul");
        p1.setIdentificador(1);
        p1.setNum_serie(999);
        
         resultado.add(p1);

        Pincel p2 = new Pincel();
        p2.setCor("Verde");
        p2.setIdentificador(2);
        p2.setNum_serie(777);
        
        resultado.add(p2);
        
        return resultado;
    
    }
    
    
}

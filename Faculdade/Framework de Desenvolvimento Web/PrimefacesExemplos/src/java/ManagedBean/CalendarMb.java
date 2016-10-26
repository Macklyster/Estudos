/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import java.awt.event.ActionEvent;
import java.util.Date;

/**
 *
 * @author alex
 */
public class CalendarMb {
    private Date nascimento;
    
    public Date getNascimento()
    {
        return nascimento;
    }

    public void setNascimento(Date nascimento) 
    {
        this.nascimento = nascimento;
    }
    
    public void botaoClicado(ActionEvent evento)
    {
        
    }
}

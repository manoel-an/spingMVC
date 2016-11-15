/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.model.Cliente;

/**
 *
 * @author Manoel
 */
@Service
public class ClienteService {

    private Cliente cliente;

    @Autowired
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public Cliente getCliente(){
        return cliente;
    }

    @Override
    public String toString(){
        return "O cliente \"" + cliente.getNome() + "\" foi inserido com sucesso!";
    }

}

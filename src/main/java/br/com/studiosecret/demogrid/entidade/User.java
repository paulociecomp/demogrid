/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.studiosecret.demogrid.entidade;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.*;

/**
 *
 * @author paulo
 */
@Entity
@Table(name="USER")
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    
    private String nome;
    
    private String email;
    
    private String idade;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar nascimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Calendar getNascimento() {
        return nascimento;
    }

    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}

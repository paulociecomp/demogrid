/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.studiosecret.demogrid.repositorio;

import br.com.caelum.vraptor.ioc.Component;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author paulo
 */
@Component
public class UserRepository {

    private EntityManager entityManager;

    public UserRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Collection getAll() {
        Query query = this.entityManager
                .createQuery("SELECT u.id, u.nome, u.email, u.idade, DATE_FORMAT(u.nascimento, '%d/%m/%Y') FROM User as u");

        return query.getResultList();
    }
}

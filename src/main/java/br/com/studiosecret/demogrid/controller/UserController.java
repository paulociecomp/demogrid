/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.studiosecret.demogrid.controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.studiosecret.demogrid.entidade.User;
import br.com.studiosecret.demogrid.helpers.JQgrid;
import br.com.studiosecret.demogrid.repositorio.UserRepository;
import java.util.Collection;
import static br.com.caelum.vraptor.view.Results.json;

/**
 *
 * @author paulo
 */
@Resource
public class UserController {
    
    private Result result;
    private UserRepository userRepository;
    
    public UserController(Result result, UserRepository userRepository){
        this.result = result;
        this.userRepository = userRepository;
    }
    
    public void grid(){
        result.include("users", userRepository.getAll());
    }
    
    @Path("/user/load-grid")
    public void loadGrid(Integer rows, Integer page, Integer sord){
        Collection<User> users = userRepository.getAll();

        JQgrid<User> JQgrid = new JQgrid<User>();
        
        JQgrid.setPage(page);
        JQgrid.setRecords(users.size());
        JQgrid.setTotal((int)Math.ceil((double)users.size() / (double)rows));
        JQgrid.setRows(users);

        result.use(json()).withoutRoot().from(JQgrid).include("rows").serialize();
    }
}

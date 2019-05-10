/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import javax.persistence.EntityManager;
import utils.PuSelector;

/**
 *
 * @author Magnus West Madsen
 */
public class OrderFacade {

    
    public OrderFacade() {
    }
    
    public EntityManager getManager()
    {
        EntityManager em = PuSelector.getEntityManagerFactory("pu").createEntityManager();
        return em;
    }
    
    
    
}

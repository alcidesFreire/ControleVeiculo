
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author junin
 */
public class Teste {
    
 
    
    
    public static void main(String[] args) {
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("car");
      
      EntityManager em = emf.createEntityManager();
      
      Carro carro = new Carro();
      carro.setModelo("masserati");
      carro.setValor(2000);
      
      EntityTransaction tx = em.getTransaction();
      tx.begin();
      em.persist(carro);
      tx.commit();
      
      em.close();
      emf.close();
    }
    
}
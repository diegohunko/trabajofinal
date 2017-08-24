/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Subquery;
import javax.persistence.metamodel.SingularAttribute;
import modelo.*;


/**
 *
 * @author claudio
 */
public class Persistencia  {
    
    private final EntityManager em;
        

    public Persistencia(EntityManagerFactory emf) {
        this.em = emf.createEntityManager();        
    }
    
    public void iniciarTransaccion() {
        em.getTransaction().begin();
    }
    
    public void confirmarTransaccion() {
        em.getTransaction().commit();
    }

    public void descartarTransaccion() {
        em.getTransaction().rollback();
    }
    
    public void insertar(Object o) {
        this.em.persist(o);
    }
    
    public void modificar(Object o){
        this.em.merge(o);
    }

    public void eliminar(Object o){
        this.em.remove(o);
    }

    public void refrescar(Object o) {
        this.em.refresh(o);
    }
    
    // Metodo generico
    // Acepta cualquier tipo (T) que extienda de Object
    // Devuelve un objeto de tipo (T)    
    public <T extends Object> T buscar(Class<T> clase, Object id) {
        return (T) this.em.find(clase, id);
    }    
    
    // Metodo generico
    // Acepta cualquier tipo (T) que extienda de Object
    // Devuelve una lista de ese tipo (T)
    public <T extends Object> List<T> buscarTodos (Class<T> clase) {
        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        CriteriaQuery<T> consulta = cb.createQuery(clase);
        Root<T> inicio = consulta.from(clase);       
        return em.createQuery(consulta).getResultList();      
    }

    // el parametro de orden a pasar se obtiene del metamodelo generado por EclipseLink
    public <T extends Object, P extends Object> List<T> buscarTodosOrdenadosPor (Class<T> clase, SingularAttribute<T, P> orden) {
        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        CriteriaQuery<T> consulta = cb.createQuery(clase);
        Root<T> inicio = consulta.from(clase);
        consulta.orderBy(cb.asc(inicio.get(orden)));
        return em.createQuery(consulta).getResultList();
    }
    
    public Cliente buscarClientePorCuit(String cuit){
        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        CriteriaQuery<Cliente> query = cb.createQuery(Cliente.class);
        Root<Cliente> clienteRoot = query.from(Cliente.class);
        query.where(cb.equal(clienteRoot.get(Cliente_.cuit), cuit));
        Cliente retornoCliente = em.createQuery(query).getSingleResult();
        return retornoCliente;
    }
    
    /**
     * Busca los articulos de cierto tipo.
     * @param ta : tipo de artículo por el cual buscar
     * @return : Lista de los artículos de tipo ta.
     */
    public List buscarArticuloPorTipoArticulo(TipoArticulo ta){
        CriteriaBuilder builder = this.em.getCriteriaBuilder();
        CriteriaQuery<Articulo> consulta = builder.createQuery(Articulo.class);
        Root<Articulo> inicio = consulta.from(Articulo.class);
        consulta.where(builder.equal(inicio.get(Articulo_.tipo), ta));
        return em.createQuery(consulta).getResultList();
    }
    
    /**
     * Busca los Envases de cierto tipo.
     * @param ta : : tipo de artículo por el cual buscar los envases
     * @return : Lista de los Envases de tipo ta.
     */
    public List<Envase> buscarEnvasePorTipoArticulo(TipoArticulo ta){
        CriteriaBuilder builder = this.em.getCriteriaBuilder();
        CriteriaQuery<Envase> consulta = builder.createQuery(Envase.class);
        Root<Envase> inicio = consulta.from(Envase.class);
        consulta.where(builder.equal(inicio.get(Envase_.tipoArticulo), ta));
        return em.createQuery(consulta).getResultList();
    }
    
    /**
     *
     * @param <T> : The type containing the represented attribute
     * @param <P> : The type of the represented attribute
     * @param clase : Clase que se quiere obtener por tipo de artículo 
     * @param orden : Campo de tipo TipoArticulo de la clase "clase"
     * @param ta : tipo de artículo a buscar.
     * @return : 
     */
    public <T extends Object, P extends Object> List<T> buscarPorTipoArticulo (Class<T> clase, 
            SingularAttribute<T, P> orden, TipoArticulo ta) {
        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        CriteriaQuery<T> consulta = cb.createQuery(clase);
        Root<T> inicio = consulta.from(clase);
        consulta.where(cb.equal(inicio.get(orden), ta));
        return em.createQuery(consulta).getResultList();
    }
    
    public Envase buscarEnvaseCapTipo(Double capacidad, TipoArticulo ta){
        CriteriaBuilder builder = this.em.getCriteriaBuilder();
        CriteriaQuery<Envase> consulta = builder.createQuery(Envase.class);
        Root<Envase> inicio = consulta.from(Envase.class);
        consulta.where(builder.and(
                builder.equal(inicio.get(Envase_.tipoArticulo), ta)),
                builder.equal(inicio.get(Envase_.capacidad), capacidad));
        return em.createQuery(consulta).getSingleResult();
    }
    
    /**
     * Método genérico que busca en una clase, con un atributo de la clase y un algo 
     * @param <T> : The type containing the represented attribute
     * @param <P> : The type of the represented attribute
     * @param clase : Clase/entidad en la que se quiere buscar
     * @param metaModelField : el parametro metaModelField se obtiene del metamodelo generado por EclipseLink
     * @param criterio
     * @return Lista 
     */
    public <T extends Object, P extends Object> List<T> buscarPorClaseCampoYCriterio(Class<T> clase,
            SingularAttribute<T,P> metaModelField, Object criterio){
        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        CriteriaQuery<T> consulta = cb.createQuery(clase);
        Root<T> inicio = consulta.from(clase);
        consulta.where(cb.equal(inicio.get(metaModelField), criterio));
        return em.createQuery(consulta).getResultList();
//        return null;
        
    }
}


// Referencia datos genericos:
// http://docs.oracle.com/javase/tutorial/extra/generics/methods.html
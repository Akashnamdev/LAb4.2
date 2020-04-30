package akash.cg.gla.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import akash.cg.gla.spring.entity.Product;
import akash.cg.gla.spring.entity.ProductOld;

@Transactional
@Repository
public class ProductDao implements ProductDaoInterface {

	@PersistenceContext
	EntityManager em;

	@Override
	public boolean create(Product product) {
		em.persist(product);
		return true;
	}

	@Override
	public List<Product> reterivev1() {
		String Qstr = "SELECT product FROM Product product";
		TypedQuery<Product> query = em.createQuery(Qstr, Product.class);

		return query.getResultList();
	}

//	@Override
//	public List<Product> reterieve() {
////		String Qstr = "SELECT NEW package_name.Product(product.prodId, product.prodName, product.prodPrice FROM Product product");
//		TypedQuery<Product> query = em.createQuery("SELECT product.prodId, product.prodName, product.prodPrice)"
//				+ "FROM Product product", Product.class);
//
//		return query.getResultList();
		
//	}
//	@Override
//	public List<ProductOld> reterieve() {
//		String Qstr = "SELECT productold FROM ProductOld productold";
//		TypedQuery<ProductOld> query1 = em.createQuery(Qstr, ProductOld.class);
//
//		return query1.getResultList();
//	}

}
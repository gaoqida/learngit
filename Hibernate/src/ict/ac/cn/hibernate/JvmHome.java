package ict.ac.cn.hibernate;

// Generated 2014-8-24 12:59:23 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Home object for domain model class Jvm.
 * @see ict.ac.cn.hibernate.Jvm
 * @author Hibernate Tools
 */
@Stateless
public class JvmHome extends BaseHibernateDAO {

	private static final Log log = LogFactory.getLog(JvmHome.class);

	@PersistenceContext
	private EntityManager entityManager;
	public void save(Jvm transientInstance) {
		log.debug("saving Architecture instance");
		Session session = getSession();
		Transaction tran=session.beginTransaction(); 
		try {
			session.save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
		finally{
		tran.commit();
		}
	}
	public void persist(Jvm transientInstance) {
		log.debug("persisting Jvm instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Jvm persistentInstance) {
		log.debug("removing Jvm instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Jvm merge(Jvm detachedInstance) {
		log.debug("merging Jvm instance");
		try {
			Jvm result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Jvm findById(Long id) {
		log.debug("getting Jvm instance with id: " + id);
		try {
			Jvm instance = entityManager.find(Jvm.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

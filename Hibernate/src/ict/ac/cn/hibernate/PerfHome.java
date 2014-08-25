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
 * Home object for domain model class Perf.
 * @see ict.ac.cn.hibernate.Perf
 * @author Hibernate Tools
 */
@Stateless
public class PerfHome extends BaseHibernateDAO {

	private static final Log log = LogFactory.getLog(PerfHome.class);

	@PersistenceContext
	private EntityManager entityManager;
	public void save(Perf pf) {
		log.debug("saving Architecture instance");
		Session session = getSession();
		Transaction tran=session.beginTransaction(); 
		try {
			session.save(pf);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
		finally{
		tran.commit();
		}
	}
	public void persist(Perf transientInstance) {
		log.debug("persisting Perf instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Perf persistentInstance) {
		log.debug("removing Perf instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Perf merge(Perf detachedInstance) {
		log.debug("merging Perf instance");
		try {
			Perf result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Perf findById(Long id) {
		log.debug("getting Perf instance with id: " + id);
		try {
			Perf instance = entityManager.find(Perf.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

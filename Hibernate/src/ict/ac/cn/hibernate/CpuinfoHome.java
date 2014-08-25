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
 * Home object for domain model class Cpuinfo.
 * @see ict.ac.cn.hibernate.Cpuinfo
 * @author Hibernate Tools
 */
@Stateless
public class CpuinfoHome  extends BaseHibernateDAO{

	private static final Log log = LogFactory.getLog(CpuinfoHome.class);

	@PersistenceContext
	private EntityManager entityManager;
	public void save(Cpuinfo transientInstance) {
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
	public void persist(Cpuinfo transientInstance) {
		log.debug("persisting Cpuinfo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Cpuinfo persistentInstance) {
		log.debug("removing Cpuinfo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Cpuinfo merge(Cpuinfo detachedInstance) {
		log.debug("merging Cpuinfo instance");
		try {
			Cpuinfo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Cpuinfo findById(Long id) {
		log.debug("getting Cpuinfo instance with id: " + id);
		try {
			Cpuinfo instance = entityManager.find(Cpuinfo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

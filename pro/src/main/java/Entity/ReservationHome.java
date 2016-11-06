package Entity;

// default package
// Generated 4-Nov-2016 9:50:44 PM by Hibernate Tools 4.3.1.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Reservation.
 * @see .Reservation
 * @author Hibernate Tools
 */
public class ReservationHome {

	private static final Log log = LogFactory.getLog(ReservationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		
         Configuration configuration = new Configuration();
         configuration.configure("hibernate.cfg.xml");
         StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
         SessionFactory sessionFactory = configuration.buildSessionFactory(ssrb.build());
//         Session session = sessionFactory.openSession();
         if (sessionFactory.equals(null))
         {
        	 System.out.println("Shit");
         }
         return sessionFactory;
	}

	public void persist(Reservation transientInstance) {
		log.debug("persisting Reservation instance");
		try {
		Session session =sessionFactory.openSession();
		Transaction lTransaction =session.beginTransaction();
		//session.persist(transientInstance);
		session.save(transientInstance);
		boolean lAnswer =lTransaction.isActive();
		lTransaction.commit();
		lAnswer =lTransaction.wasCommitted();
		session.close();
		
		
			//sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Reservation instance) {
		log.debug("attaching dirty Reservation instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Reservation instance) {
		log.debug("attaching clean Reservation instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Reservation persistentInstance) {
		log.debug("deleting Reservation instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Reservation merge(Reservation detachedInstance) {
		log.debug("merging Reservation instance");
		try {
			Reservation result = (Reservation) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Reservation findById(int id) {
		log.debug("getting Reservation instance with id: " + id);
		try {
			Reservation instance = (Reservation) sessionFactory.getCurrentSession().get("Reservation", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Reservation instance) {
		log.debug("finding Reservation instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("Reservation")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}

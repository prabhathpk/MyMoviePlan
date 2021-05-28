package in.co.movie.ticket.dao;

import java.util.List;
import java.util.logging.Logger;

import javax.sql.rowset.serial.SerialException;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.co.movie.ticket.entity.InvoiceEntity;


@Repository
public class InvoiceDAOImpl implements InvoiceDAOInt {

	@Autowired
	private SessionFactory sessionFactory;

	private Logger log = Logger.getLogger(getClass().getName());
	
	@Override
	public long add(InvoiceEntity bean) {
		log.info("InvoiceDAOImpl  add method start");
		Session session = sessionFactory.getCurrentSession();
		long pk = (long) session.save(bean);
		log.info("InvoiceDAOImpl  add method end");
		return pk;
	}

	@Override
	public void update(InvoiceEntity bean) {
		log.info("InvoiceDAOImpl  update method start");
		sessionFactory.getCurrentSession().merge(bean);
		log.info("InvoiceDAOImpl  update method end");
	}

	@Override
	public void delete(InvoiceEntity bean) {
		log.info("InvoiceDAOImpl  delete method start");
		sessionFactory.getCurrentSession().delete(bean);
		log.info("InvoiceDAOImpl  delete method end");
	}

	@Override
	public InvoiceEntity findByName(String name) {
		log.info("InvoiceDAOImpl  login method start");
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(InvoiceEntity.class);
		criteria.add(Restrictions.eq("name", name));
		log.info("InvoiceDAOImpl  login method end");
		return (InvoiceEntity) criteria.uniqueResult();
	}

	@Override
	public InvoiceEntity findByPk(long id) {
		log.info("InvoiceDAOImpl  findPk method start");
		Session session = sessionFactory.getCurrentSession();
		log.info("InvoiceDAOImpl  findPK method end");
		return session.get(InvoiceEntity.class, id);
	}

	@Override
	public List<InvoiceEntity> search(InvoiceEntity bean, long pageNo, int pageSize) {
		log.info("InvoiceDAOImpl  search method start");
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(InvoiceEntity.class);
		if (bean != null) {

			if (bean.getId() > 0) {
				criteria.add(Restrictions.eq("id", bean.getId()));
			}
			if (bean.getName() != null && bean.getName().length() > 0) {
				criteria.add(Restrictions.like("name", bean.getName() + "%"));
			}
			if (bean.getInvoiceNumber() != null && bean.getInvoiceNumber().length() > 0) {
				criteria.add(Restrictions.like("invoiceNumber", bean.getInvoiceNumber() + "%"));
			}
			if (bean.getMovieName() != null && bean.getMovieName().length() > 0) {
				criteria.add(Restrictions.like("movieName	", bean.getMovieName() + "%"));
			}
			if (bean.getUserId() > 0) {
				criteria.add(Restrictions.eq("userId", bean.getUserId()));
			}
			
			if (pageSize > 0) {
				pageNo = (pageNo - 1) * pageSize;
				criteria.setFirstResult((int) pageNo);
				criteria.setMaxResults(pageSize);
			}
		}
		log.info("InvoiceDAOImpl  search method end");
		return criteria.list();
	}

	@Override
	public List<InvoiceEntity> search(InvoiceEntity bean) {
		log.info("InvoiceDAOImpl  search method start");

		log.info("InvoiceDAOImpl search method end");
		return search(bean, 0, 0);
	}

	

}

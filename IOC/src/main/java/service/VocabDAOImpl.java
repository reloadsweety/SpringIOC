package service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import model.Vocab;

@Component
@Transactional
public class VocabDAOImpl implements VocabDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	

	public VocabDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Vocab> getListVocab() {
		return (List<Vocab>)sessionFactory.getCurrentSession().createQuery("FROM Vocab").list();
	}

	@Override
	public void addNewVocab(Vocab vc) {
		sessionFactory.getCurrentSession().save(vc);
	}

	@Override
	public void delectVocab(Vocab vc) {
		sessionFactory.getCurrentSession().delete(vc);
	}

	@Override
	public void editVocab(Vocab vc) {
		sessionFactory.getCurrentSession().update(vc);
	}

}

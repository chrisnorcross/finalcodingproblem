package base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.RateDomainModel;
import domain.StudentDomainModel;
import util.HibernateUtil;

public class RateDAL {


	public static ArrayList<RateDomainModel> getRules() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		ArrayList<RateDomainModel> Rules = new ArrayList<RateDomainModel>();

		try {
			tx = session.beginTransaction();

			List rules = session.createQuery("FROM RateDomainModel").list();
			for (Iterator iterator = rules.iterator(); iterator.hasNext();) {
				RateDomainModel rate = (RateDomainModel) iterator.next();
				Rules.add(rate);

			}

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return Rules;

	}
	public static double getRate(int score){
		for (RateDomainModel R: RateDAL.getRules()){
			if(R.getRateID()== 1){
				return 5;
			}else if(R.getRateID()==2){
				return 4.5;
			}else if(R.getRateID()==3){
				return 4;
			}else if(R.getRateID()==4){
				return 3.75;
			}else{
				return 3.5;
			}
		}
		return 0;
	}
}

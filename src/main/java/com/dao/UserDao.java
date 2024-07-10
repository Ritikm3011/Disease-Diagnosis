package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.entity.PrescriptionData;
import com.entity.Result;
import com.entity.User;

public class UserDao {
	private SessionFactory factory;
	private Session session;
	private Transaction txn;

	public UserDao(SessionFactory factory) {
		super();
		this.factory = factory;
	}

	public boolean signUp(User user) {
		boolean f = false;
		try {
			session = factory.openSession();
			txn = session.beginTransaction();

			session.save(user);
			txn.commit();
			f = true;
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("problem in UserDao.signUp");
		}

		return f;
	}

	public User login(String email, String password) {
		User user = null;
		try {
			session = factory.openSession();
			Query query = session.createQuery("from User where email=:em and password=:ps");
			query.setParameter("em", email);
			query.setParameter("ps", password);

			user = (User) query.uniqueResult();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("problem in UserDao.login");
		}
		return user;
	}

	public Integer storeResult(PrescriptionData data) {
		boolean f = false;
		Integer generatedId = null;

		try {
			session = factory.openSession();
			txn = session.beginTransaction();

			session.save(data);
			txn.commit();
			generatedId = data.getPrescriptionId();
			System.out.println("\n\n\n" + generatedId + "\n\n\n");
			f = true;
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("problem in UserDao.storeResult");
		}

		return generatedId;

	}

	public List<Result> getResult(int userId) {
		List<Result> resultList = null;

		try {
			session = factory.openSession();
			Query query = session.createQuery("from Result where userId=:id");
			query.setParameter("id", userId);

			resultList = query.list();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("problem in AdminDao.getAllExam");
		}

		return resultList;
	}

	public String scanner(String imgName) {
		String data = "";
		System.out.println("\n\n!" + imgName + "!\n\n\n");
		if ("img.jpg".equals(imgName)) {
			data = "Headache\r\n"
					+ "High Prolactin Adv\r\n"
					+ "level Refer Opthalmologist for\r\n"
					+ "since long automated perimetry\r\n"
					+ "Latest - 164 . 4. H / O yearly\r\n"
					+ "migraine N- Blood for Serum Prolactin [\r\n"
					+ "A Serum IGF /\r\n"
					+ "R\r\n"
					+ "H / O- allergy every after 6 month S\r\n"
					+ "Acromegalic No neurosurgical intervention\r\n"
					+ "features needed at present .\r\n"
					+ "MRI - Ramal\r\n"
					+ "pituitary Warm Compress\r\n"
					+ "gland & - lower back HHIK DR . KASHIK SIL\r\n"
					+ "chiasma PROFESSOR NEUROSURGERY BRAIN & SPINE SURGEON\r\n"
					+ "80 ( 1 ) Tab Cetadom - I tab sos for Readache Tab Myocom 150mg - 1 tab sos for sparm\r\n"
					+ "2 bock / neck\r\n"
					+ "Spinal extension\r\n"
					+ "exercises\r\n"
					+ "Reg . No.- WBMC 51763";
			System.out.println("first one");
		} else if ("img1.jpg".equals(imgName)) {
			data = "Nirup Mitra MBBS DIP. CARD.\r\n"
					+ "06 NOV 2019\r\n"
					+ "Res. & Chamber: 16/2K, Ballygunge Station Road, Phone: 40607212, 11-1p.m., 6-30 - 8-30 p.m.\r\n"
					+ "under Shods, Apetite J,\r\n"
					+ "tais sensation erround meet. lot\r\n"
					+ "MR. P.P-Ray, clean d\r\n"
					+ "(bad spande, lain)\r\n"
					+ "ore.\r\n"
					+ "rueling of heat\r\n"
					+ "Glyciphage SR (16)\r\n"
					+ "RICONIA\r\n"
					+ "hasix (wc,\r\n"
					+ "SILVER\r\n"
					+ "+\r\n"
					+ "305\r\n"
					+ "negance of\r\n"
					+ "Mihercanten (6.6)\r\n"
					+ "Mikorentin (6.6)\r\n"
					+ "Lavila ekens (sc)\r\n"
					+ "VIZYLAC\r\n"
					+ "Silodal. 8\r\n"
					+ "Relaxieni\r\n"
					+ "Panez of (111).\r\n"
					+ "1\r\n"
					+ "M\r\n"
					+ "½\r\n"
					+ "40 M..\r\n"
					+ "1 table:\r\n"
					+ "befar derni\r\n"
					+ "night.";
			System.out.println("second one");
		} else if ("img2.jpg".equals(imgName)) {
			data =  "MBBS ( Govt . Medical College , Thrissur ) alg : 3.30 to 7.30\r\n"
					+ "M.D. Paediatrics ( JIPMER ) Reg . No .: 52547\r\n" + "ശിശുരോഗവിദഗ്ദൻ Ph : 8086993168\r\n"
					+ "CHC , Nemmara\r\n" + "Name : ASHVIKA Weight :\r\n" + "Age , Gender : 4 gr / F 13.25 kg\r\n"
					+ "Date : 20-9-2022\r\n" + "Clinical Description :\r\n" + "Advice :\r\n" + "URTI - RR 22 / min\r\n"
					+ "RS - BIL AEE\r\n" + "Syp CALPOL ( 25015 ) 4ML Q6H x 3 d\r\n" + "syp DELCON 3 mL TDS x 5d\r\n"
					+ "syp LEVOLIN 3 ML TDS x 5d\r\n" + "syp MEFTAL - P ( 100/5 ) 3 ML SOS\r\n";

		} else if("img3.jpg".equals(imgName)) {
			
			data = "Name:\r\n"
					+ "Queen's\r\n"
					+ "NRI Hospital\r\n"
					+ "(A Unit of M/s Chalasani Hospitals Pvt Ltd.,)\r\n"
					+ "N.Varalakshmi\r\n"
					+ "Gurudwara Lane\r\n"
					+ "Seethammadhara\r\n"
					+ "Visakhapatnam - 13\r\n"
					+ "Ph: 2827777\r\n"
					+ "Cell: 99490 98345\r\n"
					+ "Toll Free: 18005991818\r\n"
					+ "Date: 16/5/2021\r\n"
					+ "Ref. Dr. Naveen Kumm (GIVT I.P/O.P.: 2103291\r\n"
					+ "Patcovid\r\n"
					+ "Patient is admitted with\r\n"
					+ "diagnosis of mucamycosis of\r\n"
					+ "Left Sinuses and bit\r\n"
					+ "Therefore She admitted for\r\n"
					+ "Mancent and debridunt\r\n"
					+ "Hunce\r\n"
					+ "She needs this\r\n"
					+ "Fy: Liposomal Amphotericin B\r\n"
					+ "30 vials (Jummediatly)\r\n"
					+ "Dr. D. NAVEEN KUMAR\r\n"
					+ "Regd. No 41400\r\n"
					+ "M.S (ENT\r\n"
					+ "CONSULTANTK\r\n"
					+ "ENT, HEAD & NECK SURGEON\r\n"
					+ "QUEEN'S NRI HOSPITAL\r\n"
					+ "";
			
		} else if("img4.jpg".equals(imgName)) {
			
			data = "From:\r\n"
					+ "B. VENUGOPAL,\r\n"
					+ "AHM,\r\n"
					+ "RRBLK GUs,\r\n"
					+ "Pithapur\r\n"
					+ "Sir,\r\n"
					+ "sub :-\r\n"
					+ "request y\r\n"
					+ "To,\r\n"
					+ "His Holinen WMAR ALISI\r\n"
					+ "Pithecli-pate,\r\n"
					+ "UARDT,\r\n"
					+ "Pithapuram.\r\n"
					+ "Preventive Dose for CORONA) VERUS-\r\n"
					+ "reporadiz.\r\n"
					+ "please provide in\r\n"
					+ "medicine\r\n"
					+ "for\r\n"
					+ "Prevenchy\r\n"
					+ "the spread of\r\n"
					+ "of Coronaviren\r\n"
					+ "300\r\n"
					+ "studenti\r\n"
					+ "Than you\r\n"
					+ "S..\r\n"
					+ "Yours\r\n"
					+ "foft fully\r\n"
					+ "2\r\n"
					+ "GAZETTED HEADMASTER\r\n"
					+ "2.R.BH.R. GOVT. HIGH SCHOO\r\n"
					+ "PITHAPURAM-533 450";
			
		}
		
		
		else {
			data = "Default data for unknown image";
			
		}

		return data;
	}

	public PrescriptionData getScannedData(int pId) {
		PrescriptionData pData = null;

		try {
			session = factory.openSession();
			Query query = session.createQuery("from PrescriptionData where prescriptionId=:id");
			query.setParameter("id", pId);

			pData = (PrescriptionData) query.uniqueResult();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("problem in AdminDao.getAllExam");
		}

		return pData;
	}

	public boolean updatePrescriptionData(int prescriptionId, String newPrescriptionData) {
		boolean isUpdated = false;
		session = factory.openSession();
		txn = session.beginTransaction();

		try {
			PrescriptionData pData = session.get(PrescriptionData.class, prescriptionId);
			pData.setPrescriptionData(newPrescriptionData);

			// Saving the updated entity
			session.update(pData);

			// Committing the transaction
			txn.commit();
			isUpdated = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return isUpdated;
	}
	
	public List<PrescriptionData> getResultList(int userId) {
		List<PrescriptionData> resultList = null;

		try {
			session = factory.openSession();
			Query query = session.createQuery("from PrescriptionData where userId=:id");
			query.setParameter("id", userId);

			resultList = query.list();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("problem in AdminDao.getAllExam");
		}

		return resultList;
	}

	

}

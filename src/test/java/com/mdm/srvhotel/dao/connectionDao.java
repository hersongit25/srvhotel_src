package com.mdm.srvhotel.dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class connectionDao {
	
	private static SessionFactory session;
	
	public synchronized static SessionFactory getSession(){
		if( session == null ){
			StandardServiceRegistry reg = new StandardServiceRegistryBuilder()
				.configure("hbm.cfg.xml").build();
			
			Metadata meta = new MetadataSources(reg).getMetadataBuilder().build();
			session = meta.getSessionFactoryBuilder().build();
		}
		
		return session;
	}
}

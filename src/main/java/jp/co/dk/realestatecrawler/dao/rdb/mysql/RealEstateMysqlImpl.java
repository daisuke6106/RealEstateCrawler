package jp.co.dk.realestatecrawler.dao.rdb.mysql;

import java.util.Date;
import java.util.List;
import java.util.Map;

import jp.co.dk.datastoremanager.DataBaseDriverConstants;
import jp.co.dk.datastoremanager.DataStore;
import jp.co.dk.datastoremanager.exception.DataStoreManagerException;
import jp.co.dk.datastoremanager.rdb.AbstractDataBaseAccessObject;
import jp.co.dk.datastoremanager.rdb.DataBaseAccessParameter;
import jp.co.dk.datastoremanager.rdb.Sql;
import jp.co.dk.realestatecrawler.dao.rdb.RealEstate;
import jp.co.dk.realestatecrawler.dao.rdb.record.RealEstateRecord;

public class RealEstateMysqlImpl extends AbstractDataBaseAccessObject implements RealEstate{
	
	public RealEstateMysqlImpl(DataBaseAccessParameter parameter) throws DataStoreManagerException {
		super(parameter);
	}
	
	public RealEstateMysqlImpl(DataBaseDriverConstants driver, String url,String sid, String user, String password) throws DataStoreManagerException {
		super(driver, url, sid, user, password);
	}
	
	public RealEstateMysqlImpl(DataStore datastore) throws DataStoreManagerException {
		super(datastore);
	}

	@Override
	public void createTable() throws DataStoreManagerException {
		StringBuilder sb = new StringBuilder("CREATE TABLE REAL_ESTATE ");
		sb.append('(');
		sb.append("HASH               VARCHAR(128)  NOT NULL,");
		sb.append("URL                VARCHAR(512),");
		sb.append("AMOUNT             INT          ,");
		sb.append("FLOOR_PLANS        VARCHAR(128) ,");
		sb.append("BUILDING_AREA      VARCHAR(128) ,");
		sb.append("LAND_AREA          VARCHAR(128) ,");
		sb.append("BUILDING_COVERAGE  VARCHAR(128) ,");
		sb.append("FLOOR_AREA_RATIO   VARCHAR(128) ,");
		sb.append("TIME_OF_COMPLETION VARCHAR(128) ,");
		sb.append("STRUCTURE          VARCHAR(128) ,");
		sb.append("CREATE_DATE        DATETIME, ");
		sb.append("UPDATE_DATE        DATETIME, ");
		sb.append("PRIMARY KEY(HASH, URL))");
		Sql sql = new Sql(sb.toString());
		this.createTable(sql);
	}
	
	@Override
	public void dropTable() throws DataStoreManagerException {
		StringBuilder sb = new StringBuilder("DROP TABLE REAL_ESTATE ");
		Sql sql = new Sql(sb.toString());
		this.dropTable(sql);
	}

	@Override
	public List<RealEstateRecord> select(String hash) throws DataStoreManagerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(String hash,String url,int amount,String floorPlans,String buildingArea,String landArea,String buildingCoverage,String floorAreaRatio,String timeOfCompletion,String structure,Date createDate,Date updateDate) throws DataStoreManagerException {
		// TODO Auto-generated method stub
		
	}
	
}

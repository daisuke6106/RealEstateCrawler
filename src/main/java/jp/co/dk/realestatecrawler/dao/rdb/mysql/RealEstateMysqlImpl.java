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
		StringBuilder sb = new StringBuilder("CREATE TABLE PAGES ");
		sb.append('(');
		sb.append("PROTOCOL         VARCHAR(6)   NOT NULL,");
		sb.append("HOSTNAME         VARCHAR(255) NOT NULL,");
		sb.append("H_PATH           INT          NOT NULL,");
		sb.append("H_PARAM          INT          NOT NULL,");
		sb.append("FILEID           CHAR(64)     NOT NULL,");
		sb.append("TIMEID           BIGINT(8)    NOT NULL,");
		sb.append("PATH             LONGBLOB,");
		sb.append("PATH_COUNT       INT,");
		sb.append("PARAMETER        LONGBLOB,");
		sb.append("PARAMETER_COUNT  INT,");
		sb.append("REQUEST_HEADER   LONGBLOB,");
		sb.append("RESPONCE_HEADER  LONGBLOB,");
		sb.append("HTTP_STATUS_CODE CHAR(3),");
		sb.append("HTTP_VERSION     CHAR(3),");
		sb.append("CREATE_DATE      DATETIME, ");
		sb.append("UPDATE_DATE      DATETIME, ");
		sb.append("PRIMARY KEY(PROTOCOL, HOSTNAME, H_PATH, H_PARAM, FILEID, TIMEID))");
		Sql sql = new Sql(sb.toString());
		this.createTable(sql);
	}
	
	@Override
	public void dropTable() throws DataStoreManagerException {
		StringBuilder sb = new StringBuilder("DROP TABLE PAGES ");
		Sql sql = new Sql(sb.toString());
		this.dropTable(sql);
	}

	@Override
	public List<RealEstateRecord> select(String protcol, String host,
			List<String> path, Map<String, String> parameter)
			throws DataStoreManagerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RealEstateRecord select(String protcol, String host,
			List<String> path, Map<String, String> parameter, String fileId,
			long timeId) throws DataStoreManagerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(String protcol, String host, List<String> path,
			Map<String, String> parameter, Map<String, String> requestHeader,
			Map<String, List<String>> responceHeader, String httpStatusCode,
			String httpVersion, String fileid, long timeid, Date createDate,
			Date updateDate) throws DataStoreManagerException {
		// TODO Auto-generated method stub
		
	}
	
}

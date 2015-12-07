package jp.co.dk.realestatecrawler.dao.rdb.record;

import java.util.Date;

import jp.co.dk.datastoremanager.exception.DataStoreManagerException;
import jp.co.dk.datastoremanager.rdb.DataBaseRecord;
import jp.co.dk.datastoremanager.rdb.DataConvertable;
import jp.co.dk.datastoremanager.rdb.Record;

/**
 * RealEstateRecordは、REALESTATEテーブルの単一のレコードを表すクラス。
 * 
 * @version 0.1
 * @author D.Kanno
 */
public class RealEstateRecord implements DataConvertable{

	
	/** 作成日時 */
	protected Date createDate;
	
	/** 更新日時 */
	protected Date updateDate;
	
	/**
	 * 登録日時を取得する。
	 * @return 登録日時
	 */
	public Date getCreateDate() {
		return createDate;
	}
	
	/**
	 * 更新日時を取得する。
	 * @return 更新日時
	 */
	public Date getUpdateDate() {
		return updateDate;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public DataConvertable convert(DataBaseRecord record)	throws DataStoreManagerException {
		RealEstateRecord pagesRecord    = new RealEstateRecord();
		pagesRecord.createDate     = record.getTimestamp("CREATE_DATE");
		pagesRecord.updateDate     = record.getTimestamp("UPDATE_DATE");
		return pagesRecord;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public DataConvertable convert(Record record)	throws DataStoreManagerException {
		RealEstateRecord pagesRecord    = new RealEstateRecord();
		pagesRecord.createDate     = record.getDate(15);
		pagesRecord.updateDate     = record.getDate(16);
		return pagesRecord;
	}
}

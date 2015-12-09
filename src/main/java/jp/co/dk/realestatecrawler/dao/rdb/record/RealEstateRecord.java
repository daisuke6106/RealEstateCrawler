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
	
	/** ハッシュ */
	protected String hash;
	
	/** URL */
	protected String url;
	
	/** 金額 */
	protected int amount;
	
	/** 間取り */
	protected String floorPlans;
	
	/** 建物面積 */
	protected String buildingArea;
	
	/** 土地面積 */
	protected String landArea;
	
	/** 建ぺい率 */
	protected String buildingCoverage;
	
	/** 容積率 */
	protected String floorAreaRatio;
	
	/** 完成時期 */
	protected String timeOfCompletion;
	
	/** 構造・工法 */
	protected String structure;
	
	/** 作成日時 */
	protected Date createDate;
	
	/** 更新日時 */
	protected Date updateDate;
	
	/**
	 * ハッシュを取得する。
	 * @return ハッシュ
	 */
	public String getHash() {
		return hash;
	}

	/**
	 * URLを取得する。
	 * @return URL
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 金額を取得する。
	 * @return 金額
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * 間取りを取得する。
	 * @return 間取り
	 */
	public String getFloorPlans() {
		return floorPlans;
	}

	/**
	 * 建物面積を取得する。
	 * @return 建物面積
	 */
	public String getBuildingArea() {
		return buildingArea;
	}

	/**
	 * 土地面積を取得する。
	 * @return 土地面積
	 */
	public String getLandArea() {
		return landArea;
	}

	/**
	 * 建ぺい率を取得する。
	 * @return 建ぺい率
	 */
	public String getBuildingCoverage() {
		return buildingCoverage;
	}

	/**
	 * 容積率を取得する。
	 * @return 容積率
	 */
	public String getFloorAreaRatio() {
		return floorAreaRatio;
	}

	/**
	 * 完成時期を取得する。
	 * @return 完成時期
	 */
	public String getTimeOfCompletion() {
		return timeOfCompletion;
	}

	/**
	 * 構造・工法を取得する。
	 * @return 構造・工法
	 */
	public String getStructure() {
		return structure;
	}

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
		pagesRecord.hash             = record.getString("HASH");
		pagesRecord.url              = record.getString("URL");
		pagesRecord.amount           = record.getInt("AMOUNT");
		pagesRecord.floorPlans       = record.getString("FLOOR_PLANS");
		pagesRecord.buildingArea     = record.getString("BUILDING_AREA");
		pagesRecord.landArea         = record.getString("LAND_AREA");
		pagesRecord.buildingCoverage = record.getString("BUILDING_COVERAGE");
		pagesRecord.floorAreaRatio   = record.getString("FLOOR_AREA_RATIO");
		pagesRecord.timeOfCompletion = record.getString("TIME_OF_COMPLETION");
		pagesRecord.structure        = record.getString("STRUCTURE");
		pagesRecord.createDate       = record.getTimestamp("CREATE_DATE");
		pagesRecord.updateDate       = record.getTimestamp("UPDATE_DATE");
		return pagesRecord;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public DataConvertable convert(Record record)	throws DataStoreManagerException {
		RealEstateRecord pagesRecord    = new RealEstateRecord();
		pagesRecord.hash             = record.getString(1);
		pagesRecord.url              = record.getString(2);
		pagesRecord.amount           = record.getInt(3);
		pagesRecord.floorPlans       = record.getString(4);
		pagesRecord.buildingArea     = record.getString(5);
		pagesRecord.landArea         = record.getString(6);
		pagesRecord.buildingCoverage = record.getString(7);
		pagesRecord.floorAreaRatio   = record.getString(8);
		pagesRecord.timeOfCompletion = record.getString(9);
		pagesRecord.structure        = record.getString(10);
		pagesRecord.createDate       = record.getDate(11);
		pagesRecord.updateDate       = record.getDate(12);
		return pagesRecord;
	}
}
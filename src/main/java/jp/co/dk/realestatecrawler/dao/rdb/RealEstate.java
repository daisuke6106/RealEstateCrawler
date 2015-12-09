package jp.co.dk.realestatecrawler.dao.rdb;

import java.util.Date;
import java.util.List;
import java.util.Map;

import jp.co.dk.datastoremanager.DataAccessObject;
import jp.co.dk.datastoremanager.exception.DataStoreManagerException;
import jp.co.dk.realestatecrawler.dao.rdb.record.RealEstateRecord;

/**
 * RealEstateは、REAL_ESTATEテーブルに対しての制御を行うDAOインスタンスが実装するインターフェース。
 * 
 * @version 1.0
 * @author D.Kanno
 */
public interface RealEstate extends DataAccessObject{
	
	/**
	 * REAL_ESTATEテーブルを作成する。<p/>
	 * テーブル作成に失敗した場合、例外が送出される。
	 * 
	 * @throws DataStoreManagerException テーブル作成に失敗した場合
	 */
	public void createTable() throws DataStoreManagerException;

	/**
	 * REAL_ESTATEテーブルを削除する。<p/>
	 * テーブル削除に失敗した場合、例外が送出される。
	 * 
	 * @throws DataStoreManagerException テーブル作成に失敗した場合
	 */
	public void dropTable() throws DataStoreManagerException;
	
	/**
	 * REAL_ESTATEテーブルから指定の条件に合致するレコードを取得する。
	 * 
	 * @param protocol  プロトコル名
	 * @param hostname  ホスト名
	 * @param path      パスのハッシュ値
	 * @param parameter パラメータのハッシュ値
	 * @return 取得したレコードオブジェクトの一覧
	 */
	public List<RealEstateRecord> select(String hash) throws DataStoreManagerException ;
	
	/**
	 * REAL_ESTATEテーブルから指定の１レコードを登録する。<p/>
	 * 必須パラメータが設定されていない場合、例外を送出します。<br/>
	 * 
	 * @param hash ハッシュ
	 * @param url URL
	 * @param amount 金額
	 * @param floorPlans 間取り
	 * @param buildingArea 建物面積
	 * @param landArea 土地面積
	 * @param buildingCoverage 建ぺい率
	 * @param floorAreaRatio 容積率
	 * @param timeOfCompletion 完成時期
	 * @param structure 構造・工法
	 * @param createDate 作成日時
	 * @param updateDate 更新日時
	 * @throws DataStoreManagerException 登録に失敗した場合
	 */
	public void insert(String hash,String url,int amount,String floorPlans,String buildingArea,String landArea,String buildingCoverage,String floorAreaRatio,String timeOfCompletion,String structure,Date createDate,Date updateDate) throws DataStoreManagerException ;
	
}

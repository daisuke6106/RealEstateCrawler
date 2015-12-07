package jp.co.dk.realestatecrawler.message;

import java.io.Serializable;

import jp.co.dk.message.AbstractMessage;

/**
 * RealEstateCrawlerMessageは、データストアの操作にて使用するメッセージを定義する定数クラスです。
 * 
 * @version 0.1
 * @author D.Kanno
 */
public class RealEstateCrawlerMessage extends AbstractMessage implements Serializable{
	
	/** シリアルバージョンID */
	private static final long serialVersionUID = -5583067693198405513L;

	/** 指定のデータストアは対応していません。データストア種別=[{0}] */
	public static final RealEstateCrawlerMessage DETASTORETYPE_IS_NOT_SUPPORT = new RealEstateCrawlerMessage("E001");
	
	protected RealEstateCrawlerMessage(String messageId) {
		super(messageId);
	}

}

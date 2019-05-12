package kent.pckeibaLink;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.pckeiba.entity.JvdRaceShosai;
import com.pckeiba.entity.JvdRaceShosaiExample;
import com.pckeiba.entity.JvdRaceShosaiMapper;
import com.pckeiba.entity.JvdUmagotoRaceJoho;
import com.pckeiba.entity.JvdUmagotoRaceJohoExample;
import com.pckeiba.entity.JvdUmagotoRaceJohoMapper;

/**
 * MyBatisを使ってDBにアクセスするサンプルプログラムです.
 *
 */
public class App2 {
    public static void main(String[] args) {
		int i = 0;
		long start = System.currentTimeMillis();
    	long end = System.currentTimeMillis();

		String racecode = "2019051205020811";

        //1
		end = System.currentTimeMillis();
		System.out.println(++i + ".[" + (end - start) + "ms]");

		// 読み込んだ設定ファイルからSqlSessionFactoryを生成します
/********************************************************************************************************/
/*	ここから時間のかかる処理	*************************************************************************************/
/********************************************************************************************************/
		InputStream rs = null;
		try {
			rs = Resources.getResourceAsStream("pckeiba-mybatis-config.xml");
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(rs);

/********************************************************************************************************/
/*	ここまで時間のかかる処理	*************************************************************************************/
/********************************************************************************************************/

		start = System.currentTimeMillis();


		end = System.currentTimeMillis();
		System.out.println(++i + ".[" + (end - start) + "ms]");

		// SQLセッションを取得します
		try (SqlSession session = factory.openSession()) {

		    // ActorテーブルのMapperを取得します
			JvdUmagotoRaceJohoMapper map = session.getMapper(JvdUmagotoRaceJohoMapper.class);
		    // Actorテーブルの条件検索用クラスを生成します
			JvdUmagotoRaceJohoExample ex = new JvdUmagotoRaceJohoExample();
		    // WHERE
		    ex.createCriteria().andRaceCodeEqualTo(racecode);
		    // 上記の条件でテーブルを検索します
		    List<JvdUmagotoRaceJoho> actorList = map.selectByExample(ex);
		    //検索結果の表示
		    for (JvdUmagotoRaceJoho actor : actorList) {
		        System.out.println(actor.getBamei());
		    }

		}


		end = System.currentTimeMillis();
		System.out.println(++i + ".[" + (end - start) + "ms]");

		//	SQLセッション取得2
		try (SqlSession session = factory.openSession()){
			//actorテーブルのMapper取得
			JvdRaceShosaiMapper map = session.getMapper(JvdRaceShosaiMapper.class);
			//actorテーブルの条件検索用クラスを生成
			JvdRaceShosaiExample ex = new JvdRaceShosaiExample();
			//WHERE
			ex.createCriteria().andRaceCodeEqualTo(racecode);
			//List取得
			List<JvdRaceShosai> actorList = map.selectByExample(ex);
			//検索結果表示
			for(JvdRaceShosai data : actorList) {
				System.out.println(data.getKyosomeiHondai());
			}
		}
        //8
    	end = System.currentTimeMillis();
    	System.out.println(++i + ".[" + (end - start) + "ms]");
    }

}
package kent.pckeibaLink;

import java.io.IOException;
import java.util.List;

import com.aql.access.JvdUmagotoRaceJohoSession;
import com.pckeiba.entity.JvdUmagotoRaceJoho;

public class AppTest {

	public static void main(String[] args) {
		List<JvdUmagotoRaceJoho> list = null;
		try (JvdUmagotoRaceJohoSession rs = new JvdUmagotoRaceJohoSession();) {
			rs.getExample().createCriteria().andKettoTorokuBangoEqualTo("2012104503");
			rs.getExample().setOrderByClause("bamei asc");
			list = rs.getMapper().selectByExample(rs.getExample());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		for(JvdUmagotoRaceJoho data : list) {
			System.out.println(data.getBamei() + "," + data.getKakuteiChakujun());
		}
	}

}

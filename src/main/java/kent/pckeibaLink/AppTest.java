package kent.pckeibaLink;

import java.io.IOException;
import java.util.List;

import com.example.entity.ViewRaceShosai;
import com.view.racedata.RaceShosaiReader;

public class AppTest {

	public static void main(String[] args) {
		List<ViewRaceShosai> list = null;
		try (RaceShosaiReader rs = new RaceShosaiReader();) {
			rs.getExample().createCriteria().andTokubetsuKyosoBangoEqualTo("0076");
			rs.getExample().setOrderByClause("kaisai_nengappi desc limit 10");
			list = rs.getMapper().selectByExample(rs.getExample());
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (Exception e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}

		for(ViewRaceShosai data : list) {
			System.out.println(data);
		}
	}

}

package kent.pckeibaLink;

import java.io.IOException;
import java.util.List;

import com.aql.access.UmaDataViewSession;
import com.example.entity.UmaDataView;

public class AppTest {

	public static void main(String[] args) {
		List<UmaDataView> list = null;
		try (UmaDataViewSession rs = new UmaDataViewSession();) {
			rs.getExample().createCriteria().andKettoTorokuBangoEqualTo("2012104503");
			rs.getExample().setOrderByClause("bamei asc");
			list = rs.getMapper().selectByExample(rs.getExample());
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (Exception e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}

		for(UmaDataView data : list) {
			System.out.println(data.getBamei() + "," + data.getKakuteiChakujun() + "," + data.getKyosomeiHondai());
		}
	}

}

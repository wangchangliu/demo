import java.util.List;

import javax.annotation.Resource;

import com.example.demo.common.entity.req.LocationReq;
import com.example.demo.common.entity.resp.MobileFoodMerchantResp;
import com.example.demo.service.api.MobileFoodService;
import org.junit.Assert;
import org.junit.Test;

public class MobileFoodServiceTest extends BaseTest {
    @Resource
    private MobileFoodService mobileFoodService;

    @Test
    public void queryByLocationId() {
        MobileFoodMerchantResp resp = mobileFoodService.queryByLocationId(1723825);
        Assert.assertEquals("Natan's Catering", resp.applicant);
    }

    @Test
    public void queryByLocation() {
        LocationReq locationReq = new LocationReq();
        locationReq.setLongitude(-122.4039078482122300);
        locationReq.setLatitude(37.7653706693171200);
        locationReq.setMeters(10000);
        List<MobileFoodMerchantResp> resp = mobileFoodService.queryByLocation(locationReq);
        Assert.assertNotEquals(0, resp.size());
    }

    @Test
    public void queryByFoodKeyWords() {
        List<MobileFoodMerchantResp> resp = mobileFoodService.queryByFoodKeyWords("hot dogs");
        Assert.assertEquals(12, resp.size());
    }

    @Test
    public void querySaleRankList() {
        List<MobileFoodMerchantResp> resp = mobileFoodService.querySaleRankList();
        Assert.assertEquals(10, resp.size());
    }

    @Test
    public void queryComingSoon() {
        List<MobileFoodMerchantResp> resp = mobileFoodService.queryComingSoon();
        Assert.assertEquals(204, resp.size());
    }
}

import com.alibaba.fastjson.JSON;
import com.shdy.interfaces.DevPOS;
import com.shdy.requestmodel.ShowRequestlogin;
import com.sun.jna.Library;
import com.sun.jna.Native;

public class test {
    public interface Dll extends Library {

        Dll instance = (Dll) Native.loadLibrary("DevPOS", Dll.class);
        String login(String jsonData);
        String payCash(String jsonData);
        String payCancel(String jsonData);
        String getPOSInfo(String jsonData);
        String printAndTransByTrace(String jsonData);
        String queryAllTrans(String jsonData);
        String refund(String jsonData);
        String settle(String jsonData);
    }

    public static void main(String[] args) {
        ShowRequestlogin ShowRequest =new ShowRequestlogin();
        ShowRequest.setUrl("192.168.31.111:50087");
        ShowRequest.setProtocolVersion("201701");
        ShowRequest.setOptCode("01");
        ShowRequest.setOptPass("123456");
        ShowRequest.setTermidm("LD1809CA886769");
        String Request = JSON.toJSONString(ShowRequest);
        System.out.println(Request);
        System.setProperty("jna.protected","true");
        String sub ="";
        try{
            sub = Dll.instance.login(Request);
        } catch(Throwable e)
        {

        }

        System.out.printf(sub);
    }
}

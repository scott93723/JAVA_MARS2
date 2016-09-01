import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.EncodingUtils;

public class JVD204_URL {
	static List<String> A = new ArrayList<String>();
	static String urlData = null;
	public static void main(String[] args) {
		// 1.下載網路資料
		String stringURL = "https://docs.google.com/spreadsheets/d/1mbzS46w4sBqIphkPhC0I9Id8xQrVXLZ0-RaYt3ifAyc/pub?gid=1258452756&single=true&output=csv";
		try {
			// 1.產生URL定址物件
			URL myUrl = new URL(stringURL);
			// 2.連線
			URLConnection myConn = myUrl.openConnection(); // 開啟連線
			// 3.取得輸入串流
			InputStream in = myConn.getInputStream();
			// 4.抓取串流到Buffer物件
			BufferedInputStream bis = new BufferedInputStream(in);
			ByteArrayBuffer baf = new ByteArrayBuffer(bis.available());
			int data = 0;
			while ((data = bis.read()) != -1) { // 讀取BufferedInputStream中資料
				baf.append((byte) data); // 將資料置入ByteArrayBuffer中
			}
			// 5.轉換為UTF-8編碼
			urlData = EncodingUtils.getString(baf.toByteArray(), "UTF-8"); // 轉換為字串
			// System.out.println(urlData);

		} catch (Exception e) {
			e.printStackTrace();
		}
		// 2.切出所需要的資料
		Parser(urlData);
		// 3.輸出資料
		// 輸出標題&內容：
		for (int i = 0; i < A.size(); i++) {
			System.out.print(A.get(i));
		}
	}
	// 切出所需要的資料
	public static void Parser(String urlData) {
		String temp = null;
		int start = 0, end = 0;
		while (urlData.indexOf("\r\n", start) != -1) {
			end = urlData.indexOf("\r\n", start);
			temp = urlData.substring(start, end);
			start = 0 + end + 1;
			A.add(temp);
		}
		start = 0 + end + 1;
		temp = urlData.substring(start, urlData.length());
		A.add(temp);
		;
	}
}



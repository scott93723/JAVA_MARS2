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
		// 1.�U���������
		String stringURL = "https://docs.google.com/spreadsheets/d/1mbzS46w4sBqIphkPhC0I9Id8xQrVXLZ0-RaYt3ifAyc/pub?gid=1258452756&single=true&output=csv";
		try {
			// 1.����URL�w�}����
			URL myUrl = new URL(stringURL);
			// 2.�s�u
			URLConnection myConn = myUrl.openConnection(); // �}�ҳs�u
			// 3.���o��J��y
			InputStream in = myConn.getInputStream();
			// 4.�����y��Buffer����
			BufferedInputStream bis = new BufferedInputStream(in);
			ByteArrayBuffer baf = new ByteArrayBuffer(bis.available());
			int data = 0;
			while ((data = bis.read()) != -1) { // Ū��BufferedInputStream�����
				baf.append((byte) data); // �N��Ƹm�JByteArrayBuffer��
			}
			// 5.�ഫ��UTF-8�s�X
			urlData = EncodingUtils.getString(baf.toByteArray(), "UTF-8"); // �ഫ���r��
			// System.out.println(urlData);

		} catch (Exception e) {
			e.printStackTrace();
		}
		// 2.���X�һݭn�����
		Parser(urlData);
		// 3.��X���
		// ��X���D&���e�G
		for (int i = 0; i < A.size(); i++) {
			System.out.print(A.get(i));
		}
	}
	// ���X�һݭn�����
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



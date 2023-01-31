package util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadFile {// 파일 내용 읽어오기
    private String content = "";

    public ReadFile(String path) {
        BufferedReader reader;

        try {
            reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(path), "UTF-8"));
            String str = "";

            while ((str = reader.readLine()) != null) {
                content += str + "\n";
            }
            reader.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public String getCon() {

        return content;
    }

}

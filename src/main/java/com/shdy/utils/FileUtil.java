package com.shdy.utils;

import java.io.*;

/**
 * Created by xuxiya on 2018/10/19
 */
public class FileUtil {

    private static String fileNameTemp;

    /**
     * 创建对账文件
     */
    public static boolean fileCreate(String filePath, String fileName, String fileSuffix) {
        Boolean bool = false;
        //文件路径+文件名+文件后缀
        fileNameTemp = filePath + fileName + fileSuffix;
        File file = new File(fileNameTemp);
        try {
            if (!file.exists()) {
                file.createNewFile();
                bool = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return bool;
    }


    /**
     * 删除对账文件
     */
    public static boolean fileDelete(String filePath, String fileName, String fileSuffix) {
        Boolean bool = false;
        //文件路径+文件名+文件后缀
        fileNameTemp = filePath + fileName + fileSuffix;
        File file = new File(fileNameTemp);
        try {
            if (file.exists()) {
                file.delete();
                bool = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bool;
    }

    /**
     * 写入对账文件
     */

    public static boolean writeFileContent(String filePath, String StrContent) throws IOException {
        Boolean bool = false;
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        FileOutputStream fos = null;
        PrintWriter pw = null;

        try {
            File file = new File(filePath);
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            StringBuffer buffer = new StringBuffer();
            buffer.append(StrContent);
            fos = new FileOutputStream(file);
            pw = new PrintWriter(fos);
            pw.write(buffer.toString().toCharArray());
            pw.flush();
            bool = true;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //不要忘记关闭
            if (pw != null) {
                pw.close();
            }
            if (fos != null) {
                fos.close();
            }
            if (br != null) {
                br.close();
            }
            if (isr != null) {
                isr.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
        return bool;
    }

}

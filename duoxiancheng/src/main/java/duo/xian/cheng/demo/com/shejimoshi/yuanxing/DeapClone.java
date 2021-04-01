/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/31 16:22
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.shejimoshi.yuanxing;

import java.io.*;

public class DeapClone  implements Cloneable, Serializable {

    private String name ;
    private int age;
    private DeapClone friend;


    public DeapClone(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public DeapClone(String name, int age, DeapClone friend) {
        super();
        this.name = name;
        this.age = age;
        this.friend = friend;
    }
    public Object deepCopy() {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {

            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeapClone deepCopyObject = (DeapClone) ois.readObject();
            return deepCopyObject;


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } finally {
            try {
                if (bos != null ) {
                    bos.close();
                }
                if (oos != null) {
                    oos.close();
                }
                if (bis != null) {
                    bis.close();
                }
                if (ois != null) {
                    ois.close();
                }

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return null;

    }




}

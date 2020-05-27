package com.yly;

import java.io.FileInputStream;

public class MyClassLoader extends ClassLoader {

    private String path;

    public MyClassLoader(String path) {
        this.path = path;
    }

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        if (name.equals("Student")) {
            try (FileInputStream is = new FileInputStream(path + name + ".class")) {
                byte[] bytes = new byte[is.available()];
                int read = is.read(bytes);
                if (read == -1) {
                    return super.loadClass(name, resolve);
                }
                return defineClass("com.yly.Student", bytes, 0, bytes.length);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return super.loadClass(name, resolve);
    }
}

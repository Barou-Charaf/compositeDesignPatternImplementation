package org.example.composite;


public class File implements ComponnentFileSystem {

    private String name;

    public File(String name) {
        this.name = name;
    }


    @Override
    public void print() {
        System.out.println("File : "+this.name);
    }
}

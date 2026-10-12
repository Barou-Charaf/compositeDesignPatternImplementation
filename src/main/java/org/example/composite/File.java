package org.example.composite;


public class File implements ComponnentFileSystem {

    private String name;
    private  double size ;

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }


    @Override
    public void print() {
        System.out.println("File : "+this.name + "with size : "+  this.size);
    }
}

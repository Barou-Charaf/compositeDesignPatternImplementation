package org.example;


import org.example.composite.ComponnentFileSystem;
import org.example.composite.File;
import org.example.composite.Folder;

public class Main {
    public static void main(String[] args) {

        ComponnentFileSystem file1 = new File("file1",123.90);
        ComponnentFileSystem file2 = new File("file2",12.9070);
        ComponnentFileSystem file3 = new File("file3",23.90);
        ComponnentFileSystem file4 = new File("file4",13.90);

        Folder root = new Folder("root");
        Folder child1 = new Folder("child1");
        Folder child2 = new Folder("child2");

        child1.add(file1);
        child2.add(file2);
        root.add(child1);
        root.add(child2);
        root.add(file3);
        root.add(file4);

        root.print();

    }
}
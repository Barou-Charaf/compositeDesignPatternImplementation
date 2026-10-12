package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements ComponnentFileSystem {

    private String name ;

    private final List<ComponnentFileSystem> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(ComponnentFileSystem componnentFileSystem) {
        this.children.add(componnentFileSystem);
    }

    public void remove(ComponnentFileSystem componnentFileSystem) {
        this.children.remove(componnentFileSystem);
    }

    @Override
    public void print() {
        System.out.println("Folder  : " + this.name);
        if (children.isEmpty()) return;
        for (ComponnentFileSystem componnentFileSystem : this.children) {
            componnentFileSystem.print();
        }
    }


    @Override
    public double getTotalSize() {
        double totalSize = 0;
        if (children.isEmpty()) return 0;
        for (ComponnentFileSystem componnentFileSystem : this.children) {
            totalSize += componnentFileSystem.getTotalSize();
        }
        return totalSize;
    }

}

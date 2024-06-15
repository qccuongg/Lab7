/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
class Store implements Serializable {

    private static Store instance;
    private ArrayList<CD> cdlist;

    public Store() {
        cdlist = new ArrayList<CD>();
        if (FileUtils.fileExists("C:\\CDSStore", "CD.eiu")) {
            cdlist.addAll(FileUtils.read("C:\\CDStore", "CD.eiu"));
        }
    }

    public void setCdlist(ArrayList<CD> cdlist) {
        this.cdlist = cdlist;
    }

    public ArrayList<CD> getCdlist() {
        return cdlist;
    }

    public static Store getInstance() {
        if(instance == null){
            instance = new Store();
        }
        return instance;
    }
    
    public void addCD( CD cd) {
        cdlist.add(cd);
        FileUtils.write("C:\\CDStore", "CD.eiu", cdlist);
    }
    
    public CD findTitle(String title) {
        for (CD cd : cdlist) {
            if (cd.getTitle().equals(title)) {
                return cd;
            }
        }
        return null;
    }
    
    public ArrayList<CD> containsTitle(String title) {
        String titleUpperCase = title.toUpperCase();
        ArrayList<CD> similarTitle = new ArrayList<>();
        for (CD cd : cdlist) {
            if (cd.getTitle().toUpperCase().contains(titleUpperCase)) {
                similarTitle.add(cd);
            }
        }
        return similarTitle;
    }
    
    public ArrayList<CD> searchtYPEString collection0) {
        
    }
}

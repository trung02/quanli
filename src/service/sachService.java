/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import javaapplication1.sachDao;
import manager.sach;

/**
 *
 * @author trunghuynh
 */
public class sachService {
    private sachDao sach;
    public sachService(){
        sach = new sachDao();
    }
    public List<sach> getALLSach(){
        return sach.getALLSach();
    }
    public void insertSach(sach a){
        sachDao.insertSach(a);
    }
    public void UpdateSach(sach a){
        sachDao.UpdateSach(a);
    }
    public void deleteSach(sach a){
        sachDao.deleteSach(a);
    }
}

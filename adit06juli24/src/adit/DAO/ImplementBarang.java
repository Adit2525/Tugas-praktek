/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package adit.DAO;

import java.util.List;
import adit.Model.Barang;

/**
 *
 * @author vava
 */
public interface ImplementBarang {
    public void insert(Barang b);
    public void delete(int no);
    public void update(Barang b);
    public List<Barang> getAll();
    public List<Barang> getCariNama(String nama);
}

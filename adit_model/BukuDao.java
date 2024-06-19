/*
 */
package adit_model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class BukuDao {
    private List<Buku> data = new ArrayList<Buku>();
    
    public BukuDao()
    {
        data.add(new Buku("001","Bumi","Tere Liye","Erlangga","2020"));
        data.add(new Buku("002","Hujan","Tere Liye","Erlangga","2021"));
        data.add(new Buku("003","Terbit","Tere Liye","Erlangga","2022"));
    }
    
    public void insert(Buku b)
    {
        data.add(b);
    }
    
    public void update(int index, Buku b)
    {
        data.set(index, b);
    }
    
    public void delete(int index)
    {
        data.remove(index);
    }

    public Buku getBuku(int index)
    {
        return data.get(index);
    }

    public List<Buku> getAllBuku() 
    {
        return data;
    }

}

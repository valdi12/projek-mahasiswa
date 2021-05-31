
/**
 * class Mahasiswa.
 *
 * @author Muhammad Rivaldi Al Hajad
 * @version 0.1
 */
import java.util.ArrayList;
public class Mahasiswa
{
    // instance variables - replace the example below with your own
    private int nim;
    private String nama, alamat, JK;
   
    public Mahasiswa(int nim, String nama, String alamat, String JK)
    {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.JK = JK;
    }

    public String getnamaMhs()
    {
        return this.nama;
    }
    
    public int getnimMhs()
    {
        return this.nim;
    }
    
    public String getalamatMhs()
    {
        return this.alamat;
    }
    
    public String getJKMhs()
    {
        return this.JK;
    }
    
    public void setnamaMhs(String nama)
    {
        this.nama = nama;
    }
    
    public void setnimMhs(int nim)
    {
        this.nim = nim;
    }
    
    public void setalamatMhs(String alamat)
    {
        this.alamat = alamat;
    }
    
    public void setJKMhs(String JK)
    {
        this.JK = JK;
    }
    
    public void rmvJKMhs(String JK)
    {
        this.JK = JK;
    }
}
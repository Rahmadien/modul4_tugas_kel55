package tugas_modul4_kel55;


public class info {
    private int stage1,stage2,stage3,jadwal;

    public info()
    {
        
    }

    info(int stage) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void tombol(int stage)
    {
        jadwal=stage;
    }
    
    public int get_pilihanstage()
    {
        if(jadwal==1)
        {
            stage1++;
            return stage1;
        }
        else
        {
            stage2++;
            return stage2;
        }
    }
    
    
    public void get_pilihan()
    {
    switch (jadwal) {
        case 1:
            System.out.println("=========================");
            System.out.println("Berikut info harga sewa");
            System.out.printf("pilihan stage : %d",get_pilihanstage());
            System.out.println("");
            System.out.println("sewa panggung sebesar Rp500.000");
            System.out.println("");
            System.out.println("terima kasih telah mengunjungi kami");
            System.out.println("");
            break;
        case 2:
            System.out.println("=========================");
            System.out.println("Berikut info harga sewa");
            System.out.printf("pilihan stage : %d",get_pilihanstage());
            System.out.println("");
            System.out.println("sewa panggung sebesar Rp1.000.000");
            System.out.println("");
            System.out.println("terima kasih telah mengunjungi kami");
            System.out.println("");
            break;
        default:
            System.out.println("Anda salah memasukkan pilihan");
            System.out.println("Terima kasih telah mengunjungi kami");
            break;
    }          
    }

}

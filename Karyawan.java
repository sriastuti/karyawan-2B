public class Karyawan{
	String nama;
	String alamat;
	private int gaji;
	public int getGaji(){
	return gaji;
	}
	
	public void showGaji(){
		System.out.println("nama = "+nama);
		System.out.println("alamat = "+alamat);
		System.out.println("gaji = "+gaji);

	}
	public void setGaji(int money, String pesan){
		gaji = money;
		System.out.println(money);
		System.out.println(pesan);
	}
	public void setAlamat(String alamat){
		System.out.println("alamat = "+alamat);
	}
	public void setGaji(int money){
		gaji=money;
	}
	public void setNama(String nama){
		System.out.println("nama = "+nama);
	}
	
}
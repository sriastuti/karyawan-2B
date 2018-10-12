public class Programmer extends Karyawan{
	public void setGaji(int money){
		if(money<=90){
			System.out.println("Jumlah Gaji = "+money);
		}else{
			System.out.println("Gaji Melebihi Batas");
		}
	}
}
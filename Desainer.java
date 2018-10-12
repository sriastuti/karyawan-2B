public class Desainer extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=70){
			System.out.println("Jumlah Gaji = "+gaji);
		}else{
			System.out.println("Gaji Melebihi Batas");
		}
	}
}
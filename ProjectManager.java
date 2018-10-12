public class ProjectManager extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=100){
			System.out.println("jumlah Gaji  = "+gaji);
		}else{
			System.out.println("Gaji Melebihi Batas");
		}
	}
}
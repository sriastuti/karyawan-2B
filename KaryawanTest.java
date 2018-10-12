public class KaryawanTest{
	public static void main(String[] args) {
	System.out.println("Perushaan XYZ");
	System.out.println("Jabatan Programmer");
	Programmer p = new Programmer();
	p.setNama("Rani");
	p.setAlamat("Cirebon");
	p.setGaji(70);

	System.out.println("Perushaan XYZ");
	System.out.println("Jabatan Project Manager");
	ProjectManager pm = new Pm();
	pm.setNama("Riana");
	pm.setAlamat("Bandung");
	pm.setGaji(80);

	System.out.println("Perushaan XYZ");
	System.out.println("Jabatan Desainer");
	Desainer d = new Desainer();
	d.setNama("Rini");
	d.setAlamat("Sukabumi");
	d.setGaji(60);
	}
}
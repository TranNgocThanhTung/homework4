package BT;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class Test {
		static ArrayList<Student> listu= new ArrayList<Student>();
	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		boolean check=true;
		while(check==true) {
			System.out.println("1.Nhập thông tin SV và ghi vào file");
	
		    System.out.println("3.In ra thông tin SV ");
		    System.out.println("4.Tính điểm TB của SV và in ra kết quả");
		   
		    a=s.nextInt();
		switch(a) {
		case 1:NhapSV();break;
		
		case 3: Print();break;
		case 4:try {
				TinhTBvaxetKQ();
			} catch (IOException e) {
				
				e.printStackTrace();
			}break;
		}
	    }
	}

	public static void NhapSV() {
		try {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Nhập số lượng sinh viên:");
	    int n=sc.nextInt();
	    sc.nextLine();
	 
	    for(int i=0;i<n;i++) {
	   	 Student stu=new Student();
	   	 System.out.println("Nhập thông tin SV thứ"+(i+1)+":");
	   	 System.out.println("Mã SV:");
	   	stu.setId(sc.nextLine());
	   	System.out.println("Tên SV:");
	   	stu.setName(sc.nextLine());
	   	System.out.println("Giới tính:");
	   	stu.setSex(sc.nextLine());
	   	System.out.println("Điểm Python:");
	   	stu.setDiempython(sc.nextDouble());
	   	System.out.println("Điểm Java:");
	   	stu.setDiemjva(sc.nextDouble());
	   	sc.nextLine();
	   	listu.add(stu);
	    }
	  FileWriter writer=new FileWriter("C:\\Users\\ADMIN\\eclipse-workspace\\BTClassroom\\student.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			for (Student student: listu) {
				bufferedWriter.write(student.toString());
                bufferedWriter.newLine();
              
			}
			 bufferedWriter.close(); 
			System.out.println("Đã ghi thông tin SV vào file");
		
	    
		
	   	
	    }catch(IOException e) {
	    	e.printStackTrace();
	    }
	   
		
	}
		 
		
			
	public static void Print() {
		for(Student stud:listu) {
			System.out.println(stud.toString());
		}
	}
 public static void TinhTBvaxetKQ() throws IOException {
	 try {
		BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\ADMIN\\eclipse-workspace\\BTClassroom\\student.txt"));
		String line;
		while((line=reader.readLine())!=null) {
			String [] parts=line.split(",");
			if(parts.length>=5) {
			String maSV=parts[0].trim();
			String hoTen=parts[1].trim();
			String gioitinh=parts[2].trim();
			double diemPython=Double.parseDouble(parts[3].trim());
			double diemJava=Double.parseDouble(parts[4].trim());
			double diemTB=(diemJava*2+diemPython)/3;
				String ketqua=(diemTB>=5)?"Đậu":"Rớt";
			
			Student st=new Student(maSV,hoTen,gioitinh,diemPython,diemJava);
			
			st.setDiemTB(diemTB);
			
		
			st.setKetqua(ketqua);

				System.out.println("Tên SV:"+st.getName()+""+"Điểm TB:"+st.getDiemTB()+"Kết quả:"+st.getKetqua());
			}	
		}

		reader.close();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
 }
 
}

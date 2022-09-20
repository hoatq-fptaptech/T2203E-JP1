package assignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Account myAccount = new Account(1,"Trịnh Quang Hòa",1000000);
        Scanner sc = new Scanner(System.in);
        System.out.println("NHap so tien muon rut:");
        int x = sc.nextInt();
        if(myAccount.debit(x)){
            System.out.println("Rut thanh cong "+x);
        }else{
            System.out.println("So du tai khoan khong du hoac nhap sai so tien");
        }

        Account nam = new Account(2,"Cao Hoàng Nam",10000);
        if(myAccount.tranferTo(nam,10000)){
            System.out.println("Chuyen thanh cong sang tai khoan "+nam.getName());
        }else{
            System.out.println("Chuyen khoan that bai");
        }
    }

    public static void mainOld(String[] args){
        Scanner sc = new Scanner(System.in);
        //int x = sc.nextInt();// <=> scanf("%d",&x);
        PhanSo f1 = new PhanSo();
        int ts = sc.nextInt();
        f1.setTuSo(ts);
        f1.setMauSo(sc.nextInt());
        f1.inPhanSo();

        PhanSo f2= new PhanSo();
        f2.setTuSo(sc.nextInt());
        f2.setMauSo(sc.nextInt());
        f2.inPhanSo();

        PhanSo t = f1.add(f2);
        t.rutGon();
        t.inPhanSo();
    }
}

package hodon;
public class Main {
    public static void main(String[] args) {
        Result kqResult= new Result();
        Sevices setRecordSevices= new Sevices();
        //setRecordSevices.InsertRe(2, "Tuan");
       setRecordSevices.DeleteRe(2);
        for(nhanvien i:kqResult.Result_Re()){
            System.out.println(i.Name);
        }
        //kqResult.Result_Re(1);
    }
}

public class AccessProtection {
    public String name;
     int accountNo;
    private String password;
    protected String email;

    //getters and setters
    public void setPass(String pass){
        password=pass;
    }

    public String getPass(){
        return password;
    }

}

 class Bank{
    public static void main(String[] args) {
        AccessProtection obj=new AccessProtection();
        obj.name="ram";
        obj.accountNo=123;
        obj.setPass("ram@123");
        obj.email="jaisriram@gamil.com";
        System.out.println(obj.getPass());
    }
}

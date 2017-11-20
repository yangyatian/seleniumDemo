package testData;

public enum TestEnum {
    
   /* OK(200,"success"),
    FAIL(300,"fail");*/
    
    Name(1, "百度"),address(2, "西二旗");
     
    int retCode;    
    String msg;
     
    private TestEnum(int retCode, String msg) {
        this.retCode = retCode;
        this.msg = msg;
    }
 
    public int getRetCode() {
        return retCode;
    }
 
    public void setRetCode(int retCode) {
        this.retCode = retCode;
    }
 
    public String getMsg() {
        return msg;
    }
 
    public void setMsg(String msg) {
        this.msg = msg;
    }
 
    @Override
    public String toString() {
        return retCode+" "+msg;
    }
 
    public static void main(String[] args) {
        TestEnum[] vs = TestEnum.values();
        System.out.println(vs[0]);
        System.out.println(vs[0].getRetCode());
        System.out.println(vs[0].getMsg());
        System.out.println(TestEnum.Name);
        System.out.println(TestEnum.Name.getRetCode());
        System.out.println(TestEnum.Name.getMsg());
        System.out.println(TestEnum.valueOf("Name").getMsg());
    }
  
    
}

package basicStu;

public class Singletornja {

    public static void main(String[] args) {
        싱글톤반환 싱글이 = 싱글톤반환.get싱글();
        싱글톤반환 싱글이2 = 싱글톤반환.get싱글();
        싱글톤반환 싱글이3 = 싱글톤반환.get싱글();

        char a= 'a';
        System.out.println((int)a);


    }

}

class 싱글톤반환 {
    private static 싱글톤반환 싱글=new 싱글톤반환();

    private 싱글톤반환(){ }

    public static 싱글톤반환 get싱글(){
        return 싱글;
    }


}

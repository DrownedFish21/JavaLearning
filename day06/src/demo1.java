import java.util.Scanner;

@SuppressWarnings("all")
public class demo1 {
    public static void main(String[] args) {
        User user = new User("张三","sbsb");
        User user1 = new User();
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名");
        user1.setName(scan.next());
        int num = 3;
        while (true){
            System.out.print("请输入密码");
            user1.setPassWord(scan.next());
            String name = user.getName();
            String passWord = user.getPassWord();
            if(name.equals(user1.getName()) && passWord.equals(user1.getPassWord())){
                System.out.println("登陆成功！");
                break;
            }
            else {
                if(--num == 0){
                    System.out.println("请明天再来试试");
                    break;
                }
                else
                System.out.println("密码错误，您还有"+ num +"次机会");
            }
        }

    }
}

class User{
    private String name;
    private String passWord;

    public User() {
    }

    public String getName() {
        return name;
    }

    public User(String name, String passWord) {
        this.name = name;
        this.passWord = passWord;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 杨捷宁
 * @Date: 2022/02/28/17:45
 * @Description:
 */
public class Main {
    static {
        System.load("C:\\Users\\ASUS\\Desktop\\Main\\Main\\x64\\Debug\\Main.dll");
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
    }

    public static native int sum(int a, int b);
}

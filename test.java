
public class Test {

    private string epicMessage;
   
    public Test(string epicMessage) {
        this.epicMessage = epicMessage;
    }
    
    public void leakSecret() {
        System.out.Println(this.epicMessage);
    }
    
}

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Scanner;

public class Commands implements Interpreter {
    private Scanner scanner;

    @Autowired
    Container container;

    public Commands(Scanner scanner) {
        this.scanner = scanner;
    }

    public void handle() {
        String str = scanner.nextLine();
        if (str.startsWith("add")) {
            String[] command = str.split(" ");
            add(command[1]);
        } else if (str.startsWith("out")) {
            System.out.println(out());
        } else if (str.startsWith("stop")) {
            stop();
        }
    }

    private List<User> out(){
        return container.out();
    }

    private void add(String name) {
        container.add(User.builder().name(name).build());
    }


    private void stop(){
        System.exit(0);
    }
}
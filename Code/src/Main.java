 // Your main method hooks itself up to the real thing,
 // but could be run with a different `App` implementation
 // for testing
 public class Main {

   private final App app;

   public static void main(String[] args) {
     App realApp = new RealApp();
     Main program = new Main(realApp);
     program.run();
   }

   public Main(App app) {
     this.app = app;
   }

   public void run() {
     String bandwidth = app.showInfo("Enter bandwidth:");
     // etc...
   }
 }

// Defines the things you do in your application abstractly
public interface App {
  public String showInputDialog(String message);
  public void showInfo(String message);
  public void showError(String errorMessage, String value);
  public void quit();
}

// The real implementation that does the real actions
public class RealApp implements App {
  public String showInputDialog(String message) {
    return JOptionPane.showInputDialog(message);
  }

  public void showInfo(String message) {
    JOptionPane.showMessageDialog(null, message);
  }

  public void showError(String errorMessage, String value) {
    JOptionPane.showMessageDialog(null, message, value,
        JOptionPane.ERROR_MESSAGE);
  }

  public void quit() {
    System.exit(0);
  }
}

// A fake implementation that doesn't actually do the real thing,
// but lets you see what happened for testing
public class TestingApp implements App {
  public String testUserInput = "";
  public boolean showedInfoBox = false;
  public boolean showedErrorBox = false;
  public boolean quitProgram = false;

  public String showInputDialog(String message) {
    return testUserInput;
  }

  public void showInfo(String message) {
    showedInfoBox = true;
  }

  public void showError(String errorMessage, String value) {
    showedErrorBox = true;
  }

  public void quit() {
    quitProgram = true;
  }
}
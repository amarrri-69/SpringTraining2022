import java.util.function.Consumer;
import java.util.function.Supplier;

public class RunDriveTrain implements Command {
  public Consumer<Double> runMotor;
    public Supplier<Double> motorPower;

  private int countdown = 5;
  public boolean initialization = false; 

  
  public RunDriveTrain(Supplier<Double> motorPower){
      this.runMotor = (power) -> {
          System.out.println("Set drivetrain power to " + power);
      };
      this.motorPower = motorPower;
  }

  @Override
  public void init() {
    System.out.println("Initializing drivetrain...");
    this.initialization = true;
  }

    
    @Override
    public void execute(){
      if (this.initialization) {
        this.runMotor.accept(this.motorPower.get());
      }
      else {
        System.out.println("initialize drivetrain first");
      }
    }

    @Override
    public boolean isFinished(){
        this.countdown--;
        return this.countdown == 0;
    }

    @Override
    public void end(boolean interrupted){
        this.runMotor.accept(0.0);
    }
}

import java.util.function.Consumer;
import java.util.function.Supplier;

class ShootBall implements Command {
  
  public Consumer<Boolean> shoot;
  public Supplier<Boolean> gamepadA;

  private int countdown = 3;
  public boolean initialization;
  
  public ShootBall(Supplier<Boolean> gamepadA) {
    this.shoot = (button) -> {
      System.out.println("Shooting state: " + button);
    };
    this.gamepadA = gamepadA;
  }
  
  @Override
  public void init() {
    System.out.println("initializing shooter...");
    initialization = true;
  }

  @Override
  public void execute(){
     if (initialization) {
       this.shoot.accept(this.gamepadA.get());
     }
    else {
      System.out.println("initialize shooter first");
    }
  }
  
  @Override
  public boolean isFinished(){
      this.countdown--;
      return this.countdown == 0;
    }

  @Override
  public void end(boolean interrupted) {
    this.shoot.accept(false);
  } 

}


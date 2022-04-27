import java.util.Random;

class Main {
  
  public static void main(String[] args) {
    Random random = new Random();

    ShootBall shooter = new ShootBall(() -> {
            return random.nextBoolean();
        });

    RunDriveTrain drivetrain = new RunDriveTrain(() -> {
            return Math.random();
        });

    drivetrain.init();
    shooter.init();

    while(!drivetrain.isFinished()){
        drivetrain.execute();
    }

    while(!shooter.isFinished()){
            shooter.execute();
        }
    
    drivetrain.end(false);
    shooter.end(false);
  }
}

public interface Command {
  
  public void init();
  
  public void execute();

  public boolean isFinished();

  public void end(boolean interrupted);
  
}

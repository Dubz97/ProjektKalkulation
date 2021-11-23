package Model;

public class ProjectParts {

  private String subProjectName;
  private String tasks;
  private double timeFrame;
  private double timeUsed;
  private double timeLeft;
  private int partsId;
  private int projectId;


  public ProjectParts(String subProjectName, String tasks, double timeFrame, double timeUsed, double timeLeft, int partsId, int projectId) {
    this.subProjectName = subProjectName;
    this.tasks = tasks;
    this.timeFrame = timeFrame;
    this.timeUsed = timeUsed;
    this.timeLeft = timeLeft;
    this.partsId = partsId;
    this.projectId = projectId;
  }

  public ProjectParts() {}

  public String getSubProjectName() {
    return subProjectName;
  }

  public void setSubProjectName(String subProjectName) {
    this.subProjectName = subProjectName;
  }

  public String getTasks() {
    return tasks;
  }

  public void setTasks(String tasks) {
    this.tasks = tasks;
  }

  public double getTimeFrame() {
    return timeFrame;
  }

  public void setTimeFrame(double timeFrame) {
    this.timeFrame = timeFrame;
  }

  public double getTimeUsed() {
    return timeUsed;
  }

  public void setTimeUsed(double timeUsed) {
    this.timeUsed = timeUsed;
  }

  public double getTimeLeft() {
    return timeLeft;
  }

  public void setTimeLeft(double timeLeft) {
    this.timeLeft = timeLeft;
  }

  public int getPartsId() {
    return partsId;
  }

  public void setPartsId(int partsId) {
    this.partsId = partsId;
  }

  public int getProjectId() {
    return projectId;
  }

  public void setProjectId(int projectId) {
    this.projectId = projectId;
  }
}
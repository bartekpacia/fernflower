package records;

public record TestRecordSimple(int x, int y, int z) {
  public int z() {
    return 0;
  }
}
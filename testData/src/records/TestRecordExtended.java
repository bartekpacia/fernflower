package records;

public record TestRecordExtended(int x, int y, int z) {
  public TestRecordExtended(int x, int y, int z, int w) {
    this(x, y, z);
    // ignore w
  }
  
  public int z() {
    return 0;
  }
}
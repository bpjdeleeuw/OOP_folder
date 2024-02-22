package factory;

public interface ProductVisitor {
  void visit(Chair chair);
  void visit(Fridge fridge);
}

/* This file was generated with JastAdd2 (http://jastadd.org) version R20130212 (r1031) */
package soot.JastAddJ;

/**
 * @production PreDecExpr : {@link Unary};
 * @ast node
 * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.4Frontend/java.ast:138
 */
public class PreDecExpr extends Unary implements Cloneable {
  /** @apilevel low-level */
  public void flushCache() {
    super.flushCache();
  }
  /** @apilevel internal */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal */
  @SuppressWarnings({"unchecked", "cast"})
  public PreDecExpr clone() throws CloneNotSupportedException {
    PreDecExpr node = (PreDecExpr) super.clone();
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /** @apilevel internal */
  @SuppressWarnings({"unchecked", "cast"})
  public PreDecExpr copy() {
    try {
      PreDecExpr node = clone();
      node.parent = null;
      if (children != null) node.children = children.clone();
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node. The copy is dangling, i.e. has no parent.
   *
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   */
  @SuppressWarnings({"unchecked", "cast"})
  public PreDecExpr fullCopy() {
    PreDecExpr tree = copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = children[i];
        if (child != null) {
          child = child.fullCopy();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * @ast method
   * @aspect DefiniteAssignment
   * @declaredat
   *     /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.4Frontend/DefiniteAssignment.jrag:81
   */
  public void definiteAssignment() {
    if (getOperand().isVariable()) {
      Variable v = getOperand().varDecl();
      if (v != null && v.isFinal()) {
        error("++ and -- can not be applied to final variable " + v);
      }
    }
  }
  /**
   * @ast method
   * @aspect DA
   * @declaredat
   *     /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.4Frontend/DefiniteAssignment.jrag:483
   */
  protected boolean checkDUeverywhere(Variable v) {
    if (getOperand().isVariable() && getOperand().varDecl() == v) if (!isDAbefore(v)) return false;
    return super.checkDUeverywhere(v);
  }
  /**
   * @ast method
   * @aspect TypeCheck
   * @declaredat
   *     /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.4Frontend/TypeCheck.jrag:309
   */
  public void typeCheck() {
    if (!getOperand().isVariable()) error("prefix decrement expression only work on variables");
    else if (!getOperand().type().isNumericType())
      error("unary decrement only operates on numeric types");
  }
  /**
   * @ast method
   * @aspect Expressions
   * @declaredat
   *     /Users/eric/Documents/workspaces/clara-soot/JastAddExtensions/JimpleBackend/Expressions.jrag:770
   */
  public soot.Value eval(Body b) {
    return emitPrefix(b, -1);
  }
  /** @ast method */
  public PreDecExpr() {
    super();
  }
  /**
   * Initializes the child array to the correct size. Initializes List and Opt nta children.
   *
   * @apilevel internal
   * @ast method
   * @ast method
   */
  public void init$Children() {
    children = new ASTNode[1];
  }
  /** @ast method */
  public PreDecExpr(Expr p0) {
    setChild(p0, 0);
  }
  /**
   * @apilevel low-level
   * @ast method
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @ast method
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /**
   * Replaces the Operand child.
   *
   * @param node The new node to replace the Operand child.
   * @apilevel high-level
   * @ast method
   */
  public void setOperand(Expr node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Operand child.
   *
   * @return The current node used as the Operand child.
   * @apilevel high-level
   * @ast method
   */
  public Expr getOperand() {
    return (Expr) getChild(0);
  }
  /**
   * Retrieves the Operand child.
   *
   * <p><em>This method does not invoke AST transformations.</em>
   *
   * @return The current node used as the Operand child.
   * @apilevel low-level
   * @ast method
   */
  public Expr getOperandNoTransform() {
    return (Expr) getChildNoTransform(0);
  }
  /**
   * @attribute syn
   * @aspect PrettyPrint
   * @declaredat
   *     /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.4Frontend/PrettyPrint.jadd:376
   */
  public String printPreOp() {
    ASTNode$State state = state();
    try {
      return "--";
    } finally {
    }
  }
  /**
   * @declaredat
   *     /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.4Frontend/DefiniteAssignment.jrag:47
   * @apilevel internal
   */
  public boolean Define_boolean_isDest(ASTNode caller, ASTNode child) {
    if (caller == getOperandNoTransform()) {
      return true;
    } else {
      return getParent().Define_boolean_isDest(this, caller);
    }
  }
  /**
   * @declaredat
   *     /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.4Frontend/DefiniteAssignment.jrag:55
   * @apilevel internal
   */
  public boolean Define_boolean_isIncOrDec(ASTNode caller, ASTNode child) {
    if (caller == getOperandNoTransform()) {
      return true;
    } else {
      return getParent().Define_boolean_isIncOrDec(this, caller);
    }
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}

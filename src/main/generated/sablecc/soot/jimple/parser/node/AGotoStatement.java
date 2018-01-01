/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class AGotoStatement extends PStatement {
  private PGotoStmt _gotoStmt_;

  public AGotoStatement() {
    // Constructor
  }

  public AGotoStatement(@SuppressWarnings("hiding") PGotoStmt _gotoStmt_) {
    // Constructor
    setGotoStmt(_gotoStmt_);
  }

  @Override
  public Object clone() {
    return new AGotoStatement(cloneNode(this._gotoStmt_));
  }

  @Override
  public void apply(Switch sw) {
    ((Analysis) sw).caseAGotoStatement(this);
  }

  public PGotoStmt getGotoStmt() {
    return this._gotoStmt_;
  }

  public void setGotoStmt(PGotoStmt node) {
    if (this._gotoStmt_ != null) {
      this._gotoStmt_.parent(null);
    }

    if (node != null) {
      if (node.parent() != null) {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    this._gotoStmt_ = node;
  }

  @Override
  public String toString() {
    return "" + toString(this._gotoStmt_);
  }

  @Override
  void removeChild(@SuppressWarnings("unused") Node child) {
    // Remove child
    if (this._gotoStmt_ == child) {
      this._gotoStmt_ = null;
      return;
    }

    throw new RuntimeException("Not a child.");
  }

  @Override
  void replaceChild(
      @SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild) {
    // Replace child
    if (this._gotoStmt_ == oldChild) {
      setGotoStmt((PGotoStmt) newChild);
      return;
    }

    throw new RuntimeException("Not a child.");
  }
}

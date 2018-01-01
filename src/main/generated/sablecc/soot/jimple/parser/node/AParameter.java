/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class AParameter extends PParameter {
  private PNonvoidType _nonvoidType_;

  public AParameter() {
    // Constructor
  }

  public AParameter(@SuppressWarnings("hiding") PNonvoidType _nonvoidType_) {
    // Constructor
    setNonvoidType(_nonvoidType_);
  }

  @Override
  public Object clone() {
    return new AParameter(cloneNode(this._nonvoidType_));
  }

  @Override
  public void apply(Switch sw) {
    ((Analysis) sw).caseAParameter(this);
  }

  public PNonvoidType getNonvoidType() {
    return this._nonvoidType_;
  }

  public void setNonvoidType(PNonvoidType node) {
    if (this._nonvoidType_ != null) {
      this._nonvoidType_.parent(null);
    }

    if (node != null) {
      if (node.parent() != null) {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    this._nonvoidType_ = node;
  }

  @Override
  public String toString() {
    return "" + toString(this._nonvoidType_);
  }

  @Override
  void removeChild(@SuppressWarnings("unused") Node child) {
    // Remove child
    if (this._nonvoidType_ == child) {
      this._nonvoidType_ = null;
      return;
    }

    throw new RuntimeException("Not a child.");
  }

  @Override
  void replaceChild(
      @SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild) {
    // Replace child
    if (this._nonvoidType_ == oldChild) {
      setNonvoidType((PNonvoidType) newChild);
      return;
    }

    throw new RuntimeException("Not a child.");
  }
}

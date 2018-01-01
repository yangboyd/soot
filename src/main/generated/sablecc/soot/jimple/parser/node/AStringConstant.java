/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class AStringConstant extends PConstant {
  private TStringConstant _stringConstant_;

  public AStringConstant() {
    // Constructor
  }

  public AStringConstant(@SuppressWarnings("hiding") TStringConstant _stringConstant_) {
    // Constructor
    setStringConstant(_stringConstant_);
  }

  @Override
  public Object clone() {
    return new AStringConstant(cloneNode(this._stringConstant_));
  }

  @Override
  public void apply(Switch sw) {
    ((Analysis) sw).caseAStringConstant(this);
  }

  public TStringConstant getStringConstant() {
    return this._stringConstant_;
  }

  public void setStringConstant(TStringConstant node) {
    if (this._stringConstant_ != null) {
      this._stringConstant_.parent(null);
    }

    if (node != null) {
      if (node.parent() != null) {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    this._stringConstant_ = node;
  }

  @Override
  public String toString() {
    return "" + toString(this._stringConstant_);
  }

  @Override
  void removeChild(@SuppressWarnings("unused") Node child) {
    // Remove child
    if (this._stringConstant_ == child) {
      this._stringConstant_ = null;
      return;
    }

    throw new RuntimeException("Not a child.");
  }

  @Override
  void replaceChild(
      @SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild) {
    // Replace child
    if (this._stringConstant_ == oldChild) {
      setStringConstant((TStringConstant) newChild);
      return;
    }

    throw new RuntimeException("Not a child.");
  }
}

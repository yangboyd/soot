/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class ACmpBinop extends PBinop {
  private TCmp _cmp_;

  public ACmpBinop() {
    // Constructor
  }

  public ACmpBinop(@SuppressWarnings("hiding") TCmp _cmp_) {
    // Constructor
    setCmp(_cmp_);
  }

  @Override
  public Object clone() {
    return new ACmpBinop(cloneNode(this._cmp_));
  }

  @Override
  public void apply(Switch sw) {
    ((Analysis) sw).caseACmpBinop(this);
  }

  public TCmp getCmp() {
    return this._cmp_;
  }

  public void setCmp(TCmp node) {
    if (this._cmp_ != null) {
      this._cmp_.parent(null);
    }

    if (node != null) {
      if (node.parent() != null) {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    this._cmp_ = node;
  }

  @Override
  public String toString() {
    return "" + toString(this._cmp_);
  }

  @Override
  void removeChild(@SuppressWarnings("unused") Node child) {
    // Remove child
    if (this._cmp_ == child) {
      this._cmp_ = null;
      return;
    }

    throw new RuntimeException("Not a child.");
  }

  @Override
  void replaceChild(
      @SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild) {
    // Replace child
    if (this._cmp_ == oldChild) {
      setCmp((TCmp) newChild);
      return;
    }

    throw new RuntimeException("Not a child.");
  }
}

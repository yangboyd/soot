/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class AFinalModifier extends PModifier {
  private TFinal _final_;

  public AFinalModifier() {
    // Constructor
  }

  public AFinalModifier(@SuppressWarnings("hiding") TFinal _final_) {
    // Constructor
    setFinal(_final_);
  }

  @Override
  public Object clone() {
    return new AFinalModifier(cloneNode(this._final_));
  }

  @Override
  public void apply(Switch sw) {
    ((Analysis) sw).caseAFinalModifier(this);
  }

  public TFinal getFinal() {
    return this._final_;
  }

  public void setFinal(TFinal node) {
    if (this._final_ != null) {
      this._final_.parent(null);
    }

    if (node != null) {
      if (node.parent() != null) {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    this._final_ = node;
  }

  @Override
  public String toString() {
    return "" + toString(this._final_);
  }

  @Override
  void removeChild(@SuppressWarnings("unused") Node child) {
    // Remove child
    if (this._final_ == child) {
      this._final_ = null;
      return;
    }

    throw new RuntimeException("Not a child.");
  }

  @Override
  void replaceChild(
      @SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild) {
    // Replace child
    if (this._final_ == oldChild) {
      setFinal((TFinal) newChild);
      return;
    }

    throw new RuntimeException("Not a child.");
  }
}

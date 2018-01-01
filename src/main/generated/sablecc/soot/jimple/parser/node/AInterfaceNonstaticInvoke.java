/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class AInterfaceNonstaticInvoke extends PNonstaticInvoke {
  private TInterfaceinvoke _interfaceinvoke_;

  public AInterfaceNonstaticInvoke() {
    // Constructor
  }

  public AInterfaceNonstaticInvoke(@SuppressWarnings("hiding") TInterfaceinvoke _interfaceinvoke_) {
    // Constructor
    setInterfaceinvoke(_interfaceinvoke_);
  }

  @Override
  public Object clone() {
    return new AInterfaceNonstaticInvoke(cloneNode(this._interfaceinvoke_));
  }

  @Override
  public void apply(Switch sw) {
    ((Analysis) sw).caseAInterfaceNonstaticInvoke(this);
  }

  public TInterfaceinvoke getInterfaceinvoke() {
    return this._interfaceinvoke_;
  }

  public void setInterfaceinvoke(TInterfaceinvoke node) {
    if (this._interfaceinvoke_ != null) {
      this._interfaceinvoke_.parent(null);
    }

    if (node != null) {
      if (node.parent() != null) {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    this._interfaceinvoke_ = node;
  }

  @Override
  public String toString() {
    return "" + toString(this._interfaceinvoke_);
  }

  @Override
  void removeChild(@SuppressWarnings("unused") Node child) {
    // Remove child
    if (this._interfaceinvoke_ == child) {
      this._interfaceinvoke_ = null;
      return;
    }

    throw new RuntimeException("Not a child.");
  }

  @Override
  void replaceChild(
      @SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild) {
    // Replace child
    if (this._interfaceinvoke_ == oldChild) {
      setInterfaceinvoke((TInterfaceinvoke) newChild);
      return;
    }

    throw new RuntimeException("Not a child.");
  }
}

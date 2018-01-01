/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.Analysis;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

@SuppressWarnings("nls")
public final class AFileBody extends PFileBody {
  private TLBrace _lBrace_;
  private final LinkedList<PMember> _member_ = new LinkedList<PMember>();
  private TRBrace _rBrace_;

  public AFileBody() {
    // Constructor
  }

  public AFileBody(
      @SuppressWarnings("hiding") TLBrace _lBrace_,
      @SuppressWarnings("hiding") List<?> _member_,
      @SuppressWarnings("hiding") TRBrace _rBrace_) {
    // Constructor
    setLBrace(_lBrace_);

    setMember(_member_);

    setRBrace(_rBrace_);
  }

  @Override
  public Object clone() {
    return new AFileBody(
        cloneNode(this._lBrace_), cloneList(this._member_), cloneNode(this._rBrace_));
  }

  @Override
  public void apply(Switch sw) {
    ((Analysis) sw).caseAFileBody(this);
  }

  public TLBrace getLBrace() {
    return this._lBrace_;
  }

  public void setLBrace(TLBrace node) {
    if (this._lBrace_ != null) {
      this._lBrace_.parent(null);
    }

    if (node != null) {
      if (node.parent() != null) {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    this._lBrace_ = node;
  }

  public LinkedList<PMember> getMember() {
    return this._member_;
  }

  public void setMember(List<?> list) {
    for (PMember e : this._member_) {
      e.parent(null);
    }
    this._member_.clear();

    for (Object obj_e : list) {
      PMember e = (PMember) obj_e;
      if (e.parent() != null) {
        e.parent().removeChild(e);
      }

      e.parent(this);
      this._member_.add(e);
    }
  }

  public TRBrace getRBrace() {
    return this._rBrace_;
  }

  public void setRBrace(TRBrace node) {
    if (this._rBrace_ != null) {
      this._rBrace_.parent(null);
    }

    if (node != null) {
      if (node.parent() != null) {
        node.parent().removeChild(node);
      }

      node.parent(this);
    }

    this._rBrace_ = node;
  }

  @Override
  public String toString() {
    return "" + toString(this._lBrace_) + toString(this._member_) + toString(this._rBrace_);
  }

  @Override
  void removeChild(@SuppressWarnings("unused") Node child) {
    // Remove child
    if (this._lBrace_ == child) {
      this._lBrace_ = null;
      return;
    }

    if (this._member_.remove(child)) {
      return;
    }

    if (this._rBrace_ == child) {
      this._rBrace_ = null;
      return;
    }

    throw new RuntimeException("Not a child.");
  }

  @Override
  void replaceChild(
      @SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild) {
    // Replace child
    if (this._lBrace_ == oldChild) {
      setLBrace((TLBrace) newChild);
      return;
    }

    for (ListIterator<PMember> i = this._member_.listIterator(); i.hasNext(); ) {
      if (i.next() == oldChild) {
        if (newChild != null) {
          i.set((PMember) newChild);
          newChild.parent(this);
          oldChild.parent(null);
          return;
        }

        i.remove();
        oldChild.parent(null);
        return;
      }
    }

    if (this._rBrace_ == oldChild) {
      setRBrace((TRBrace) newChild);
      return;
    }

    throw new RuntimeException("Not a child.");
  }
}

/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class TBoolConstant extends Token {
  public TBoolConstant(String text) {
    setText(text);
  }

  public TBoolConstant(String text, int line, int pos) {
    setText(text);
    setLine(line);
    setPos(pos);
  }

  @Override
  public Object clone() {
    return new TBoolConstant(getText(), getLine(), getPos());
  }

  @Override
  public void apply(Switch sw) {
    ((Analysis) sw).caseTBoolConstant(this);
  }
}

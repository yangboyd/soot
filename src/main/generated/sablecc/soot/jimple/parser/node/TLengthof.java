/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class TLengthof extends Token {
  public TLengthof() {
    super.setText("lengthof");
  }

  public TLengthof(int line, int pos) {
    super.setText("lengthof");
    setLine(line);
    setPos(pos);
  }

  @Override
  public Object clone() {
    return new TLengthof(getLine(), getPos());
  }

  @Override
  public void apply(Switch sw) {
    ((Analysis) sw).caseTLengthof(this);
  }

  @Override
  public void setText(@SuppressWarnings("unused") String text) {
    throw new RuntimeException("Cannot change TLengthof text.");
  }
}

/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class TCase extends Token {
  public TCase() {
    super.setText("case");
  }

  public TCase(int line, int pos) {
    super.setText("case");
    setLine(line);
    setPos(pos);
  }

  @Override
  public Object clone() {
    return new TCase(getLine(), getPos());
  }

  @Override
  public void apply(Switch sw) {
    ((Analysis) sw).caseTCase(this);
  }

  @Override
  public void setText(@SuppressWarnings("unused") String text) {
    throw new RuntimeException("Cannot change TCase text.");
  }
}

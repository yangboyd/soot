/* Soot - a J*va Optimization Framework
 * Copyright (C) 1999 Patrick Lam
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */

/*
 * Modified by the Sable Research Group and others 1997-1999.
 * See the 'credits' file distributed with Soot for the complete list of
 * contributors.  (Soot is distributed at http://www.sable.mcgill.ca/soot)
 */

package soot.jimple.internal;

import soot.AbstractTrap;
import soot.SootClass;
import soot.Unit;
import soot.UnitBox;
import soot.jimple.Jimple;

public class JTrap extends AbstractTrap {

  public JTrap(SootClass exception, Unit beginStmt, Unit endStmt, Unit handlerStmt) {
    super(
        exception,
        Jimple.v().newStmtBox(beginStmt),
        Jimple.v().newStmtBox(endStmt),
        Jimple.v().newStmtBox(handlerStmt));
  }

  public JTrap(SootClass exception, UnitBox beginStmt, UnitBox endStmt, UnitBox handlerStmt) {
    super(exception, beginStmt, endStmt, handlerStmt);
  }

  public Object clone() {
    return new JTrap(exception, getBeginUnit(), getEndUnit(), getHandlerUnit());
  }

  public String toString() {
    StringBuffer buf = new StringBuffer("Trap :");
    buf.append("\nbegin  : ");
    buf.append(getBeginUnit());
    buf.append("\nend    : ");
    buf.append(getEndUnit());
    buf.append("\nhandler: ");
    buf.append(getHandlerUnit());
    return new String(buf);
  }
}

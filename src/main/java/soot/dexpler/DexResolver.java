/* Soot - a Java Optimization Framework
 * Copyright (C) 2012 Michael Markert, Frank Hartmann
 *
 * (c) 2012 University of Luxembourg - Interdisciplinary Centre for
 * Security Reliability and Trust (SnT) - All rights reserved
 * Alexandre Bartel
 *
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

package soot.dexpler;

import soot.G;
import soot.Singletons;
import soot.SootClass;
import soot.javaToJimple.IInitialResolver.Dependencies;

import java.io.File;
import java.util.Map;
import java.util.TreeMap;

public class DexResolver {

  protected Map<File, DexlibWrapper> cache = new TreeMap<File, DexlibWrapper>();

  public DexResolver(Singletons.Global g) {}

  public static DexResolver v() {
    return G.v().soot_dexpler_DexResolver();
  }

  /**
   * Resolve the class contained in file into the passed soot class.
   *
   * @param file the path to the dex/apk file to resolve
   * @param className the name of the class to resolve
   * @param sc the soot class that will represent the class
   * @return the dependencies of this class.
   */
  public Dependencies resolveFromFile(File file, String className, SootClass sc) {
    DexlibWrapper wrapper = initializeDexFile(file);
    Dependencies deps = wrapper.makeSootClass(sc, className);
    addSourceFileTag(sc, "dalvik_source_" + file.getName());

    return deps;
  }

  /**
   * Initializes the dex wrapper for the given dex file
   *
   * @param file The dex file to load
   * @return The wrapper object for the given dex file
   */
  protected DexlibWrapper initializeDexFile(File file) {
    DexlibWrapper wrapper = cache.get(file);
    if (wrapper == null) {
      wrapper = new DexlibWrapper(file);
      cache.put(file, wrapper);
      wrapper.initialize();
    }
    return wrapper;
  }

  /** adds source file tag to each sootclass */
  protected static void addSourceFileTag(SootClass sc, String fileName) {
    soot.tagkit.SourceFileTag tag = null;
    if (sc.hasTag("SourceFileTag")) {
      return; // do not add tag if original class already has debug
      // information
    } else {
      tag = new soot.tagkit.SourceFileTag();
      sc.addTag(tag);
    }
    tag.setSourceFile(fileName);
  }
}

/*
 * Copyright © 2023 Vertispan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dominokit.doctool;

import com.sun.source.doctree.*;
import com.sun.source.util.SimpleDocTreeVisitor;

public class DominoKitSiteExclusionTreeVisitor extends SimpleDocTreeVisitor<Boolean, DocTree> {

  @Override
  protected Boolean defaultAction(DocTree node, DocTree treeNode) {
    return false;
  }

  @Override
  public Boolean visitUnknownBlockTag(UnknownBlockTagTree node, DocTree treeNode) {
    return node.getTagName().equalsIgnoreCase("dominokit-site-ignore");
  }

  @Override
  public Boolean visitDeprecated(DeprecatedTree node, DocTree docTree) {
    return false;
  }
}

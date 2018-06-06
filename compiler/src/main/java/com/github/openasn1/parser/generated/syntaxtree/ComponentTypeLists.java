//
// Generated by JTB 1.3.2
//

package com.github.openasn1.parser.generated.syntaxtree;

/**
 * Grammar production:
 * <PRE>
 * nodeChoice -> RootComponentTypeList() [ &lt;COMMA_TKN&gt; ExtensionAndException() [ ExtensionAdditions() ] [ ExtensionEndMarker() [ &lt;COMMA_TKN&gt; RootComponentTypeList() ] ] ]
 *       | ExtensionAndException() [ ExtensionAdditions() ] [ ExtensionEndMarker() [ &lt;COMMA_TKN&gt; RootComponentTypeList() ] ]
 * </PRE>
 */
public class ComponentTypeLists implements Node {
   private Node parent;
   public NodeChoice nodeChoice;

   public ComponentTypeLists(NodeChoice n0) {
      nodeChoice = n0;
      if ( nodeChoice != null ) nodeChoice.setParent(this);
   }

   public void accept(com.github.openasn1.parser.generated.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(com.github.openasn1.parser.generated.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(com.github.openasn1.parser.generated.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(com.github.openasn1.parser.generated.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
   public void setParent(Node n) { parent = n; }
   public Node getParent()       { return parent; }
}


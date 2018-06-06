//
// Generated by JTB 1.3.2
//

package com.github.openasn1.parser.generated.syntaxtree;

/**
 * Grammar production:
 * <PRE>
 * nodeToken -> &lt;IDENTIFIER&gt;
 * componentConstraint -> ComponentConstraint()
 * </PRE>
 */
public class NamedConstraint implements Node {
   private Node parent;
   public NodeToken nodeToken;
   public ComponentConstraint componentConstraint;

   public NamedConstraint(NodeToken n0, ComponentConstraint n1) {
      nodeToken = n0;
      if ( nodeToken != null ) nodeToken.setParent(this);
      componentConstraint = n1;
      if ( componentConstraint != null ) componentConstraint.setParent(this);
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


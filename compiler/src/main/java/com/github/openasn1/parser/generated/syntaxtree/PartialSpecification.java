//
// Generated by JTB 1.3.2
//

package com.github.openasn1.parser.generated.syntaxtree;

/**
 * Grammar production:
 * <PRE>
 * nodeToken -> &lt;LEFT_BRACE_TKN&gt;
 * nodeToken1 -> &lt;ELLIPSIS_TKN&gt;
 * nodeToken2 -> &lt;COMMA_TKN&gt;
 * typeConstraints -> TypeConstraints()
 * nodeToken3 -> &lt;RIGHT_BRACE_TKN&gt;
 * </PRE>
 */
public class PartialSpecification implements Node {
   private Node parent;
   public NodeToken nodeToken;
   public NodeToken nodeToken1;
   public NodeToken nodeToken2;
   public TypeConstraints typeConstraints;
   public NodeToken nodeToken3;

   public PartialSpecification(NodeToken n0, NodeToken n1, NodeToken n2, TypeConstraints n3, NodeToken n4) {
      nodeToken = n0;
      if ( nodeToken != null ) nodeToken.setParent(this);
      nodeToken1 = n1;
      if ( nodeToken1 != null ) nodeToken1.setParent(this);
      nodeToken2 = n2;
      if ( nodeToken2 != null ) nodeToken2.setParent(this);
      typeConstraints = n3;
      if ( typeConstraints != null ) typeConstraints.setParent(this);
      nodeToken3 = n4;
      if ( nodeToken3 != null ) nodeToken3.setParent(this);
   }

   public PartialSpecification(TypeConstraints n0) {
      nodeToken = new NodeToken("{");
      if ( nodeToken != null ) nodeToken.setParent(this);
      nodeToken1 = new NodeToken("...");
      if ( nodeToken1 != null ) nodeToken1.setParent(this);
      nodeToken2 = new NodeToken(",");
      if ( nodeToken2 != null ) nodeToken2.setParent(this);
      typeConstraints = n0;
      if ( typeConstraints != null ) typeConstraints.setParent(this);
      nodeToken3 = new NodeToken("}");
      if ( nodeToken3 != null ) nodeToken3.setParent(this);
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


//
// Generated by JTB 1.3.2
//

package com.github.openasn1.parser.generated.syntaxtree;

/**
 * Grammar production:
 * <PRE>
 * nodeToken -> &lt;ENUMERATED_TKN&gt;
 * nodeToken1 -> &lt;LEFT_BRACE_TKN&gt;
 * enumerations -> Enumerations()
 * nodeToken2 -> &lt;RIGHT_BRACE_TKN&gt;
 * </PRE>
 */
public class EnumeratedType implements Node {
   private Node parent;
   public NodeToken nodeToken;
   public NodeToken nodeToken1;
   public Enumerations enumerations;
   public NodeToken nodeToken2;

   public EnumeratedType(NodeToken n0, NodeToken n1, Enumerations n2, NodeToken n3) {
      nodeToken = n0;
      if ( nodeToken != null ) nodeToken.setParent(this);
      nodeToken1 = n1;
      if ( nodeToken1 != null ) nodeToken1.setParent(this);
      enumerations = n2;
      if ( enumerations != null ) enumerations.setParent(this);
      nodeToken2 = n3;
      if ( nodeToken2 != null ) nodeToken2.setParent(this);
   }

   public EnumeratedType(Enumerations n0) {
      nodeToken = new NodeToken("ENUMERATED");
      if ( nodeToken != null ) nodeToken.setParent(this);
      nodeToken1 = new NodeToken("{");
      if ( nodeToken1 != null ) nodeToken1.setParent(this);
      enumerations = n0;
      if ( enumerations != null ) enumerations.setParent(this);
      nodeToken2 = new NodeToken("}");
      if ( nodeToken2 != null ) nodeToken2.setParent(this);
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

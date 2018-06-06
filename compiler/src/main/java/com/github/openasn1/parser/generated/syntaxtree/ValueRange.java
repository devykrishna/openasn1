//
// Generated by JTB 1.3.2
//

package com.github.openasn1.parser.generated.syntaxtree;

/**
 * Grammar production:
 * <PRE>
 * lowerEndpoint -> LowerEndpoint()
 * nodeToken -> &lt;DOTDOT_TKN&gt;
 * upperEndpoint -> UpperEndpoint()
 * </PRE>
 */
public class ValueRange implements Node {
   private Node parent;
   public LowerEndpoint lowerEndpoint;
   public NodeToken nodeToken;
   public UpperEndpoint upperEndpoint;

   public ValueRange(LowerEndpoint n0, NodeToken n1, UpperEndpoint n2) {
      lowerEndpoint = n0;
      if ( lowerEndpoint != null ) lowerEndpoint.setParent(this);
      nodeToken = n1;
      if ( nodeToken != null ) nodeToken.setParent(this);
      upperEndpoint = n2;
      if ( upperEndpoint != null ) upperEndpoint.setParent(this);
   }

   public ValueRange(LowerEndpoint n0, UpperEndpoint n1) {
      lowerEndpoint = n0;
      if ( lowerEndpoint != null ) lowerEndpoint.setParent(this);
      nodeToken = new NodeToken("..");
      if ( nodeToken != null ) nodeToken.setParent(this);
      upperEndpoint = n1;
      if ( upperEndpoint != null ) upperEndpoint.setParent(this);
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

//
// Generated by JTB 1.3.2
//

package com.github.openasn1.parser.generated.syntaxtree;

/**
 * Grammar production:
 * <PRE>
 * nodeToken -> &lt;CHARACTER_TKN&gt;
 * nodeToken1 -> &lt;STRING_TKN&gt;
 * </PRE>
 */
public class UnrestrictedCharacterStringType implements Node {
   private Node parent;
   public NodeToken nodeToken;
   public NodeToken nodeToken1;

   public UnrestrictedCharacterStringType(NodeToken n0, NodeToken n1) {
      nodeToken = n0;
      if ( nodeToken != null ) nodeToken.setParent(this);
      nodeToken1 = n1;
      if ( nodeToken1 != null ) nodeToken1.setParent(this);
   }

   public UnrestrictedCharacterStringType() {
      nodeToken = new NodeToken("CHARACTER");
      if ( nodeToken != null ) nodeToken.setParent(this);
      nodeToken1 = new NodeToken("STRING");
      if ( nodeToken1 != null ) nodeToken1.setParent(this);
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


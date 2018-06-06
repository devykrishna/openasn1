//
// Generated by JTB 1.3.2
//

package com.github.openasn1.parser.generated.syntaxtree;

/**
 * Grammar production:
 * <PRE>
 * nodeToken -> &lt;COMMA_TKN&gt;
 * extensionAdditionAlternativesList -> ExtensionAdditionAlternativesList()
 * </PRE>
 */
public class ExtensionAdditionAlternatives implements Node {
   private Node parent;
   public NodeToken nodeToken;
   public ExtensionAdditionAlternativesList extensionAdditionAlternativesList;

   public ExtensionAdditionAlternatives(NodeToken n0, ExtensionAdditionAlternativesList n1) {
      nodeToken = n0;
      if ( nodeToken != null ) nodeToken.setParent(this);
      extensionAdditionAlternativesList = n1;
      if ( extensionAdditionAlternativesList != null ) extensionAdditionAlternativesList.setParent(this);
   }

   public ExtensionAdditionAlternatives(ExtensionAdditionAlternativesList n0) {
      nodeToken = new NodeToken(",");
      if ( nodeToken != null ) nodeToken.setParent(this);
      extensionAdditionAlternativesList = n0;
      if ( extensionAdditionAlternativesList != null ) extensionAdditionAlternativesList.setParent(this);
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


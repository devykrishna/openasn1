//
// Generated by JTB 1.3.2
//

package com.github.openasn1.parser.generated.syntaxtree;

/**
 * Grammar production:
 * <PRE>
 * charsDefn -> CharsDefn()
 * nodeListOptional -> ( &lt;COMMA_TKN&gt; CharsDefn() )*
 * </PRE>
 */
public class CharSyms implements Node {
   private Node parent;
   public CharsDefn charsDefn;
   public NodeListOptional nodeListOptional;

   public CharSyms(CharsDefn n0, NodeListOptional n1) {
      charsDefn = n0;
      if ( charsDefn != null ) charsDefn.setParent(this);
      nodeListOptional = n1;
      if ( nodeListOptional != null ) nodeListOptional.setParent(this);
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


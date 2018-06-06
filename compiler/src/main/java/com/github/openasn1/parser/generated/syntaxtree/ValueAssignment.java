//
// Generated by JTB 1.3.2
//

package com.github.openasn1.parser.generated.syntaxtree;

/**
 * Grammar production:
 * <PRE>
 * valuereference -> valuereference()
 * type -> Type()
 * nodeToken -> &lt;ASSIGN_OP_TKN&gt;
 * value -> Value()
 * </PRE>
 */
public class ValueAssignment implements Node {
   private Node parent;
   public valuereference valuereference;
   public Type type;
   public NodeToken nodeToken;
   public Value value;

   public ValueAssignment(valuereference n0, Type n1, NodeToken n2, Value n3) {
      valuereference = n0;
      if ( valuereference != null ) valuereference.setParent(this);
      type = n1;
      if ( type != null ) type.setParent(this);
      nodeToken = n2;
      if ( nodeToken != null ) nodeToken.setParent(this);
      value = n3;
      if ( value != null ) value.setParent(this);
   }

   public ValueAssignment(valuereference n0, Type n1, Value n2) {
      valuereference = n0;
      if ( valuereference != null ) valuereference.setParent(this);
      type = n1;
      if ( type != null ) type.setParent(this);
      nodeToken = new NodeToken("::=");
      if ( nodeToken != null ) nodeToken.setParent(this);
      value = n2;
      if ( value != null ) value.setParent(this);
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


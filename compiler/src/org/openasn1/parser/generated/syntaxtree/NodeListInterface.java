//
// Generated by JTB 1.3.2
//

package org.openasn1.parser.generated.syntaxtree;

/**
 * The interface which NodeList, NodeListOptional, and NodeSequence
 * implement.
 */
public interface NodeListInterface extends Node {
   public void addNode(Node n);
   public Node elementAt(int i);
   public java.util.Enumeration<Node> elements();
   public int size();

   public void accept(org.openasn1.parser.generated.visitor.Visitor v);
   public <R,A> R accept(org.openasn1.parser.generated.visitor.GJVisitor<R,A> v, A argu);
   public <R> R accept(org.openasn1.parser.generated.visitor.GJNoArguVisitor<R> v);
   public <A> void accept(org.openasn1.parser.generated.visitor.GJVoidVisitor<A> v, A argu);
}


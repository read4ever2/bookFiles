// ----------------------------------------------------------------------------
// LLNode.java                by Dale/Joyce/Weems                    Chapter 2
//
// Implements <T> nodes for a Linked List.
// ----------------------------------------------------------------------------
package support;

public class LLNode<T> {
  protected LLNode<T> link;
  protected T info;

  public LLNode(T info) {
    this.info = info;
    link = null;
  }

  public T getInfo() {
    return info;
  }

  public void setInfo(T info) {
    this.info = info;
  }

  public LLNode<T> getLink() {
    return link;
  }

  public void setLink(LLNode<T> link) {
    this.link = link;
  }
}

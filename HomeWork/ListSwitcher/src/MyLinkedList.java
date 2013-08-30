import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 8/19/13
 * Time: 8:51 PM
 * To change this template use File | Settings | File Templates.
 */

public class MyLinkedList<E> implements List<E> {
    private int size = 0;
    private Node firstNode = null;
    private Node lastNode = null;
    private Node cursor = firstNode;

    public MyLinkedList() {
    }

    public MyLinkedList(Collection<? extends E> c) {
        this();
        addAll(c);
    }

    private class Node {
        private E e;
        private Node next;
        private Node previous;

        private Node(E e, Node next, Node previous) {
            this.e = e;
            this.next = next;
            this.previous = previous;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        public Node getNext() {
            return next;
        }

        public Node getPrevious() {
            return previous;
        }
    }

    private void addLast(E e) {
        Node newNode = new Node(e, null, null);
        if (isEmpty()) {
            lastNode = newNode;
            firstNode = newNode;
            cursor = new Node((E) "noDirection", firstNode, null);
        } else {
            newNode.setPrevious(lastNode);
            lastNode.setNext(newNode);
            lastNode = newNode;
        }
        size++;
    }

    private void removeLast() {
        lastNode = lastNode.getPrevious();
        lastNode.setNext(null);
        size--;

    }

    private boolean checkIndex(int index) {

        if ((index < 0) || (index >= size)) {
            throw new NullPointerException();
        }
        return true;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (isEmpty()) {
            return false;
        } else {
            try {
                Node currentNode = firstNode;
                while (!currentNode.e.equals(o)) {
                    currentNode = currentNode.getNext();
                }
            } catch (NullPointerException e) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Iterator<E> iterator() {
        if (!isEmpty()) {
            return listIterator();
        } else return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.

    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void clear() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public E get(int index) {
        return getNode(index).e;
    }

    private Node getNode(int index) {
        checkIndex(index);
        if (index == 0) {
            return firstNode;
        } else {
            Node currentNode = firstNode;
            int i = 0;
            while (i < index) {
                currentNode = currentNode.getNext();
                i++;
            }
            return currentNode;
        }   //working on it
    }

    @Override
    public E set(int index, E element) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void add(int index, E element) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        Node nodeToRemove = getNode(index);

        if (index == 0) {
            firstNode = nodeToRemove.getNext();
            firstNode.setPrevious(null);
            size--;
            return nodeToRemove.e;
        }

        if (nodeToRemove.equals(lastNode)) {
            removeLast();
            return nodeToRemove.getPrevious().e;
        }

        Node nextAfterBeingRemoved = nodeToRemove.getNext();

        nodeToRemove.getPrevious().setNext(nextAfterBeingRemoved);
        nextAfterBeingRemoved.setPrevious(nodeToRemove.getPrevious());
        size--;
        return nodeToRemove.getPrevious().e;
    }

    @Override
    public int indexOf(Object o) {
        if (!isEmpty()) {
            if (firstNode.e.equals(o)) {
                return 0;
            }
            Node currentNode = firstNode;
            int index = 0;
            try {
                while (!currentNode.e.equals(o)) {
                    currentNode = currentNode.getNext();
                    index++;
                }
                return index;
            } catch (NullPointerException e) {
                return -1;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ListIterator<E> listIterator() {
        return new ListIterator<E>() {

            @Override
            public boolean hasNext() {
                return cursor.getNext() != null;
            }

            @Override
            public E next() {
                Node nextNode = cursor.getNext();
                cursor.setNext(nextNode.getNext());
                cursor.setPrevious(nextNode);

                // Set the last method has been used. Previous or Next. Needed for remove()
                cursor.e = (E) new String("Next");
                if (cursor == null) {
                    throw new NoSuchElementException();
                }
                return nextNode.e;
            }

            @Override
            public boolean hasPrevious() {
                return cursor.getPrevious() != null;
            }

            @Override
            public E previous() {
                Node previousNode = cursor.getPrevious();
                cursor.setPrevious(previousNode.getPrevious());
                cursor.setNext(previousNode);

                // Set the last method has been used. Previous or Next. Needed for remove()
                cursor.e = (E) new String("Previous");
                if (cursor == null) {
                    throw new NoSuchElementException();
                }
                return previousNode.e;
            }

            @Override
            public int nextIndex() {
                try {
                    return MyLinkedList.this.indexOf(cursor.getNext().e);
                } catch (NullPointerException e) {
                    return size;
                }
            }

            @Override
            public int previousIndex() {
                try {
                    return MyLinkedList.this.indexOf(cursor.getPrevious().e);
                } catch (NullPointerException e) {
                    return -1;
                }
            }

            @Override
            public void remove() {
                if (cursor.e.equals("Next")) {
                    MyLinkedList.this.remove(nextIndex());
                } else if (cursor.e.equals("Previous")) {
                    MyLinkedList.this.remove(previousIndex());
                }
            }

            @Override
            public void set(E e) {
                //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public void add(E e) {
                // Set the last method has been used. Previous or Next. Needed for remove()
                cursor.e = (E) new String("Can't remove");
                //To change body of implemented methods use File | Settings | File Templates.
            }
        };
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}

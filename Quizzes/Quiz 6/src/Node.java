public class Node {
    private int data;
    private Node rightChild;
    private Node leftChild;


    public void insert(int value)
    {
        if(value == data)
        {
            return;
        }

        if (value < data)
        {
            if (leftChild == null)
            {
                leftChild = new Node(value);
            }
            else
            {
                leftChild.insert(value);
            }
        }
        else
        {
            if (rightChild == null)
            {
                rightChild = new Node(value);
            }
            else
            {
                rightChild.insert(value);
            }
        }

    }

    //Prints smallest to largest
    public void traverseInOrder()
    {
        if (leftChild != null)
        {
            leftChild.traverseInOrder();
        }
        System.out.println("Data: " + data);

        if (rightChild !=null)
        {
            rightChild.traverseInOrder();
        }
    }

    //Prints largest to smallest
    public void traverseInOrderDesc()
    {
        if (rightChild !=null)
        {
            rightChild.traverseInOrderDesc();
        }
        System.out.println("Data: " + data);

        if (leftChild != null)
        {
            leftChild.traverseInOrderDesc();
        }
    }
    public Node get(int value)
    {
        if (value == data)
        {
            return this;
        }

        if (value < data)
        {
            if (leftChild != null)
            {
                return leftChild.get(value);
            }
        }
        else
        {
            if (rightChild != null)
            {
                    return rightChild.get(value);
            }
        }

        return null;
    }

    public Node(int _data)
    {
        this.data = _data;
    }

    //Gets the minimum
    public Node getMin()
    {
        if (leftChild == null)
        {
            return this;
        }

        return leftChild.getMin();
    }

    //Gets the maximum
    public Node getMax()
    {
        if(rightChild == null)
        {
            return this;
        }

        return rightChild.getMin();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}

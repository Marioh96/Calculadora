public abstract class AbstractStack<E> implements Stack<E> {
    
    /**
     *
     * @return post: returns true if and only if the stack is empty
     */
    public boolean empty()
	// 
	{
		return size() == 0;
	}
}

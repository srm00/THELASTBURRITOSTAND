public class MaxHeap {
		private int[] array;
		private int currentSize; 
		private int maximum; 
		
	    public MaxHeap( int capacity )
	    {
	        this.maximum = capacity;
	    	this.currentSize = 0;
	        array = new int[this.maximum + 1];
	        array[0] = Integer.MAX_VALUE;
	     }
	    
	  //Private helper methods 
	    private int parent(int position)
	    {
	    	return position/2; 
	    }
	    private int leftChild(int position)
	    {
	    	return position*2; 
	    }
	    private int rightChild(int position)
	    {
	    	return (2*position)+1; 
	    }
	    
	   
	    //method to check if something is a leaf node 
	    private boolean isLeaf(int position)
	    {
	        if (position >=  (currentSize / 2)  &&  position <= currentSize)
	        {
	            return true;
	        }
	        return false;
	    }
	 
	   
	    //helper swap method
	    private void swap(int first, int second)
	    {
	    	int temp; 
	    	temp = array[first]; 
	    	array[first] = array[second]; 
	    	array[second] = temp; 
	    }
	    

	    public void insert( int x )
	    {
	        array[currentSize + 1] = x; 
	        int current = currentSize; 

	            // Percolate up
	        while(array[current] > array[parent(current)])
	        {
	        	swap(current, parent(current)); 
	        	current = parent(current);
	        	
	        	
	        }
	        currentSize++; 
	    }

	 
	    
	    public void maxHeap()
	    { 
	    	  for (int pos = (currentSize / 2); pos >= 1; pos--)
	          {
	              percolateDown(pos);
	          }
	    }
	    
	    public int findMax()
	    {
	    	return array[1];
	    }
	    
	   
	    public int deleteMax( )
	    {
	    	if(array[1]!=0)
	    	{
	    	int popped = findMax();
	        array[1] = array[currentSize--]; 
	        percolateDown(1);
	        return popped;
	    	}
	    	else
	    		return 0; 
	    }

	    
	    //Basic print which prints parent and right and left child in a row
	    public void print()
	    {
	    	System.out.println("The current Size is " + currentSize);
	        for (int i = 1; i <= currentSize / 2; i++ )
	        {
	        	
	            System.out.print(" PARENT : " + array[i] + " LEFT CHILD : " + array[2*i]
	                  + " RIGHT CHILD :" + array[2 * i  + 1]);
	            System.out.println();
	        }
	    }
	    
	    public void printByIndex()
	    {
	    	System.out.println("Array: ");
	    	for(int i = 1; i<currentSize; i++)
	    	{
	    		System.out.print( array[i] + " ");
	    	}
	    }
	    
	    public void printByTree()
	    {
	    	System.out.println("Tree: "); 
	    	int power = 0; 
	    	int numPrint[] = new int[currentSize]; 
	    	
	    	int count = currentSize - 1; 
	    	
	    	//this for loop creates a list of the number of values to be printed for each level of the tree
	    	for (int i = 0; i < currentSize/2; i++)
	    	{
	    		
	    		if(i == 0)
	    		{
	    			numPrint[i] = 1; 
	    		}
	    		else if(i==1)
	    		{
	    			numPrint[i] = 2;
	    		}
	    		else
	    		{
	    			power  = (int)Math.pow(i,2);
	    			numPrint[i] = power; 
	    			count = count - power; 
	    		}
	    	}
	    
	    	//this for loop prints the array as it would appear in the tree 	
	    	int currentPosition = 1;
	    	for(int i = 0; i<numPrint.length; i++)
	    	{
	    		
	    		for(int j = 0; j < numPrint[i]; j++)
	    		{
	    			if(array[currentPosition]!=0)
	    			{
	    			System.out.print(array[currentPosition] + " ");
	    			currentPosition++;
	    			}
	    			else
	    				break; 
	    		}
	    		System.out.println();
	    	}
	    }
	    
	    
	    private void percolateDown( int hole )
	    {
	    	if (!isLeaf(hole))
	        { 
	            if ( array[hole] < array[leftChild(hole)]  || array[hole] < array[rightChild(hole)])
	            {
	                if (array[leftChild(hole)] > array[rightChild(hole)])
	                {
	                    swap(hole, leftChild(hole));
	                    percolateDown(leftChild(hole));
	                }
	                else
	                {
	                    swap(hole, rightChild(hole));
	                    percolateDown(rightChild(hole));
	                }
	            }
	        }
	    }

	}

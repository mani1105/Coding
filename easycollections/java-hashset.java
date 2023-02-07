//Write your code here
HashSet<String> p = new HashSet<String>(t);

    for(int i = 0; i < t; i++)
    {
        p.add(pair_left[i] + ", " + pair_right[i] );
        System.out.println(p.size());        
    }

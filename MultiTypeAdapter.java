 android.content.Context; 
4    import android.support.annotation.NonNull; 
5    import android.support.v7.widget.RecyclerView; 
6    import android.view.LayoutInflater; 
7    import android.view.View; 
8    import android.view.ViewGroup; 
9     
10   import java.util.ArrayList; 
11    
12   public class MultiTypeAdapter extends RecyclerView.Adapter { 
13       Context context; 
14       private ArrayList<Model> dataSet; 
15    
16       MultiTypeAdapter(ArrayList<Model> dataSet, Context context) { 
17           this.dataSet = dataSet; 
18           this.context = context; 
19       } 
20    
21       @NonNull 
22       @Override 
23       public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { 
24    
25           View v; 
26    
27           switch (viewType) { 
28               case Model.SINGLE_TYPE: 
29                   v = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_column, parent, false); 
30                   return new SingleViewHolder(v); 
31    
32    
33               case Model.DOUBLE_TYPE: 
34                   v = LayoutInflater.from(parent.getContext()).inflate(R.layout.double_column, parent, false); 
35                   return new DoubleViewHolder(v); 
36           } 
37           return null; 
38       } 
39    
40       @Override 
41       public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) { 
42    
43       } 
44    
45       @Override 
46       public int getItemCount() { 
47           return dataSet.size(); 
48       } 
49    
50       @Override 
51       public int getItemViewType(int position) { 
52           switch (dataSet.get(position).type) { 
53               case 0: 
54                   return Model.SINGLE_TYPE; 
55               case 1: 
56                   return Model.DOUBLE_TYPE; 
57               default: 
58                   return -1; 
59    
60           } 
61    
62       } 
63    
64       class SingleViewHolder extends RecyclerView.ViewHolder { 
65    
66           public SingleViewHolder(View itemView) { 
67               super(itemView); 
68           } 
69       } 
70    
71       class DoubleViewHolder extends RecyclerView.ViewHolder { 
72    
73           public DoubleViewHolder(View itemView) { 
74               super(itemView); 
75           } 
76       } 
77   } 
78   

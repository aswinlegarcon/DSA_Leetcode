class Item
{
    int value;
    int weight;
    public Item(int value,int weight)
    {
        this.value = value;
        this.weight = weight;
    }
}
class Solution {
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        // code here
        double total = 0;
        Item[] arr = new Item[values.length];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = new Item(values[i],weights[i]);
        }
        Arrays.sort(arr,(a1,a2)->
        {
            double frac1 = 1.0*a1.value/a1.weight;
            double frac2 = 1.0*a2.value/a2.weight;
            return Double.compare(frac2,frac1);
            
        });
        
        for(int i=0;i<values.length;i++)
        {
            if(arr[i].weight<=W)
            {
                total += arr[i].value;
                W -= arr[i].weight;
            }
            else
            {
                total += (1.0 * arr[i].value / arr[i].weight) * W;
                break;
            }
        }
        return total;
    }
}
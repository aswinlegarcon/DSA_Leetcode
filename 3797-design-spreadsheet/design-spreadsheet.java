class Spreadsheet {

    private int spreadSheet[][];

    public Spreadsheet(int rows) {
        this.spreadSheet = new int[rows][26];
    }
    
    public void setCell(String cell, int value) {
        char col = cell.substring(0,1).charAt(0);
        int row = Integer.parseInt(cell.substring(1,cell.length()));
        spreadSheet[row-1][col-'A'] = value;
    }
    
    public void resetCell(String cell) {
        setCell(cell,0);
    }
    
    public int getValue(String formula) {
        char arr[] = formula.toCharArray();
        int i = 1; // skip '='
        int n = arr.length;
        int ans = 0;

        while (i < n) {
            char temp = arr[i];

            if (temp >= 'A' && temp <= 'Z') {
                char col = temp;
                i++;

                StringBuilder sb = new StringBuilder();
                while (i < n && arr[i] != '+') {
                    sb.append(arr[i]);
                    i++;
                }

                int row = Integer.parseInt(sb.toString());
                ans += spreadSheet[row - 1][col - 'A'];
            } else {
                StringBuilder sb = new StringBuilder();
                while (i < n && arr[i] != '+') {
                    sb.append(arr[i]);
                    i++;
                }

                int num = Integer.parseInt(sb.toString());
                ans += num;
            }

            i++;
        }
        return ans;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */
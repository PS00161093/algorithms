class PascalsTriangle {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            result.add(getNumber(rowIndex, i));
        }

        return result;
    }

    int getNumber(int row, int column) {
        if (row == 0 || column == 0 || row == column) {
            return 1;
        }

        return getNumber(row - 1, column - 1) + getNumber(row - 1, column);
    }
}

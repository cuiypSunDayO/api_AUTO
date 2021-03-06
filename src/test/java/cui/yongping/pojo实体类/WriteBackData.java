package cui.yongping.pojo实体类;

/**
 * @author 崔崔
 * @date 2021/7/15-11:12
 * 小崔hello
 */
public class WriteBackData {
    private int sheetIndex;
    private int rowNum;
    private int cellNum;
    private String content;

    public WriteBackData() {
    }

    public WriteBackData(int sheetIndex, int rowNum, int cellNum, String content) {
        this.sheetIndex = sheetIndex;
        this.rowNum = rowNum;
        this.cellNum = cellNum;
        this.content = content;
    }

    public int getSheetIndex() {
        return sheetIndex;
    }

    public void setSheetIndex(int sheetIndex) {
        this.sheetIndex = sheetIndex;
    }

    public int getRowNum() {
        return rowNum;
    }

    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }

    public int getCellNum() {
        return cellNum;
    }

    public void setCellNum(int cellNum) {
        this.cellNum = cellNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "WriteBackData{" +
                "sheetIndex=" + sheetIndex +
                ", rowNum=" + rowNum +
                ", cellNum=" + cellNum +
                ", content='" + content + '\'' +
                '}';
    }
}


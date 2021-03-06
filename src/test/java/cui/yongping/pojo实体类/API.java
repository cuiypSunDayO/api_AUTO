package cui.yongping.pojo实体类;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * @author 崔崔
 * @date 2021/5/24-14:58
 * 小崔hello
 */
public class API {
    //CaseId	Name	Url	Type
    @Excel(name = "CaseId")
    private int id;
    @Excel(name = "Name")
    private  String name;
    @Excel(name = "Url")
    private String url;
    @Excel(name = "Type")
    private String method;

    @Override
    public String toString() {
        return "API{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", method='" + method + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}

package studio.aki.havefive.dto;

public class ResultBean {

    private int responseCode;

    private String responseMessage = "Success";

    private Object body;

    public ResultBean() {
        // intentionally empty
    }

    public ResultBean(final int responseCode, final Object body) {
        this.responseCode = responseCode;
        this.body = body;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }
}

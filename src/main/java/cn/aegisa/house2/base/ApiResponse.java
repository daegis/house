package cn.aegisa.house2.base;

import lombok.Data;

import java.io.Serializable;

/**
 * Using IntelliJ IDEA.
 *
 * @author HNAyd.xian at 2018/5/20 15:08
 */
@Data
public class ApiResponse implements Serializable {
    private Integer code;
    private String message;
    private Object data;
    private boolean more;

    public ApiResponse() {
    }

    public ApiResponse(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ApiResponse(Integer code) {
        this.code = code;
    }

    public static ApiResponse ofMessage(int code, String message) {
        return new ApiResponse(code, message, null);
    }

    public static ApiResponse ofSuccess(Object data) {
        return new ApiResponse(Status.SUCCESS.code, Status.SUCCESS.message, data);
    }

    public enum Status {
        SUCCESS(200, "ok"),
        INTERNAL_ERROR(500, "error");
        private int code;
        private String message;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        Status(int code, String message) {
            this.code = code;
            this.message = message;
        }
    }
}

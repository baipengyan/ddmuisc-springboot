package com.bestbigkk.ddmusic.service.common;

import com.alibaba.fastjson.JSONObject;
import com.bestbigkk.ddmusic.utils.SpringContextUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;

/**
 * @author 开
 * 根据图片持久化服务，建立使用较多的文件上传功能，
 */
@Service
public class FileStoreService {
    private final FileStore fileStore;
    private final JSONObject jsonObject;

    @Autowired
    public FileStoreService(FileStore fileStore, SpringContextUtil springContextUtil, JSONObject jsonObject) {
        this.fileStore = fileStore;
        this.jsonObject = jsonObject;
    }

    public JSONObject fileUpload(HttpServletRequest request, HttpServletResponse response, InputStream inputStream, String format){
        jsonObject.put("status", false);

        if (inputStream == null) {
            jsonObject.put("msg", "未找到要上传的文件");
            return jsonObject;
        }

        String path = fileStore.save(inputStream, "."+format, "temp");
        if (path == null) {
            jsonObject.put("msg", "图片上传失败，请稍后重试");
            return jsonObject;
        }
        jsonObject.put("status", true);
        jsonObject.put("url", path);
        return jsonObject;
    }
}

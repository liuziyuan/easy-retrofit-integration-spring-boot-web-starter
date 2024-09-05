package io.github.liuziyuan.retrofit.integration.spring.boot.web;

import io.github.easyretrofit.core.RetrofitResourceContext;
import io.github.easyretrofit.core.extension.BaseInterceptor;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Response;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;

@Slf4j
@Component
public class PrintInterceptor extends BaseInterceptor {

    @Resource
    private RetrofitResourceContext context;

    @Override
    protected Response executeIntercept(Chain chain) throws IOException {
        PrintInfo printInfoAnnotation = (PrintInfo) super.getExtensionAnnotation(PrintInfo.class);
        String value = printInfoAnnotation.value();
        log.info("{}{}", value, chain.request().method());
        return chain.proceed(chain.request());
    }

    @Override
    protected RetrofitResourceContext getInjectedRetrofitResourceContext() {
        return this.context;
    }
}

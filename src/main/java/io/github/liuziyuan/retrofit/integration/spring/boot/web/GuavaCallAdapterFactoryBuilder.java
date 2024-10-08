package io.github.liuziyuan.retrofit.integration.spring.boot.web;

import io.github.easyretrofit.core.builder.BaseCallAdapterFactoryBuilder;
import org.springframework.stereotype.Component;
import retrofit2.CallAdapter;
import retrofit2.adapter.guava.GuavaCallAdapterFactory;

/**
 * @author liuziyuan
 */
@Component
public class GuavaCallAdapterFactoryBuilder extends BaseCallAdapterFactoryBuilder {

    @Override
    public CallAdapter.Factory buildCallAdapterFactory() {
        return GuavaCallAdapterFactory.create();
    }
}

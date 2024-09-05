package io.github.liuziyuan.retrofit.integration.spring.boot.web;


import io.github.easyretrofit.core.builder.BaseCallAdapterFactoryBuilder;
import io.github.liuziyuan.retrofit.adapter.simple.body.BodyCallAdapterFactory;
import retrofit2.CallAdapter;

public class BodyCallAdapterFactoryBuilder extends BaseCallAdapterFactoryBuilder {
    @Override
    public CallAdapter.Factory buildCallAdapterFactory() {
        return BodyCallAdapterFactory.create();
    }
}

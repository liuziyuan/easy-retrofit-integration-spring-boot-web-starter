package io.github.liuziyuan.retrofit.integration.spring.boot.web;

import io.github.easyretrofit.core.annotation.RetrofitBuilder;

@RetrofitBuilder(baseUrl = "${integration.baseUrl}")
public interface IntegrationBaseApi {
}

package com.samiu.wangank.bean.base

/**
 * @author Samiu 2020/3/3
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
data class WanResponse<out T>(val errorCode: Int, val errorMsg: String, val data: T)
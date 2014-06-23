package com.psd.app01.function;

/**
 * 方法接口
 * @author YuF
 * @param <Req>
 * @param <Res>
 */
public interface IFuction<Req, Res> {
	public Res action(Req req);
}

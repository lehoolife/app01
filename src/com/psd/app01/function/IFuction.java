package com.psd.app01.function;

/**
 * �����ӿ�
 * @author YuF
 * @param <Req>
 * @param <Res>
 */
public interface IFuction<Req, Res> {
	public Res action(Req req);
}

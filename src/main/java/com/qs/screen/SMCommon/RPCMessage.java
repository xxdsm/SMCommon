package com.qs.screen.SMCommon;

/**
 *rpc 通信
 */
public class RPCMessage<Data extends Object> {
	private int rpccode;
	private String message;
	private Data dataContent;
	
	public int getRpccode() {
		return rpccode;
	}
	public void setRpccode(int rpccode) {
		this.rpccode = rpccode;
	}
	public String getMessage() {
		return message == null?"":message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Data getDataContent() {
		return dataContent;
	}
	public void setDataContent(Data dataContent) {
		this.dataContent = dataContent;
	}
	
}

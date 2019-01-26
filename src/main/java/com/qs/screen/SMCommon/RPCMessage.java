package com.qs.screen.SMCommon;

/**
 *rpc 通信
 */
public class RPCMessage {
	private int rpccode;
	private String message;
	private String dataContent;
	
	public int getRpccode() {
		return rpccode;
	}
	public void setRpccode(int rpccode) {
		this.rpccode = rpccode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDataContent() {
		return dataContent;
	}
	public void setDataContent(String dataContent) {
		this.dataContent = dataContent;
	}
	
}

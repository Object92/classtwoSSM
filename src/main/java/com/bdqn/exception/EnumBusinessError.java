package com.bdqn.exception;

import com.bdqn.pojo.User;

/**
 *@ClassName:ҵ���쳣ͨ�õ�ö��
 *@Description:
 *@Author:lzq
 *@Date: 2019/9/9 9:05
 **/
public enum EnumBusinessError implements CommonError{

    UNKNOWERROR(10001,"δ֪����"),
    USER_NOT_FOUND(20001,"�û�δ�ҵ�"),
    ROLES_NOT_FOUND(30001,"�û���ɫ����δ�ҵ�"),
    ;

    private int errCode;//�������
    private String errMsg;//��������

    EnumBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    EnumBusinessError() {
    }

    public int getErrorCode() {
        return this.errCode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public CommonError setErrMsg(String errMsg) {
        this.errMsg=errMsg;
        return this;
    }

    public static void main(String[] args) {
//        Object o=new User();
//        o.toString();
//        CommonError commonError=new EnumBusinessError(30000,"��Ӧ����Ϣ����");
//        BusinessExcpetion businessExcpetion=new BusinessExcpetion(EnumBusinessError.UNKNOWERROR);
        BusinessExcpetion businessExcpetion=new BusinessExcpetion(EnumBusinessError.USER_NOT_FOUND);
        System.out.println( businessExcpetion.getErrMsg());
        System.out.println( businessExcpetion.getErrorCode());


    }
}

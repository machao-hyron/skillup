//public static void setBeanRider(RiderInfoValue rider,RdrChgInfoValue hostRider,String changeDate){
//
//        SLILog.startMethod(CLS_NW,"setBeanRider",null);
//        hostRider.setNew_pln_cd(rider.getRiderInput().getPlnCode());
//
//    if(CodeConst.ISF_CD_95.equals(ruder.getPlnInfo().getIsf_cd())){
//        if(UF37ConstCHANGE_DATE_95_2018.compartTo(changeDate)>0){
//            hostRider.setNew_rdr_fc(new SLIBigDecimal("10000000"));
//        }else{
//            hostRider.setNew_rdr_fc(new SLIBigDecimal("20000000"));
//        }
//        }else if(!ValldatorUtil.isEmpty(rider.getRiderInput().getNewSln())){
//            hostRider.setNew_rdr_fc(new SLIBigDecimal(rider.getRiderInput().getNewSln()));
//        }
//            SLILog.endMethod(CLS_NM,"setBeanRider",null);
//        }
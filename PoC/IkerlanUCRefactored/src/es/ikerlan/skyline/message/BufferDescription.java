package es.ikerlan.skyline.message;

import java.util.Hashtable;

import es.ikerlan.skyline.utils.PrintUtils;
import es.ikerlan.skyline.utils.StringUtils;

public class BufferDescription {
    private Hashtable parameters;
    private static BufferDescription instance = null;
    
    protected BufferDescription(){
        parameters = new Hashtable();
        populateSetup();
    }

    public static BufferDescription getInstance() {
        if (instance == null) {
            instance = new BufferDescription();
        }
        return instance;
    }
    
    public void appendParameter(int tid, int bufferId, int itemId, long min, long max){
        Hashtable parameter = new Hashtable();
        parameter.put("TID", new Integer(tid));
        parameter.put("Buffer ID", new Integer(bufferId));
        parameter.put("Item ID", new Integer(itemId));
        parameter.put("min", new Long(min));
        parameter.put("max", new Long(max));
        parameters.put(Integer.toString(tid), parameter);
    }
    
    public void populateSetup(){
        appendParameter(10000,1,0,0L,1L);
        appendParameter(10001,1,1,-1L,1L);
        appendParameter(10002,1,2,-1L,1L);
        appendParameter(10003,1,3,0L,1L);
        appendParameter(10004,1,4,0L,500L);
        appendParameter(10005,1,5,0L,500L);
        appendParameter(10006,1,6,0L,500L);
        appendParameter(10007,1,7,0L,32L);
        appendParameter(10008,1,8,0L,1L);
        appendParameter(10009,1,9,0L,9999L);
        appendParameter(10010,1,10,0L,16L);
        appendParameter(10011,1,11,0L,16L);
        appendParameter(10012,1,12,0L,16L);
        appendParameter(10013,1,13,1L,1440L);
        appendParameter(10014,1,14,1L,1440L);
        appendParameter(10015,1,15,0L,54L);
        appendParameter(10016,1,16,0L,2L);
        appendParameter(10017,1,17,0L,4L);
        appendParameter(10018,1,18,0L,4L);
        appendParameter(10019,1,19,0L,4L);
        appendParameter(10020,1,20,0L,4L);
        appendParameter(10021,1,21,0L,4L);
        appendParameter(10022,1,22,0L,4L);
        appendParameter(20000,2,0,0L,1L);
        appendParameter(20001,2,1,0L,1L);
        appendParameter(20002,2,2,0L,4294967295L);
        appendParameter(20003,2,3,0L,4294967295L);
        appendParameter(20004,2,4,0L,1L);
        appendParameter(20005,2,5,0L,9999L);
        appendParameter(20006,2,6,0L,9999L);
        appendParameter(20007,2,7,0L,1L);
        appendParameter(20008,2,8,0L,1L);
        appendParameter(20009,2,9,1000L,1000000L);
        appendParameter(20010,2,10,1000L,1000000L);
        appendParameter(20011,2,11,1000L,1000000L);
        appendParameter(20012,2,12,1000L,1000000L);
        appendParameter(20013,2,13,1000L,1000000L);
        
    }

    public boolean isValid(String tid, String value){
        boolean valid = false;
        if (parameters.containsKey(tid)) {
            if (StringUtils.isNumeric(value)){
                long valueLong = Long.parseLong(value);
                PrintUtils.debug("Compare value: "+valueLong+ " with min: "+getMin(tid) +" and max: "+getMax(tid));
                if ((valueLong >= getMin(tid)) && (valueLong <= getMax(tid))){
                    valid = true;
                }
            }
        }
        return valid;
    }
    
    
    public int getBufferId(String tid){
    	return ((Integer)((Hashtable) parameters.get(tid)).get("Buffer ID")).intValue();
    }
    
    public int getItemId(String tid){
    	return ((Integer)((Hashtable) parameters.get(tid)).get("Item ID")).intValue();
    }
    
    public long getMax(String tid){
    	return ((Long)((Hashtable) parameters.get(tid)).get("max")).longValue();
    }
    
    public long getMin(String tid){
    	return ((Long)((Hashtable) parameters.get(tid)).get("min")).longValue();
    }
}


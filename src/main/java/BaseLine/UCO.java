package BaseLine;

import bean.*;
import util.DBUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UCO {
    List<User> experimentalUserList;
    List<EdgeServer> experimentalEdgeServer;
    List<PopularData> experimentalPopularData;
    List<Request> predictiveRequest;
    EdgeServerGraph edgeServerGraph;
    Map<Integer,double[]> dataVectorMap;
    //用户最近的服务器
    Map<Integer,Integer> useredge;
  //  Map<Integer,Map<Integer,Double>> dataSimilarityMap;
    public void InitializeData() throws IOException {
        this.experimentalUserList = DBUtils.getAllUser();
        this.experimentalEdgeServer = DBUtils.getAllEdgeServer();
        this.experimentalPopularData = DBUtils.getAllPopularData();
     //   this.useredge=
    }
//    //返回的是<时间戳，<用户id，时延>>
//    public Map<Integer,Map<Integer,Integer>> experiment(int begintimestamp,int endtimestamp)throws IOException{
//        List<Integer> timeperiod=new ArrayList<Integer>();
//        for(int i=begintimestamp;i<=endtimestamp;i++){
//            timeperiod.add(i);
//        }
//        for(Integer time:timeperiod){
//            for(EdgeServer edgeServer:experimentalEdgeServer){
//
//            }
//        }
//
//    }
}

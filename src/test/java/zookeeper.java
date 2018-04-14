import org.apache.log4j.BasicConfigurator;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;

public class zookeeper {
    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();

        ZooKeeper zk = new ZooKeeper("192.168.1.1:2181", 400000,new emmm());

        System.out.println(zk.getClass());
        if(zk.exists("/test", false) == null)
        {
            zk.create("/test", "znode1".getBytes(), Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        }
        System.out.println(new String(zk.getData("/test", false, null)));
        zk.close();

    }
}
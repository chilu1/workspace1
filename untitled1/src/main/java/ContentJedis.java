import redis.clients.jedis.Jedis;

public class ContentJedis {
    public static void main(String[] args) {
        //new Jedis对象即可
        Jedis jedis = new Jedis("127.0.0.1",6379);
        //
        jedis.flushDB();
        jedis.set("name","dingyongjun");
        jedis.set("age","23");
        jedis.set("high","173");
        jedis.lpush("list","1","2","3","4");
        System.out.println("name:"+jedis.get("name")+"\nage:"+jedis.get("age")+"\nhigh:"+jedis.get("high"));
        System.out.println("******************************************************************");
        System.out.println("list:"+jedis.lrange("list",0,-1));
    }
}

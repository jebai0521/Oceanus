package com.bj58.oceanus.plugins.mybatis.shard;

import java.util.Map;

import com.bj58.oceanus.core.shard.Function;

public class TopicShardFunction implements Function{
    @Override
    public int execute(int size, Map<String, Object> parameters) {
            long id = Long.valueOf(parameters.get("ID").toString());
            long forum = Long.valueOf(parameters.get("FORUM").toString());
            long sequence = Long.valueOf(parameters.get("SEQUENCE").toString());
            int index = (int)((forum - 1) * 10 + (sequence - 1) / 10);
            
            System.out.println("size ==> " + size);
            System.out.println("index ==> " + index);
            return index;
    }
}

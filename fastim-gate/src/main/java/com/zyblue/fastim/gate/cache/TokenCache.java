package com.zyblue.fastim.gate.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TokenCache {
    public static final Map<Long, String> tokenMap = new ConcurrentHashMap<>(256);

}

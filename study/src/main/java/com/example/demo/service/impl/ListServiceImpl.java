package com.example.demo.service.impl;

        import com.example.demo.entity.TUserInfo;
        import com.example.demo.entity.TUserInfoExample;
        import com.example.demo.mapper.TUserInfoMapper;
        import com.example.demo.service.ListService;
        import lombok.extern.slf4j.Slf4j;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import javax.annotation.Resource;
        import java.util.List;

@Slf4j
@Service
public class ListServiceImpl implements ListService {

    @Resource
    private TUserInfoMapper userInfoMapper;

    @Override
    public List<TUserInfo> init() {
        TUserInfoExample example = new TUserInfoExample();
        List<TUserInfo> tUserInfo = userInfoMapper.selectByExample(example);
        log.info("userinfoSize:" + tUserInfo.size());
        return tUserInfo;
    }
}
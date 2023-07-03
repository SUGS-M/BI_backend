package com.example.bi_backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bi_backend.model.entity.Chart;
import com.example.bi_backend.service.ChartService;
import com.example.bi_backend.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author 18599
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2023-06-29 21:22:26
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{


}





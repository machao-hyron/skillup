package com.longyue.orvetimeservice.converter;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.converters.ReadConverterContext;
import com.alibaba.excel.converters.WriteConverterContext;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.data.ReadCellData;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class ListConverter implements Converter<List> {
    @Override
    public Class supportJavaTypeKey() {
        return List.class;
    }

    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.STRING;
    }

    @Override
    public List convertToJavaData(ReadCellData<?> cellData, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        String stringValue = cellData.getStringValue();
        String[] split = stringValue.split(",");
        List<String> enterpriseList = new ArrayList<>();
        for(int i = 0; i < split.length; i++){
            enterpriseList.add(split[i]);
        }
        return enterpriseList;
    }

    @Override
    public List convertToJavaData(ReadConverterContext<?> context) throws Exception {
        return Converter.super.convertToJavaData(context);
    }

    @Override
    public WriteCellData<?> convertToExcelData(WriteConverterContext<List> context) throws Exception {
        return Converter.super.convertToExcelData(context);
    }

    @Override
    public WriteCellData<?> convertToExcelData(List value, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        return Converter.super.convertToExcelData(value, contentProperty, globalConfiguration);
    }
}


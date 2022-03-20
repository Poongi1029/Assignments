package com.Q10;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.web.servlet.view.document.AbstractExcelView;

public class ExcelReportView extends AbstractExcelView  {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		 response.setHeader("Content-Disposition", "attachment;filename=\"student.xls\"");
	        List<Employee> employeeList =(List< Employee>) model.get("empList");
	        HSSFSheet  sheet = workbook.createSheet("Employee Data");
	        Row header = sheet.createRow(0);
	        header.createCell(0).setCellValue("Employee ID");
	        header.createCell(1).setCellValue("Employee Name");
	        header.createCell(2).setCellValue("Employee Salary");

	        int rowNum = 1;
	        for(Employee employee:employeeList){
	            Row row = sheet.createRow(rowNum++);
	            row.createCell(0).setCellValue(employee.getId());
	            row.createCell(1).setCellValue(employee.getName());
	            row.createCell(2).setCellValue(employee.getSalary());
	        }
	    }

}

package com.tensquare.base.controller;

import com.tensquare.base.Label;
import com.tensquare.base.service.LabelService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class LabelController {

   @Autowired
   private LabelService labelService;
   @RequestMapping(value = "/",method = RequestMethod.GET)
   public Result findAll(){
    return new Result(true, StatusCode.OK,"查询成功",labelService.findAll());
   }

   @RequestMapping(value = "findById/{labelId}",method = RequestMethod.GET)
   public Result findById(@PathVariable("labelId") String labelId){
      return new Result(true, StatusCode.OK,"查询成功",labelService.findById(labelId));
   }
   @RequestMapping(value="/save",method = RequestMethod.POST)
   public Result save(@RequestBody Label label){
      labelService.save(label);
      return new Result(true, StatusCode.OK,"保存成功");
   }

   @RequestMapping(value = "update/{labelId}",method = RequestMethod.PUT)
   public Result update(@PathVariable String labelId,@RequestBody Label label){
      label.setId(labelId);
      labelService.update(label);
      return new Result(true, StatusCode.OK,"修改成功");
   }

   @RequestMapping(value = "/deleteById/{labelId}",method = RequestMethod.DELETE)
   public Result deleteById(@PathVariable("labelId") String labelId){
      labelService.deleteById(labelId);
      return new Result(true, StatusCode.OK,"保存成功");
   }
}

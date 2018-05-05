package sourongdaojia;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sourong.product.dao.ProductVoMapper;
import com.sourong.product.domain.ProductVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class test {
 @Resource
 private ProductVoMapper proVoMapper;
	
 
 	@Test
	public void test() {
		List<ProductVo> selectAll = proVoMapper.selectAll();
		System.out.println(selectAll);
	}

}

package com.tt.careerplanner;

import com.tt.careerplanner.model.Form;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CareerPlannerApplicationTests {

	@Test
	void formisSavedTest() {
		Form formMock = Mockito.mock(Form.class);
		Mockito.when(formMock.getResponseId()).thenReturn(20L);
	}

}

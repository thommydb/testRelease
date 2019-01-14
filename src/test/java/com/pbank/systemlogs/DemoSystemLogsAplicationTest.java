package com.pbank.systemlogs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.Rule;

import org.springframework.boot.test.rule.OutputCapture;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoSystemLogsAplicationTest {

	@Test
	public void contextLoads() {
	}
	
	@Rule
	public final OutputCapture output = new OutputCapture();

	@Test
	public void testLoadedCustomLogbackConfig() throws Exception {
		DemoSystemLogsAplication.main(new String[0]);
		assertThat(this.output.toString()).contains("Sample Debug Message");
		assertThat(this.output.toString()).doesNotContain("Sample Trace Message");
	}

	@Test
	public void testProfile() throws Exception {
		DemoSystemLogsAplication
				.main(new String[] { "--spring.profiles.active=staging" });
		assertThat(this.output.toString()).contains("Sample Debug Message");
		assertThat(this.output.toString()).contains("Sample Trace Message");
	}	

}


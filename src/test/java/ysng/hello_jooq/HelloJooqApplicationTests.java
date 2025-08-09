package ysng.hello_jooq;

import org.jooq.DSLContext;
import org.jooq.generated.tables.JActor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloJooqApplicationTests {

	@Autowired
	DSLContext dslContext;

	@DisplayName("")
	@Test
	void test() {
		dslContext.selectFrom(JActor.ACTOR)
			.limit(10)
			.fetch();
	}

}

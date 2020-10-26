package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("37")
class Record_4958 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4958: FirstName is Dayna")
	void FirstNameOfRecord4958() {
		assertEquals("Dayna", customers.get(4957).getFirstName());
	}

	@Test
	@DisplayName("Record 4958: LastName is Roath")
	void LastNameOfRecord4958() {
		assertEquals("Roath", customers.get(4957).getLastName());
	}

	@Test
	@DisplayName("Record 4958: Company is Cntry Wide Tape & Rec Dstrbtrs")
	void CompanyOfRecord4958() {
		assertEquals("Cntry Wide Tape & Rec Dstrbtrs", customers.get(4957).getCompany());
	}

	@Test
	@DisplayName("Record 4958: Address is 12952 152nd Ave")
	void AddressOfRecord4958() {
		assertEquals("12952 152nd Ave", customers.get(4957).getAddress());
	}

	@Test
	@DisplayName("Record 4958: City is Grand Haven")
	void CityOfRecord4958() {
		assertEquals("Grand Haven", customers.get(4957).getCity());
	}

	@Test
	@DisplayName("Record 4958: County is Ottawa")
	void CountyOfRecord4958() {
		assertEquals("Ottawa", customers.get(4957).getCounty());
	}

	@Test
	@DisplayName("Record 4958: State is MI")
	void StateOfRecord4958() {
		assertEquals("MI", customers.get(4957).getState());
	}

	@Test
	@DisplayName("Record 4958: ZIP is 49417")
	void ZIPOfRecord4958() {
		assertEquals("49417", customers.get(4957).getZIP());
	}

	@Test
	@DisplayName("Record 4958: Phone is 616-842-6095")
	void PhoneOfRecord4958() {
		assertEquals("616-842-6095", customers.get(4957).getPhone());
	}

	@Test
	@DisplayName("Record 4958: Fax is 616-842-4747")
	void FaxOfRecord4958() {
		assertEquals("616-842-4747", customers.get(4957).getFax());
	}

	@Test
	@DisplayName("Record 4958: Email is dayna@roath.com")
	void EmailOfRecord4958() {
		assertEquals("dayna@roath.com", customers.get(4957).getEmail());
	}

	@Test
	@DisplayName("Record 4958: Web is http://www.daynaroath.com")
	void WebOfRecord4958() {
		assertEquals("http://www.daynaroath.com", customers.get(4957).getWeb());
	}
}

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

@Tag("13")
class Record_4394 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4394: FirstName is Mitchell")
	void FirstNameOfRecord4394() {
		assertEquals("Mitchell", customers.get(4393).getFirstName());
	}

	@Test
	@DisplayName("Record 4394: LastName is Rubenstone")
	void LastNameOfRecord4394() {
		assertEquals("Rubenstone", customers.get(4393).getLastName());
	}

	@Test
	@DisplayName("Record 4394: Company is Askintowicz, John W Iii")
	void CompanyOfRecord4394() {
		assertEquals("Askintowicz, John W Iii", customers.get(4393).getCompany());
	}

	@Test
	@DisplayName("Record 4394: Address is 712 E Ohio St")
	void AddressOfRecord4394() {
		assertEquals("712 E Ohio St", customers.get(4393).getAddress());
	}

	@Test
	@DisplayName("Record 4394: City is Fortville")
	void CityOfRecord4394() {
		assertEquals("Fortville", customers.get(4393).getCity());
	}

	@Test
	@DisplayName("Record 4394: County is Hancock")
	void CountyOfRecord4394() {
		assertEquals("Hancock", customers.get(4393).getCounty());
	}

	@Test
	@DisplayName("Record 4394: State is IN")
	void StateOfRecord4394() {
		assertEquals("IN", customers.get(4393).getState());
	}

	@Test
	@DisplayName("Record 4394: ZIP is 46040")
	void ZIPOfRecord4394() {
		assertEquals("46040", customers.get(4393).getZIP());
	}

	@Test
	@DisplayName("Record 4394: Phone is 317-485-7741")
	void PhoneOfRecord4394() {
		assertEquals("317-485-7741", customers.get(4393).getPhone());
	}

	@Test
	@DisplayName("Record 4394: Fax is 317-485-2471")
	void FaxOfRecord4394() {
		assertEquals("317-485-2471", customers.get(4393).getFax());
	}

	@Test
	@DisplayName("Record 4394: Email is mitchell@rubenstone.com")
	void EmailOfRecord4394() {
		assertEquals("mitchell@rubenstone.com", customers.get(4393).getEmail());
	}

	@Test
	@DisplayName("Record 4394: Web is http://www.mitchellrubenstone.com")
	void WebOfRecord4394() {
		assertEquals("http://www.mitchellrubenstone.com", customers.get(4393).getWeb());
	}
}

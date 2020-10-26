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

@Tag("40")
class Record_308 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 308: FirstName is Lorraine")
	void FirstNameOfRecord308() {
		assertEquals("Lorraine", customers.get(307).getFirstName());
	}

	@Test
	@DisplayName("Record 308: LastName is Wreath")
	void LastNameOfRecord308() {
		assertEquals("Wreath", customers.get(307).getLastName());
	}

	@Test
	@DisplayName("Record 308: Company is Bermuda Dept Of Tourism")
	void CompanyOfRecord308() {
		assertEquals("Bermuda Dept Of Tourism", customers.get(307).getCompany());
	}

	@Test
	@DisplayName("Record 308: Address is 345 Us Highway 9")
	void AddressOfRecord308() {
		assertEquals("345 Us Highway 9", customers.get(307).getAddress());
	}

	@Test
	@DisplayName("Record 308: City is Freehold")
	void CityOfRecord308() {
		assertEquals("Freehold", customers.get(307).getCity());
	}

	@Test
	@DisplayName("Record 308: County is Monmouth")
	void CountyOfRecord308() {
		assertEquals("Monmouth", customers.get(307).getCounty());
	}

	@Test
	@DisplayName("Record 308: State is NJ")
	void StateOfRecord308() {
		assertEquals("NJ", customers.get(307).getState());
	}

	@Test
	@DisplayName("Record 308: ZIP is 7728")
	void ZIPOfRecord308() {
		assertEquals("7728", customers.get(307).getZIP());
	}

	@Test
	@DisplayName("Record 308: Phone is 732-866-6889")
	void PhoneOfRecord308() {
		assertEquals("732-866-6889", customers.get(307).getPhone());
	}

	@Test
	@DisplayName("Record 308: Fax is 732-866-9667")
	void FaxOfRecord308() {
		assertEquals("732-866-9667", customers.get(307).getFax());
	}

	@Test
	@DisplayName("Record 308: Email is lorraine@wreath.com")
	void EmailOfRecord308() {
		assertEquals("lorraine@wreath.com", customers.get(307).getEmail());
	}

	@Test
	@DisplayName("Record 308: Web is http://www.lorrainewreath.com")
	void WebOfRecord308() {
		assertEquals("http://www.lorrainewreath.com", customers.get(307).getWeb());
	}
}

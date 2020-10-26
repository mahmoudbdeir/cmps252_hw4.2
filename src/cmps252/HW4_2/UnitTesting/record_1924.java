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

@Tag("43")
class Record_1924 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1924: FirstName is Stephen")
	void FirstNameOfRecord1924() {
		assertEquals("Stephen", customers.get(1923).getFirstName());
	}

	@Test
	@DisplayName("Record 1924: LastName is Neyland")
	void LastNameOfRecord1924() {
		assertEquals("Neyland", customers.get(1923).getLastName());
	}

	@Test
	@DisplayName("Record 1924: Company is Herlihy, Thomas M Esq")
	void CompanyOfRecord1924() {
		assertEquals("Herlihy, Thomas M Esq", customers.get(1923).getCompany());
	}

	@Test
	@DisplayName("Record 1924: Address is 2294 E Iona Rd")
	void AddressOfRecord1924() {
		assertEquals("2294 E Iona Rd", customers.get(1923).getAddress());
	}

	@Test
	@DisplayName("Record 1924: City is Idaho Falls")
	void CityOfRecord1924() {
		assertEquals("Idaho Falls", customers.get(1923).getCity());
	}

	@Test
	@DisplayName("Record 1924: County is Bonneville")
	void CountyOfRecord1924() {
		assertEquals("Bonneville", customers.get(1923).getCounty());
	}

	@Test
	@DisplayName("Record 1924: State is ID")
	void StateOfRecord1924() {
		assertEquals("ID", customers.get(1923).getState());
	}

	@Test
	@DisplayName("Record 1924: ZIP is 83401")
	void ZIPOfRecord1924() {
		assertEquals("83401", customers.get(1923).getZIP());
	}

	@Test
	@DisplayName("Record 1924: Phone is 208-524-3880")
	void PhoneOfRecord1924() {
		assertEquals("208-524-3880", customers.get(1923).getPhone());
	}

	@Test
	@DisplayName("Record 1924: Fax is 208-524-4328")
	void FaxOfRecord1924() {
		assertEquals("208-524-4328", customers.get(1923).getFax());
	}

	@Test
	@DisplayName("Record 1924: Email is stephen@neyland.com")
	void EmailOfRecord1924() {
		assertEquals("stephen@neyland.com", customers.get(1923).getEmail());
	}

	@Test
	@DisplayName("Record 1924: Web is http://www.stephenneyland.com")
	void WebOfRecord1924() {
		assertEquals("http://www.stephenneyland.com", customers.get(1923).getWeb());
	}
}

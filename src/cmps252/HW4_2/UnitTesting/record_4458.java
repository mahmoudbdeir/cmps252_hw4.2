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

@Tag("32")
class Record_4458 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4458: FirstName is Peter")
	void FirstNameOfRecord4458() {
		assertEquals("Peter", customers.get(4457).getFirstName());
	}

	@Test
	@DisplayName("Record 4458: LastName is Anderholm")
	void LastNameOfRecord4458() {
		assertEquals("Anderholm", customers.get(4457).getLastName());
	}

	@Test
	@DisplayName("Record 4458: Company is Jr Industries")
	void CompanyOfRecord4458() {
		assertEquals("Jr Industries", customers.get(4457).getCompany());
	}

	@Test
	@DisplayName("Record 4458: Address is 1910 Ne 30th Ave")
	void AddressOfRecord4458() {
		assertEquals("1910 Ne 30th Ave", customers.get(4457).getAddress());
	}

	@Test
	@DisplayName("Record 4458: City is Portland")
	void CityOfRecord4458() {
		assertEquals("Portland", customers.get(4457).getCity());
	}

	@Test
	@DisplayName("Record 4458: County is Multnomah")
	void CountyOfRecord4458() {
		assertEquals("Multnomah", customers.get(4457).getCounty());
	}

	@Test
	@DisplayName("Record 4458: State is OR")
	void StateOfRecord4458() {
		assertEquals("OR", customers.get(4457).getState());
	}

	@Test
	@DisplayName("Record 4458: ZIP is 97212")
	void ZIPOfRecord4458() {
		assertEquals("97212", customers.get(4457).getZIP());
	}

	@Test
	@DisplayName("Record 4458: Phone is 503-281-9603")
	void PhoneOfRecord4458() {
		assertEquals("503-281-9603", customers.get(4457).getPhone());
	}

	@Test
	@DisplayName("Record 4458: Fax is 503-281-4307")
	void FaxOfRecord4458() {
		assertEquals("503-281-4307", customers.get(4457).getFax());
	}

	@Test
	@DisplayName("Record 4458: Email is peter@anderholm.com")
	void EmailOfRecord4458() {
		assertEquals("peter@anderholm.com", customers.get(4457).getEmail());
	}

	@Test
	@DisplayName("Record 4458: Web is http://www.peteranderholm.com")
	void WebOfRecord4458() {
		assertEquals("http://www.peteranderholm.com", customers.get(4457).getWeb());
	}
}

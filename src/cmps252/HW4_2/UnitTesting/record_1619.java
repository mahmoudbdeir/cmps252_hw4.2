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

@Tag("31")
class Record_1619 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1619: FirstName is Gayle")
	void FirstNameOfRecord1619() {
		assertEquals("Gayle", customers.get(1618).getFirstName());
	}

	@Test
	@DisplayName("Record 1619: LastName is Suiter")
	void LastNameOfRecord1619() {
		assertEquals("Suiter", customers.get(1618).getLastName());
	}

	@Test
	@DisplayName("Record 1619: Company is Bunger, Brian C Esq")
	void CompanyOfRecord1619() {
		assertEquals("Bunger, Brian C Esq", customers.get(1618).getCompany());
	}

	@Test
	@DisplayName("Record 1619: Address is 208 Sw Stark St  #-509")
	void AddressOfRecord1619() {
		assertEquals("208 Sw Stark St  #-509", customers.get(1618).getAddress());
	}

	@Test
	@DisplayName("Record 1619: City is Portland")
	void CityOfRecord1619() {
		assertEquals("Portland", customers.get(1618).getCity());
	}

	@Test
	@DisplayName("Record 1619: County is Multnomah")
	void CountyOfRecord1619() {
		assertEquals("Multnomah", customers.get(1618).getCounty());
	}

	@Test
	@DisplayName("Record 1619: State is OR")
	void StateOfRecord1619() {
		assertEquals("OR", customers.get(1618).getState());
	}

	@Test
	@DisplayName("Record 1619: ZIP is 97204")
	void ZIPOfRecord1619() {
		assertEquals("97204", customers.get(1618).getZIP());
	}

	@Test
	@DisplayName("Record 1619: Phone is 503-241-9738")
	void PhoneOfRecord1619() {
		assertEquals("503-241-9738", customers.get(1618).getPhone());
	}

	@Test
	@DisplayName("Record 1619: Fax is 503-241-8588")
	void FaxOfRecord1619() {
		assertEquals("503-241-8588", customers.get(1618).getFax());
	}

	@Test
	@DisplayName("Record 1619: Email is gayle@suiter.com")
	void EmailOfRecord1619() {
		assertEquals("gayle@suiter.com", customers.get(1618).getEmail());
	}

	@Test
	@DisplayName("Record 1619: Web is http://www.gaylesuiter.com")
	void WebOfRecord1619() {
		assertEquals("http://www.gaylesuiter.com", customers.get(1618).getWeb());
	}
}

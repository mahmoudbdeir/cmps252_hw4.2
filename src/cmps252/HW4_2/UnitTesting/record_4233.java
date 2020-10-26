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
class Record_4233 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4233: FirstName is Alberto")
	void FirstNameOfRecord4233() {
		assertEquals("Alberto", customers.get(4232).getFirstName());
	}

	@Test
	@DisplayName("Record 4233: LastName is Vanwart")
	void LastNameOfRecord4233() {
		assertEquals("Vanwart", customers.get(4232).getLastName());
	}

	@Test
	@DisplayName("Record 4233: Company is Hillcrest Stationers")
	void CompanyOfRecord4233() {
		assertEquals("Hillcrest Stationers", customers.get(4232).getCompany());
	}

	@Test
	@DisplayName("Record 4233: Address is 4400 Roudebush Ln")
	void AddressOfRecord4233() {
		assertEquals("4400 Roudebush Ln", customers.get(4232).getAddress());
	}

	@Test
	@DisplayName("Record 4233: City is Batavia")
	void CityOfRecord4233() {
		assertEquals("Batavia", customers.get(4232).getCity());
	}

	@Test
	@DisplayName("Record 4233: County is Clermont")
	void CountyOfRecord4233() {
		assertEquals("Clermont", customers.get(4232).getCounty());
	}

	@Test
	@DisplayName("Record 4233: State is OH")
	void StateOfRecord4233() {
		assertEquals("OH", customers.get(4232).getState());
	}

	@Test
	@DisplayName("Record 4233: ZIP is 45103")
	void ZIPOfRecord4233() {
		assertEquals("45103", customers.get(4232).getZIP());
	}

	@Test
	@DisplayName("Record 4233: Phone is 513-732-5242")
	void PhoneOfRecord4233() {
		assertEquals("513-732-5242", customers.get(4232).getPhone());
	}

	@Test
	@DisplayName("Record 4233: Fax is 513-732-5819")
	void FaxOfRecord4233() {
		assertEquals("513-732-5819", customers.get(4232).getFax());
	}

	@Test
	@DisplayName("Record 4233: Email is alberto@vanwart.com")
	void EmailOfRecord4233() {
		assertEquals("alberto@vanwart.com", customers.get(4232).getEmail());
	}

	@Test
	@DisplayName("Record 4233: Web is http://www.albertovanwart.com")
	void WebOfRecord4233() {
		assertEquals("http://www.albertovanwart.com", customers.get(4232).getWeb());
	}
}

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

@Tag("36")
class Record_703 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 703: FirstName is Robert")
	void FirstNameOfRecord703() {
		assertEquals("Robert", customers.get(702).getFirstName());
	}

	@Test
	@DisplayName("Record 703: LastName is Lamango")
	void LastNameOfRecord703() {
		assertEquals("Lamango", customers.get(702).getLastName());
	}

	@Test
	@DisplayName("Record 703: Company is M C Gill Corp")
	void CompanyOfRecord703() {
		assertEquals("M C Gill Corp", customers.get(702).getCompany());
	}

	@Test
	@DisplayName("Record 703: Address is 1801 Russell Blvd")
	void AddressOfRecord703() {
		assertEquals("1801 Russell Blvd", customers.get(702).getAddress());
	}

	@Test
	@DisplayName("Record 703: City is Saint Louis")
	void CityOfRecord703() {
		assertEquals("Saint Louis", customers.get(702).getCity());
	}

	@Test
	@DisplayName("Record 703: County is Saint Louis City")
	void CountyOfRecord703() {
		assertEquals("Saint Louis City", customers.get(702).getCounty());
	}

	@Test
	@DisplayName("Record 703: State is MO")
	void StateOfRecord703() {
		assertEquals("MO", customers.get(702).getState());
	}

	@Test
	@DisplayName("Record 703: ZIP is 63104")
	void ZIPOfRecord703() {
		assertEquals("63104", customers.get(702).getZIP());
	}

	@Test
	@DisplayName("Record 703: Phone is 314-771-5582")
	void PhoneOfRecord703() {
		assertEquals("314-771-5582", customers.get(702).getPhone());
	}

	@Test
	@DisplayName("Record 703: Fax is 314-771-9005")
	void FaxOfRecord703() {
		assertEquals("314-771-9005", customers.get(702).getFax());
	}

	@Test
	@DisplayName("Record 703: Email is robert@lamango.com")
	void EmailOfRecord703() {
		assertEquals("robert@lamango.com", customers.get(702).getEmail());
	}

	@Test
	@DisplayName("Record 703: Web is http://www.robertlamango.com")
	void WebOfRecord703() {
		assertEquals("http://www.robertlamango.com", customers.get(702).getWeb());
	}
}

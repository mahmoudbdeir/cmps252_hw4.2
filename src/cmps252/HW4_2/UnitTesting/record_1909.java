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

@Tag("22")
class Record_1909 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1909: FirstName is Marilyn")
	void FirstNameOfRecord1909() {
		assertEquals("Marilyn", customers.get(1908).getFirstName());
	}

	@Test
	@DisplayName("Record 1909: LastName is Acrey")
	void LastNameOfRecord1909() {
		assertEquals("Acrey", customers.get(1908).getLastName());
	}

	@Test
	@DisplayName("Record 1909: Company is Ace Signs Of Orlando")
	void CompanyOfRecord1909() {
		assertEquals("Ace Signs Of Orlando", customers.get(1908).getCompany());
	}

	@Test
	@DisplayName("Record 1909: Address is Box #-3707")
	void AddressOfRecord1909() {
		assertEquals("Box #-3707", customers.get(1908).getAddress());
	}

	@Test
	@DisplayName("Record 1909: City is Kodiak")
	void CityOfRecord1909() {
		assertEquals("Kodiak", customers.get(1908).getCity());
	}

	@Test
	@DisplayName("Record 1909: County is Kodiak Island")
	void CountyOfRecord1909() {
		assertEquals("Kodiak Island", customers.get(1908).getCounty());
	}

	@Test
	@DisplayName("Record 1909: State is AK")
	void StateOfRecord1909() {
		assertEquals("AK", customers.get(1908).getState());
	}

	@Test
	@DisplayName("Record 1909: ZIP is 99615")
	void ZIPOfRecord1909() {
		assertEquals("99615", customers.get(1908).getZIP());
	}

	@Test
	@DisplayName("Record 1909: Phone is 907-487-7468")
	void PhoneOfRecord1909() {
		assertEquals("907-487-7468", customers.get(1908).getPhone());
	}

	@Test
	@DisplayName("Record 1909: Fax is 907-487-2474")
	void FaxOfRecord1909() {
		assertEquals("907-487-2474", customers.get(1908).getFax());
	}

	@Test
	@DisplayName("Record 1909: Email is marilyn@acrey.com")
	void EmailOfRecord1909() {
		assertEquals("marilyn@acrey.com", customers.get(1908).getEmail());
	}

	@Test
	@DisplayName("Record 1909: Web is http://www.marilynacrey.com")
	void WebOfRecord1909() {
		assertEquals("http://www.marilynacrey.com", customers.get(1908).getWeb());
	}
}

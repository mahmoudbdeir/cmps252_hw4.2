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

@Tag("16")
class Record_724 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 724: FirstName is Bob")
	void FirstNameOfRecord724() {
		assertEquals("Bob", customers.get(723).getFirstName());
	}

	@Test
	@DisplayName("Record 724: LastName is Branen")
	void LastNameOfRecord724() {
		assertEquals("Branen", customers.get(723).getLastName());
	}

	@Test
	@DisplayName("Record 724: Company is Ardito Sweeney Stusse")
	void CompanyOfRecord724() {
		assertEquals("Ardito Sweeney Stusse", customers.get(723).getCompany());
	}

	@Test
	@DisplayName("Record 724: Address is 3543 Mountain View Dr")
	void AddressOfRecord724() {
		assertEquals("3543 Mountain View Dr", customers.get(723).getAddress());
	}

	@Test
	@DisplayName("Record 724: City is Anchorage")
	void CityOfRecord724() {
		assertEquals("Anchorage", customers.get(723).getCity());
	}

	@Test
	@DisplayName("Record 724: County is Anchorage")
	void CountyOfRecord724() {
		assertEquals("Anchorage", customers.get(723).getCounty());
	}

	@Test
	@DisplayName("Record 724: State is AK")
	void StateOfRecord724() {
		assertEquals("AK", customers.get(723).getState());
	}

	@Test
	@DisplayName("Record 724: ZIP is 99508")
	void ZIPOfRecord724() {
		assertEquals("99508", customers.get(723).getZIP());
	}

	@Test
	@DisplayName("Record 724: Phone is 907-272-0302")
	void PhoneOfRecord724() {
		assertEquals("907-272-0302", customers.get(723).getPhone());
	}

	@Test
	@DisplayName("Record 724: Fax is 907-272-8847")
	void FaxOfRecord724() {
		assertEquals("907-272-8847", customers.get(723).getFax());
	}

	@Test
	@DisplayName("Record 724: Email is bob@branen.com")
	void EmailOfRecord724() {
		assertEquals("bob@branen.com", customers.get(723).getEmail());
	}

	@Test
	@DisplayName("Record 724: Web is http://www.bobbranen.com")
	void WebOfRecord724() {
		assertEquals("http://www.bobbranen.com", customers.get(723).getWeb());
	}
}

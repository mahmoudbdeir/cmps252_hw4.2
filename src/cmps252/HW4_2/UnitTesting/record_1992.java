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

@Tag("11")
class Record_1992 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1992: FirstName is Nestor")
	void FirstNameOfRecord1992() {
		assertEquals("Nestor", customers.get(1991).getFirstName());
	}

	@Test
	@DisplayName("Record 1992: LastName is Minelli")
	void LastNameOfRecord1992() {
		assertEquals("Minelli", customers.get(1991).getLastName());
	}

	@Test
	@DisplayName("Record 1992: Company is Healthcare Inc")
	void CompanyOfRecord1992() {
		assertEquals("Healthcare Inc", customers.get(1991).getCompany());
	}

	@Test
	@DisplayName("Record 1992: Address is 1701 W Lafayette Blvd")
	void AddressOfRecord1992() {
		assertEquals("1701 W Lafayette Blvd", customers.get(1991).getAddress());
	}

	@Test
	@DisplayName("Record 1992: City is Detroit")
	void CityOfRecord1992() {
		assertEquals("Detroit", customers.get(1991).getCity());
	}

	@Test
	@DisplayName("Record 1992: County is Wayne")
	void CountyOfRecord1992() {
		assertEquals("Wayne", customers.get(1991).getCounty());
	}

	@Test
	@DisplayName("Record 1992: State is MI")
	void StateOfRecord1992() {
		assertEquals("MI", customers.get(1991).getState());
	}

	@Test
	@DisplayName("Record 1992: ZIP is 48216")
	void ZIPOfRecord1992() {
		assertEquals("48216", customers.get(1991).getZIP());
	}

	@Test
	@DisplayName("Record 1992: Phone is 313-962-4218")
	void PhoneOfRecord1992() {
		assertEquals("313-962-4218", customers.get(1991).getPhone());
	}

	@Test
	@DisplayName("Record 1992: Fax is 313-962-2658")
	void FaxOfRecord1992() {
		assertEquals("313-962-2658", customers.get(1991).getFax());
	}

	@Test
	@DisplayName("Record 1992: Email is nestor@minelli.com")
	void EmailOfRecord1992() {
		assertEquals("nestor@minelli.com", customers.get(1991).getEmail());
	}

	@Test
	@DisplayName("Record 1992: Web is http://www.nestorminelli.com")
	void WebOfRecord1992() {
		assertEquals("http://www.nestorminelli.com", customers.get(1991).getWeb());
	}
}

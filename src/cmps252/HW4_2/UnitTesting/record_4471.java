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

@Tag("29")
class Record_4471 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4471: FirstName is Francisca")
	void FirstNameOfRecord4471() {
		assertEquals("Francisca", customers.get(4470).getFirstName());
	}

	@Test
	@DisplayName("Record 4471: LastName is Maskaly")
	void LastNameOfRecord4471() {
		assertEquals("Maskaly", customers.get(4470).getLastName());
	}

	@Test
	@DisplayName("Record 4471: Company is Ryan Electronics Corp")
	void CompanyOfRecord4471() {
		assertEquals("Ryan Electronics Corp", customers.get(4470).getCompany());
	}

	@Test
	@DisplayName("Record 4471: Address is 720 Centinela Ave")
	void AddressOfRecord4471() {
		assertEquals("720 Centinela Ave", customers.get(4470).getAddress());
	}

	@Test
	@DisplayName("Record 4471: City is Inglewood")
	void CityOfRecord4471() {
		assertEquals("Inglewood", customers.get(4470).getCity());
	}

	@Test
	@DisplayName("Record 4471: County is Los Angeles")
	void CountyOfRecord4471() {
		assertEquals("Los Angeles", customers.get(4470).getCounty());
	}

	@Test
	@DisplayName("Record 4471: State is CA")
	void StateOfRecord4471() {
		assertEquals("CA", customers.get(4470).getState());
	}

	@Test
	@DisplayName("Record 4471: ZIP is 90302")
	void ZIPOfRecord4471() {
		assertEquals("90302", customers.get(4470).getZIP());
	}

	@Test
	@DisplayName("Record 4471: Phone is 310-671-2932")
	void PhoneOfRecord4471() {
		assertEquals("310-671-2932", customers.get(4470).getPhone());
	}

	@Test
	@DisplayName("Record 4471: Fax is 310-671-1301")
	void FaxOfRecord4471() {
		assertEquals("310-671-1301", customers.get(4470).getFax());
	}

	@Test
	@DisplayName("Record 4471: Email is francisca@maskaly.com")
	void EmailOfRecord4471() {
		assertEquals("francisca@maskaly.com", customers.get(4470).getEmail());
	}

	@Test
	@DisplayName("Record 4471: Web is http://www.franciscamaskaly.com")
	void WebOfRecord4471() {
		assertEquals("http://www.franciscamaskaly.com", customers.get(4470).getWeb());
	}
}

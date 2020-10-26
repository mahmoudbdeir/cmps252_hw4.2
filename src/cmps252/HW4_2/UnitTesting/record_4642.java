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

@Tag("34")
class Record_4642 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4642: FirstName is Wayne")
	void FirstNameOfRecord4642() {
		assertEquals("Wayne", customers.get(4641).getFirstName());
	}

	@Test
	@DisplayName("Record 4642: LastName is Kazakos")
	void LastNameOfRecord4642() {
		assertEquals("Kazakos", customers.get(4641).getLastName());
	}

	@Test
	@DisplayName("Record 4642: Company is Rosen Law Firm")
	void CompanyOfRecord4642() {
		assertEquals("Rosen Law Firm", customers.get(4641).getCompany());
	}

	@Test
	@DisplayName("Record 4642: Address is 708 Eraste Landry Rd")
	void AddressOfRecord4642() {
		assertEquals("708 Eraste Landry Rd", customers.get(4641).getAddress());
	}

	@Test
	@DisplayName("Record 4642: City is Lafayette")
	void CityOfRecord4642() {
		assertEquals("Lafayette", customers.get(4641).getCity());
	}

	@Test
	@DisplayName("Record 4642: County is Lafayette")
	void CountyOfRecord4642() {
		assertEquals("Lafayette", customers.get(4641).getCounty());
	}

	@Test
	@DisplayName("Record 4642: State is LA")
	void StateOfRecord4642() {
		assertEquals("LA", customers.get(4641).getState());
	}

	@Test
	@DisplayName("Record 4642: ZIP is 70506")
	void ZIPOfRecord4642() {
		assertEquals("70506", customers.get(4641).getZIP());
	}

	@Test
	@DisplayName("Record 4642: Phone is 337-233-0814")
	void PhoneOfRecord4642() {
		assertEquals("337-233-0814", customers.get(4641).getPhone());
	}

	@Test
	@DisplayName("Record 4642: Fax is 337-233-7248")
	void FaxOfRecord4642() {
		assertEquals("337-233-7248", customers.get(4641).getFax());
	}

	@Test
	@DisplayName("Record 4642: Email is wayne@kazakos.com")
	void EmailOfRecord4642() {
		assertEquals("wayne@kazakos.com", customers.get(4641).getEmail());
	}

	@Test
	@DisplayName("Record 4642: Web is http://www.waynekazakos.com")
	void WebOfRecord4642() {
		assertEquals("http://www.waynekazakos.com", customers.get(4641).getWeb());
	}
}

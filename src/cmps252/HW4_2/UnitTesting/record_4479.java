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

@Tag("18")
class Record_4479 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4479: FirstName is Tod")
	void FirstNameOfRecord4479() {
		assertEquals("Tod", customers.get(4478).getFirstName());
	}

	@Test
	@DisplayName("Record 4479: LastName is Monnet")
	void LastNameOfRecord4479() {
		assertEquals("Monnet", customers.get(4478).getLastName());
	}

	@Test
	@DisplayName("Record 4479: Company is Edwards Photographic Studios")
	void CompanyOfRecord4479() {
		assertEquals("Edwards Photographic Studios", customers.get(4478).getCompany());
	}

	@Test
	@DisplayName("Record 4479: Address is 2772 Leonis Blvd")
	void AddressOfRecord4479() {
		assertEquals("2772 Leonis Blvd", customers.get(4478).getAddress());
	}

	@Test
	@DisplayName("Record 4479: City is Los Angeles")
	void CityOfRecord4479() {
		assertEquals("Los Angeles", customers.get(4478).getCity());
	}

	@Test
	@DisplayName("Record 4479: County is Los Angeles")
	void CountyOfRecord4479() {
		assertEquals("Los Angeles", customers.get(4478).getCounty());
	}

	@Test
	@DisplayName("Record 4479: State is CA")
	void StateOfRecord4479() {
		assertEquals("CA", customers.get(4478).getState());
	}

	@Test
	@DisplayName("Record 4479: ZIP is 90058")
	void ZIPOfRecord4479() {
		assertEquals("90058", customers.get(4478).getZIP());
	}

	@Test
	@DisplayName("Record 4479: Phone is 323-947-2288")
	void PhoneOfRecord4479() {
		assertEquals("323-947-2288", customers.get(4478).getPhone());
	}

	@Test
	@DisplayName("Record 4479: Fax is 323-947-6799")
	void FaxOfRecord4479() {
		assertEquals("323-947-6799", customers.get(4478).getFax());
	}

	@Test
	@DisplayName("Record 4479: Email is tod@monnet.com")
	void EmailOfRecord4479() {
		assertEquals("tod@monnet.com", customers.get(4478).getEmail());
	}

	@Test
	@DisplayName("Record 4479: Web is http://www.todmonnet.com")
	void WebOfRecord4479() {
		assertEquals("http://www.todmonnet.com", customers.get(4478).getWeb());
	}
}

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

@Tag("47")
class Record_4094 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4094: FirstName is Tracey")
	void FirstNameOfRecord4094() {
		assertEquals("Tracey", customers.get(4093).getFirstName());
	}

	@Test
	@DisplayName("Record 4094: LastName is Barlip")
	void LastNameOfRecord4094() {
		assertEquals("Barlip", customers.get(4093).getLastName());
	}

	@Test
	@DisplayName("Record 4094: Company is Natl Assn For Hear & Speech")
	void CompanyOfRecord4094() {
		assertEquals("Natl Assn For Hear & Speech", customers.get(4093).getCompany());
	}

	@Test
	@DisplayName("Record 4094: Address is 2107 Adams St")
	void AddressOfRecord4094() {
		assertEquals("2107 Adams St", customers.get(4093).getAddress());
	}

	@Test
	@DisplayName("Record 4094: City is Indianapolis")
	void CityOfRecord4094() {
		assertEquals("Indianapolis", customers.get(4093).getCity());
	}

	@Test
	@DisplayName("Record 4094: County is Marion")
	void CountyOfRecord4094() {
		assertEquals("Marion", customers.get(4093).getCounty());
	}

	@Test
	@DisplayName("Record 4094: State is IN")
	void StateOfRecord4094() {
		assertEquals("IN", customers.get(4093).getState());
	}

	@Test
	@DisplayName("Record 4094: ZIP is 46218")
	void ZIPOfRecord4094() {
		assertEquals("46218", customers.get(4093).getZIP());
	}

	@Test
	@DisplayName("Record 4094: Phone is 317-545-1326")
	void PhoneOfRecord4094() {
		assertEquals("317-545-1326", customers.get(4093).getPhone());
	}

	@Test
	@DisplayName("Record 4094: Fax is 317-545-2545")
	void FaxOfRecord4094() {
		assertEquals("317-545-2545", customers.get(4093).getFax());
	}

	@Test
	@DisplayName("Record 4094: Email is tracey@barlip.com")
	void EmailOfRecord4094() {
		assertEquals("tracey@barlip.com", customers.get(4093).getEmail());
	}

	@Test
	@DisplayName("Record 4094: Web is http://www.traceybarlip.com")
	void WebOfRecord4094() {
		assertEquals("http://www.traceybarlip.com", customers.get(4093).getWeb());
	}
}

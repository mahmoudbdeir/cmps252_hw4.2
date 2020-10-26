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

@Tag("20")
class Record_505 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 505: FirstName is Kenton")
	void FirstNameOfRecord505() {
		assertEquals("Kenton", customers.get(504).getFirstName());
	}

	@Test
	@DisplayName("Record 505: LastName is Kral")
	void LastNameOfRecord505() {
		assertEquals("Kral", customers.get(504).getLastName());
	}

	@Test
	@DisplayName("Record 505: Company is Sowders, A Glenn Jr")
	void CompanyOfRecord505() {
		assertEquals("Sowders, A Glenn Jr", customers.get(504).getCompany());
	}

	@Test
	@DisplayName("Record 505: Address is 1611 Peach St")
	void AddressOfRecord505() {
		assertEquals("1611 Peach St", customers.get(504).getAddress());
	}

	@Test
	@DisplayName("Record 505: City is Erie")
	void CityOfRecord505() {
		assertEquals("Erie", customers.get(504).getCity());
	}

	@Test
	@DisplayName("Record 505: County is Erie")
	void CountyOfRecord505() {
		assertEquals("Erie", customers.get(504).getCounty());
	}

	@Test
	@DisplayName("Record 505: State is PA")
	void StateOfRecord505() {
		assertEquals("PA", customers.get(504).getState());
	}

	@Test
	@DisplayName("Record 505: ZIP is 16501")
	void ZIPOfRecord505() {
		assertEquals("16501", customers.get(504).getZIP());
	}

	@Test
	@DisplayName("Record 505: Phone is 814-456-9489")
	void PhoneOfRecord505() {
		assertEquals("814-456-9489", customers.get(504).getPhone());
	}

	@Test
	@DisplayName("Record 505: Fax is 814-456-2094")
	void FaxOfRecord505() {
		assertEquals("814-456-2094", customers.get(504).getFax());
	}

	@Test
	@DisplayName("Record 505: Email is kenton@kral.com")
	void EmailOfRecord505() {
		assertEquals("kenton@kral.com", customers.get(504).getEmail());
	}

	@Test
	@DisplayName("Record 505: Web is http://www.kentonkral.com")
	void WebOfRecord505() {
		assertEquals("http://www.kentonkral.com", customers.get(504).getWeb());
	}
}

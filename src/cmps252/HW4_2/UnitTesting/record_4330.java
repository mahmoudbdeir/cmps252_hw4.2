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

@Tag("13")
class Record_4330 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4330: FirstName is Miquel")
	void FirstNameOfRecord4330() {
		assertEquals("Miquel", customers.get(4329).getFirstName());
	}

	@Test
	@DisplayName("Record 4330: LastName is Libel")
	void LastNameOfRecord4330() {
		assertEquals("Libel", customers.get(4329).getLastName());
	}

	@Test
	@DisplayName("Record 4330: Company is Koivunen, Debra G Md")
	void CompanyOfRecord4330() {
		assertEquals("Koivunen, Debra G Md", customers.get(4329).getCompany());
	}

	@Test
	@DisplayName("Record 4330: Address is 171 12th St  #-300")
	void AddressOfRecord4330() {
		assertEquals("171 12th St  #-300", customers.get(4329).getAddress());
	}

	@Test
	@DisplayName("Record 4330: City is Oakland")
	void CityOfRecord4330() {
		assertEquals("Oakland", customers.get(4329).getCity());
	}

	@Test
	@DisplayName("Record 4330: County is Alameda")
	void CountyOfRecord4330() {
		assertEquals("Alameda", customers.get(4329).getCounty());
	}

	@Test
	@DisplayName("Record 4330: State is CA")
	void StateOfRecord4330() {
		assertEquals("CA", customers.get(4329).getState());
	}

	@Test
	@DisplayName("Record 4330: ZIP is 94607")
	void ZIPOfRecord4330() {
		assertEquals("94607", customers.get(4329).getZIP());
	}

	@Test
	@DisplayName("Record 4330: Phone is 510-835-2036")
	void PhoneOfRecord4330() {
		assertEquals("510-835-2036", customers.get(4329).getPhone());
	}

	@Test
	@DisplayName("Record 4330: Fax is 510-835-7036")
	void FaxOfRecord4330() {
		assertEquals("510-835-7036", customers.get(4329).getFax());
	}

	@Test
	@DisplayName("Record 4330: Email is miquel@libel.com")
	void EmailOfRecord4330() {
		assertEquals("miquel@libel.com", customers.get(4329).getEmail());
	}

	@Test
	@DisplayName("Record 4330: Web is http://www.miquellibel.com")
	void WebOfRecord4330() {
		assertEquals("http://www.miquellibel.com", customers.get(4329).getWeb());
	}
}

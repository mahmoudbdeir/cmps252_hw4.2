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

@Tag("24")
class Record_4247 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4247: FirstName is Edison")
	void FirstNameOfRecord4247() {
		assertEquals("Edison", customers.get(4246).getFirstName());
	}

	@Test
	@DisplayName("Record 4247: LastName is Drossos")
	void LastNameOfRecord4247() {
		assertEquals("Drossos", customers.get(4246).getLastName());
	}

	@Test
	@DisplayName("Record 4247: Company is Brauns Ornamental Iron Works")
	void CompanyOfRecord4247() {
		assertEquals("Brauns Ornamental Iron Works", customers.get(4246).getCompany());
	}

	@Test
	@DisplayName("Record 4247: Address is 2340 W Wabansia Ave")
	void AddressOfRecord4247() {
		assertEquals("2340 W Wabansia Ave", customers.get(4246).getAddress());
	}

	@Test
	@DisplayName("Record 4247: City is Chicago")
	void CityOfRecord4247() {
		assertEquals("Chicago", customers.get(4246).getCity());
	}

	@Test
	@DisplayName("Record 4247: County is Cook")
	void CountyOfRecord4247() {
		assertEquals("Cook", customers.get(4246).getCounty());
	}

	@Test
	@DisplayName("Record 4247: State is IL")
	void StateOfRecord4247() {
		assertEquals("IL", customers.get(4246).getState());
	}

	@Test
	@DisplayName("Record 4247: ZIP is 60647")
	void ZIPOfRecord4247() {
		assertEquals("60647", customers.get(4246).getZIP());
	}

	@Test
	@DisplayName("Record 4247: Phone is 773-276-7802")
	void PhoneOfRecord4247() {
		assertEquals("773-276-7802", customers.get(4246).getPhone());
	}

	@Test
	@DisplayName("Record 4247: Fax is 773-276-5034")
	void FaxOfRecord4247() {
		assertEquals("773-276-5034", customers.get(4246).getFax());
	}

	@Test
	@DisplayName("Record 4247: Email is edison@drossos.com")
	void EmailOfRecord4247() {
		assertEquals("edison@drossos.com", customers.get(4246).getEmail());
	}

	@Test
	@DisplayName("Record 4247: Web is http://www.edisondrossos.com")
	void WebOfRecord4247() {
		assertEquals("http://www.edisondrossos.com", customers.get(4246).getWeb());
	}
}

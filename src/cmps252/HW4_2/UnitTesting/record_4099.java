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

@Tag("30")
class Record_4099 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4099: FirstName is Simone")
	void FirstNameOfRecord4099() {
		assertEquals("Simone", customers.get(4098).getFirstName());
	}

	@Test
	@DisplayName("Record 4099: LastName is Janeczko")
	void LastNameOfRecord4099() {
		assertEquals("Janeczko", customers.get(4098).getLastName());
	}

	@Test
	@DisplayName("Record 4099: Company is Quincy Soybean Company Of Ar")
	void CompanyOfRecord4099() {
		assertEquals("Quincy Soybean Company Of Ar", customers.get(4098).getCompany());
	}

	@Test
	@DisplayName("Record 4099: Address is 555 Sherman Ave")
	void AddressOfRecord4099() {
		assertEquals("555 Sherman Ave", customers.get(4098).getAddress());
	}

	@Test
	@DisplayName("Record 4099: City is Hamden")
	void CityOfRecord4099() {
		assertEquals("Hamden", customers.get(4098).getCity());
	}

	@Test
	@DisplayName("Record 4099: County is New Haven")
	void CountyOfRecord4099() {
		assertEquals("New Haven", customers.get(4098).getCounty());
	}

	@Test
	@DisplayName("Record 4099: State is CT")
	void StateOfRecord4099() {
		assertEquals("CT", customers.get(4098).getState());
	}

	@Test
	@DisplayName("Record 4099: ZIP is 6514")
	void ZIPOfRecord4099() {
		assertEquals("6514", customers.get(4098).getZIP());
	}

	@Test
	@DisplayName("Record 4099: Phone is 203-287-7781")
	void PhoneOfRecord4099() {
		assertEquals("203-287-7781", customers.get(4098).getPhone());
	}

	@Test
	@DisplayName("Record 4099: Fax is 203-287-9417")
	void FaxOfRecord4099() {
		assertEquals("203-287-9417", customers.get(4098).getFax());
	}

	@Test
	@DisplayName("Record 4099: Email is simone@janeczko.com")
	void EmailOfRecord4099() {
		assertEquals("simone@janeczko.com", customers.get(4098).getEmail());
	}

	@Test
	@DisplayName("Record 4099: Web is http://www.simonejaneczko.com")
	void WebOfRecord4099() {
		assertEquals("http://www.simonejaneczko.com", customers.get(4098).getWeb());
	}
}

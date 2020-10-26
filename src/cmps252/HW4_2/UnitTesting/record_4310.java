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

@Tag("44")
class Record_4310 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4310: FirstName is Krystal")
	void FirstNameOfRecord4310() {
		assertEquals("Krystal", customers.get(4309).getFirstName());
	}

	@Test
	@DisplayName("Record 4310: LastName is Turek")
	void LastNameOfRecord4310() {
		assertEquals("Turek", customers.get(4309).getLastName());
	}

	@Test
	@DisplayName("Record 4310: Company is Norwest Mortgage Inc")
	void CompanyOfRecord4310() {
		assertEquals("Norwest Mortgage Inc", customers.get(4309).getCompany());
	}

	@Test
	@DisplayName("Record 4310: Address is 2201 Ridgewood Rd  #-400")
	void AddressOfRecord4310() {
		assertEquals("2201 Ridgewood Rd  #-400", customers.get(4309).getAddress());
	}

	@Test
	@DisplayName("Record 4310: City is Reading")
	void CityOfRecord4310() {
		assertEquals("Reading", customers.get(4309).getCity());
	}

	@Test
	@DisplayName("Record 4310: County is Berks")
	void CountyOfRecord4310() {
		assertEquals("Berks", customers.get(4309).getCounty());
	}

	@Test
	@DisplayName("Record 4310: State is PA")
	void StateOfRecord4310() {
		assertEquals("PA", customers.get(4309).getState());
	}

	@Test
	@DisplayName("Record 4310: ZIP is 19610")
	void ZIPOfRecord4310() {
		assertEquals("19610", customers.get(4309).getZIP());
	}

	@Test
	@DisplayName("Record 4310: Phone is 610-372-9124")
	void PhoneOfRecord4310() {
		assertEquals("610-372-9124", customers.get(4309).getPhone());
	}

	@Test
	@DisplayName("Record 4310: Fax is 610-372-7532")
	void FaxOfRecord4310() {
		assertEquals("610-372-7532", customers.get(4309).getFax());
	}

	@Test
	@DisplayName("Record 4310: Email is krystal@turek.com")
	void EmailOfRecord4310() {
		assertEquals("krystal@turek.com", customers.get(4309).getEmail());
	}

	@Test
	@DisplayName("Record 4310: Web is http://www.krystalturek.com")
	void WebOfRecord4310() {
		assertEquals("http://www.krystalturek.com", customers.get(4309).getWeb());
	}
}

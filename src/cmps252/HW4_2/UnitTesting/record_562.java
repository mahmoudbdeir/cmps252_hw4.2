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

@Tag("40")
class Record_562 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 562: FirstName is Darius")
	void FirstNameOfRecord562() {
		assertEquals("Darius", customers.get(561).getFirstName());
	}

	@Test
	@DisplayName("Record 562: LastName is Campman")
	void LastNameOfRecord562() {
		assertEquals("Campman", customers.get(561).getLastName());
	}

	@Test
	@DisplayName("Record 562: Company is Lundy Flitter & Beldecos")
	void CompanyOfRecord562() {
		assertEquals("Lundy Flitter & Beldecos", customers.get(561).getCompany());
	}

	@Test
	@DisplayName("Record 562: Address is 1608 Ryd St")
	void AddressOfRecord562() {
		assertEquals("1608 Ryd St", customers.get(561).getAddress());
	}

	@Test
	@DisplayName("Record 562: City is Palatka")
	void CityOfRecord562() {
		assertEquals("Palatka", customers.get(561).getCity());
	}

	@Test
	@DisplayName("Record 562: County is Putnam")
	void CountyOfRecord562() {
		assertEquals("Putnam", customers.get(561).getCounty());
	}

	@Test
	@DisplayName("Record 562: State is FL")
	void StateOfRecord562() {
		assertEquals("FL", customers.get(561).getState());
	}

	@Test
	@DisplayName("Record 562: ZIP is 32177")
	void ZIPOfRecord562() {
		assertEquals("32177", customers.get(561).getZIP());
	}

	@Test
	@DisplayName("Record 562: Phone is 386-325-4248")
	void PhoneOfRecord562() {
		assertEquals("386-325-4248", customers.get(561).getPhone());
	}

	@Test
	@DisplayName("Record 562: Fax is 386-325-7664")
	void FaxOfRecord562() {
		assertEquals("386-325-7664", customers.get(561).getFax());
	}

	@Test
	@DisplayName("Record 562: Email is darius@campman.com")
	void EmailOfRecord562() {
		assertEquals("darius@campman.com", customers.get(561).getEmail());
	}

	@Test
	@DisplayName("Record 562: Web is http://www.dariuscampman.com")
	void WebOfRecord562() {
		assertEquals("http://www.dariuscampman.com", customers.get(561).getWeb());
	}
}

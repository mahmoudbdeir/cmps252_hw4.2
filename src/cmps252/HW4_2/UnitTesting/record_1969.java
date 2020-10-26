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

@Tag("12")
class Record_1969 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1969: FirstName is Frits")
	void FirstNameOfRecord1969() {
		assertEquals("Frits", customers.get(1968).getFirstName());
	}

	@Test
	@DisplayName("Record 1969: LastName is Swensen")
	void LastNameOfRecord1969() {
		assertEquals("Swensen", customers.get(1968).getLastName());
	}

	@Test
	@DisplayName("Record 1969: Company is G & G Engineering & Mfg")
	void CompanyOfRecord1969() {
		assertEquals("G & G Engineering & Mfg", customers.get(1968).getCompany());
	}

	@Test
	@DisplayName("Record 1969: Address is 8135 Bracken Crk")
	void AddressOfRecord1969() {
		assertEquals("8135 Bracken Crk", customers.get(1968).getAddress());
	}

	@Test
	@DisplayName("Record 1969: City is San Antonio")
	void CityOfRecord1969() {
		assertEquals("San Antonio", customers.get(1968).getCity());
	}

	@Test
	@DisplayName("Record 1969: County is Comal")
	void CountyOfRecord1969() {
		assertEquals("Comal", customers.get(1968).getCounty());
	}

	@Test
	@DisplayName("Record 1969: State is TX")
	void StateOfRecord1969() {
		assertEquals("TX", customers.get(1968).getState());
	}

	@Test
	@DisplayName("Record 1969: ZIP is 78266")
	void ZIPOfRecord1969() {
		assertEquals("78266", customers.get(1968).getZIP());
	}

	@Test
	@DisplayName("Record 1969: Phone is 830-651-3839")
	void PhoneOfRecord1969() {
		assertEquals("830-651-3839", customers.get(1968).getPhone());
	}

	@Test
	@DisplayName("Record 1969: Fax is 830-651-5584")
	void FaxOfRecord1969() {
		assertEquals("830-651-5584", customers.get(1968).getFax());
	}

	@Test
	@DisplayName("Record 1969: Email is frits@swensen.com")
	void EmailOfRecord1969() {
		assertEquals("frits@swensen.com", customers.get(1968).getEmail());
	}

	@Test
	@DisplayName("Record 1969: Web is http://www.fritsswensen.com")
	void WebOfRecord1969() {
		assertEquals("http://www.fritsswensen.com", customers.get(1968).getWeb());
	}
}

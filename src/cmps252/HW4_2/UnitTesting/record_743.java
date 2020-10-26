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

@Tag("14")
class Record_743 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 743: FirstName is Colton")
	void FirstNameOfRecord743() {
		assertEquals("Colton", customers.get(742).getFirstName());
	}

	@Test
	@DisplayName("Record 743: LastName is Crofton")
	void LastNameOfRecord743() {
		assertEquals("Crofton", customers.get(742).getLastName());
	}

	@Test
	@DisplayName("Record 743: Company is Ring Specialty Co")
	void CompanyOfRecord743() {
		assertEquals("Ring Specialty Co", customers.get(742).getCompany());
	}

	@Test
	@DisplayName("Record 743: Address is 906 N 25th St")
	void AddressOfRecord743() {
		assertEquals("906 N 25th St", customers.get(742).getAddress());
	}

	@Test
	@DisplayName("Record 743: City is Waco")
	void CityOfRecord743() {
		assertEquals("Waco", customers.get(742).getCity());
	}

	@Test
	@DisplayName("Record 743: County is McLennan")
	void CountyOfRecord743() {
		assertEquals("McLennan", customers.get(742).getCounty());
	}

	@Test
	@DisplayName("Record 743: State is TX")
	void StateOfRecord743() {
		assertEquals("TX", customers.get(742).getState());
	}

	@Test
	@DisplayName("Record 743: ZIP is 76707")
	void ZIPOfRecord743() {
		assertEquals("76707", customers.get(742).getZIP());
	}

	@Test
	@DisplayName("Record 743: Phone is 254-756-5321")
	void PhoneOfRecord743() {
		assertEquals("254-756-5321", customers.get(742).getPhone());
	}

	@Test
	@DisplayName("Record 743: Fax is 254-756-9262")
	void FaxOfRecord743() {
		assertEquals("254-756-9262", customers.get(742).getFax());
	}

	@Test
	@DisplayName("Record 743: Email is colton@crofton.com")
	void EmailOfRecord743() {
		assertEquals("colton@crofton.com", customers.get(742).getEmail());
	}

	@Test
	@DisplayName("Record 743: Web is http://www.coltoncrofton.com")
	void WebOfRecord743() {
		assertEquals("http://www.coltoncrofton.com", customers.get(742).getWeb());
	}
}

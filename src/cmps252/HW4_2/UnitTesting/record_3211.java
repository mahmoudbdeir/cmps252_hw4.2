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
class Record_3211 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3211: FirstName is Celestine")
	void FirstNameOfRecord3211() {
		assertEquals("Celestine", customers.get(3210).getFirstName());
	}

	@Test
	@DisplayName("Record 3211: LastName is Standifur")
	void LastNameOfRecord3211() {
		assertEquals("Standifur", customers.get(3210).getLastName());
	}

	@Test
	@DisplayName("Record 3211: Company is Care Technologies Inc")
	void CompanyOfRecord3211() {
		assertEquals("Care Technologies Inc", customers.get(3210).getCompany());
	}

	@Test
	@DisplayName("Record 3211: Address is 98 San Jacinto Blvd")
	void AddressOfRecord3211() {
		assertEquals("98 San Jacinto Blvd", customers.get(3210).getAddress());
	}

	@Test
	@DisplayName("Record 3211: City is Austin")
	void CityOfRecord3211() {
		assertEquals("Austin", customers.get(3210).getCity());
	}

	@Test
	@DisplayName("Record 3211: County is Travis")
	void CountyOfRecord3211() {
		assertEquals("Travis", customers.get(3210).getCounty());
	}

	@Test
	@DisplayName("Record 3211: State is TX")
	void StateOfRecord3211() {
		assertEquals("TX", customers.get(3210).getState());
	}

	@Test
	@DisplayName("Record 3211: ZIP is 78701")
	void ZIPOfRecord3211() {
		assertEquals("78701", customers.get(3210).getZIP());
	}

	@Test
	@DisplayName("Record 3211: Phone is 512-320-6738")
	void PhoneOfRecord3211() {
		assertEquals("512-320-6738", customers.get(3210).getPhone());
	}

	@Test
	@DisplayName("Record 3211: Fax is 512-320-8666")
	void FaxOfRecord3211() {
		assertEquals("512-320-8666", customers.get(3210).getFax());
	}

	@Test
	@DisplayName("Record 3211: Email is celestine@standifur.com")
	void EmailOfRecord3211() {
		assertEquals("celestine@standifur.com", customers.get(3210).getEmail());
	}

	@Test
	@DisplayName("Record 3211: Web is http://www.celestinestandifur.com")
	void WebOfRecord3211() {
		assertEquals("http://www.celestinestandifur.com", customers.get(3210).getWeb());
	}
}

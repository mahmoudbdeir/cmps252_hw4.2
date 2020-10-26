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
class Record_494 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 494: FirstName is Bret")
	void FirstNameOfRecord494() {
		assertEquals("Bret", customers.get(493).getFirstName());
	}

	@Test
	@DisplayName("Record 494: LastName is Kijak")
	void LastNameOfRecord494() {
		assertEquals("Kijak", customers.get(493).getLastName());
	}

	@Test
	@DisplayName("Record 494: Company is Boehm Surgical Instrument Corp")
	void CompanyOfRecord494() {
		assertEquals("Boehm Surgical Instrument Corp", customers.get(493).getCompany());
	}

	@Test
	@DisplayName("Record 494: Address is 1186 Ocean Shore Blvd")
	void AddressOfRecord494() {
		assertEquals("1186 Ocean Shore Blvd", customers.get(493).getAddress());
	}

	@Test
	@DisplayName("Record 494: City is Ormond Beach")
	void CityOfRecord494() {
		assertEquals("Ormond Beach", customers.get(493).getCity());
	}

	@Test
	@DisplayName("Record 494: County is Volusia")
	void CountyOfRecord494() {
		assertEquals("Volusia", customers.get(493).getCounty());
	}

	@Test
	@DisplayName("Record 494: State is FL")
	void StateOfRecord494() {
		assertEquals("FL", customers.get(493).getState());
	}

	@Test
	@DisplayName("Record 494: ZIP is 32176")
	void ZIPOfRecord494() {
		assertEquals("32176", customers.get(493).getZIP());
	}

	@Test
	@DisplayName("Record 494: Phone is 386-441-5507")
	void PhoneOfRecord494() {
		assertEquals("386-441-5507", customers.get(493).getPhone());
	}

	@Test
	@DisplayName("Record 494: Fax is 386-441-0038")
	void FaxOfRecord494() {
		assertEquals("386-441-0038", customers.get(493).getFax());
	}

	@Test
	@DisplayName("Record 494: Email is bret@kijak.com")
	void EmailOfRecord494() {
		assertEquals("bret@kijak.com", customers.get(493).getEmail());
	}

	@Test
	@DisplayName("Record 494: Web is http://www.bretkijak.com")
	void WebOfRecord494() {
		assertEquals("http://www.bretkijak.com", customers.get(493).getWeb());
	}
}

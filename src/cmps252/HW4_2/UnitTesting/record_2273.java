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
class Record_2273 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2273: FirstName is Roger")
	void FirstNameOfRecord2273() {
		assertEquals("Roger", customers.get(2272).getFirstName());
	}

	@Test
	@DisplayName("Record 2273: LastName is Trahan")
	void LastNameOfRecord2273() {
		assertEquals("Trahan", customers.get(2272).getLastName());
	}

	@Test
	@DisplayName("Record 2273: Company is South Indiana Lumber Co")
	void CompanyOfRecord2273() {
		assertEquals("South Indiana Lumber Co", customers.get(2272).getCompany());
	}

	@Test
	@DisplayName("Record 2273: Address is 9440 Viscount Blvd  #-242")
	void AddressOfRecord2273() {
		assertEquals("9440 Viscount Blvd  #-242", customers.get(2272).getAddress());
	}

	@Test
	@DisplayName("Record 2273: City is El Paso")
	void CityOfRecord2273() {
		assertEquals("El Paso", customers.get(2272).getCity());
	}

	@Test
	@DisplayName("Record 2273: County is El Paso")
	void CountyOfRecord2273() {
		assertEquals("El Paso", customers.get(2272).getCounty());
	}

	@Test
	@DisplayName("Record 2273: State is TX")
	void StateOfRecord2273() {
		assertEquals("TX", customers.get(2272).getState());
	}

	@Test
	@DisplayName("Record 2273: ZIP is 79925")
	void ZIPOfRecord2273() {
		assertEquals("79925", customers.get(2272).getZIP());
	}

	@Test
	@DisplayName("Record 2273: Phone is 915-593-1851")
	void PhoneOfRecord2273() {
		assertEquals("915-593-1851", customers.get(2272).getPhone());
	}

	@Test
	@DisplayName("Record 2273: Fax is 915-593-8644")
	void FaxOfRecord2273() {
		assertEquals("915-593-8644", customers.get(2272).getFax());
	}

	@Test
	@DisplayName("Record 2273: Email is roger@trahan.com")
	void EmailOfRecord2273() {
		assertEquals("roger@trahan.com", customers.get(2272).getEmail());
	}

	@Test
	@DisplayName("Record 2273: Web is http://www.rogertrahan.com")
	void WebOfRecord2273() {
		assertEquals("http://www.rogertrahan.com", customers.get(2272).getWeb());
	}
}

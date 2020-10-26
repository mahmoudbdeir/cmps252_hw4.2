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
class Record_3970 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3970: FirstName is Cristina")
	void FirstNameOfRecord3970() {
		assertEquals("Cristina", customers.get(3969).getFirstName());
	}

	@Test
	@DisplayName("Record 3970: LastName is Nazari")
	void LastNameOfRecord3970() {
		assertEquals("Nazari", customers.get(3969).getLastName());
	}

	@Test
	@DisplayName("Record 3970: Company is Prudential Overall Supply")
	void CompanyOfRecord3970() {
		assertEquals("Prudential Overall Supply", customers.get(3969).getCompany());
	}

	@Test
	@DisplayName("Record 3970: Address is 800 N Shoreline Blvd")
	void AddressOfRecord3970() {
		assertEquals("800 N Shoreline Blvd", customers.get(3969).getAddress());
	}

	@Test
	@DisplayName("Record 3970: City is Corpus Christi")
	void CityOfRecord3970() {
		assertEquals("Corpus Christi", customers.get(3969).getCity());
	}

	@Test
	@DisplayName("Record 3970: County is Nueces")
	void CountyOfRecord3970() {
		assertEquals("Nueces", customers.get(3969).getCounty());
	}

	@Test
	@DisplayName("Record 3970: State is TX")
	void StateOfRecord3970() {
		assertEquals("TX", customers.get(3969).getState());
	}

	@Test
	@DisplayName("Record 3970: ZIP is 78401")
	void ZIPOfRecord3970() {
		assertEquals("78401", customers.get(3969).getZIP());
	}

	@Test
	@DisplayName("Record 3970: Phone is 361-880-6883")
	void PhoneOfRecord3970() {
		assertEquals("361-880-6883", customers.get(3969).getPhone());
	}

	@Test
	@DisplayName("Record 3970: Fax is 361-880-4297")
	void FaxOfRecord3970() {
		assertEquals("361-880-4297", customers.get(3969).getFax());
	}

	@Test
	@DisplayName("Record 3970: Email is cristina@nazari.com")
	void EmailOfRecord3970() {
		assertEquals("cristina@nazari.com", customers.get(3969).getEmail());
	}

	@Test
	@DisplayName("Record 3970: Web is http://www.cristinanazari.com")
	void WebOfRecord3970() {
		assertEquals("http://www.cristinanazari.com", customers.get(3969).getWeb());
	}
}

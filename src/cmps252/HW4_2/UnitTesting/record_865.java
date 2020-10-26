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

@Tag("7")
class Record_865 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 865: FirstName is Abram")
	void FirstNameOfRecord865() {
		assertEquals("Abram", customers.get(864).getFirstName());
	}

	@Test
	@DisplayName("Record 865: LastName is Schoemaker")
	void LastNameOfRecord865() {
		assertEquals("Schoemaker", customers.get(864).getLastName());
	}

	@Test
	@DisplayName("Record 865: Company is Arkay Products Mfg Co Inc")
	void CompanyOfRecord865() {
		assertEquals("Arkay Products Mfg Co Inc", customers.get(864).getCompany());
	}

	@Test
	@DisplayName("Record 865: Address is 500 Alakawa St  #-100")
	void AddressOfRecord865() {
		assertEquals("500 Alakawa St  #-100", customers.get(864).getAddress());
	}

	@Test
	@DisplayName("Record 865: City is Honolulu")
	void CityOfRecord865() {
		assertEquals("Honolulu", customers.get(864).getCity());
	}

	@Test
	@DisplayName("Record 865: County is Honolulu")
	void CountyOfRecord865() {
		assertEquals("Honolulu", customers.get(864).getCounty());
	}

	@Test
	@DisplayName("Record 865: State is HI")
	void StateOfRecord865() {
		assertEquals("HI", customers.get(864).getState());
	}

	@Test
	@DisplayName("Record 865: ZIP is 96817")
	void ZIPOfRecord865() {
		assertEquals("96817", customers.get(864).getZIP());
	}

	@Test
	@DisplayName("Record 865: Phone is 808-842-1883")
	void PhoneOfRecord865() {
		assertEquals("808-842-1883", customers.get(864).getPhone());
	}

	@Test
	@DisplayName("Record 865: Fax is 808-842-0706")
	void FaxOfRecord865() {
		assertEquals("808-842-0706", customers.get(864).getFax());
	}

	@Test
	@DisplayName("Record 865: Email is abram@schoemaker.com")
	void EmailOfRecord865() {
		assertEquals("abram@schoemaker.com", customers.get(864).getEmail());
	}

	@Test
	@DisplayName("Record 865: Web is http://www.abramschoemaker.com")
	void WebOfRecord865() {
		assertEquals("http://www.abramschoemaker.com", customers.get(864).getWeb());
	}
}

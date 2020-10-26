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

@Tag("10")
class Record_4810 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4810: FirstName is Matilda")
	void FirstNameOfRecord4810() {
		assertEquals("Matilda", customers.get(4809).getFirstName());
	}

	@Test
	@DisplayName("Record 4810: LastName is Angon")
	void LastNameOfRecord4810() {
		assertEquals("Angon", customers.get(4809).getLastName());
	}

	@Test
	@DisplayName("Record 4810: Company is Utah Motor Transportation Assn")
	void CompanyOfRecord4810() {
		assertEquals("Utah Motor Transportation Assn", customers.get(4809).getCompany());
	}

	@Test
	@DisplayName("Record 4810: Address is 2752 Mount Carmel Ave")
	void AddressOfRecord4810() {
		assertEquals("2752 Mount Carmel Ave", customers.get(4809).getAddress());
	}

	@Test
	@DisplayName("Record 4810: City is Glenside")
	void CityOfRecord4810() {
		assertEquals("Glenside", customers.get(4809).getCity());
	}

	@Test
	@DisplayName("Record 4810: County is Montgomery")
	void CountyOfRecord4810() {
		assertEquals("Montgomery", customers.get(4809).getCounty());
	}

	@Test
	@DisplayName("Record 4810: State is PA")
	void StateOfRecord4810() {
		assertEquals("PA", customers.get(4809).getState());
	}

	@Test
	@DisplayName("Record 4810: ZIP is 19038")
	void ZIPOfRecord4810() {
		assertEquals("19038", customers.get(4809).getZIP());
	}

	@Test
	@DisplayName("Record 4810: Phone is 215-572-4599")
	void PhoneOfRecord4810() {
		assertEquals("215-572-4599", customers.get(4809).getPhone());
	}

	@Test
	@DisplayName("Record 4810: Fax is 215-572-2311")
	void FaxOfRecord4810() {
		assertEquals("215-572-2311", customers.get(4809).getFax());
	}

	@Test
	@DisplayName("Record 4810: Email is matilda@angon.com")
	void EmailOfRecord4810() {
		assertEquals("matilda@angon.com", customers.get(4809).getEmail());
	}

	@Test
	@DisplayName("Record 4810: Web is http://www.matildaangon.com")
	void WebOfRecord4810() {
		assertEquals("http://www.matildaangon.com", customers.get(4809).getWeb());
	}
}

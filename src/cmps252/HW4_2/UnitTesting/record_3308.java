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

@Tag("19")
class Record_3308 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3308: FirstName is Arden")
	void FirstNameOfRecord3308() {
		assertEquals("Arden", customers.get(3307).getFirstName());
	}

	@Test
	@DisplayName("Record 3308: LastName is Danas")
	void LastNameOfRecord3308() {
		assertEquals("Danas", customers.get(3307).getLastName());
	}

	@Test
	@DisplayName("Record 3308: Company is Larry E Landers Dds Pc")
	void CompanyOfRecord3308() {
		assertEquals("Larry E Landers Dds Pc", customers.get(3307).getCompany());
	}

	@Test
	@DisplayName("Record 3308: Address is 900 Veterans Blvd  #-400")
	void AddressOfRecord3308() {
		assertEquals("900 Veterans Blvd  #-400", customers.get(3307).getAddress());
	}

	@Test
	@DisplayName("Record 3308: City is Redwood City")
	void CityOfRecord3308() {
		assertEquals("Redwood City", customers.get(3307).getCity());
	}

	@Test
	@DisplayName("Record 3308: County is San Mateo")
	void CountyOfRecord3308() {
		assertEquals("San Mateo", customers.get(3307).getCounty());
	}

	@Test
	@DisplayName("Record 3308: State is CA")
	void StateOfRecord3308() {
		assertEquals("CA", customers.get(3307).getState());
	}

	@Test
	@DisplayName("Record 3308: ZIP is 94063")
	void ZIPOfRecord3308() {
		assertEquals("94063", customers.get(3307).getZIP());
	}

	@Test
	@DisplayName("Record 3308: Phone is 650-367-0316")
	void PhoneOfRecord3308() {
		assertEquals("650-367-0316", customers.get(3307).getPhone());
	}

	@Test
	@DisplayName("Record 3308: Fax is 650-367-0675")
	void FaxOfRecord3308() {
		assertEquals("650-367-0675", customers.get(3307).getFax());
	}

	@Test
	@DisplayName("Record 3308: Email is arden@danas.com")
	void EmailOfRecord3308() {
		assertEquals("arden@danas.com", customers.get(3307).getEmail());
	}

	@Test
	@DisplayName("Record 3308: Web is http://www.ardendanas.com")
	void WebOfRecord3308() {
		assertEquals("http://www.ardendanas.com", customers.get(3307).getWeb());
	}
}

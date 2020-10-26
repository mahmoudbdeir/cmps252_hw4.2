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

@Tag("43")
class Record_311 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 311: FirstName is Belinda")
	void FirstNameOfRecord311() {
		assertEquals("Belinda", customers.get(310).getFirstName());
	}

	@Test
	@DisplayName("Record 311: LastName is Dorsey")
	void LastNameOfRecord311() {
		assertEquals("Dorsey", customers.get(310).getLastName());
	}

	@Test
	@DisplayName("Record 311: Company is Postal Annex")
	void CompanyOfRecord311() {
		assertEquals("Postal Annex", customers.get(310).getCompany());
	}

	@Test
	@DisplayName("Record 311: Address is 244 Shoemaker Rd")
	void AddressOfRecord311() {
		assertEquals("244 Shoemaker Rd", customers.get(310).getAddress());
	}

	@Test
	@DisplayName("Record 311: City is Pottstown")
	void CityOfRecord311() {
		assertEquals("Pottstown", customers.get(310).getCity());
	}

	@Test
	@DisplayName("Record 311: County is Montgomery")
	void CountyOfRecord311() {
		assertEquals("Montgomery", customers.get(310).getCounty());
	}

	@Test
	@DisplayName("Record 311: State is PA")
	void StateOfRecord311() {
		assertEquals("PA", customers.get(310).getState());
	}

	@Test
	@DisplayName("Record 311: ZIP is 19464")
	void ZIPOfRecord311() {
		assertEquals("19464", customers.get(310).getZIP());
	}

	@Test
	@DisplayName("Record 311: Phone is 610-970-1255")
	void PhoneOfRecord311() {
		assertEquals("610-970-1255", customers.get(310).getPhone());
	}

	@Test
	@DisplayName("Record 311: Fax is 610-970-0928")
	void FaxOfRecord311() {
		assertEquals("610-970-0928", customers.get(310).getFax());
	}

	@Test
	@DisplayName("Record 311: Email is belinda@dorsey.com")
	void EmailOfRecord311() {
		assertEquals("belinda@dorsey.com", customers.get(310).getEmail());
	}

	@Test
	@DisplayName("Record 311: Web is http://www.belindadorsey.com")
	void WebOfRecord311() {
		assertEquals("http://www.belindadorsey.com", customers.get(310).getWeb());
	}
}

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

@Tag("23")
class Record_4113 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4113: FirstName is Lorenzo")
	void FirstNameOfRecord4113() {
		assertEquals("Lorenzo", customers.get(4112).getFirstName());
	}

	@Test
	@DisplayName("Record 4113: LastName is Mcnees")
	void LastNameOfRecord4113() {
		assertEquals("Mcnees", customers.get(4112).getLastName());
	}

	@Test
	@DisplayName("Record 4113: Company is Racklyn Cptol Wlpaper Pnt")
	void CompanyOfRecord4113() {
		assertEquals("Racklyn Cptol Wlpaper Pnt", customers.get(4112).getCompany());
	}

	@Test
	@DisplayName("Record 4113: Address is 282 Lincoln Blvd")
	void AddressOfRecord4113() {
		assertEquals("282 Lincoln Blvd", customers.get(4112).getAddress());
	}

	@Test
	@DisplayName("Record 4113: City is Middlesex")
	void CityOfRecord4113() {
		assertEquals("Middlesex", customers.get(4112).getCity());
	}

	@Test
	@DisplayName("Record 4113: County is Middlesex")
	void CountyOfRecord4113() {
		assertEquals("Middlesex", customers.get(4112).getCounty());
	}

	@Test
	@DisplayName("Record 4113: State is NJ")
	void StateOfRecord4113() {
		assertEquals("NJ", customers.get(4112).getState());
	}

	@Test
	@DisplayName("Record 4113: ZIP is 8846")
	void ZIPOfRecord4113() {
		assertEquals("8846", customers.get(4112).getZIP());
	}

	@Test
	@DisplayName("Record 4113: Phone is 732-805-2695")
	void PhoneOfRecord4113() {
		assertEquals("732-805-2695", customers.get(4112).getPhone());
	}

	@Test
	@DisplayName("Record 4113: Fax is 732-805-6111")
	void FaxOfRecord4113() {
		assertEquals("732-805-6111", customers.get(4112).getFax());
	}

	@Test
	@DisplayName("Record 4113: Email is lorenzo@mcnees.com")
	void EmailOfRecord4113() {
		assertEquals("lorenzo@mcnees.com", customers.get(4112).getEmail());
	}

	@Test
	@DisplayName("Record 4113: Web is http://www.lorenzomcnees.com")
	void WebOfRecord4113() {
		assertEquals("http://www.lorenzomcnees.com", customers.get(4112).getWeb());
	}
}

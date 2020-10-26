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
class Record_2687 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2687: FirstName is Geraldine")
	void FirstNameOfRecord2687() {
		assertEquals("Geraldine", customers.get(2686).getFirstName());
	}

	@Test
	@DisplayName("Record 2687: LastName is Capan")
	void LastNameOfRecord2687() {
		assertEquals("Capan", customers.get(2686).getLastName());
	}

	@Test
	@DisplayName("Record 2687: Company is Aston Travel Agency")
	void CompanyOfRecord2687() {
		assertEquals("Aston Travel Agency", customers.get(2686).getCompany());
	}

	@Test
	@DisplayName("Record 2687: Address is 33 W Union Blvd")
	void AddressOfRecord2687() {
		assertEquals("33 W Union Blvd", customers.get(2686).getAddress());
	}

	@Test
	@DisplayName("Record 2687: City is Bethlehem")
	void CityOfRecord2687() {
		assertEquals("Bethlehem", customers.get(2686).getCity());
	}

	@Test
	@DisplayName("Record 2687: County is Lehigh")
	void CountyOfRecord2687() {
		assertEquals("Lehigh", customers.get(2686).getCounty());
	}

	@Test
	@DisplayName("Record 2687: State is PA")
	void StateOfRecord2687() {
		assertEquals("PA", customers.get(2686).getState());
	}

	@Test
	@DisplayName("Record 2687: ZIP is 18018")
	void ZIPOfRecord2687() {
		assertEquals("18018", customers.get(2686).getZIP());
	}

	@Test
	@DisplayName("Record 2687: Phone is 610-882-9470")
	void PhoneOfRecord2687() {
		assertEquals("610-882-9470", customers.get(2686).getPhone());
	}

	@Test
	@DisplayName("Record 2687: Fax is 610-882-9723")
	void FaxOfRecord2687() {
		assertEquals("610-882-9723", customers.get(2686).getFax());
	}

	@Test
	@DisplayName("Record 2687: Email is geraldine@capan.com")
	void EmailOfRecord2687() {
		assertEquals("geraldine@capan.com", customers.get(2686).getEmail());
	}

	@Test
	@DisplayName("Record 2687: Web is http://www.geraldinecapan.com")
	void WebOfRecord2687() {
		assertEquals("http://www.geraldinecapan.com", customers.get(2686).getWeb());
	}
}

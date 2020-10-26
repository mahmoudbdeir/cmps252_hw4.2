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

@Tag("49")
class Record_187 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 187: FirstName is Twila")
	void FirstNameOfRecord187() {
		assertEquals("Twila", customers.get(186).getFirstName());
	}

	@Test
	@DisplayName("Record 187: LastName is Moore")
	void LastNameOfRecord187() {
		assertEquals("Moore", customers.get(186).getLastName());
	}

	@Test
	@DisplayName("Record 187: Company is Anderson, Rebecca S Esq")
	void CompanyOfRecord187() {
		assertEquals("Anderson, Rebecca S Esq", customers.get(186).getCompany());
	}

	@Test
	@DisplayName("Record 187: Address is 4649 Waldo Industrial Dr")
	void AddressOfRecord187() {
		assertEquals("4649 Waldo Industrial Dr", customers.get(186).getAddress());
	}

	@Test
	@DisplayName("Record 187: City is High Ridge")
	void CityOfRecord187() {
		assertEquals("High Ridge", customers.get(186).getCity());
	}

	@Test
	@DisplayName("Record 187: County is Jefferson")
	void CountyOfRecord187() {
		assertEquals("Jefferson", customers.get(186).getCounty());
	}

	@Test
	@DisplayName("Record 187: State is MO")
	void StateOfRecord187() {
		assertEquals("MO", customers.get(186).getState());
	}

	@Test
	@DisplayName("Record 187: ZIP is 63049")
	void ZIPOfRecord187() {
		assertEquals("63049", customers.get(186).getZIP());
	}

	@Test
	@DisplayName("Record 187: Phone is 636-677-8324")
	void PhoneOfRecord187() {
		assertEquals("636-677-8324", customers.get(186).getPhone());
	}

	@Test
	@DisplayName("Record 187: Fax is 636-677-7884")
	void FaxOfRecord187() {
		assertEquals("636-677-7884", customers.get(186).getFax());
	}

	@Test
	@DisplayName("Record 187: Email is twila@moore.com")
	void EmailOfRecord187() {
		assertEquals("twila@moore.com", customers.get(186).getEmail());
	}

	@Test
	@DisplayName("Record 187: Web is http://www.twilamoore.com")
	void WebOfRecord187() {
		assertEquals("http://www.twilamoore.com", customers.get(186).getWeb());
	}
}

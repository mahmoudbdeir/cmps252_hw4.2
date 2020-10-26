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
class Record_4931 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4931: FirstName is Angela")
	void FirstNameOfRecord4931() {
		assertEquals("Angela", customers.get(4930).getFirstName());
	}

	@Test
	@DisplayName("Record 4931: LastName is Iwasa")
	void LastNameOfRecord4931() {
		assertEquals("Iwasa", customers.get(4930).getLastName());
	}

	@Test
	@DisplayName("Record 4931: Company is David A Epstone Ltd")
	void CompanyOfRecord4931() {
		assertEquals("David A Epstone Ltd", customers.get(4930).getCompany());
	}

	@Test
	@DisplayName("Record 4931: Address is 666 Plainsboro Rd")
	void AddressOfRecord4931() {
		assertEquals("666 Plainsboro Rd", customers.get(4930).getAddress());
	}

	@Test
	@DisplayName("Record 4931: City is Plainsboro")
	void CityOfRecord4931() {
		assertEquals("Plainsboro", customers.get(4930).getCity());
	}

	@Test
	@DisplayName("Record 4931: County is Middlesex")
	void CountyOfRecord4931() {
		assertEquals("Middlesex", customers.get(4930).getCounty());
	}

	@Test
	@DisplayName("Record 4931: State is NJ")
	void StateOfRecord4931() {
		assertEquals("NJ", customers.get(4930).getState());
	}

	@Test
	@DisplayName("Record 4931: ZIP is 8536")
	void ZIPOfRecord4931() {
		assertEquals("8536", customers.get(4930).getZIP());
	}

	@Test
	@DisplayName("Record 4931: Phone is 609-799-7485")
	void PhoneOfRecord4931() {
		assertEquals("609-799-7485", customers.get(4930).getPhone());
	}

	@Test
	@DisplayName("Record 4931: Fax is 609-799-0577")
	void FaxOfRecord4931() {
		assertEquals("609-799-0577", customers.get(4930).getFax());
	}

	@Test
	@DisplayName("Record 4931: Email is angela@iwasa.com")
	void EmailOfRecord4931() {
		assertEquals("angela@iwasa.com", customers.get(4930).getEmail());
	}

	@Test
	@DisplayName("Record 4931: Web is http://www.angelaiwasa.com")
	void WebOfRecord4931() {
		assertEquals("http://www.angelaiwasa.com", customers.get(4930).getWeb());
	}
}

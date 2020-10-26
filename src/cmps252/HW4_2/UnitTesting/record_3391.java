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

@Tag("29")
class Record_3391 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3391: FirstName is Leora")
	void FirstNameOfRecord3391() {
		assertEquals("Leora", customers.get(3390).getFirstName());
	}

	@Test
	@DisplayName("Record 3391: LastName is Thrams")
	void LastNameOfRecord3391() {
		assertEquals("Thrams", customers.get(3390).getLastName());
	}

	@Test
	@DisplayName("Record 3391: Company is Werh Am Fm Radio Station")
	void CompanyOfRecord3391() {
		assertEquals("Werh Am Fm Radio Station", customers.get(3390).getCompany());
	}

	@Test
	@DisplayName("Record 3391: Address is 1 Rossmoor Dr  #-201")
	void AddressOfRecord3391() {
		assertEquals("1 Rossmoor Dr  #-201", customers.get(3390).getAddress());
	}

	@Test
	@DisplayName("Record 3391: City is Monroe Township")
	void CityOfRecord3391() {
		assertEquals("Monroe Township", customers.get(3390).getCity());
	}

	@Test
	@DisplayName("Record 3391: County is Middlesex")
	void CountyOfRecord3391() {
		assertEquals("Middlesex", customers.get(3390).getCounty());
	}

	@Test
	@DisplayName("Record 3391: State is NJ")
	void StateOfRecord3391() {
		assertEquals("NJ", customers.get(3390).getState());
	}

	@Test
	@DisplayName("Record 3391: ZIP is 8831")
	void ZIPOfRecord3391() {
		assertEquals("8831", customers.get(3390).getZIP());
	}

	@Test
	@DisplayName("Record 3391: Phone is 732-395-1939")
	void PhoneOfRecord3391() {
		assertEquals("732-395-1939", customers.get(3390).getPhone());
	}

	@Test
	@DisplayName("Record 3391: Fax is 732-395-8227")
	void FaxOfRecord3391() {
		assertEquals("732-395-8227", customers.get(3390).getFax());
	}

	@Test
	@DisplayName("Record 3391: Email is leora@thrams.com")
	void EmailOfRecord3391() {
		assertEquals("leora@thrams.com", customers.get(3390).getEmail());
	}

	@Test
	@DisplayName("Record 3391: Web is http://www.leorathrams.com")
	void WebOfRecord3391() {
		assertEquals("http://www.leorathrams.com", customers.get(3390).getWeb());
	}
}

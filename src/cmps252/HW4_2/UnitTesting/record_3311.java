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
class Record_3311 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3311: FirstName is Robbie")
	void FirstNameOfRecord3311() {
		assertEquals("Robbie", customers.get(3310).getFirstName());
	}

	@Test
	@DisplayName("Record 3311: LastName is Fallert")
	void LastNameOfRecord3311() {
		assertEquals("Fallert", customers.get(3310).getLastName());
	}

	@Test
	@DisplayName("Record 3311: Company is Milford Printers")
	void CompanyOfRecord3311() {
		assertEquals("Milford Printers", customers.get(3310).getCompany());
	}

	@Test
	@DisplayName("Record 3311: Address is 36 W Main St")
	void AddressOfRecord3311() {
		assertEquals("36 W Main St", customers.get(3310).getAddress());
	}

	@Test
	@DisplayName("Record 3311: City is Freehold")
	void CityOfRecord3311() {
		assertEquals("Freehold", customers.get(3310).getCity());
	}

	@Test
	@DisplayName("Record 3311: County is Monmouth")
	void CountyOfRecord3311() {
		assertEquals("Monmouth", customers.get(3310).getCounty());
	}

	@Test
	@DisplayName("Record 3311: State is NJ")
	void StateOfRecord3311() {
		assertEquals("NJ", customers.get(3310).getState());
	}

	@Test
	@DisplayName("Record 3311: ZIP is 7728")
	void ZIPOfRecord3311() {
		assertEquals("7728", customers.get(3310).getZIP());
	}

	@Test
	@DisplayName("Record 3311: Phone is 732-409-1541")
	void PhoneOfRecord3311() {
		assertEquals("732-409-1541", customers.get(3310).getPhone());
	}

	@Test
	@DisplayName("Record 3311: Fax is 732-409-9753")
	void FaxOfRecord3311() {
		assertEquals("732-409-9753", customers.get(3310).getFax());
	}

	@Test
	@DisplayName("Record 3311: Email is robbie@fallert.com")
	void EmailOfRecord3311() {
		assertEquals("robbie@fallert.com", customers.get(3310).getEmail());
	}

	@Test
	@DisplayName("Record 3311: Web is http://www.robbiefallert.com")
	void WebOfRecord3311() {
		assertEquals("http://www.robbiefallert.com", customers.get(3310).getWeb());
	}
}

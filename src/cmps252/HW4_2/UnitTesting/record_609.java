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

@Tag("28")
class Record_609 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 609: FirstName is Breanna")
	void FirstNameOfRecord609() {
		assertEquals("Breanna", customers.get(608).getFirstName());
	}

	@Test
	@DisplayName("Record 609: LastName is Dannenfelser")
	void LastNameOfRecord609() {
		assertEquals("Dannenfelser", customers.get(608).getLastName());
	}

	@Test
	@DisplayName("Record 609: Company is Management Strategies Inc")
	void CompanyOfRecord609() {
		assertEquals("Management Strategies Inc", customers.get(608).getCompany());
	}

	@Test
	@DisplayName("Record 609: Address is 4950 Franklin Blvd")
	void AddressOfRecord609() {
		assertEquals("4950 Franklin Blvd", customers.get(608).getAddress());
	}

	@Test
	@DisplayName("Record 609: City is Sacramento")
	void CityOfRecord609() {
		assertEquals("Sacramento", customers.get(608).getCity());
	}

	@Test
	@DisplayName("Record 609: County is Sacramento")
	void CountyOfRecord609() {
		assertEquals("Sacramento", customers.get(608).getCounty());
	}

	@Test
	@DisplayName("Record 609: State is CA")
	void StateOfRecord609() {
		assertEquals("CA", customers.get(608).getState());
	}

	@Test
	@DisplayName("Record 609: ZIP is 95820")
	void ZIPOfRecord609() {
		assertEquals("95820", customers.get(608).getZIP());
	}

	@Test
	@DisplayName("Record 609: Phone is 916-456-0442")
	void PhoneOfRecord609() {
		assertEquals("916-456-0442", customers.get(608).getPhone());
	}

	@Test
	@DisplayName("Record 609: Fax is 916-456-0247")
	void FaxOfRecord609() {
		assertEquals("916-456-0247", customers.get(608).getFax());
	}

	@Test
	@DisplayName("Record 609: Email is breanna@dannenfelser.com")
	void EmailOfRecord609() {
		assertEquals("breanna@dannenfelser.com", customers.get(608).getEmail());
	}

	@Test
	@DisplayName("Record 609: Web is http://www.breannadannenfelser.com")
	void WebOfRecord609() {
		assertEquals("http://www.breannadannenfelser.com", customers.get(608).getWeb());
	}
}

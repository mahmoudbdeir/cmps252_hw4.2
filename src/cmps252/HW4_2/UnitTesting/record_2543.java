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
class Record_2543 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2543: FirstName is Lila")
	void FirstNameOfRecord2543() {
		assertEquals("Lila", customers.get(2542).getFirstName());
	}

	@Test
	@DisplayName("Record 2543: LastName is Burchette")
	void LastNameOfRecord2543() {
		assertEquals("Burchette", customers.get(2542).getLastName());
	}

	@Test
	@DisplayName("Record 2543: Company is Harold Beck & Sons Inc")
	void CompanyOfRecord2543() {
		assertEquals("Harold Beck & Sons Inc", customers.get(2542).getCompany());
	}

	@Test
	@DisplayName("Record 2543: Address is 1120c Douglas Blvd")
	void AddressOfRecord2543() {
		assertEquals("1120c Douglas Blvd", customers.get(2542).getAddress());
	}

	@Test
	@DisplayName("Record 2543: City is Roseville")
	void CityOfRecord2543() {
		assertEquals("Roseville", customers.get(2542).getCity());
	}

	@Test
	@DisplayName("Record 2543: County is Placer")
	void CountyOfRecord2543() {
		assertEquals("Placer", customers.get(2542).getCounty());
	}

	@Test
	@DisplayName("Record 2543: State is CA")
	void StateOfRecord2543() {
		assertEquals("CA", customers.get(2542).getState());
	}

	@Test
	@DisplayName("Record 2543: ZIP is 95678")
	void ZIPOfRecord2543() {
		assertEquals("95678", customers.get(2542).getZIP());
	}

	@Test
	@DisplayName("Record 2543: Phone is 916-782-2744")
	void PhoneOfRecord2543() {
		assertEquals("916-782-2744", customers.get(2542).getPhone());
	}

	@Test
	@DisplayName("Record 2543: Fax is 916-782-0417")
	void FaxOfRecord2543() {
		assertEquals("916-782-0417", customers.get(2542).getFax());
	}

	@Test
	@DisplayName("Record 2543: Email is lila@burchette.com")
	void EmailOfRecord2543() {
		assertEquals("lila@burchette.com", customers.get(2542).getEmail());
	}

	@Test
	@DisplayName("Record 2543: Web is http://www.lilaburchette.com")
	void WebOfRecord2543() {
		assertEquals("http://www.lilaburchette.com", customers.get(2542).getWeb());
	}
}

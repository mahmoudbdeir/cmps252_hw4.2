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

@Tag("25")
class Record_675 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 675: FirstName is Ashley")
	void FirstNameOfRecord675() {
		assertEquals("Ashley", customers.get(674).getFirstName());
	}

	@Test
	@DisplayName("Record 675: LastName is Brande")
	void LastNameOfRecord675() {
		assertEquals("Brande", customers.get(674).getLastName());
	}

	@Test
	@DisplayName("Record 675: Company is Rogstad, T Mark Esq")
	void CompanyOfRecord675() {
		assertEquals("Rogstad, T Mark Esq", customers.get(674).getCompany());
	}

	@Test
	@DisplayName("Record 675: Address is 11212 Wright Rd")
	void AddressOfRecord675() {
		assertEquals("11212 Wright Rd", customers.get(674).getAddress());
	}

	@Test
	@DisplayName("Record 675: City is Lynwood")
	void CityOfRecord675() {
		assertEquals("Lynwood", customers.get(674).getCity());
	}

	@Test
	@DisplayName("Record 675: County is Los Angeles")
	void CountyOfRecord675() {
		assertEquals("Los Angeles", customers.get(674).getCounty());
	}

	@Test
	@DisplayName("Record 675: State is CA")
	void StateOfRecord675() {
		assertEquals("CA", customers.get(674).getState());
	}

	@Test
	@DisplayName("Record 675: ZIP is 90262")
	void ZIPOfRecord675() {
		assertEquals("90262", customers.get(674).getZIP());
	}

	@Test
	@DisplayName("Record 675: Phone is 310-604-3492")
	void PhoneOfRecord675() {
		assertEquals("310-604-3492", customers.get(674).getPhone());
	}

	@Test
	@DisplayName("Record 675: Fax is 310-604-1891")
	void FaxOfRecord675() {
		assertEquals("310-604-1891", customers.get(674).getFax());
	}

	@Test
	@DisplayName("Record 675: Email is ashley@brande.com")
	void EmailOfRecord675() {
		assertEquals("ashley@brande.com", customers.get(674).getEmail());
	}

	@Test
	@DisplayName("Record 675: Web is http://www.ashleybrande.com")
	void WebOfRecord675() {
		assertEquals("http://www.ashleybrande.com", customers.get(674).getWeb());
	}
}

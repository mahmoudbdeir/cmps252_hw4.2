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

@Tag("38")
class Record_4825 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4825: FirstName is Maryann")
	void FirstNameOfRecord4825() {
		assertEquals("Maryann", customers.get(4824).getFirstName());
	}

	@Test
	@DisplayName("Record 4825: LastName is Henifin")
	void LastNameOfRecord4825() {
		assertEquals("Henifin", customers.get(4824).getLastName());
	}

	@Test
	@DisplayName("Record 4825: Company is Hopewell Vly Medl Assocs P")
	void CompanyOfRecord4825() {
		assertEquals("Hopewell Vly Medl Assocs P", customers.get(4824).getCompany());
	}

	@Test
	@DisplayName("Record 4825: Address is 527 Garden St")
	void AddressOfRecord4825() {
		assertEquals("527 Garden St", customers.get(4824).getAddress());
	}

	@Test
	@DisplayName("Record 4825: City is Santa Barbara")
	void CityOfRecord4825() {
		assertEquals("Santa Barbara", customers.get(4824).getCity());
	}

	@Test
	@DisplayName("Record 4825: County is Santa Barbara")
	void CountyOfRecord4825() {
		assertEquals("Santa Barbara", customers.get(4824).getCounty());
	}

	@Test
	@DisplayName("Record 4825: State is CA")
	void StateOfRecord4825() {
		assertEquals("CA", customers.get(4824).getState());
	}

	@Test
	@DisplayName("Record 4825: ZIP is 93101")
	void ZIPOfRecord4825() {
		assertEquals("93101", customers.get(4824).getZIP());
	}

	@Test
	@DisplayName("Record 4825: Phone is 805-564-7773")
	void PhoneOfRecord4825() {
		assertEquals("805-564-7773", customers.get(4824).getPhone());
	}

	@Test
	@DisplayName("Record 4825: Fax is 805-564-0253")
	void FaxOfRecord4825() {
		assertEquals("805-564-0253", customers.get(4824).getFax());
	}

	@Test
	@DisplayName("Record 4825: Email is maryann@henifin.com")
	void EmailOfRecord4825() {
		assertEquals("maryann@henifin.com", customers.get(4824).getEmail());
	}

	@Test
	@DisplayName("Record 4825: Web is http://www.maryannhenifin.com")
	void WebOfRecord4825() {
		assertEquals("http://www.maryannhenifin.com", customers.get(4824).getWeb());
	}
}

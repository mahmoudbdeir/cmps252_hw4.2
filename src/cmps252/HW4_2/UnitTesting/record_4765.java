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

@Tag("5")
class Record_4765 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4765: FirstName is Beverley")
	void FirstNameOfRecord4765() {
		assertEquals("Beverley", customers.get(4764).getFirstName());
	}

	@Test
	@DisplayName("Record 4765: LastName is Nute")
	void LastNameOfRecord4765() {
		assertEquals("Nute", customers.get(4764).getLastName());
	}

	@Test
	@DisplayName("Record 4765: Company is Lsi Lighting Systems Inc")
	void CompanyOfRecord4765() {
		assertEquals("Lsi Lighting Systems Inc", customers.get(4764).getCompany());
	}

	@Test
	@DisplayName("Record 4765: Address is 1250 Canal Rd")
	void AddressOfRecord4765() {
		assertEquals("1250 Canal Rd", customers.get(4764).getAddress());
	}

	@Test
	@DisplayName("Record 4765: City is Lafayette")
	void CityOfRecord4765() {
		assertEquals("Lafayette", customers.get(4764).getCity());
	}

	@Test
	@DisplayName("Record 4765: County is Tippecanoe")
	void CountyOfRecord4765() {
		assertEquals("Tippecanoe", customers.get(4764).getCounty());
	}

	@Test
	@DisplayName("Record 4765: State is IN")
	void StateOfRecord4765() {
		assertEquals("IN", customers.get(4764).getState());
	}

	@Test
	@DisplayName("Record 4765: ZIP is 47904")
	void ZIPOfRecord4765() {
		assertEquals("47904", customers.get(4764).getZIP());
	}

	@Test
	@DisplayName("Record 4765: Phone is 765-742-8063")
	void PhoneOfRecord4765() {
		assertEquals("765-742-8063", customers.get(4764).getPhone());
	}

	@Test
	@DisplayName("Record 4765: Fax is 765-742-1387")
	void FaxOfRecord4765() {
		assertEquals("765-742-1387", customers.get(4764).getFax());
	}

	@Test
	@DisplayName("Record 4765: Email is beverley@nute.com")
	void EmailOfRecord4765() {
		assertEquals("beverley@nute.com", customers.get(4764).getEmail());
	}

	@Test
	@DisplayName("Record 4765: Web is http://www.beverleynute.com")
	void WebOfRecord4765() {
		assertEquals("http://www.beverleynute.com", customers.get(4764).getWeb());
	}
}

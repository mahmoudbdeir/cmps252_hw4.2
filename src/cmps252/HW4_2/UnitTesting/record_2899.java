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

@Tag("31")
class Record_2899 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2899: FirstName is Tricia")
	void FirstNameOfRecord2899() {
		assertEquals("Tricia", customers.get(2898).getFirstName());
	}

	@Test
	@DisplayName("Record 2899: LastName is Mots")
	void LastNameOfRecord2899() {
		assertEquals("Mots", customers.get(2898).getLastName());
	}

	@Test
	@DisplayName("Record 2899: Company is Days Inn")
	void CompanyOfRecord2899() {
		assertEquals("Days Inn", customers.get(2898).getCompany());
	}

	@Test
	@DisplayName("Record 2899: Address is 8781 E Main")
	void AddressOfRecord2899() {
		assertEquals("8781 E Main", customers.get(2898).getAddress());
	}

	@Test
	@DisplayName("Record 2899: City is Stamford")
	void CityOfRecord2899() {
		assertEquals("Stamford", customers.get(2898).getCity());
	}

	@Test
	@DisplayName("Record 2899: County is Fairfield")
	void CountyOfRecord2899() {
		assertEquals("Fairfield", customers.get(2898).getCounty());
	}

	@Test
	@DisplayName("Record 2899: State is CT")
	void StateOfRecord2899() {
		assertEquals("CT", customers.get(2898).getState());
	}

	@Test
	@DisplayName("Record 2899: ZIP is 6902")
	void ZIPOfRecord2899() {
		assertEquals("6902", customers.get(2898).getZIP());
	}

	@Test
	@DisplayName("Record 2899: Phone is 203-327-6077")
	void PhoneOfRecord2899() {
		assertEquals("203-327-6077", customers.get(2898).getPhone());
	}

	@Test
	@DisplayName("Record 2899: Fax is 203-327-0523")
	void FaxOfRecord2899() {
		assertEquals("203-327-0523", customers.get(2898).getFax());
	}

	@Test
	@DisplayName("Record 2899: Email is tricia@mots.com")
	void EmailOfRecord2899() {
		assertEquals("tricia@mots.com", customers.get(2898).getEmail());
	}

	@Test
	@DisplayName("Record 2899: Web is http://www.triciamots.com")
	void WebOfRecord2899() {
		assertEquals("http://www.triciamots.com", customers.get(2898).getWeb());
	}
}

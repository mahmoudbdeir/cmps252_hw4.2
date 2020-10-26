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

@Tag("30")
class Record_2810 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2810: FirstName is Winifred")
	void FirstNameOfRecord2810() {
		assertEquals("Winifred", customers.get(2809).getFirstName());
	}

	@Test
	@DisplayName("Record 2810: LastName is Bosshart")
	void LastNameOfRecord2810() {
		assertEquals("Bosshart", customers.get(2809).getLastName());
	}

	@Test
	@DisplayName("Record 2810: Company is L P Associates Inc")
	void CompanyOfRecord2810() {
		assertEquals("L P Associates Inc", customers.get(2809).getCompany());
	}

	@Test
	@DisplayName("Record 2810: Address is 774 Mamaroneck Ave")
	void AddressOfRecord2810() {
		assertEquals("774 Mamaroneck Ave", customers.get(2809).getAddress());
	}

	@Test
	@DisplayName("Record 2810: City is White Plains")
	void CityOfRecord2810() {
		assertEquals("White Plains", customers.get(2809).getCity());
	}

	@Test
	@DisplayName("Record 2810: County is Westchester")
	void CountyOfRecord2810() {
		assertEquals("Westchester", customers.get(2809).getCounty());
	}

	@Test
	@DisplayName("Record 2810: State is NY")
	void StateOfRecord2810() {
		assertEquals("NY", customers.get(2809).getState());
	}

	@Test
	@DisplayName("Record 2810: ZIP is 10605")
	void ZIPOfRecord2810() {
		assertEquals("10605", customers.get(2809).getZIP());
	}

	@Test
	@DisplayName("Record 2810: Phone is 914-428-3305")
	void PhoneOfRecord2810() {
		assertEquals("914-428-3305", customers.get(2809).getPhone());
	}

	@Test
	@DisplayName("Record 2810: Fax is 914-428-3945")
	void FaxOfRecord2810() {
		assertEquals("914-428-3945", customers.get(2809).getFax());
	}

	@Test
	@DisplayName("Record 2810: Email is winifred@bosshart.com")
	void EmailOfRecord2810() {
		assertEquals("winifred@bosshart.com", customers.get(2809).getEmail());
	}

	@Test
	@DisplayName("Record 2810: Web is http://www.winifredbosshart.com")
	void WebOfRecord2810() {
		assertEquals("http://www.winifredbosshart.com", customers.get(2809).getWeb());
	}
}

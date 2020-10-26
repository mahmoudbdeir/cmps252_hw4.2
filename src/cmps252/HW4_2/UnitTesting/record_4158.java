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

@Tag("22")
class Record_4158 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4158: FirstName is Ryan")
	void FirstNameOfRecord4158() {
		assertEquals("Ryan", customers.get(4157).getFirstName());
	}

	@Test
	@DisplayName("Record 4158: LastName is Petchulis")
	void LastNameOfRecord4158() {
		assertEquals("Petchulis", customers.get(4157).getLastName());
	}

	@Test
	@DisplayName("Record 4158: Company is Professional Plan Assocs Inc")
	void CompanyOfRecord4158() {
		assertEquals("Professional Plan Assocs Inc", customers.get(4157).getCompany());
	}

	@Test
	@DisplayName("Record 4158: Address is 355 Chestnut St")
	void AddressOfRecord4158() {
		assertEquals("355 Chestnut St", customers.get(4157).getAddress());
	}

	@Test
	@DisplayName("Record 4158: City is Norwood")
	void CityOfRecord4158() {
		assertEquals("Norwood", customers.get(4157).getCity());
	}

	@Test
	@DisplayName("Record 4158: County is Bergen")
	void CountyOfRecord4158() {
		assertEquals("Bergen", customers.get(4157).getCounty());
	}

	@Test
	@DisplayName("Record 4158: State is NJ")
	void StateOfRecord4158() {
		assertEquals("NJ", customers.get(4157).getState());
	}

	@Test
	@DisplayName("Record 4158: ZIP is 7648")
	void ZIPOfRecord4158() {
		assertEquals("7648", customers.get(4157).getZIP());
	}

	@Test
	@DisplayName("Record 4158: Phone is 201-767-7873")
	void PhoneOfRecord4158() {
		assertEquals("201-767-7873", customers.get(4157).getPhone());
	}

	@Test
	@DisplayName("Record 4158: Fax is 201-767-5418")
	void FaxOfRecord4158() {
		assertEquals("201-767-5418", customers.get(4157).getFax());
	}

	@Test
	@DisplayName("Record 4158: Email is ryan@petchulis.com")
	void EmailOfRecord4158() {
		assertEquals("ryan@petchulis.com", customers.get(4157).getEmail());
	}

	@Test
	@DisplayName("Record 4158: Web is http://www.ryanpetchulis.com")
	void WebOfRecord4158() {
		assertEquals("http://www.ryanpetchulis.com", customers.get(4157).getWeb());
	}
}

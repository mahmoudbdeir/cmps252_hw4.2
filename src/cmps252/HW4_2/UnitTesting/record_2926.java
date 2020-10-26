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

@Tag("19")
class Record_2926 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2926: FirstName is Alma")
	void FirstNameOfRecord2926() {
		assertEquals("Alma", customers.get(2925).getFirstName());
	}

	@Test
	@DisplayName("Record 2926: LastName is Bance")
	void LastNameOfRecord2926() {
		assertEquals("Bance", customers.get(2925).getLastName());
	}

	@Test
	@DisplayName("Record 2926: Company is Mccarthy, M Charles Esq")
	void CompanyOfRecord2926() {
		assertEquals("Mccarthy, M Charles Esq", customers.get(2925).getCompany());
	}

	@Test
	@DisplayName("Record 2926: Address is 1312 W Washington St")
	void AddressOfRecord2926() {
		assertEquals("1312 W Washington St", customers.get(2925).getAddress());
	}

	@Test
	@DisplayName("Record 2926: City is Orlando")
	void CityOfRecord2926() {
		assertEquals("Orlando", customers.get(2925).getCity());
	}

	@Test
	@DisplayName("Record 2926: County is Orange")
	void CountyOfRecord2926() {
		assertEquals("Orange", customers.get(2925).getCounty());
	}

	@Test
	@DisplayName("Record 2926: State is FL")
	void StateOfRecord2926() {
		assertEquals("FL", customers.get(2925).getState());
	}

	@Test
	@DisplayName("Record 2926: ZIP is 32805")
	void ZIPOfRecord2926() {
		assertEquals("32805", customers.get(2925).getZIP());
	}

	@Test
	@DisplayName("Record 2926: Phone is 407-648-1784")
	void PhoneOfRecord2926() {
		assertEquals("407-648-1784", customers.get(2925).getPhone());
	}

	@Test
	@DisplayName("Record 2926: Fax is 407-648-7259")
	void FaxOfRecord2926() {
		assertEquals("407-648-7259", customers.get(2925).getFax());
	}

	@Test
	@DisplayName("Record 2926: Email is alma@bance.com")
	void EmailOfRecord2926() {
		assertEquals("alma@bance.com", customers.get(2925).getEmail());
	}

	@Test
	@DisplayName("Record 2926: Web is http://www.almabance.com")
	void WebOfRecord2926() {
		assertEquals("http://www.almabance.com", customers.get(2925).getWeb());
	}
}

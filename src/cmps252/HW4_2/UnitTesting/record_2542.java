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

@Tag("46")
class Record_2542 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2542: FirstName is Avery")
	void FirstNameOfRecord2542() {
		assertEquals("Avery", customers.get(2541).getFirstName());
	}

	@Test
	@DisplayName("Record 2542: LastName is Kadel")
	void LastNameOfRecord2542() {
		assertEquals("Kadel", customers.get(2541).getLastName());
	}

	@Test
	@DisplayName("Record 2542: Company is Copeland, Pamela M Esq")
	void CompanyOfRecord2542() {
		assertEquals("Copeland, Pamela M Esq", customers.get(2541).getCompany());
	}

	@Test
	@DisplayName("Record 2542: Address is 155 Dorr Dr  #-9")
	void AddressOfRecord2542() {
		assertEquals("155 Dorr Dr  #-9", customers.get(2541).getAddress());
	}

	@Test
	@DisplayName("Record 2542: City is Rutland")
	void CityOfRecord2542() {
		assertEquals("Rutland", customers.get(2541).getCity());
	}

	@Test
	@DisplayName("Record 2542: County is Rutland")
	void CountyOfRecord2542() {
		assertEquals("Rutland", customers.get(2541).getCounty());
	}

	@Test
	@DisplayName("Record 2542: State is VT")
	void StateOfRecord2542() {
		assertEquals("VT", customers.get(2541).getState());
	}

	@Test
	@DisplayName("Record 2542: ZIP is 5701")
	void ZIPOfRecord2542() {
		assertEquals("5701", customers.get(2541).getZIP());
	}

	@Test
	@DisplayName("Record 2542: Phone is 802-775-8917")
	void PhoneOfRecord2542() {
		assertEquals("802-775-8917", customers.get(2541).getPhone());
	}

	@Test
	@DisplayName("Record 2542: Fax is 802-775-3689")
	void FaxOfRecord2542() {
		assertEquals("802-775-3689", customers.get(2541).getFax());
	}

	@Test
	@DisplayName("Record 2542: Email is avery@kadel.com")
	void EmailOfRecord2542() {
		assertEquals("avery@kadel.com", customers.get(2541).getEmail());
	}

	@Test
	@DisplayName("Record 2542: Web is http://www.averykadel.com")
	void WebOfRecord2542() {
		assertEquals("http://www.averykadel.com", customers.get(2541).getWeb());
	}
}

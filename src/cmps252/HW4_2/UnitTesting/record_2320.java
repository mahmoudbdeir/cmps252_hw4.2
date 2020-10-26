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

@Tag("12")
class Record_2320 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2320: FirstName is Kathleen")
	void FirstNameOfRecord2320() {
		assertEquals("Kathleen", customers.get(2319).getFirstName());
	}

	@Test
	@DisplayName("Record 2320: LastName is Mendicino")
	void LastNameOfRecord2320() {
		assertEquals("Mendicino", customers.get(2319).getLastName());
	}

	@Test
	@DisplayName("Record 2320: Company is Laurent, Stephen J Esq")
	void CompanyOfRecord2320() {
		assertEquals("Laurent, Stephen J Esq", customers.get(2319).getCompany());
	}

	@Test
	@DisplayName("Record 2320: Address is 7655 Market St")
	void AddressOfRecord2320() {
		assertEquals("7655 Market St", customers.get(2319).getAddress());
	}

	@Test
	@DisplayName("Record 2320: City is Youngstown")
	void CityOfRecord2320() {
		assertEquals("Youngstown", customers.get(2319).getCity());
	}

	@Test
	@DisplayName("Record 2320: County is Mahoning")
	void CountyOfRecord2320() {
		assertEquals("Mahoning", customers.get(2319).getCounty());
	}

	@Test
	@DisplayName("Record 2320: State is OH")
	void StateOfRecord2320() {
		assertEquals("OH", customers.get(2319).getState());
	}

	@Test
	@DisplayName("Record 2320: ZIP is 44512")
	void ZIPOfRecord2320() {
		assertEquals("44512", customers.get(2319).getZIP());
	}

	@Test
	@DisplayName("Record 2320: Phone is 330-726-7307")
	void PhoneOfRecord2320() {
		assertEquals("330-726-7307", customers.get(2319).getPhone());
	}

	@Test
	@DisplayName("Record 2320: Fax is 330-726-7566")
	void FaxOfRecord2320() {
		assertEquals("330-726-7566", customers.get(2319).getFax());
	}

	@Test
	@DisplayName("Record 2320: Email is kathleen@mendicino.com")
	void EmailOfRecord2320() {
		assertEquals("kathleen@mendicino.com", customers.get(2319).getEmail());
	}

	@Test
	@DisplayName("Record 2320: Web is http://www.kathleenmendicino.com")
	void WebOfRecord2320() {
		assertEquals("http://www.kathleenmendicino.com", customers.get(2319).getWeb());
	}
}
